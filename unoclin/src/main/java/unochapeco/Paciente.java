package unochapeco;

public class Paciente extends Pessoa{
    //-----atributos especificos
    private String sexo;
    private  String historico_medico;
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

    //----construtor
    public Paciente(int id, String nome, int cpf, String telefone, String email, String endereco) {
        super(id, nome, cpf, telefone, email, endereco);
    }
}
