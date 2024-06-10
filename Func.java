//Nome: Matheus José Rossieri  RA: 2600986

public abstract class Func extends Pessoa{
    
    private String departamento;
    private String cargo;
    private String data_contratacao;
    private String turno_trabalho;
    private double valor_diaria;

    public double getValor_diaria() {
        return valor_diaria;
    }
    public void setValor_diaria(double valor_diaria) {
        this.valor_diaria = valor_diaria;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getData_contratacao() {
        return data_contratacao;
    }
    public void setData_contratacao(String data_contratacao) {
        this.data_contratacao = data_contratacao;
    }
    public String getTurno_trabalho() {
        return turno_trabalho;
    }
    public void setTurno_trabalho(String turno_trabalho) {
        this.turno_trabalho = turno_trabalho;
    }
}
