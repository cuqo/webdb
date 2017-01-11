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
public class TempDTO {
    private String dowId;    
    private String nombre;

    public TempDTO() {
    }

    public TempDTO(String dowId) {
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
    
    
}
