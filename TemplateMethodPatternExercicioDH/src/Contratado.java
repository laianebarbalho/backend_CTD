public class Contratado extends Funcionario{
    private int horas;
    private double valorPorHora;

    public Contratado(String nome, String sobrenome, String numeroConta, String localDeposito, int horas, double valorPorHora) {
        super(nome, sobrenome, numeroConta, localDeposito);
        this.horas = horas;
        this.valorPorHora = valorPorHora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return valorPorHora * horas;
    }
}
