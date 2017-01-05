/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.inject.Named;

/**
 *
 * @author ND17613
 */
@Named(value = "menuBean")
@SessionScoped
public class MenuBean implements Serializable {

    private String selectedLocalitzacio;
    private String selectedPlanta;

    public String getSelectedPlanta() {
        return selectedPlanta;
    }

    public void setSelectedPlanta(String selectedPlanta) {
        this.selectedPlanta = selectedPlanta;
    }
    

    public String getSelectedLocalitzacio() {
        return selectedLocalitzacio;
    }

    public void setSelectedLocalitzacio(String selectedLocalitzacio) {
        this.selectedLocalitzacio = selectedLocalitzacio;
    }

    public String[] getLocalitzacio() {
        return new String[]{"Selecciona una opció", "DOW NORTH", "DOW SOUTH"};
    }

    public String[] getPlanta() {
        if (selectedLocalitzacio != null && selectedLocalitzacio.equals("Selecciona una opció")) {
            return new String[]{"Selecciona una localització"};
        } else if (selectedLocalitzacio != null && selectedLocalitzacio.equals("DOW NORTH")) {
            return new String[]{"Selecciona una planta","Cracker", "Octè"};
        } else if(selectedLocalitzacio != null && selectedLocalitzacio.equals("DOW SOUTH")){
            return new String[]{"Selecciona una planta","Planta 1", "Planta 2"};
        }else{
            return new String[]{"Selecciona una localització"};
        }
    }
    
    public String[] getDepartament(){
        if (selectedPlanta != null && selectedPlanta.equals("Selecciona una localització")) {
            return new String[]{"Selecciona una planta"};
        } else if (selectedPlanta != null && selectedPlanta.equals("Cracker")) {
            return new String[]{"Selecciona un departament","Departament 1", "Departament 2"};
        } else if(selectedPlanta != null && selectedPlanta.equals("Octè")){
            return new String[]{"Selecciona un departament","Departament 3", "Departament 4"};
        }else if(selectedPlanta != null && selectedPlanta.equals("Planta 1")){
            return new String[]{"Selecciona un departament","Departament 5", "Departament 6"};
        }else if(selectedPlanta != null && selectedPlanta.equals("Planta 2")){
            return new String[]{"Selecciona un departament","Departament 7", "Departament 8"};
        }else{
            return new String[]{"Selecciona una planta"};
        }
    }

}
