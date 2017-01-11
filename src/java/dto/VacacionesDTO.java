/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import domini.Usuarios;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ND17613
 */
@RequestScoped
public class VacacionesDTO {
    protected VacacionesPKDTO vacacionesPK;    
    private Boolean medioDia;    
    private Usuarios usuarios;

    public VacacionesDTO() {
    }

    public VacacionesDTO(VacacionesPKDTO vacacionesPK) {
        this.vacacionesPK = vacacionesPK;
    }

    public VacacionesDTO(String dowId, int dia, int mes, int año) {
        this.vacacionesPK = new VacacionesPKDTO(dowId, dia, mes, año);
    }

    public VacacionesPKDTO getVacacionesPK() {
        return vacacionesPK;
    }

    public void setVacacionesPK(VacacionesPKDTO vacacionesPK) {
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
    
    
}
