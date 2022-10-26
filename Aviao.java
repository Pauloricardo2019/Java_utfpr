public class Aviao extends Veiculo{
    private int turbina;
    
    public Aviao(){
        this.turbina = 1;
        super.tipo = "Aereo";
        super.valorPadrao = 8000;
        super.velocidade = 600;
        super.cargaMaxima = 40000;
    }
    
    
    public Aviao(Aviao v){
        this.turbina = v.getTurbina();
        super.tipo = "Aereo";
        super.valorPadrao = 8000;
        super.velocidade = 600;
        super.cargaMaxima = 40000;
    }
    
    public int getTurbina(){
        return turbina;
    }
    
    public void setTurbina(int turbina){
        this.turbina = turbina;
    }   
    
}
