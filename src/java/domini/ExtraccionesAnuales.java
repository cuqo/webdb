/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domini;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author ND17613
 */
@Entity
@Table(name = "ExtraccionesAnuales")
@NamedQueries({
    @NamedQuery(name = "ExtraccionesAnuales.findAll", query = "SELECT e FROM ExtraccionesAnuales e")
    , @NamedQuery(name = "ExtraccionesAnuales.findByFechaExtraccion", query = "SELECT e FROM ExtraccionesAnuales e WHERE e.fechaExtraccion = :fechaExtraccion")
    , @NamedQuery(name = "ExtraccionesAnuales.findByA\u00f1o", query = "SELECT e FROM ExtraccionesAnuales e WHERE e.extraccionesAnualesPK.a\u00f1o = :a\u00f1o")
    , @NamedQuery(name = "ExtraccionesAnuales.findByDowId", query = "SELECT e FROM ExtraccionesAnuales e WHERE e.extraccionesAnualesPK.dowId = :dowId")
    , @NamedQuery(name = "ExtraccionesAnuales.findByPendientes", query = "SELECT e FROM ExtraccionesAnuales e WHERE e.pendientes = :pendientes")
    , @NamedQuery(name = "ExtraccionesAnuales.findByDisfrutadas", query = "SELECT e FROM ExtraccionesAnuales e WHERE e.disfrutadas = :disfrutadas")
    , @NamedQuery(name = "ExtraccionesAnuales.findByVacaciones", query = "SELECT e FROM ExtraccionesAnuales e WHERE e.vacaciones = :vacaciones")})
public class ExtraccionesAnuales implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExtraccionesAnualesPK extraccionesAnualesPK;
    @Size(max = 10)
    @Column(name = "FechaExtraccion")
    private String fechaExtraccion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Pendientes")
    private Double pendientes;
    @Column(name = "Disfrutadas")
    private Double disfrutadas;
    @Column(name = "Vacaciones")
    private Double vacaciones;

    public ExtraccionesAnuales() {
    }

    public ExtraccionesAnuales(ExtraccionesAnualesPK extraccionesAnualesPK) {
        this.extraccionesAnualesPK = extraccionesAnualesPK;
    }

    public ExtraccionesAnuales(int año, String dowId) {
        this.extraccionesAnualesPK = new ExtraccionesAnualesPK(año, dowId);
    }

    public ExtraccionesAnualesPK getExtraccionesAnualesPK() {
        return extraccionesAnualesPK;
    }

    public void setExtraccionesAnualesPK(ExtraccionesAnualesPK extraccionesAnualesPK) {
        this.extraccionesAnualesPK = extraccionesAnualesPK;
    }

    public String getFechaExtraccion() {
        return fechaExtraccion;
    }

    public void setFechaExtraccion(String fechaExtraccion) {
        this.fechaExtraccion = fechaExtraccion;
    }

    public Double getPendientes() {
        return pendientes;
    }

    public void setPendientes(Double pendientes) {
        this.pendientes = pendientes;
    }

    public Double getDisfrutadas() {
        return disfrutadas;
    }

    public void setDisfrutadas(Double disfrutadas) {
        this.disfrutadas = disfrutadas;
    }

    public Double getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(Double vacaciones) {
        this.vacaciones = vacaciones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (extraccionesAnualesPK != null ? extraccionesAnualesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExtraccionesAnuales)) {
            return false;
        }
        ExtraccionesAnuales other = (ExtraccionesAnuales) object;
        if ((this.extraccionesAnualesPK == null && other.extraccionesAnualesPK != null) || (this.extraccionesAnualesPK != null && !this.extraccionesAnualesPK.equals(other.extraccionesAnualesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domini.ExtraccionesAnuales[ extraccionesAnualesPK=" + extraccionesAnualesPK + " ]";
    }
    
}
