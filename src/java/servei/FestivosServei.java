/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servei;

import dao.IFestivosFacade;
import domini.Festivos;
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
public class FestivosServei implements IFestivosServei, Serializable{
    @Inject
    private IFestivosFacade festiuDao;

    @Transactional
    @Override
    public List<Festivos> llistarFestius() {
        return festiuDao.findAll();
    }

    @Transactional
    @Override
    public void inserirFestiu(Festivos festiu) {
        festiuDao.create(festiu);
    }

    @Transactional
    @Override
    public Festivos obtenirFestiu(String dowId) {
        return festiuDao.find(dowId);
    }

    @Transactional
    @Override
    public void modificarFestiu(Festivos festiu) {
        festiuDao.edit(festiu);
    }

    @Transactional
    @Override
    public void eliminarFestiu(String dowId) {
        festiuDao.remove(festiuDao.find(dowId));
    }
}
