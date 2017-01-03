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
public class VacacionesPKDTO {
    private String dowId;    
    private int dia;    
    private int mes;    
    private int año;

    public VacacionesPKDTO() {
    }

    public VacacionesPKDTO(String dowId, int dia, int mes, int año) {
        this.dowId = dowId;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String getDowId() {
        return dowId;
    }

    public void setDowId(String dowId) {
        this.dowId = dowId;
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
    
    
}
