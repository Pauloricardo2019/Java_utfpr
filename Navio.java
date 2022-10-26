public class Navio extends Veiculo{
    private int porao;

    public Navio(){
        this.porao = 1;
        super.tipo = "Aquático";
        super.valorPadrao = 1200;
        super.velocidade = 40;
        super.cargaMaxima = 80000;    
    }

    public Navio(Navio n){
        this.porao = n.getPorao();
        super.tipo = "Aquático";
        super.valorPadrao = 1200;
        super.velocidade = 40;
        super.cargaMaxima = 80000;    
    }
    
    
    public void setPorao(int porao){
        this.porao = porao;
    }
    
    public int getPorao(){
        return porao;
        
    }
    
}
