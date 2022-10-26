public class Caminhao extends Veiculo{
    private int eixo;

    public Caminhao(){
        this.eixo = 1;
        super.tipo = "Rodoviario";
        super.valorPadrao = 2000;
        super.velocidade = 80;
        super.cargaMaxima = 16000;
    }
        

    public Caminhao(Caminhao c){
        this.eixo = c.getEixo();
        super.tipo = "Rodoviario";
        super.valorPadrao = 2000;
        super.velocidade = 80;
        super.cargaMaxima = 16000;
    }
    
    
    public void setEixo(int eixo){
        this.eixo = eixo;
    }
    
    public int getEixo(){
        return eixo;
    }
    
}

