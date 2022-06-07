package edu.escuelaing.arsw.ASE.app;

import java.io.File;
import java.util.Scanner;

public class CountLoc 
{
    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main( String[] args ) throws Exception{
        int cont = 0;
        File file = new File(args[1]);
        Scanner scan = new Scanner(file);
        if(args[0].equals("phy")){
            while (scan.hasNextLine()){
                scan.nextLine();
                cont += 1;
            }
        }
        else if(args[0].equals("loc")){
            while(scan.hasNextLine()){
                String line = scan.nextLine().strip();
                if(line.length() > 0){
                    if(!line.startsWith("*") && !line.startsWith("/")){
                        cont += 1;
                    }
                }
            }
        }
        System.out.println(cont);
    }
}