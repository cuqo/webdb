/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servei;

import dao.IVacacionesFacade;
import domini.Vacaciones;
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
public class VacacionesServei implements IVacacionesServei, Serializable{
    @Inject
    private IVacacionesFacade vacancesDao;

    @Transactional
    @Override
    public List<Vacaciones> llistarVacances() {
        return vacancesDao.findAll();
    }

    @Transactional
    @Override
    public void inserirVacances(Vacaciones vacances) {
        vacancesDao.create(vacances);
    }

    @Transactional
    @Override
    public Vacaciones obtenirVacances(String dowId) {
        return vacancesDao.find(dowId);
    }

    @Transactional
    @Override
    public void modificarVacances(Vacaciones vacances) {
        vacancesDao.edit(vacances);
    }

    @Transactional
    @Override
    public void eliminarVacances(String dowId) {
        vacancesDao.remove(vacancesDao.find(dowId));
    }
}
