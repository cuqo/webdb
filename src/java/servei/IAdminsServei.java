/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servei;

import domini.Admins;
import java.util.List;

/**
 *
 * @author ND17613
 */
public interface IAdminsServei {
    public List<Admins> llistarAdmins();
    public void inserirAdmin(Admins admin);
    public Admins obtenirAdmin(String dowId);
    public void modificarAdmin(Admins admin);
    public void eliminarAdmin(String dowId);
}
