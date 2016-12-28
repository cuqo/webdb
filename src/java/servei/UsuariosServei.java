/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servei;

import dao.IUsuariosFacade;
import domini.Usuarios;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

/**
 *
 * @author ND17613
 */
@Named
@SessionScoped
public class UsuariosServei implements IUsuariosServei, Serializable{
    @Inject
    private IUsuariosFacade usuariDao;

    @Transactional
    @Override
    public List<Usuarios> llistarUsuaris() {
        return usuariDao.findAll();
    }

    @Transactional
    @Override
    public void inserirUsuari(Usuarios usuari) {
        usuariDao.create(usuari);
    }

    @Transactional
    @Override
    public Usuarios obtenirUsuari(String dowId) {
        return usuariDao.find(dowId);
    }

    @Transactional
    @Override
    public void modificarUsuari(Usuarios usuari) {
        usuariDao.edit(usuari);
    }

    @Transactional
    @Override
    public void eliminarUsuari(String dowId) {
        usuariDao.remove(usuariDao.find(dowId));
    }

    
    
}
