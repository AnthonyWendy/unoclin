package unochapeco;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Profissional extends Pessoa{
    //----atributos unicos
    private String especialidade;
    private String registro_profissional;
    private String sim;
    //vetor com os horaios medicos disponiveis do profissional
    ArrayList<LocalTime> horarios = new ArrayList<>();
    //----gets e sets
    public String getRegistro_profissional() {
        return registro_profissional;
    }
    public void setRegistro_profissional(String registro_profissional) {
        this.registro_profissional = registro_profissional;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    public String getSim() {
        return sim;
    }
    public void setSim(String sim) {
        this.sim = sim;
    }

    //----construtor
    public Profissional() {
        setDados();
        profissionalDados();
    }

    public void profissionalDados(){
        Scanner lerInt = new Scanner(System.in);
        Scanner lerString = new Scanner(System.in);
        System.out.print("Digite a Especialidade do profissional: ");
        this.setEspecialidade(lerString.nextLine());
        System.out.print("Digite o Registro profissional (CRM, CRO, etc.)(Codigo que comprova que é um profissional qualificado para realizar o trabalho de médico): ");
        this.setRegistro_profissional(lerString.nextLine());

        do{
            int h, m;
            try {
                System.out.print("Digite a hora: ");
                h = lerInt.nextInt();
                System.out.print("Digite os minutos: ");
                m = lerInt.nextInt();
            } catch (Exception e) {
                System.out.println("Erro, utilizou string (texto) em lugar de int (numeros)");
                throw new RuntimeException(e);
            }

            horarios.add(LocalTime.of(h, m));
            System.out.print("Deseja adicionar um novo horario disponivel? (s/n): ");
            this.setSim(lerString.nextLine());

        }while(this.getSim().equalsIgnoreCase("s"));


    }

    public void mostrarDadosM(){
        System.out.println("Especialidade do profissional é " + this.getEspecialidade());
        System.out.println("Registro profissional (CRM, CRO, etc.) é " + this.getRegistro_profissional());
        System.out.print("os horarios disponiveis são:" );
        System.out.print( "os horarios disponiveis são: " + horarios );
        System.out.println("");
    }

}


