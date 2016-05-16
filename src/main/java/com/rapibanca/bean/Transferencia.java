/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rapibanca.bean;

import com.informa.dto.ClienteRapibancaDTO;
import com.rapibanca.dao.ClienteRapibancaDAO;
import com.rapibanca.dao.ProductosRapibancaDAO;
import com.rapibanca.dao.TipoOperacionDAO;
import com.rapibanca.dao.TransaccionesRapibancaDAO;
import com.rapibanca.entities.ClienteRapibanca;
import com.rapibanca.entities.ProductosRapibanca;
import com.rapibanca.entities.TipoOperacion;
import com.rapibanca.entities.TransaccionesRapibanca;
import com.rapibanca.tool.TipoProducto;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author jmartine
 */
public class Transferencia extends Transacciones{
    public boolean realizarTransferencia(ClienteRapibancaDTO cuentaOrigen, BigInteger valorTransferencia,BigDecimal cuentaDestino){
        ClienteRapibancaDAO clienteRapibancaDAO = new ClienteRapibancaDAO();
        ClienteRapibanca cuentaOriginaria = clienteRapibancaDAO.findById(cuentaOrigen.getNumeroDocumento());
        ClienteRapibanca cuentaDestinataria = clienteRapibancaDAO.findById(cuentaDestino);
        if(validarSaldoCuenta(cuentaOriginaria)){
            //ClienteRapibancaDAO clienteRapibancaDAO = new ClienteRapibancaDAO();
            ProductosRapibancaDAO productosRapibancaDAO = new ProductosRapibancaDAO();
            TipoOperacionDAO tipoOperacionDAO = new TipoOperacionDAO();
            TransaccionesRapibancaDAO transaccionesRapibancaDAO = new TransaccionesRapibancaDAO();
            //ClienteRapibanca cuentaFinal = clienteRapibancaDAO.findById(cuentaDestino);
            ProductosRapibanca cuentaFinal = productosRapibancaDAO.consultarSaldo(cuentaDestinataria, TipoProducto.CUENTA_AHORROS);
            ProductosRapibanca cuentaPrincipio = productosRapibancaDAO.consultarSaldo(cuentaDestinataria, TipoProducto.CUENTA_AHORROS);
            
            //Obtiene el tipo de operacion
            TipoOperacion tipoOperacion = tipoOperacionDAO.findById(BigDecimal.ONE);
            BigInteger saldoActual = cuentaFinal.getSaldoProducto();
            saldoActual = saldoActual.add(valorTransferencia);
            cuentaFinal.setSaldoProducto(saldoActual);
            //Se actualiza el saldo de la persona destinatario
            productosRapibancaDAO.actualizarProducto(cuentaFinal);
            //Se actualiza el saldo de la persona origen de la transferencia
            productosRapibancaDAO.actualizarProducto(cuentaPrincipio);
            TransaccionesRapibanca transaccion = asignarTransaccion(cuentaPrincipio, tipoOperacion, valorTransferencia);
            transaccionesRapibancaDAO.persist(transaccion);
            
            return true;
        }
        else{
            return false;
        }
        
    }
 
}
