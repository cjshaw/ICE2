
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Clint
 */
public class ICE {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);

        File file = new File("cipher_test.txt");

        in = new Scanner(file);

        String str = "";
        ArrayList stringList = new ArrayList();
        String newStr = "";

        while (in.hasNext()) {
            str = in.next();
            str = puncRemove(str);
            newStr = str.substring(str.length()-1, str.length());
            stringList.add(newStr);
        }

        for (Object nothing : stringList) {
            
            System.out.print(nothing);
        }
        
    }

    public static String puncRemove(String str) {
        String newStr = str.replaceAll("[^a-zA-Z ]", "");

        return newStr;
    }



}
