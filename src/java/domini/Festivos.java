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
@Table(name = "Festivos")
@NamedQueries({
    @NamedQuery(name = "Festivos.findAll", query = "SELECT f FROM Festivos f")
    , @NamedQuery(name = "Festivos.findByDia", query = "SELECT f FROM Festivos f WHERE f.festivosPK.dia = :dia")
    , @NamedQuery(name = "Festivos.findByMes", query = "SELECT f FROM Festivos f WHERE f.festivosPK.mes = :mes")
    , @NamedQuery(name = "Festivos.findByDescripci\u00f3n", query = "SELECT f FROM Festivos f WHERE f.descripci\u00f3n = :descripci\u00f3n")
    , @NamedQuery(name = "Festivos.findByA\u00f1o", query = "SELECT f FROM Festivos f WHERE f.festivosPK.a\u00f1o = :a\u00f1o")})
public class Festivos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FestivosPK festivosPK;
    @Size(max = 255)
    @Column(name = "Descripci\u00f3n")
    private String descripción;

    public Festivos() {
    }

    public Festivos(FestivosPK festivosPK) {
        this.festivosPK = festivosPK;
    }

    public Festivos(int dia, int mes, int año) {
        this.festivosPK = new FestivosPK(dia, mes, año);
    }

    public FestivosPK getFestivosPK() {
        return festivosPK;
    }

    public void setFestivosPK(FestivosPK festivosPK) {
        this.festivosPK = festivosPK;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (festivosPK != null ? festivosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Festivos)) {
            return false;
        }
        Festivos other = (Festivos) object;
        if ((this.festivosPK == null && other.festivosPK != null) || (this.festivosPK != null && !this.festivosPK.equals(other.festivosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domini.Festivos[ festivosPK=" + festivosPK + " ]";
    }
    
}
