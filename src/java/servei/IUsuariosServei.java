/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servei;

import domini.Usuarios;
import java.util.List;

/**
 *
 * @author ND17613
 */
public interface IUsuariosServei {
    public List<Usuarios> llistarUsuaris();
    public void inserirUsuari(Usuarios usuari);
    public Usuarios obtenirUsuari(String dowId);
    public void modificarUsuari(Usuarios usuari);
//    public void eliminarUsuari(Usuarios usuari);
    public void eliminarUsuari(String dowId);
}
