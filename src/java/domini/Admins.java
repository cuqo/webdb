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
@Table(name = "Admins")
@NamedQueries({
    @NamedQuery(name = "Admins.findAll", query = "SELECT a FROM Admins a")
    , @NamedQuery(name = "Admins.findByDowId", query = "SELECT a FROM Admins a WHERE a.dowId = :dowId")
    , @NamedQuery(name = "Admins.findByNombre", query = "SELECT a FROM Admins a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Admins.findByComentarios", query = "SELECT a FROM Admins a WHERE a.comentarios = :comentarios")})
public class Admins implements Serializable {

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
    @Size(max = 255)
    @Column(name = "Comentarios")
    private String comentarios;

    public Admins() {
    }

    public Admins(String dowId) {
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

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
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
        if (!(object instanceof Admins)) {
            return false;
        }
        Admins other = (Admins) object;
        if ((this.dowId == null && other.dowId != null) || (this.dowId != null && !this.dowId.equals(other.dowId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domini.Admins[ dowId=" + dowId + " ]";
    }
    
}
