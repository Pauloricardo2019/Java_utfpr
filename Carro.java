public class Carro extends Veiculo{
    private float potencia;
    
    
    public Carro(){
        this.potencia = 1;
        tipo = "Rodoviario";
        valorPadrao = 1000;
        velocidade = 100;
        cargaMaxima = 500;
    }

    public Carro(Carro c){
        this.potencia = c.getPotencia();
        tipo = "Rodoviario";
        valorPadrao = 1000;
        velocidade = 100;
        cargaMaxima = 500;
    }
    
    public void setPotencia(float potencia){
        this.potencia = potencia;
    }
    
    public float getPotencia(){
        return potencia;
    }
    
}
