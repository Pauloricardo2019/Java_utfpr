//Paulo Ricardo RA:2145332
public class Navio extends Veiculo {
    private int porao;

    public Navio() {
        this.porao = 1;
        super.tipo = "Aquático";
        super.valorPadrao = 1200;
        super.velocidade = 40;
        super.cargaMaxima = 80000;
    }

    public Navio(Navio n) {
        this.porao = n.getPorao();
        super.tipo = "Aquático";
        super.valorPadrao = 1200;
        super.velocidade = 40;
        super.cargaMaxima = 80000;
    }

    public void setPorao(int porao) throws PoraoException {
        if (porao == 1 || porao == 2) {
            this.porao = porao;
        } else {

            throw new PoraoException();
        }

    }

    public int getPorao() {
        return porao;

    }

}
