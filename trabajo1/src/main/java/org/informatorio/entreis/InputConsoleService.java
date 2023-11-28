package org.informatorio.entreis;
import java.util.Scanner;

public class InputConsoleService{
    //clase escaner como es static no hace falta instanciar la clase

    public static Scanner scanner;

    public static void createScanner(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
    }

    public static Scanner getScanner(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static void closeScanner(){
        if(scanner != null){
            scanner.close();
        }
    }

}