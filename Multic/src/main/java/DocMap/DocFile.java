/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DocMap;

import ACO.Edge;
import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VietAnh
 */
public class DocFile {
    static int soNode;
    static int SoDomain;
    static ArrayList<Integer> listDichDomain;
    static ArrayList<ArrayList<Integer>> listDinhDomain;
    static ArrayList<Edge> listCanhDomain;
    public DocFile() throws IOException{
        File file = new File("C:\\Users\\VietAnh\\Downloads\\idpc_ndu_427_7_14927.txt");
        Scanner scan = new Scanner(file);
        soNode = scan.nextInt();
        SoDomain = scan.nextInt();
        scan.nextLine();
        
    }
}
