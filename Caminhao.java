//Paulo Ricardo RA:2145332
public class Caminhao extends Veiculo {
    private int eixo;

    public Caminhao() {
        this.eixo = 1;
        super.tipo = "Rodoviario";
        super.valorPadrao = 2000;
        super.velocidade = 80;
        super.cargaMaxima = 16000;
    }

    public Caminhao(Caminhao c) {
        this.eixo = c.getEixo();
        super.tipo = "Rodoviario";
        super.valorPadrao = 2000;
        super.velocidade = 80;
        super.cargaMaxima = 16000;
    }

    public void setEixo(int eixo) throws EixoException {
        if (eixo == 1 || eixo == 2) {
            this.eixo = eixo;
        } else {
            throw new EixoException();
        }
    }

    public int getEixo() {
        return eixo;
    }

}
