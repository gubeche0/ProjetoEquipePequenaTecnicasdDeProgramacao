import java.util.Scanner;

/**
 * App
 */
public class App {
    public static void main(String [] args){
        Boolean rodando = true;
        Scanner sc=new Scanner(System.in);  
        while(rodando){
            System.out.println("Selecione sua opcao: ");
            System.out.println("1- Listar todos os veiculos");
            System.out.println("2- Listar todos os carros");
            System.out.println("3- Listar todos os caminhoes");
            System.out.println("4- Listar todos os avioes");
            System.out.println("5- Listar veiculos por marca");
            System.out.println("6- Listar veiculos por ano especifico");
            System.out.println("7- Listar veiculos por espaco de tempo");
            System.out.println("8- Sair");

            int choice = sc.nextInt();

            switch (choice) {
                case 1: 
                         break;
                case 2: 
                         break;
                case 3:  
                         break;
                case 4:
                         break;
                case 5:  
                         break;
                case 6: 
                         break;
                case 7: 
                         break;
                case 8: 
                    rodando = false;
                break;

            }
        }
    }
}