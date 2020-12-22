/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACO;

import DocMap.DocFile;
import DocMap.MapDomain;
import java.io.IOException;

/**
 *
 * @author VietAnh
 */
public class Main {
    public static void main(String[] args) throws IOException {
         new DocFile();
         new MapDomain();
         new Map(MapDomain.listCanhD, MapDomain.listDichD);
         new Aco();
        
    }
}
