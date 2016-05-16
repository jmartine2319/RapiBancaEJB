/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rapibanca.test;

import com.informa.dto.ClienteRapibancaDTO;
import com.rapibanca.bean.Transferencia;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author marti_000
 */
public class TestEJB {
    public static void main(String args[]){
        Transferencia transferencia = new Transferencia();
        ClienteRapibancaDTO rapibancaDTO = new ClienteRapibancaDTO();
        rapibancaDTO.setNumeroDocumento(new BigDecimal(153));
        transferencia.realizarTransferencia(rapibancaDTO, BigInteger.valueOf(12), new BigDecimal(121212));
    }
}
