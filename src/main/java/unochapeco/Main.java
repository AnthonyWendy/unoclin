package unochapeco;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //---------unica int e get do main (eu espero)
    private static String opcao;
    public static String getOpcao() {
        return opcao;
    }
    //---------random
    static Random gerador = new Random();
    //---------------------vetor que quarda os pacientes
    public static ArrayList<Paciente> listaP = new ArrayList<>();  // lista de paciente
    public static ArrayList<Profissional> listaM = new ArrayList<>();  // lista m porque m de medico pois o p ja foi escolhido
    public static ArrayList<Agendamento> listaA = new ArrayList<>();
    public static ArrayList<Prontuario> listaProntuario = new ArrayList<>();


    //--------------Main
    public static void main(String[] args) {
        System.out.println("Seja bem vindo a um simples crud de uma clinica");
        Scanner lerString = new Scanner(System.in);
        Scanner lerInt = new Scanner(System.in);



            do{
                Menu();
                opcao = lerString.nextLine();
       //------------ switch case de escolhas no menu
                switch(opcao){
                    case "1" -> {              //ADICIONAR
                        String subOpcao = "";
                        menuC();
                        subOpcao = lerString.nextLine();
                        switch (subOpcao){
                            case "1" -> {
                                listaP.add(new Paciente());
                                idControlP();
                                System.out.println(" ");
                            }
                            case "2" -> {
                                listaM.add(new Profissional());
                                idControlM();
                                System.out.println(" ");
                            }
                            case "3" -> {
                                listaA.add(new Agendamento());
                                idControlA();
                                System.out.println(" ");
                            }
                            default -> {
                                System.out.println("\nEste numero não existe");}
                        }
                    }
                    case "2" -> {               // MOSTRAR
                        String subOpcao = "";
                        menuD();
                        subOpcao = lerString.nextLine();
                        switch (subOpcao){
                            case "1" -> {
                                System.out.println("\n----Lista dos pacientes----");
                                for(int i = 0; i < listaP.size(); i++){
                                    listaP.get(i).mostrarDados();
                                    listaP.get(i).mostrarDadosP();}
                                    System.out.println("");
                            }
                            case "2" -> {
                                System.out.println("\n----Lista dos profissionais----");
                                for(int i = 0; i < listaM.size(); i++){
                                    listaM.get(i).mostrarDados();
                                    listaM.get(i).mostrarDadosM();}
                                System.out.println("");
                            }
                            case "3" -> {
                                System.out.println("-----lista dos agendamentos----");
                                for(int i = 0; i < listaA.size(); i++){
                                    listaA.get(i).mostrarAgendamento();
                                    System.out.println("");}
                            }
                            default -> {
                                System.out.println("\nEste numero não existe");}
                        }
                    }
                    case "3" -> {                           //REMOVER
                        String subOpcao = "";
                        menuR();
                        subOpcao = lerString.nextLine();
                        switch (subOpcao){
                            case "1" -> {
                                int idA;
                                System.out.println("Digite o id do Paciente que sera removido");
                                System.out.print("Id: ");
                                idA = lerInt.nextInt();
                                listaP.removeIf(listaP -> listaP.getId() == idA);
                                System.out.println("");
                            }
                            case "2" -> {
                                int idA;
                                System.out.println("Digite o id do profissional que sera removido");
                                System.out.print("Id: ");
                                idA = lerInt.nextInt();
                                listaM.removeIf(listaM -> listaM.getId() == idA);
                                System.out.println("");
                            }
                            case "3" ->{
                                int idA;
                                System.out.println("Digite o id do  Agentamento que sera removido");
                                System.out.print("Id: ");
                                idA = lerInt.nextInt();
                                listaA.removeIf(listaA -> listaA.getId() == idA);
                                System.out.println("");
                            }
                            default -> {
                                System.out.println("\nEste numero não existe");}
                        }
                    }
                    case "4"-> {                  //MODIFICAR
                        String subOpcao = "";
                        menuA();
                        subOpcao = lerString.nextLine();
                        switch (subOpcao){
                            case "1" -> {
                                int idA;
                                System.out.println("Digite o id do Agentamento que tera hora modificada");
                                System.out.print("Id: ");
                                idA = lerInt.nextInt();
                                for(Agendamento i : listaA){
                                    if(idA == i.getId()){
                                        i.alterarHora();
                                        System.out.println("");
                                        break;}
                                else{System.out.println("Id não existe"); }
                                }
                            }
                            default -> {
                                System.out.println("\nEste numero não existe");}
                        }
                    }
                    case "5" -> {              //TODOS (um pouco de tudo)
                        String subOpcao = "";
                        menuP();
                        subOpcao = lerString.nextLine();
                        switch (subOpcao){
                            case "1" -> {
                                listaProntuario.add(new Prontuario());
                                idControlPro();
                            }
                            case "2" -> {
                                System.out.println("Informações prontuario");
                                for(int i = 0; i < listaProntuario.size(); i++){
                                    listaProntuario.get(i).mostrarP();}
                                System.out.println("");
                            }
                            case "3" -> {
                                int idA;
                                System.out.println("Digite o id do Prontuario que sera modificado");
                                System.out.print("Id: ");
                                idA = lerInt.nextInt();
                                for(Prontuario i : listaProntuario){
                                    if(idA == i.getId()){
                                        i.modificar();
                                        System.out.println("");
                                        break;}}
                            }
                        }
                    }

                    case "sair" -> {
                        System.out.println("\nobrigado por usar este programa =)");
                    }
                    case "Sair" -> {
                        System.out.println("\nobrigado por usar este programa =)");}

                    default -> {
                        System.out.println("\nEste numero não existe, por favor digite de novo");}
                }
             }while(!getOpcao().equalsIgnoreCase("Sair"));



        }





    public static void Menu(){
        System.out.println("-----Opções do sistema----");
        System.out.println("1 - Cadastrar Item");
        System.out.println("2 - Mostrar dados ");
        System.out.println("3 - Remover itens");
        System.out.println("4 - Alterações ");
        System.out.println("5 - Opções para o prontuario");


        System.out.println("Digite *Sair* para sair do programa");
        System.out.print("OPÇÃO: ");
    }

    public static void menuC(){
        System.out.println("-----Opções de cadastro----");
        System.out.println("1 - Cadastrar Paciente");
        System.out.println("2 - Cadastrar Profissional");
        System.out.println("3- Cadastrar Agendamento");
        System.out.print("OPÇÃO: ");
    }

    public static void menuD(){
        System.out.println("-----Opções para mostrar dados----");
        System.out.println("1 - Mostrar Pacientes");
        System.out.println("2 - Mostrar Profissionais");
        System.out.println("3- Mostrar  Agendamentos");
        System.out.print("OPÇÃO: ");
    }
    public static void menuR(){
        System.out.println("-----Opções para Remover Itens----");
        System.out.println("1 - Remover Paciente");
        System.out.println("2 - Remover Profissional");
        System.out.println("3 - Remover Agendamento");
        System.out.print("OPÇÃO: ");
    }
    public static void menuA(){
        System.out.println("-----Opções para Alterar itens----");
        System.out.println("1 - Remarcar Agendamento");

        System.out.print("OPÇÃO: ");
    }
    public static void menuP(){
        System.out.println("-----Opções para o Prontuario----");
        System.out.println("1 - Realizar Prontuario");
        System.out.println("2 - Mostrar Prontuario");
        System.out.println("3 - Alterar Prontuario");


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
    public static void idControlA(){
        for(int i = 0; i >= listaA.size(); i++ ){
            for(int x = 0; x >= listaA.size(); x++ ){
                if(listaA.get(i).getId() == listaA.get(x).getId()){
                    listaA.get(x).setId(x + 1 + gerador.nextInt(100 - x));}}}
    }
    public static void idControlPro(){
        for(int i = 0; i >= listaProntuario.size(); i++ ){
            for(int x = 0; x >= listaProntuario.size(); x++ ){
                if(listaProntuario.get(i).getId() == listaProntuario.get(x).getId()){
                    listaProntuario.get(x).setId(x + 1 + gerador.nextInt(100 - x));}}}
    }
}
