/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocMap;

import ACO.Edge;
import java.util.ArrayList;

/**
 *
 * @author VietAnh
 */
public class MapNode {
    static ArrayList<Edge> listCanhN;
    static ArrayList<Integer> listDichN;

    public MapNode(int k) {
        for(int i=0; i<DocFile.listCanhDomain.size();i++){
            int d11 = DocFile.listCanhDomain.get(i).d1;
            int d22 = DocFile.listCanhDomain.get(i).d2;
            double w = DocFile.listCanhDomain.get(i).kc;     
            if(DocFile.listDinhDomain.get(k).contains(d11) && DocFile.listDinhDomain.get(k).contains(d22)){
              listCanhN.add(DocFile.listCanhDomain.get(i));
        }
    }
            
    }
    
}
