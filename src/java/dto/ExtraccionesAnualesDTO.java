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
public class ExtraccionesAnualesDTO {
    protected ExtraccionesAnualesPKDTO extraccionesAnualesPK;    
    private String fechaExtraccion;     
    private Double pendientes;    
    private Double disfrutadas;    
    private Double vacaciones;

    public ExtraccionesAnualesDTO() {
    }

    public ExtraccionesAnualesDTO(ExtraccionesAnualesPKDTO extraccionesAnualesPK) {
        this.extraccionesAnualesPK = extraccionesAnualesPK;
    }
    
    public ExtraccionesAnualesDTO(int año, String dowId) {
        this.extraccionesAnualesPK = new ExtraccionesAnualesPKDTO(año, dowId);
    }

    public ExtraccionesAnualesPKDTO getExtraccionesAnualesPK() {
        return extraccionesAnualesPK;
    }

    public void setExtraccionesAnualesPK(ExtraccionesAnualesPKDTO extraccionesAnualesPK) {
        this.extraccionesAnualesPK = extraccionesAnualesPK;
    }

    public String getFechaExtraccion() {
        return fechaExtraccion;
    }

    public void setFechaExtraccion(String fechaExtraccion) {
        this.fechaExtraccion = fechaExtraccion;
    }

    public Double getPendientes() {
        return pendientes;
    }

    public void setPendientes(Double pendientes) {
        this.pendientes = pendientes;
    }

    public Double getDisfrutadas() {
        return disfrutadas;
    }

    public void setDisfrutadas(Double disfrutadas) {
        this.disfrutadas = disfrutadas;
    }

    public Double getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(Double vacaciones) {
        this.vacaciones = vacaciones;
    } 
          
    
}
