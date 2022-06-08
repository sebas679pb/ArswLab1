package edu.escuelaing.arsw.ASE.app;

import java.io.File;
import java.util.Scanner;

public class CountLoc {
    /**
     * Program wich count the lines of code from a source file with a given path.
     * @param args as the type of search and the path of the file or the diretory.
     * @throws Exception
     */
    public static void main( String[] args ) throws Exception{
        if(args.length != 2){
            System.out.println("El numero de parametros recibidos no es correcto.");
        }else if(!args[0].equals("phy") && !args[0].equals("loc")){
            System.out.println("Digite un parametro de conteo adecuado.");
        }
        else{
            try{
                int cont = 0;
                File files = new File(args[1]);
                if(files.isDirectory()){
                    File[] listFiles = files.listFiles();
                    cont = directorySearch(args[0], listFiles);
                }else{
                    Scanner scan = new Scanner(files);
                    if(args[0].equals("phy")){
                        cont = phyFunction(scan);
                    }else if(args[0].equals("loc")){
                        cont = locFunction(scan);
                    }
                }
                System.out.println("El path ingresado contine " + cont + " lineas.");
            }catch(Exception e){
                System.out.println("El path del directorio o archivo digitado es incorrecto.");
            }
        }
    }

    /**
     * Function that counts the physical lines in the source file.
     * @param scan as a file.
     * @return number of physical lines in the file.
     */
    public static int phyFunction(Scanner scan){
        int cont = 0;
        while (scan.hasNextLine()){
            scan.nextLine();
            cont += 1;
        }
        return cont;
    }

    /**
     * Function that counts the code lines in the source file.
     * @param scan as a file.
     * @return number of code lines in the file.
     */
    public static int locFunction(Scanner scan){
        int cont = 0;
        while(scan.hasNextLine()){
            String line = scan.nextLine().strip();
            if(line.length() > 0){
                if(!line.startsWith("*") && !line.startsWith("/")){
                    cont += 1;
                }
            }
        }
        return cont;
    }

    /**
     * Function wich counts the physical or code lines in the files of a given directory.
     * @param counterType as the type of search.
     * @param listFiles as an array of files or directories of the given directory.
     * @return number of physical or code lines in the file of the directory.
     * @throws Exception
     */
    public static int directorySearch(String counterType, File[] listFiles) throws Exception{
        int cont = 0;
        if(counterType.equals("phy")){
            for (File file : listFiles) {
                if(file.isDirectory()){
                    cont += directorySearch(counterType, file.listFiles());
                }else{
                    Scanner scan = new Scanner(file);
                    cont += phyFunction(scan);
                }
            }
        }else if(counterType.equals("loc")){
            for (File file : listFiles) {
                if(file.isDirectory()){
                    cont += directorySearch(counterType, file.listFiles());
                }else{
                    Scanner scan = new Scanner(file);
                    cont += locFunction(scan);
                }
            }
        }
        return cont;
    }
}