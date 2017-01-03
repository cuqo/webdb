/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domini;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author ND17613
 */
@Entity
@Table(name = "ConfiguracionAnual")
@NamedQueries({
    @NamedQuery(name = "ConfiguracionAnual.findAll", query = "SELECT c FROM ConfiguracionAnual c")
    , @NamedQuery(name = "ConfiguracionAnual.findByIdTemp", query = "SELECT c FROM ConfiguracionAnual c WHERE c.idTemp = :idTemp")
    , @NamedQuery(name = "ConfiguracionAnual.findByTotalVacaciones", query = "SELECT c FROM ConfiguracionAnual c WHERE c.totalVacaciones = :totalVacaciones")
    , @NamedQuery(name = "ConfiguracionAnual.findByVacacionesFijas", query = "SELECT c FROM ConfiguracionAnual c WHERE c.vacacionesFijas = :vacacionesFijas")
    , @NamedQuery(name = "ConfiguracionAnual.findByVacacionesMoviles", query = "SELECT c FROM ConfiguracionAnual c WHERE c.vacacionesMoviles = :vacacionesMoviles")
    , @NamedQuery(name = "ConfiguracionAnual.findByA\u00f1o", query = "SELECT c FROM ConfiguracionAnual c WHERE c.a\u00f1o = :a\u00f1o")
    , @NamedQuery(name = "ConfiguracionAnual.findByVacacionesUsuario", query = "SELECT c FROM ConfiguracionAnual c WHERE c.vacacionesUsuario = :vacacionesUsuario")})
public class ConfiguracionAnual implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdTemp")
    private Integer idTemp;
    @Column(name = "TotalVacaciones")
    private Integer totalVacaciones;
    @Column(name = "VacacionesFijas")
    private Integer vacacionesFijas;
    @Column(name = "VacacionesMoviles")
    private Integer vacacionesMoviles;
    @Size(max = 4)
    @Column(name = "A\u00f1o")
    private String año;
    @Column(name = "VacacionesUsuario")
    private Integer vacacionesUsuario;

    public ConfiguracionAnual() {
    }

    public ConfiguracionAnual(Integer idTemp) {
        this.idTemp = idTemp;
    }

    public Integer getIdTemp() {
        return idTemp;
    }

    public void setIdTemp(Integer idTemp) {
        this.idTemp = idTemp;
    }

    public Integer getTotalVacaciones() {
        return totalVacaciones;
    }

    public void setTotalVacaciones(Integer totalVacaciones) {
        this.totalVacaciones = totalVacaciones;
    }

    public Integer getVacacionesFijas() {
        return vacacionesFijas;
    }

    public void setVacacionesFijas(Integer vacacionesFijas) {
        this.vacacionesFijas = vacacionesFijas;
    }

    public Integer getVacacionesMoviles() {
        return vacacionesMoviles;
    }

    public void setVacacionesMoviles(Integer vacacionesMoviles) {
        this.vacacionesMoviles = vacacionesMoviles;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public Integer getVacacionesUsuario() {
        return vacacionesUsuario;
    }

    public void setVacacionesUsuario(Integer vacacionesUsuario) {
        this.vacacionesUsuario = vacacionesUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTemp != null ? idTemp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfiguracionAnual)) {
            return false;
        }
        ConfiguracionAnual other = (ConfiguracionAnual) object;
        if ((this.idTemp == null && other.idTemp != null) || (this.idTemp != null && !this.idTemp.equals(other.idTemp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domini.ConfiguracionAnual[ idTemp=" + idTemp + " ]";
    }
    
}
