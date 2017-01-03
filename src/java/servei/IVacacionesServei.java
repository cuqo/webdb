/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servei;

import domini.Vacaciones;
import java.util.List;

/**
 *
 * @author ND17613
 */
public interface IVacacionesServei {
    public List<Vacaciones> llistarVacances();
    public void inserirVacances(Vacaciones vacances);
    public Vacaciones obtenirVacances(String dowId);
    public void modificarVacances(Vacaciones vacances);
    public void eliminarVacances(String dowId);
}
