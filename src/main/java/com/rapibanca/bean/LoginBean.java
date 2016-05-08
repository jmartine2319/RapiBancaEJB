/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rapibanca.bean;

import com.rapibanca.dao.ClienteRapibancaDAO;
import com.rapibanca.entities.ClienteRapibanca;
import java.math.BigDecimal;
import javax.ejb.Stateless;

/**
 *
 * @author ccuellar7876 jmartine2319
 */
@Stateless(mappedName="loginBean")
public class LoginBean implements IloginBean{
    /**
     * Metodo para hacer el loguin
     * @return 
     */
    public static  void main(String args[]){
        ClienteRapibancaDAO clienteRapibancaDAO = new ClienteRapibancaDAO();
        ClienteRapibanca clienteRapibanca = clienteRapibancaDAO.findById(new BigDecimal(3456));
        System.out.println(clienteRapibanca.getIdUsuario());
    }
    public boolean loguearUsuario(){
        ClienteRapibancaDAO clienteRapibancaDAO = new ClienteRapibancaDAO();
        ClienteRapibanca clienteRapibanca = clienteRapibancaDAO.findById(new BigDecimal(3456));
        System.out.println(clienteRapibanca.getIdUsuario());
        return false;
    }
}
