/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import domini.Usuarios;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import servei.IVacacionesServei;
import dto.VacacionesDTO;
import dto.VacacionesPKDTO;
import java.util.Map;
import javax.faces.context.FacesContext;
import javax.servlet.http.Cookie;
import servei.IUsuariosServei;

/**
 *
 * @author ND17613
 */
@Named(value = "vacacionesControlador")
@SessionScoped
public class VacacionesControlador implements Serializable {

    @Inject
    private VacacionesDTO vacancesActual;

    @Inject
    private VacacionesPKDTO vacancesPKActual;

    @Inject
    private IVacacionesServei serveiVacances;

    @Inject
    private IUsuariosServei serveiUsuari;

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
        Map<String, Object> cookies = FacesContext.getCurrentInstance().getExternalContext().getRequestCookieMap();
        Cookie cookie = (Cookie) cookies.get("dowid");
        String dowid = cookie.getValue();
        Usuarios usuari = serveiUsuari.obtenirUsuari(dowid);
        
        vacancesPKActual.setAño(0);
        vacancesPKActual.setDia(0);
        vacancesPKActual.setDowId(dowid);
        vacancesPKActual.setMes(0);
        vacancesActual.setUsuarios(usuari);
        vacancesActual.setMedioDia(null);
        vacancesActual.setVacacionesPK(vacancesPKActual);       
    }

}
