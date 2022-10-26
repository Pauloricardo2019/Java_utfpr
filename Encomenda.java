public class Encomenda{
    private String nome;
    private String descricao;
    private int distancia;
    private int duracao;
    private float valor;
    private int peso;
    private Pessoa pessoa;
        
    public Encomenda(){
        nome = "";
        descricao = "";
        distancia = 0;
        duracao = 0;
        valor = 0;
        peso = 0;
        pessoa = new Pessoa();
    
    }
    
    public Encomenda(Encomenda e, Pessoa p){
        this.nome = e.getNome();
        this.descricao = e.getDescricao();
        this.distancia = e.getDistancia();
        this.duracao = e.getDuracao();  
        this.valor = e.getValor();
        this.peso = e.getPeso();
        this.pessoa = new Pessoa(p);
    }


    public int calcValor(int distancia, int valorPadrao){
        return (distancia+valorPadrao);
    }

    public int calcVelocidade(int distancia, int velocidade){
        return (distancia/velocidade);
    }

    public void setPeso(int peso) throws NumeroNegException{
        if peso < 0 {
            peso = 0;
            throw new NumeroNegException();
        }
        this.peso = peso;
    }

    public void setNome(String nome) throws NomeException{
        if (nome.length() <= 3){
            throw new NomeException();
        }
        this.nome = nome;    
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setDistancia(Integer distancia) throws NumeroNegException{
        if (distancia < 0){
            distancia = 0;
            throw new NumeroNegException();
        }
        this.distancia = distancia;
    }

    public void setValor(float valor)throws NumeroNegException{
        if (valor < 0){
            valor = 0;
            throw new NumeroNegException();
        }
        this.valor = valor;
    }

    public void setDuracao(int duracao) throws NumeroNegException{
        if (duracao < 0){
            duracao = 0;
            throw new NumeroNegException();
        }
        this.duracao = duracao;
    }

    public String getNome(){
        return nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public Integer getDistancia(){
        return distancia;
    }

    public float getValor(){
        return valor;
    }

    public int getPeso(){
        return peso;
    }

    public int getDuracao(){
        return duracao;
    }

}
