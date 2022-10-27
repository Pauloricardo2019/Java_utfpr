//Paulo Ricardo RA:2145332
public abstract class Veiculo {
    protected String tipo;
    protected int velocidade;
    protected int cargaMaxima;
    protected double valorPadrao;

    public Veiculo() {
        this.tipo = "";
        this.velocidade = 0;
        this.cargaMaxima = 0;
        this.valorPadrao = 0;
    }

    public Veiculo(String tipo, int velocidade, int cargaMaxima, float valorPadrao) {
        this.tipo = tipo;
        this.velocidade = velocidade;
        this.cargaMaxima = cargaMaxima;
        this.valorPadrao = valorPadrao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public void setValorPadrao(double valorPadrao) {
        this.valorPadrao = valorPadrao;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public double getValorPadrao() {
        return valorPadrao;
    }

}
