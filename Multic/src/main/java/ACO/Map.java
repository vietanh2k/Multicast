/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;

import java.util.ArrayList;

/**
 *
 * @author VietAnh
 */
public class Map {
    public static ArrayList<Edge> listCanh;
    public static ArrayList<Integer> listDinh;
    public static ArrayList<Integer> listDich;
    
    public Map(ArrayList<Edge> listcanh, ArrayList<Integer> listdich){
        listCanh = new ArrayList<>();
        listDich = new ArrayList<>();
        listCanh = listcanh;
        listDich = listdich;
    }
    
    public void setListCanh(){
        this.listCanh= listCanh;
        }
    
    public ArrayList getListCanh(){
        return listCanh;
    }
    
}
