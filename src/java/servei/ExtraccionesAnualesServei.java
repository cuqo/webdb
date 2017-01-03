/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servei;

import dao.IExtraccionesAnualesFacade;
import domini.ExtraccionesAnuales;
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
public class ExtraccionesAnualesServei implements IExtraccionesAnualesServei, Serializable{
    @Inject
    private IExtraccionesAnualesFacade extraccionesAnualesDao;

    @Transactional
    @Override
    public List<ExtraccionesAnuales> llistarExtraccionsAnuals() {
        return extraccionesAnualesDao.findAll();
    }

    @Transactional
    @Override
    public void inserirExtraccionsAnuals(ExtraccionesAnuales extraccioAnual) {
        extraccionesAnualesDao.create(extraccioAnual);
    }

    @Transactional
    @Override
    public ExtraccionesAnuales obtenirExtraccionsAnuals(String dowId) {
        return extraccionesAnualesDao.find(dowId);
    }

    @Transactional
    @Override
    public void modificarExtraccionsAnuals(ExtraccionesAnuales extraccioAnual) {
        extraccionesAnualesDao.edit(extraccioAnual);
    }

    @Transactional
    @Override
    public void eliminarExtraccionsAnuals(String dowId) {
        extraccionesAnualesDao.remove(extraccionesAnualesDao.find(dowId));
    }
}
