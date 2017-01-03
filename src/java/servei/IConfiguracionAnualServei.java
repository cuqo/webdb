/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servei;

import domini.ConfiguracionAnual;
import java.util.List;

/**
 *
 * @author ND17613
 */
public interface IConfiguracionAnualServei {
    public List<ConfiguracionAnual> llistarConfiguracionAnuals();
    public void inserirConfiguracionAnual(ConfiguracionAnual configuracioAnual);
    public ConfiguracionAnual obtenirConfiguracionAnual(String dowId);
    public void modificarConfiguracionAnual(ConfiguracionAnual configuracioAnual);
    public void eliminarConfiguracionAnual(String dowId);
}
