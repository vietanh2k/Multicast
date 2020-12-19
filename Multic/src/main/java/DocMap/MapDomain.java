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
public class MapDomain {
    static ArrayList<Edge> listCanhD;
    static ArrayList<Integer> listDichD;
    
    public MapDomain(){
        for(int i=0; i<DocFile.listCanhDomain.size();i++){
            int d11 = DocFile.listCanhDomain.get(i).d1;
            int d22 = DocFile.listCanhDomain.get(i).d2;
            double w = DocFile.listCanhDomain.get(i).kc;
        for(int j=0;j< DocFile.SoDomain;j++)      
        {   int t1 = 0,t2=0;
            if(DocFile.listDinhDomain.get(j).contains(d11)) t1 = j;
            if(DocFile.listDinhDomain.get(j).contains(d22)) t2 = j;
            if(t1 != t2 && t1 != 0 && t2 != 0){
              Edge  edge = new Edge(t1, t2, w);
              listCanhD.add(edge);
        }}
    }
        for(int i=0;i<DocFile.SoDomain;i++)
        for(int j=0;j<DocFile.listDichDomain.size();j++){
            if(DocFile.listDinhDomain.get(i).contains(DocFile.listDichDomain.get(j)))
                listDichD.add(i);
        }
    }
}