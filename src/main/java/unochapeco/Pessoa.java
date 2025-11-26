package unochapeco;
import java.util.Scanner;
import java.util.Random;
public abstract class Pessoa {
    //-----atributos
    private int id;
    private String nome;
    private int cpf;
    private String telefone;
    private String email;
    private String endereco;
    //---------scanner e o gerador de ids (random)
    Scanner lerInt = new Scanner(System.in);
    Scanner lerString = new Scanner(System.in);
    Random gerador = new Random();
    //-----sets e gets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    //---------- construtor
    //


    public Pessoa() {

    }


    public void setDados (){
        System.out.print("Digite o nome da pessoa: ");
        this.setNome(lerString.nextLine());
        System.out.print("Digite o E-mail de contato da pessoa: ");
        this.setEmail(lerString.nextLine());
        System.out.print("Digite o Endereço da pessoa: ");
        this.setEndereco(lerString.nextLine());
        System.out.print("Digite o Numero de telefone para contato da pessoa: ");
        this.setTelefone(lerString.nextLine());
        System.out.print("Digite o Numero de CPF/RG da pessoa: ");
        try {
            this.setCpf(lerInt.nextInt());
        } catch (Exception e) {
            System.out.println("Erro, utilizou string (texto) em lugar de int (numeros)");
            throw new RuntimeException(e);
        }
        this.setId(1 + gerador.nextInt(100));
     }

     public void mostrarDados(){
        System.out.println("Dados do Usuario: " + this.getNome());
        System.out.println("Id do Usuario é " + this.getId());
        System.out.println("Nome do Usuario é " + this.getNome());
        System.out.println("Email de contato Usuario é " + this.getEmail());
        System.out.println("Endereço do Usuario é " + this.getEndereco());
        System.out.println("Numero de CPF/Rg do Usuario é " + this.getCpf());
        System.out.println("Numero de telefone para contato do Usuario é " + this.getTelefone());




     }
}
