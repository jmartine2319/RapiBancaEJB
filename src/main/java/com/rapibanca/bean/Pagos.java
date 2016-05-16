/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rapibanca.bean;

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
 * @author jmartine2319
 */
public class Pagos extends Transacciones{
    public boolean realizarPagoServicioPublico(ClienteRapibanca cuentaOrigen,BigInteger valorPago){
        ClienteRapibancaDAO clienteRapibancaDAO = new ClienteRapibancaDAO();
        TransaccionesRapibancaDAO transaccionesRapibancaDAO = new TransaccionesRapibancaDAO();
        ProductosRapibancaDAO productosRapibancaDAO = new ProductosRapibancaDAO();
        TipoOperacionDAO tipoOperacionDAO = new TipoOperacionDAO();
        ClienteRapibanca cuentaOriginaria = clienteRapibancaDAO.findById(cuentaOrigen.getNumeroDocumento());
        if(validarSaldoCuenta(cuentaOriginaria)){
            TipoOperacion tipoOperacion = tipoOperacionDAO.findById(BigDecimal.ONE);
            ProductosRapibanca cuentaFinal = productosRapibancaDAO.consultarSaldo(cuentaOrigen, TipoProducto.CUENTA_AHORROS);
            TransaccionesRapibanca transaccion = asignarTransaccion(cuentaFinal, tipoOperacion, valorPago);
            transaccionesRapibancaDAO.persist(transaccion);
            
            return true;
        }
        return true;
    }
}
