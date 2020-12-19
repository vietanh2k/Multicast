/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author VietAnh
 */
public class Map {
    static ArrayList<Edge> listCanh;
    static ArrayList<Integer> listDinh;
    static ArrayList<Integer> listDich;
    
    public Map(ArrayList<Edge> listcanh, ArrayList<Integer> listdinh, ArrayList<Integer> listdich){
        listCanh = listcanh;
        listDich = listdich;
        listDinh = listdinh;
    }
    
}
