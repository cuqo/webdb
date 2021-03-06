/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author ND17613
 * @param <T>
 */
public interface IAbstractFacade<T> {
    public void create(T entity);
    public void edit(T entity);
    public void remove(T entity);
    public T find(Object id);
    public List<T> findAll();
}
