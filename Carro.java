//Paulo Ricardo RA:2145332
public class Carro extends Veiculo {
    private float potencia;

    public Carro() {
        this.potencia = 1;
        tipo = "Rodoviario";
        valorPadrao = 1000;
        velocidade = 100;
        cargaMaxima = 500;
    }

    public Carro(Carro c) {
        this.potencia = c.getPotencia();
        tipo = "Rodoviario";
        valorPadrao = 1000;
        velocidade = 100;
        cargaMaxima = 500;
    }

    public void setPotencia(float potencia) throws PotenciaException {
        if (potencia == 1.0 || potencia == 2.0) {
            this.potencia = potencia;
        } else {

            throw new PotenciaException();
        }
    }

    public float getPotencia() {
        return potencia;
    }

}
