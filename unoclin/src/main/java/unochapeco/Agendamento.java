package unochapeco;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

public class Agendamento {
    //----------atributos
    private int id;
    private String status;
    private String observacoes;
    private Paciente paciente;
    private Profissional profissional;
    private LocalTime hora;
    //------------importantes
    static Random gerador = new Random();

    //---------gets e sets
    public int getId() {
        return id;
    }
     public void setId(int id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Profissional getProfissional() {
        return profissional;
    }
    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }
    public LocalTime getHora() {
        return hora;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    //-------------"construtor"
    public Agendamento() {
        agentamentoDados();
    }

    public void agentamentoDados() {
        int idA;
        Scanner lerString = new Scanner(System.in);
        Scanner lerInt = new Scanner(System.in);
        this.setId(1 + gerador.nextInt(100));
        System.out.print("Digite as Observaçoes deste agendamento: ");
        this.setObservacoes(lerString.nextLine());
        System.out.print("Digite o id do Paciente: ");
        idA = lerInt.nextInt();
            for (Paciente i : Main.listaP) {  //explicação (ajuda da intermet pq eu nem lembrava que esta funçao existia
                if (idA == i.getId()) {   // ele vai percorer o vetor listap, com isso ele vai criar uma variavel i paciente e vai
                    this.setPaciente(i); //colar valor dela o valor que ele percorreu no vetor, e depois ele compara se a id
                    break;}  // é igual, se sim o paciente dessa clase se torna a variavel i (so funciona pois cada id é unico)
        }
        System.out.print("Digite o id do Profissional: ");
        idA = lerInt.nextInt();
            for (Profissional i : Main.listaM) {
                if (idA == i.getId()) {
                    this.setProfissional(i);
                    break;
            }
        }
        int h, m;
        try {
            System.out.println("Defina o horario da consulta  ");
            System.out.println("Horarios disponiveis do profissional escolhido: " + this.profissional.horarios );
            System.out.print("Digite a hora: ");
                h = lerInt.nextInt();
            System.out.print("Digite os minutos: ");
                m = lerInt.nextInt();                            // metodo mais longo e caotico desse CRUD
        } catch (Exception e) {
            System.out.println("Erro, utilizou string (texto) em lugar de int (numeros)");
            throw new RuntimeException(e);
        }
         this.setHora(LocalTime.of(h,m));
         statusSet();

    }

    public void statusSet(){
     if(this.profissional.horarios.contains(this.getHora())){
         this.setStatus("Agendado");
     } else {
         this.setStatus("Cancelado");}
    }

    public void mostrarAgendamento(){
        System.out.println("---------------------------------" );
        System.out.println("Id do agentamento é" + this.getId() );
        System.out.println("O paciente é " + this.getPaciente().getNome() );
        System.out.println("O profissional é " + this.getProfissional().getNome() );
        if(this.getStatus() == "Agendado") System.out.println("A consulta foi agentada para o horario de " + this.getHora());
        if(this.getStatus() == "Cancelado ") System.out.println("Consulta cancelada pois o profissional não esta disponivel neste momento");
        System.out.println("favor remarcar " );
        if(this.getStatus() == "Realizado") System.out.println("A consulta já foi realizada no horario das " + this.getHora());
        System.out.println("");
    }

    public void alterarHora(){
        Scanner lerInt = new Scanner(System.in);
        System.out.println("Horarios disponiveis do profissional escolhido: " + this.profissional.horarios );
        System.out.println("Atual hora é " + this.getHora() );
        int h, m;
            try {
                 System.out.println("Defina o novo horario da consulta  ");
                 System.out.print("Digite a hora: ");
                 h = lerInt.nextInt();
                 System.out.print("Digite os minutos: ");
                 m = lerInt.nextInt();                            // metodo mais longo e caotico desse CRUD
          }catch (Exception e) {
            System.out.println("Erro, utilizou string (texto) em lugar de int (numeros)");
            throw new RuntimeException(e);
        }
             this.setHora(LocalTime.of(h,m));
             statusSet();




    }
}
