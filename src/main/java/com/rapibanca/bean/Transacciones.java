/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rapibanca.bean;

import com.informa.dto.ClienteRapibancaDTO;
import com.rapibanca.dao.ProductosRapibancaDAO;
import com.rapibanca.entities.ClienteRapibanca;
import com.rapibanca.entities.ProductosRapibanca;
import com.rapibanca.entities.TipoOperacion;
import com.rapibanca.entities.TransaccionesRapibanca;
import com.rapibanca.tool.TipoProducto;
import java.math.BigInteger;
import java.util.Calendar;

/**
 *
 * @author jmartine2319
 */
public abstract class Transacciones {
    
    /**
     * Metodo que permite conocer el saldo de la cuenta de ahorros
     * @param clienteRapibanca
     * @return 
     */
    public boolean validarSaldoCuenta(ClienteRapibanca clienteRapibanca){
        ProductosRapibancaDAO productosRapibancaDAO = new ProductosRapibancaDAO();
        ProductosRapibanca productoRapibanca = productosRapibancaDAO.consultarSaldo(clienteRapibanca, TipoProducto.CUENTA_AHORROS);
        if(productoRapibanca.getSaldoProducto().intValue()>0){
            return true;
        }else{
            return false;
        }
        
    }
    /**
     * Metodo que permite consultar el producto de interes
     * @param clienteRapibanca
     * @param tipoProducto
     * @return 
     */
    public ProductosRapibanca consultarProducto(ClienteRapibanca clienteRapibanca, TipoProducto tipoProducto){
        ProductosRapibancaDAO productosRapibancaDAO = new ProductosRapibancaDAO();
        ProductosRapibanca productoRapibanca = productosRapibancaDAO.consultarSaldo(clienteRapibanca, tipoProducto);
        return productoRapibanca;
    }
    
    public TransaccionesRapibanca asignarTransaccion(ProductosRapibanca productosRapibanca,TipoOperacion tipoOperacion,BigInteger valorOperacion){
        TransaccionesRapibanca transaccionesRapibanca = new TransaccionesRapibanca();
        //transaccionesRapibanca.setIdTransaccion(1);
        Calendar cal = Calendar.getInstance();
        transaccionesRapibanca.setFechaTransaccion(cal.getTime());
        transaccionesRapibanca.setMedioElectronico(BigInteger.ONE);
        transaccionesRapibanca.setTipoOperacion(tipoOperacion);
        transaccionesRapibanca.setIdProducto(productosRapibanca);
        transaccionesRapibanca.setValorOperacion(valorOperacion);
        
        return transaccionesRapibanca;
    }
}
