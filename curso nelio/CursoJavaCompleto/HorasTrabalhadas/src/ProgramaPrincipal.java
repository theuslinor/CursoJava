public class ProgramaPrincipal{
    public static void main(String[] args) {

        Funcionario x = new Funcionario("Maria", 100.0, 15.0);
        Funcionario y = new Funcionario("João", 80.0, 10.0);

        double resultado = CalculadoraDeSalario.valorPago(100, 7);
        double total = x.valorPago();

        System.out.println(resultado);
        System.out.println(total);

    }
}