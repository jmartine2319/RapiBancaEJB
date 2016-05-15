/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.informa.dto;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author jmartine2319
 */
public class ClienteRapibancaDTO {
    private BigInteger tipoDocumento;
    private BigDecimal numeroDocumento;
    private String nombreCliente;
    private BigInteger telefono;
    private String email;
    private String direccionResidencia;
    private Date fechaVinculacion;
    private String idUsuario;
    private String password;

    public ClienteRapibancaDTO() {
    }

    public ClienteRapibancaDTO(BigDecimal numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public ClienteRapibancaDTO(BigDecimal numeroDocumento, BigInteger tipoDocumento, String nombreCliente, BigInteger telefono, String email, String direccionResidencia, Date fechaVinculacion, String idUsuario, String password) {
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
        this.email = email;
        this.direccionResidencia = direccionResidencia;
        this.fechaVinculacion = fechaVinculacion;
        this.idUsuario = idUsuario;
        this.password = password;
    }

    public BigInteger getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(BigInteger tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public BigDecimal getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(BigDecimal numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public Date getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(Date fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
