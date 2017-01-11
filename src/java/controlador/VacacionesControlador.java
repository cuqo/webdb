/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import servei.IVacacionesServei;
import dto.VacacionesDTO;
import dto.VacacionesPKDTO;

/**
 *
 * @author ND17613
 */
@Named(value="vacacionesControlador")
@SessionScoped
public class VacacionesControlador implements Serializable{
    @Inject
    private VacacionesDTO vacancesActual;
    
    @Inject
    private VacacionesPKDTO vacancesPKActual;
    
    @Inject
    private IVacacionesServei serveiVacances;

    public VacacionesDTO getVacancesActual() {
        return vacancesActual;
    }

    public void setVacancesActual(VacacionesDTO vacancesActual) {
        this.vacancesActual = vacancesActual;
    }

    public IVacacionesServei getServeiVacances() {
        return serveiVacances;
    }

    public void setServeiVacances(IVacacionesServei serveiVacances) {
        this.serveiVacances = serveiVacances;
    }
    
    public String prepararInsercio() {
        netejarFormulari();
        return "FormulariInsercio";
    }
    
    private void netejarFormulari() {
        vacancesActual.setMedioDia(null);
        vacancesActual.setUsuarios(null);
        vacancesPKActual.setAño(0);
    }
    
}
