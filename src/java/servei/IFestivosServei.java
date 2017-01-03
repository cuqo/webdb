/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servei;

import domini.Festivos;
import java.util.List;

/**
 *
 * @author ND17613
 */
public interface IFestivosServei {
    public List<Festivos> llistarFestius();
    public void inserirFestiu(Festivos festiu);
    public Festivos obtenirFestiu(String dowId);
    public void modificarFestiu(Festivos festiu);
    public void eliminarFestiu(String dowId);
}
