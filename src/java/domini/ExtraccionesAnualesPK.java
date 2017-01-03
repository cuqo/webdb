/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domini;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ND17613
 */
@Embeddable
public class ExtraccionesAnualesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "A\u00f1o")
    private int año;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "DowId")
    private String dowId;

    public ExtraccionesAnualesPK() {
    }

    public ExtraccionesAnualesPK(int año, String dowId) {
        this.año = año;
        this.dowId = dowId;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getDowId() {
        return dowId;
    }

    public void setDowId(String dowId) {
        this.dowId = dowId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) año;
        hash += (dowId != null ? dowId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExtraccionesAnualesPK)) {
            return false;
        }
        ExtraccionesAnualesPK other = (ExtraccionesAnualesPK) object;
        if (this.año != other.año) {
            return false;
        }
        if ((this.dowId == null && other.dowId != null) || (this.dowId != null && !this.dowId.equals(other.dowId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domini.ExtraccionesAnualesPK[ a\u00f1o=" + año + ", dowId=" + dowId + " ]";
    }
    
}
