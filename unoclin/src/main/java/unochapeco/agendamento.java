package unochapeco;

public class agendamento {
    //----------atributos
    private int id;
    private Profissional profissional;
    private Paciente paciente;
    private String status;
    private String observacoes;
    //---------gets e sets
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Profissional getProfissional() {
        return profissional;
    }
    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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
}
