package unochapeco;
import java.time.LocalDate;
import java.util.Scanner;

public class Paciente extends Pessoa{
    //-----atributos especificos
    private String sexo;
    private  String historico_medico;
    private LocalDate dataNascimento;

    //----sets e gets
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getHistorico_medico() {
        return historico_medico;
    }
    public void setHistorico_medico(String historico_medico) {
        this.historico_medico = historico_medico;
    }
     public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    //----construtor
    public Paciente() {
    setDados();
    pacienteDados();
    }

    // o resto dos atributos
    public void pacienteDados(){
        Scanner lerString = new Scanner(System.in);
        Scanner lerInt = new Scanner(System.in);
        System.out.print("Digite o sexo do paciente: ");
        this.setSexo(lerString.nextLine());
        System.out.print("Digite o Historico medico do paciente: ");
        this.setHistorico_medico(lerString.nextLine());

        System.out.print("Digite a Data de nascimento (Ano / Mês / Dia)" );
        System.out.println("Exemplo 2020-04-25" );


        int ano = lerInt.nextInt();
        int mes  = lerInt.nextInt();            // dor somente dor
        int dia = lerInt.nextInt();

        this.dataNascimento = LocalDate.of(ano,mes,dia);


    }
    public void mostrarDadosP(){
        System.out.println("Sexo do paciente é " + this.getSexo());
        System.out.println("Historico medico do paciente " + this.getHistorico_medico());
        System.out.println("Data de nascimento (Ano / Mês / Dia) é  " + this.getDataNascimento());
        System.out.println("");
    }


}
