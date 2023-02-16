/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import java.util.ArrayList;

/**
 *
 * @author nnminh322
 */
public interface DAOInterface<T> {
    
    public int insert(T t);
    
    public int update(T tCu,T tMoi);
    
    public int delete(T t);
    
    public ArrayList<T> selectAll();
    
    public ArrayList<T> find(String Condition);
}
