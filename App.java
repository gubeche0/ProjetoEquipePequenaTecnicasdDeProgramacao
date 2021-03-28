import java.util.List;
import java.util.Scanner;

/**
 * App
 */

 public class App {

    private static void listar(List<VeiculoInterface> lista){
            for(VeiculoInterface veiculo:lista){
                 System.out.println(veiculo);
            }
    }
    public static void main(String [] args){
        Boolean rodando = true;
        Scanner sc=new Scanner(System.in);  
        Catalogo cat = new Catalogo();
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
            sc.nextLine();

            switch (choice) {
                case 1: 
                    listar(cat.listarTodos());
                         break;
                case 2: 
                    listar(cat.listarCarros());
                         break;
                case 3:  
                    listar(cat.listarCaminhoes());
                         break;
                case 4:
                    listar(cat.listarAvioes());
                         break;
                case 5:  
                    System.out.println("Digite a marca: ");
                    String marca = sc.nextLine();
                    listar(cat.listarPorMarca(marca));
                         break;
                case 6: 
                    System.out.println("Digite o ano: ");
                    int ano = sc.nextInt();
                    listar(cat.listarPorAno(ano));
                         break;
                case 7: 
                    System.out.println("Digite o ano inicial da pesquisa: ");
                    int ano1 = sc.nextInt();
                    System.out.println("Digite o ano final da pesquisa: ");
                    int ano2 = sc.nextInt();
                    listar(cat.listarPorAno(ano1, ano2));
                         break;
                case 8: 
                    rodando = false;
                break;

            }
        }
    }
}