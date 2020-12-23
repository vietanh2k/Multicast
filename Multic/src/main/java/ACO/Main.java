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
        
        ArrayList<Edge> c = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();
        Edge t1 = new Edge(1, 2, 2, 1);
        Edge t2 = new Edge(1, 3, 2, 1);
        Edge t3 = new Edge(3, 2, 2, 1);
        Edge t4 = new Edge(2, 4, 2, 1);
        Edge t5 = new Edge(4, 5, 2, 1);
        Edge t6 = new Edge(4, 6, 2, 1);
        Edge t7 = new Edge(5, 7, 2, 1);
        Edge t8 = new Edge(6, 5, 2, 1);
        c.add(t1);c.add(t2);c.add(t3);c.add(t4);c.add(t5);c.add(t6);c.add(t7);c.add(t8);
        d.add(7);
        new Map(c, d);
       Aco a1 = new Aco(1);
        System.out.println(Map.listCanh.size());
  //       new DocFile();
 //         new MapDomain();
//         System.out.println(MapDomain.listCanhD.size());
//         System.out.println(DocFile.listCanhDomain.size());
//         
//         for(int i=0;i<DocFile.listCanhDomain.size();i++) System.out.println(DocFile.listCanhDomain.get(i).d1);
//         
 //      Map m1 = new Map(MapDomain.listCanhD, MapDomain.listDichD);
//       for(int i=0;i<m1.listCanh.size();i++) System.out.println(m1.listCanh.size());
//                            System.out.println("ACO.Main.main()");
//         for(int k=0;k<1;k++) {
 //           Aco u1 = new Aco(1);
 //         System.out.println("ACO.Main.main()");
//            ArrayList<Edge> tm2 = MapNode.listCanhN;
//            System.out.println(tm2.size());
//            for(int u=0;u<u1.HTmin.size();u++) tm2.add(DocFile.listCanhDomain.get(u1.HTmin.get(u).index));
//            new Map(tm2, DocFile.listDichDomain);
//            for(int h=0;h<2;h++) {
//                Aco h1 = new Aco(h);
//                
//           }
//            System.out.println("ACO.Main.main()");
//        }
        
    }
}
