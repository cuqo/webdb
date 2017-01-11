/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ND17613
 */
@RequestScoped
public class ConfiguracionAnualDTO {
    private Integer idTemp;    
    private Integer totalVacaciones;    
    private Integer vacacionesFijas;    
    private Integer vacacionesMoviles;    
    private String año;    
    private Integer vacacionesUsuario;

    public ConfiguracionAnualDTO() {
    }

    public ConfiguracionAnualDTO(Integer idTemp) {
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
    
    
}
