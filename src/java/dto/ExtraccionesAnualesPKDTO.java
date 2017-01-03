/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author ND17613
 */
public class ExtraccionesAnualesPKDTO {
    private int año;    
    private String dowId;

    public ExtraccionesAnualesPKDTO() {
    }

    public ExtraccionesAnualesPKDTO(int año, String dowId) {
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
    
    
}
