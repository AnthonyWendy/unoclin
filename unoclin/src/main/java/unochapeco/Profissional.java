package unochapeco;


public class Profissional extends Pessoa{
    //----atributos unicos
    private String especialidade;
    private String registro_profissional;
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

    //----construtor
    public Profissional(int id, String nome, int cpf, String telefone, String email, String endereco) {
        super(id, nome, cpf, telefone, email, endereco);

    }
}
