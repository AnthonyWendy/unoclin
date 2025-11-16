package unochapeco;

import java.util.Random;
import java.util.Scanner;

public class Prontuario {
    private int id;
    private Agendamento agendamento;
    private String descricao;
    private String diagnostico;
    private String prescricao;
    //-----metodos de set e gets
    Random gerador = new Random();
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDiagnostico() {
        return diagnostico;
    }
    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    public String getPrescricao() {
        return prescricao;
    }
    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }
    public Agendamento getAgendamento() {
        return agendamento;
    }
    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    // construtor
    public Prontuario() {
        setProntuario();
    }

    public void setProntuario(){
        this.setId(1 + gerador.nextInt(100));
        int idA;
        Scanner lerString = new Scanner(System.in);
        Scanner lerInt = new Scanner(System.in);
        System.out.print("Digite as o id do agentamento que sera finalizado ");
        idA = lerInt.nextInt();
             for (Agendamento i : Main.listaA) {
                     if (idA == i.getId()) {
                        this.setAgendamento(i);
                            break;
            }}
        System.out.print("Descrição do prontuario: ");
        this.setDescricao(lerString.nextLine());
        System.out.print("Qual foi o diagnostico? ");
        this.setDiagnostico(lerString.nextLine());
        System.out.print("Qual foi a prescrição? ");
        this.setPrescricao(lerString.nextLine());
        this.getAgendamento().setStatus("Realizado");
    }
    public void mostrarP(){
        System.out.println("O id do prontuario é " + this.getId());
        System.out.println("A consulta foi entre o paciente " + this.getAgendamento().getPaciente().getNome() + " e o profissional " + this.getAgendamento().getProfissional().getNome());
        System.out.println("O horario da consulta foi ás " + this.getAgendamento().getHora());
        System.out.println("Descrição da consulta: " + this.getDescricao());
        System.out.println("O diagnostico foi de: " +this.getDiagnostico() );
        System.out.println("A prescrição: " + this.getPrescricao());
        System.out.println("---------------");
    }

    public void modificar(){
        Scanner lerString = new Scanner(System.in);
        String opcao;
        System.out.println("Deseja modificar a Descrição do prontuario? S/N"  );
        opcao = lerString.nextLine();
        if(opcao.equalsIgnoreCase("S")){
            System.out.print("Descrição do  prontuario: ");
            this.setDescricao(lerString.nextLine());}
        System.out.println("Deseja modificar o diagnostico do prontuario? S/N"  );
        opcao = lerString.nextLine();
        if(opcao.equalsIgnoreCase("S")){
            System.out.print("Qual foi o novo diagnostico? ");
            this.setDiagnostico(lerString.nextLine());
         }
        System.out.println("Mudou a prescrição? S/N"  );
        opcao = lerString.nextLine();
        if(opcao.equalsIgnoreCase("S")){
            System.out.print("Qual é a nova prescrição? ");
            this.setPrescricao(lerString.nextLine());}




    }

}
