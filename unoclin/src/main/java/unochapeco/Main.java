package unochapeco;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //---------unica int e get do main (eu espero)
    private static int opcao;
    public static int getOpcao() {
        return opcao;
    }
    //---------random
    static Random gerador = new Random();
    //---------------------vetor que quarda os pacientes
    static ArrayList<Paciente> listaP = new ArrayList<>();  // lista de paciente
    static ArrayList<Profissional> listaM = new ArrayList<>();  // lista m porque m de medico pois o p ja foi escolhido
    //--------------Main
    static void main() {
        System.out.println("Seja bem vindo a um simples crud de uma clinica");
        Scanner lerInt = new Scanner(System.in);



            do{
                Menu();
                opcao = lerInt.nextInt();
       //------------ switch case de escolhas no menu
                switch(opcao){
                    case 1 -> {
                    listaP.add(new Paciente());
                    idControlP();

                    }

                    case 2 -> {
                    listaM.add(new Profissional());
                    idControlM();
                    }

                    case 3 -> {
                     for(int i = 0; i < listaP.size(); i++){
                         listaP.get(i).mostrarDados();
                         listaP.get(i).mostrarDadosP();}
                    }


                    case 4 -> {
                     for(int i = 0; i < listaM.size(); i++){
                            listaM.get(i).mostrarDados();
                            listaM.get(i).mostrarDadosM();}
                    }
                    case 5-> {
                        int idA;
                        System.out.println("Digite o id do profissional que sera removido");
                        System.out.print("Id: ");
                        idA = lerInt.nextInt();
                        listaM.removeIf(listaM -> listaM.getId() == idA);
                        System.out.println("");
                    }

                    case 6 -> {
                        int idA;
                        System.out.println("Digite o id do Paciente que sera removido");
                        System.out.print("Id: ");
                        idA = lerInt.nextInt();
                        listaP.removeIf(listaP -> listaP.getId() == idA);
                        System.out.println("");
                    }







                    case 9 -> {
                        System.out.println("\nobrigado por usar este programa =)");}

                    default -> {
                        System.out.println("\nEste numero não existe, por favor digite de novo");}
                }
             }while(getOpcao() != 9);



        }





    public static void Menu(){
        System.out.println("-----Opções do sistema----");
        System.out.println("1 - Cadastrar Paciente");
        System.out.println("2 - Cadastrar Profissional");
        System.out.println("3 - Mostrar todos os pacientes");
        System.out.println("4 - Mostrar todos os Profissionais");
        System.out.println("5 - Remover profissional");
        System.out.println("6 - Remover paciente");

        System.out.println("9 - Sair do programa ");
        System.out.print("OPÇÃO: ");
    }

    public static void idControlP(){
     for(int i = 0; i >= listaP.size(); i++ ){
         for(int x = 0; x >= listaP.size(); x++ ){
            if(listaP.get(i).getId() == listaP.get(x).getId()){
             listaP.get(x).setId(x + 1 + gerador.nextInt(100 - x));}}}
     }
     public static void idControlM(){
        for(int i = 0; i >= listaM.size(); i++ ){
            for(int x = 0; x >= listaM.size(); x++ ){
                if(listaM.get(i).getId() == listaM.get(x).getId()){
                    listaM.get(x).setId(x + 1 + gerador.nextInt(100 - x));}}}
    }
}
