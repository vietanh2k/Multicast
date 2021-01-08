/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;

import DocMap.DocFile;
import DocMap.MapDomain;
import DocMap.MapNode;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author VietAnh
 */
public class Main {
    public static void main(String[] args) throws IOException  {
        double S = 9999;
        ArrayList<Edge> HT = new ArrayList<>();
        new DocFile();
        new MapNode();
        new MapDomain();
        
        Map M1 = new Map(MapDomain.listCanhD, MapDomain.listDichD);
        Aco u1 = new Aco(M1);
        for(int k=0;k<50;k++){
            u1.ChayACO(k);
            ArrayList<Edge> tm2 = new ArrayList<>();
            for(int i=0;i<MapNode.listCanhN.size();i++) tm2.add(MapNode.listCanhN.get(i));
            for(int u=0;u<u1.getHT2min().size();u++) tm2.add(DocFile.listCanhDomain.get(u1.getHT2min().get(u).getindex()));
            Map M2 = new Map(tm2, DocFile.listDichDomain);
            Aco u2 = new Aco(M2);
            for(int h=0;h<10;h++){
                u2.ChayACO(h);
                if(u2.getSmin()<S){
                    S= u2.getSmin();
                    HT = u2.getHT2min();
                }
            }
        }
        System.out.println(S); 
        for(int i=0;i<HT.size();i++)
            System.out.println(HT.get(i).getd1()+" "+HT.get(i).getd2());
    }
}
