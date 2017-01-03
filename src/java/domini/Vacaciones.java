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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ND17613
 */
@Entity
@Table(name = "Vacaciones")
@NamedQueries({
    @NamedQuery(name = "Vacaciones.findAll", query = "SELECT v FROM Vacaciones v")
    , @NamedQuery(name = "Vacaciones.findByDowId", query = "SELECT v FROM Vacaciones v WHERE v.vacacionesPK.dowId = :dowId")
    , @NamedQuery(name = "Vacaciones.findByDia", query = "SELECT v FROM Vacaciones v WHERE v.vacacionesPK.dia = :dia")
    , @NamedQuery(name = "Vacaciones.findByMes", query = "SELECT v FROM Vacaciones v WHERE v.vacacionesPK.mes = :mes")
    , @NamedQuery(name = "Vacaciones.findByA\u00f1o", query = "SELECT v FROM Vacaciones v WHERE v.vacacionesPK.a\u00f1o = :a\u00f1o")
    , @NamedQuery(name = "Vacaciones.findByMedioDia", query = "SELECT v FROM Vacaciones v WHERE v.medioDia = :medioDia")})
public class Vacaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VacacionesPK vacacionesPK;
    @Column(name = "MedioDia")
    private Boolean medioDia;
    @JoinColumn(name = "DowId", referencedColumnName = "DowId", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuarios usuarios;

    public Vacaciones() {
    }

    public Vacaciones(VacacionesPK vacacionesPK) {
        this.vacacionesPK = vacacionesPK;
    }

    public Vacaciones(String dowId, int dia, int mes, int año) {
        this.vacacionesPK = new VacacionesPK(dowId, dia, mes, año);
    }

    public VacacionesPK getVacacionesPK() {
        return vacacionesPK;
    }

    public void setVacacionesPK(VacacionesPK vacacionesPK) {
        this.vacacionesPK = vacacionesPK;
    }

    public Boolean getMedioDia() {
        return medioDia;
    }

    public void setMedioDia(Boolean medioDia) {
        this.medioDia = medioDia;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vacacionesPK != null ? vacacionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vacaciones)) {
            return false;
        }
        Vacaciones other = (Vacaciones) object;
        if ((this.vacacionesPK == null && other.vacacionesPK != null) || (this.vacacionesPK != null && !this.vacacionesPK.equals(other.vacacionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domini.Vacaciones[ vacacionesPK=" + vacacionesPK + " ]";
    }
    
}
