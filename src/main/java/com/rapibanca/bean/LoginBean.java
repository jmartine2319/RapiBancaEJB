/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rapibanca.bean;

import com.informa.dto.ClienteRapibancaDTO;
import com.rapibanca.dao.ClienteRapibancaDAO;
import com.rapibanca.entities.ClienteRapibanca;
import javax.ejb.Stateless;

/**
 *
 * @author ccuellar7876 jmartine2319
 */
@Stateless(mappedName="loginBean")
public class LoginBean implements IloginBean{
    
    /**
     * Metodo para hacer el loguin
     * @param clienteRapibancaDTO
     * @return 
     */
    public boolean loguearUsuario(ClienteRapibancaDTO clienteRapibancaDTO){
        ClienteRapibancaDAO clienteRapibancaDAO = new ClienteRapibancaDAO();
        //ClienteRapibanca clienteRapibanca = clienteRapibancaDAO.findByIdUsuario(new BigDecimal(3456));
        ClienteRapibanca clienteRapibanca = clienteRapibancaDAO.findByIdUsuario(clienteRapibancaDTO.getIdUsuario());
        System.out.println(clienteRapibanca.getIdUsuario());
        //ClienteRapibancaDTO
        if(clienteRapibanca.getPassword().equals(clienteRapibancaDTO.getPassword())){
            return true;
        }
        else{
            return false;
        }
    }
}
