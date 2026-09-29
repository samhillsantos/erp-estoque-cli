package input;

import java.util.Scanner;

public class Input {
    public static final Scanner input = new Scanner(System.in);

    public static int inputInt(){
        int valor = input.nextInt();
        input.nextLine(); //Limpeza de buffer
        return valor;
    }
    public static String inputString(){
        return input.nextLine();
    }
}
