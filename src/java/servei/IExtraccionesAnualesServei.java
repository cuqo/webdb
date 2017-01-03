/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servei;

import domini.ExtraccionesAnuales;
import java.util.List;

/**
 *
 * @author ND17613
 */
public interface IExtraccionesAnualesServei {
    public List<ExtraccionesAnuales> llistarExtraccionsAnuals();
    public void inserirExtraccionsAnuals(ExtraccionesAnuales extraccioAnual);
    public ExtraccionesAnuales obtenirExtraccionsAnuals(String dowId);
    public void modificarExtraccionsAnuals(ExtraccionesAnuales extraccioAnual);
    public void eliminarExtraccionsAnuals(String dowId);
}
