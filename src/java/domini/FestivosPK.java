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

/**
 *
 * @author ND17613
 */
@Embeddable
public class FestivosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "Dia")
    private int dia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Mes")
    private int mes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "A\u00f1o")
    private int año;

    public FestivosPK() {
    }

    public FestivosPK(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) dia;
        hash += (int) mes;
        hash += (int) año;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FestivosPK)) {
            return false;
        }
        FestivosPK other = (FestivosPK) object;
        if (this.dia != other.dia) {
            return false;
        }
        if (this.mes != other.mes) {
            return false;
        }
        if (this.año != other.año) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domini.FestivosPK[ dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + año + " ]";
    }
    
}
