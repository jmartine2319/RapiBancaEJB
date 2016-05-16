/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.informa.dto;

import com.rapibanca.entities.ClienteRapibanca;
import com.rapibanca.entities.PromocionesRapibanca;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author marti_000
 */
public class ProductosRapibancaDTO {
    
    private BigDecimal idProducto;
    private String descripcionProducto;
    private Date fechaCreacion;
    private Date fechaCancelacion;
    private Short penalizacion;
    private BigInteger saldoProducto;
    private PromocionesRapibanca idPromocionFk;
    private ClienteRapibanca numDocumentoClienteFk;

    public ProductosRapibancaDTO() {
    }

    public ProductosRapibancaDTO(BigDecimal idProducto) {
        this.idProducto = idProducto;
    }

    public ProductosRapibancaDTO(BigDecimal idProducto, String descripcionProducto, Date fechaCreacion, Date fechaCancelacion, BigInteger saldoProducto) {
        this.idProducto = idProducto;
        this.descripcionProducto = descripcionProducto;
        this.fechaCreacion = fechaCreacion;
        this.fechaCancelacion = fechaCancelacion;
        this.saldoProducto = saldoProducto;
    }

    public BigDecimal getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(BigDecimal idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaCancelacion() {
        return fechaCancelacion;
    }

    public void setFechaCancelacion(Date fechaCancelacion) {
        this.fechaCancelacion = fechaCancelacion;
    }

    public Short getPenalizacion() {
        return penalizacion;
    }

    public void setPenalizacion(Short penalizacion) {
        this.penalizacion = penalizacion;
    }

    public BigInteger getSaldoProducto() {
        return saldoProducto;
    }

    public void setSaldoProducto(BigInteger saldoProducto) {
        this.saldoProducto = saldoProducto;
    }

    public PromocionesRapibanca getIdPromocionFk() {
        return idPromocionFk;
    }

    public void setIdPromocionFk(PromocionesRapibanca idPromocionFk) {
        this.idPromocionFk = idPromocionFk;
    }

    public ClienteRapibanca getNumDocumentoClienteFk() {
        return numDocumentoClienteFk;
    }

    public void setNumDocumentoClienteFk(ClienteRapibanca numDocumentoClienteFk) {
        this.numDocumentoClienteFk = numDocumentoClienteFk;
    }
}
