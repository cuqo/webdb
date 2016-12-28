/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domini;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author ND17613
 */
@Entity
@Table(name = "Usuarios")
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u")
    , @NamedQuery(name = "Usuarios.findByDowId", query = "SELECT u FROM Usuarios u WHERE u.dowId = :dowId")
    , @NamedQuery(name = "Usuarios.findByNombre", query = "SELECT u FROM Usuarios u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "Usuarios.findByApellidos", query = "SELECT u FROM Usuarios u WHERE u.apellidos = :apellidos")
    , @NamedQuery(name = "Usuarios.findByVacacionesPendientes", query = "SELECT u FROM Usuarios u WHERE u.vacacionesPendientes = :vacacionesPendientes")
    , @NamedQuery(name = "Usuarios.findByVacacionesPendientesArrastradas", query = "SELECT u FROM Usuarios u WHERE u.vacacionesPendientesArrastradas = :vacacionesPendientesArrastradas")
    , @NamedQuery(name = "Usuarios.findByVacacionesDisfrutadas", query = "SELECT u FROM Usuarios u WHERE u.vacacionesDisfrutadas = :vacacionesDisfrutadas")
    , @NamedQuery(name = "Usuarios.findByDepartamento", query = "SELECT u FROM Usuarios u WHERE u.departamento = :departamento")
    , @NamedQuery(name = "Usuarios.findByPlanta", query = "SELECT u FROM Usuarios u WHERE u.planta = :planta")
    , @NamedQuery(name = "Usuarios.findByLocalizacion", query = "SELECT u FROM Usuarios u WHERE u.localizacion = :localizacion")
    , @NamedQuery(name = "Usuarios.findByFuncion", query = "SELECT u FROM Usuarios u WHERE u.funcion = :funcion")
    , @NamedQuery(name = "Usuarios.findByVacaciones", query = "SELECT u FROM Usuarios u WHERE u.vacaciones = :vacaciones")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "DowId")
    private String dowId;
    @Size(max = 255)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 255)
    @Column(name = "Apellidos")
    private String apellidos;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VacacionesPendientes")
    private Double vacacionesPendientes;
    @Column(name = "VacacionesPendientesArrastradas")
    private Double vacacionesPendientesArrastradas;
    @Column(name = "VacacionesDisfrutadas")
    private Double vacacionesDisfrutadas;
    @Size(max = 255)
    @Column(name = "Departamento")
    private String departamento;
    @Size(max = 255)
    @Column(name = "Planta")
    private String planta;
    @Size(max = 255)
    @Column(name = "Localizacion")
    private String localizacion;
    @Size(max = 255)
    @Column(name = "Funcion")
    private String funcion;
    @Column(name = "Vacaciones")
    private Double vacaciones;

    public Usuarios() {
    }

    public Usuarios(String dowId) {
        this.dowId = dowId;
    }

    public Usuarios(String dowId, String nombre, String apellidos) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dowId != null ? dowId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.dowId == null && other.dowId != null) || (this.dowId != null && !this.dowId.equals(other.dowId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domini.Usuarios[ dowId=" + dowId + " ]";
    }
    
}
