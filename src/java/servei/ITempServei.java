/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servei;

import domini.Temp;
import java.util.List;

/**
 *
 * @author ND17613
 */
public interface ITempServei {
    public List<Temp> llistarTemps();
    public void inserirTemp(Temp temp);
    public Temp obtenirTemp(String dowId);
    public void modificarTemp(Temp temp);
    public void eliminarTemp(String dowId);
}
