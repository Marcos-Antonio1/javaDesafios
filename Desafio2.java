import java.util.Scanner;

public class Desafio02 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println(inverter(numero));
    }
    
    public static int inverter(int numero){
        String sinalDoNumero=VerificaSinalDoNumero(numero);
        int multipicadorDoSinal= 1;
        int numeroASerConvertido = numero;
        int i=0;

        if(sinalDoNumero.equals("-")){
           numeroASerConvertido = retirarSinalNegativo(numero);
           multipicadorDoSinal =-1;
        }

        while (numeroASerConvertido >0){
            i *=10;
            i +=(numeroASerConvertido%10);
            numeroASerConvertido /=10;     
        }

        return i*multipicadorDoSinal; 
        
    }
    
    public static String VerificaSinalDoNumero(int numero){
        if(String.valueOf(numero).charAt(0) == '-'){
            return "-";
        }
        return "+";
    }

    public static int retirarSinalNegativo(int numero){
        return numero * -1;
    }
}
