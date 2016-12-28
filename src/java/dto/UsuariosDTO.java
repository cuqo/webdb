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
public class UsuariosDTO {
    private String dowId;    
    private String nombre;    
    private String apellidos;    
    private Double vacacionesPendientes;    
    private Double vacacionesPendientesArrastradas;    
    private Double vacacionesDisfrutadas;    
    private String departamento;    
    private String planta;    
    private String localizacion;    
    private String funcion;    
    private Double vacaciones;

    public UsuariosDTO() {
    }

    public UsuariosDTO(String dowId) {
        this.dowId = dowId;
    }

    public UsuariosDTO(String dowId, String nombre, String apellidos) {
        this.dowId = dowId;
        this.nombre = nombre;
        this.apellidos = apellidos;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Double getVacacionesPendientes() {
        return vacacionesPendientes;
    }

    public void setVacacionesPendientes(Double vacacionesPendientes) {
        this.vacacionesPendientes = vacacionesPendientes;
    }

    public Double getVacacionesPendientesArrastradas() {
        return vacacionesPendientesArrastradas;
    }

    public void setVacacionesPendientesArrastradas(Double vacacionesPendientesArrastradas) {
        this.vacacionesPendientesArrastradas = vacacionesPendientesArrastradas;
    }

    public Double getVacacionesDisfrutadas() {
        return vacacionesDisfrutadas;
    }

    public void setVacacionesDisfrutadas(Double vacacionesDisfrutadas) {
        this.vacacionesDisfrutadas = vacacionesDisfrutadas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public Double getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(Double vacaciones) {
        this.vacaciones = vacaciones;
    }
    
    
}
