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
public class FestivosDTO {
    protected FestivosPKDTO festivosPK;   
    private String descripción;

    public FestivosDTO() {
    }

    public FestivosDTO(FestivosPKDTO festivosPK) {
        this.festivosPK = festivosPK;
    }

    public FestivosPKDTO getFestivosPK() {
        return festivosPK;
    }

    public void setFestivosPK(FestivosPKDTO festivosPK) {
        this.festivosPK = festivosPK;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
    
    
}
