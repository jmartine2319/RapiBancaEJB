/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rapibanca.bean;

import com.informa.dto.ClienteRapibancaDTO;
import javax.ejb.Local;

/**
 *
 * @author MaríaCamila
 */
@Local
public interface IloginBean {
    public boolean loguearUsuario(ClienteRapibancaDTO clienteRapibancaDTO);
}
