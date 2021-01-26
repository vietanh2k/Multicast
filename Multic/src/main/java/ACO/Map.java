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
    public ArrayList<Edge> listCanh;
    public ArrayList<Integer> listDich;
    
    public Map(ArrayList<Edge> listcanh, ArrayList<Integer> listdich){
        this.listCanh = listcanh;
        this.listDich = listdich;
    }
    

    
    public ArrayList getListCanh(){
        return listCanh;
    }
    
}
