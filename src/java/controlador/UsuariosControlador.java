/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import domini.Usuarios;
import dto.UsuariosDTO;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import servei.IUsuariosServei;

/**
 *
 * @author ND17613
 */
@Named(value="usuariosControlador")
@SessionScoped
public class UsuariosControlador implements Serializable{
    @Inject
    private UsuariosDTO usuariActual;
    
    @Inject
    private IUsuariosServei serveiUsuari;

    public UsuariosDTO getUsuariActual() {
        return usuariActual;
    }

    public void setUsuariActual(UsuariosDTO usuariActual) {
        this.usuariActual = usuariActual;
    }

    public IUsuariosServei getServeiUsuari() {
        return serveiUsuari;
    }

    public void setServeiUsuari(IUsuariosServei serveiUsuari) {
        this.serveiUsuari = serveiUsuari;
    }
        
    public List<Usuarios> llistarUsuarios() {
        return serveiUsuari.llistarUsuaris();
    }

    public String prepararInsercio() {
        netejarFormulari();
        return "FormulariInsercio";
    }

    public String crearUsuari(String dowId, String nom, String cognom) {
        Usuarios usuari = new Usuarios(dowId, nom, cognom);
        serveiUsuari.inserirUsuari(usuari);
        return "index2";
    }

    public String obtenirUsuariConsulta(String dowId) {
        Usuarios usuari = serveiUsuari.obtenirUsuari(dowId);
        passarUsuariosUsuariosDTO(usuari);
        return "Consulta";
    }

    public String obtenirUsuariModificacio(String dowId) {
        Usuarios usuari = serveiUsuari.obtenirUsuari(dowId);
        passarUsuariosUsuariosDTO(usuari);
        return "Modificacio";
    }

    public String obtenirUsuariEliminacio(String dowId) {
        Usuarios usuari = serveiUsuari.obtenirUsuari(dowId);
        passarUsuariosUsuariosDTO(usuari);
        return "Eliminacio";
    }

    public String modificarUsuari(String dowId) {
        Usuarios usuari = serveiUsuari.obtenirUsuari(dowId);
        passarUsuariosDTOUsuarios(usuari);
        serveiUsuari.modificarUsuari(usuari);
        return "index2";
    }

   public String eliminarUsuari(String dowId) {        
        serveiUsuari.eliminarUsuari(dowId);
        return "index2";
    }  
    
    //Mètodes privats
    private void passarUsuariosUsuariosDTO(Usuarios usuari) {
        usuariActual.setDowId(usuari.getDowId());
        usuariActual.setNombre(usuari.getNombre());
        usuariActual.setApellidos(usuari.getApellidos());
        usuariActual.setPlanta(usuari.getPlanta());
        usuariActual.setLocalizacion(usuari.getLocalizacion());
        usuariActual.setVacacionesPendientes(usuari.getVacacionesPendientes());
        usuariActual.setVacacionesPendientesArrastradas(usuari.getVacacionesPendientesArrastradas());
        usuariActual.setVacacionesDisfrutadas(usuari.getVacacionesDisfrutadas());
    }    

    private void passarUsuariosDTOUsuarios(Usuarios usuari) {
        usuari.setDowId(usuariActual.getDowId());
        usuari.setNombre(usuariActual.getNombre());
        usuari.setApellidos(usuariActual.getApellidos());
    }

    private void netejarFormulari() {
        usuariActual.setDowId(null);
        usuariActual.setNombre(null);
        usuariActual.setApellidos(null);        
    }
    
}
