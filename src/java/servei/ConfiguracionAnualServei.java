/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servei;

import dao.IConfiguracionAnualFacade;
import domini.ConfiguracionAnual;
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
public class ConfiguracionAnualServei implements IConfiguracionAnualServei, Serializable{
    @Inject
    private IConfiguracionAnualFacade configuracionAnualDao;

    @Transactional
    @Override
    public List<ConfiguracionAnual> llistarConfiguracionAnuals() {
        return configuracionAnualDao.findAll();
    }

    @Transactional
    @Override
    public void inserirConfiguracionAnual(ConfiguracionAnual configuracioAnual) {
        configuracionAnualDao.create(configuracioAnual);
    }

    @Transactional
    @Override
    public ConfiguracionAnual obtenirConfiguracionAnual(String dowId) {
        return configuracionAnualDao.find(dowId);
    }

    @Transactional
    @Override
    public void modificarConfiguracionAnual(ConfiguracionAnual configuracioAnual) {
        configuracionAnualDao.edit(configuracioAnual);
    }

    @Transactional
    @Override
    public void eliminarConfiguracionAnual(String dowId) {
        configuracionAnualDao.remove(configuracionAnualDao.find(dowId));
    }
}
