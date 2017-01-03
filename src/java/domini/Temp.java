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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ND17613
 */
@Entity
@Table(name = "Temp")
@NamedQueries({
    @NamedQuery(name = "Temp.findAll", query = "SELECT t FROM Temp t")
    , @NamedQuery(name = "Temp.findByDowId", query = "SELECT t FROM Temp t WHERE t.dowId = :dowId")
    , @NamedQuery(name = "Temp.findByNombre", query = "SELECT t FROM Temp t WHERE t.nombre = :nombre")})
public class Temp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "DowId")
    private String dowId;
    @Size(max = 255)
    @Column(name = "Nombre")
    private String nombre;

    public Temp() {
    }

    public Temp(String dowId) {
        this.dowId = dowId;
    }

    public String getDowId() {
        return dowId;
    }

    public void setDowId(String dowId) {
        this.dowId = dowId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dowId != null ? dowId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Temp)) {
            return false;
        }
        Temp other = (Temp) object;
        if ((this.dowId == null && other.dowId != null) || (this.dowId != null && !this.dowId.equals(other.dowId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domini.Temp[ dowId=" + dowId + " ]";
    }
    
}
