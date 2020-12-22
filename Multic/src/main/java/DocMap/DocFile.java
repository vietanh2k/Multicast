/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocMap;

import ACO.Edge;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VietAnh
 */
public class DocFile {
    static int soNode;
    static int SoDomain;
    public static ArrayList<Integer> listDichDomain;
    static ArrayList<ArrayList<Integer>> listDinhDomain;
    static ArrayList<Edge> listCanhDomain;
    public DocFile() throws IOException{
        listDichDomain = new ArrayList<>();
        listDinhDomain = new ArrayList<>();
        listCanhDomain = new ArrayList<>();
        File file = new File("C:\\Users\\VietAnh\\Downloads\\idpc_ndu_427_7_14927.txt");
        try (Scanner scan = new Scanner(file)) {
            soNode = scan.nextInt();
            SoDomain = scan.nextInt();
            scan.nextLine();
            String[] temp = scan.nextLine().split(" ");
            for (String temp1 : temp) {   	
                listDichDomain.add(Integer.parseInt(temp1));
            }
            
            for(int j=0;j< SoDomain;j++) {
                String[] temp1 = scan.nextLine().split(" ");
                for(int j1=0;j1<temp1.length;j1++) listDinhDomain.get(j1).add(Integer.parseInt(temp1[j1]));
            }
            
            while(scan.hasNextLine()) {
                int t1 = scan.nextInt();
                int t2 = scan.nextInt();
                int t3 = scan.nextInt();
                scan.nextLine();
                Edge ex = new Edge(t1, t2, t3);
                listCanhDomain.add(ex);
            }
        }
    }
}
