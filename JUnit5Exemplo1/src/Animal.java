public class Animal {
    private String tipo;
    private String tamanho;
    private double peso;

    public Animal(String tipo, String tamanho, double peso) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean ehPesado() {
        return this.peso > 500 & this.tamanho.equals("Grande");
    }
}
