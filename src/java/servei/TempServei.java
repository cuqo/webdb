/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servei;

import dao.ITempFacade;
import domini.Temp;
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
public class TempServei implements ITempServei, Serializable{
    @Inject
    private ITempFacade tempDao;

    @Transactional
    @Override
    public List<Temp> llistarTemps() {
        return tempDao.findAll();
    }

    @Transactional
    @Override
    public void inserirTemp(Temp temp) {
        tempDao.create(temp);
    }

    @Transactional
    @Override
    public Temp obtenirTemp(String dowId) {
        return tempDao.find(dowId);
    }

    @Transactional
    @Override
    public void modificarTemp(Temp temp) {
        tempDao.edit(temp);
    }

    @Transactional
    @Override
    public void eliminarTemp(String dowId) {
        tempDao.remove(tempDao.find(dowId));
    }
}
