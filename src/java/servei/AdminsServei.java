/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servei;

import dao.IAdminsFacade;
import domini.Admins;
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
public class AdminsServei implements IAdminsServei, Serializable{
    @Inject
    private IAdminsFacade adminDao;

    @Transactional
    @Override
    public List<Admins> llistarAdmins() {
        return adminDao.findAll();
    }

    @Transactional
    @Override
    public void inserirAdmin(Admins admin) {
        adminDao.create(admin);
    }

    @Transactional
    @Override
    public Admins obtenirAdmin(String dowId) {
        return adminDao.find(dowId);
    }

    @Transactional
    @Override
    public void modificarAdmin(Admins admin) {
        adminDao.edit(admin);
    }

    @Transactional
    @Override
    public void eliminarAdmin(String dowId) {
        adminDao.remove(adminDao.find(dowId));
    }
}
