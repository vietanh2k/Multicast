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
         new DocFile();
         new MapDomain();

         new Map(MapDomain.listCanhD, MapDomain.listDichD);
                          
         for(int k=0;k<2;k++) {
            Aco u1 = new Aco(k);
            ArrayList<Edge> tm2 = MapNode.listCanhN;
            for(int u=0;u<u1.HTmin.size();u++) tm2.add(DocFile.listCanhDomain.get(u1.HTmin.get(u).index));
            new Map(tm2, DocFile.listDichDomain);
            for(int h=0;h<2;h++) {
                Aco h1 = new Aco(h);
                
            }
            System.out.println("ACO.Main.main()");
         }
        
    }
}
