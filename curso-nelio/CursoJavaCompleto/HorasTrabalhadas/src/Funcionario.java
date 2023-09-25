public class Funcionario {

    public String nome;
    public Double valorPorHora;
    public Double horasTrabalhadas;

    public Funcionario(String nome, Double valorPorHora, Double horasTrabalhadas){
        super();
        this.nome = nome;
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double valorPago(){
        return valorPorHora * horasTrabalhadas;
    }
}
