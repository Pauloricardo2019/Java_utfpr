//Paulo Ricardo RA:2145332
public class Encomenda implements Calculo {
    private String nome;
    private String descricao;
    private int distancia;
    private float duracao;
    private float valor;
    private int peso;

    public Encomenda() {
        nome = "";
        descricao = "";
        distancia = 0;
        duracao = 0;
        valor = 0;
        peso = 0;

    }

    public Encomenda(Encomenda e) {
        this.nome = e.getNome();
        this.descricao = e.getDescricao();
        this.distancia = e.getDistancia();
        this.duracao = e.getDuracao();
        this.valor = e.getValor();
        this.peso = e.getPeso();
    }

    public void calcCarga(int veicCarga, int encCarga) throws CargaException {
        if (encCarga > veicCarga) {
            throw new CargaException();
        }
    }

    public float calcValor(int distancia, float valorPadrao) {
        return ((distancia + valorPadrao) * 2);
    }

    public float calcTempo(int distancia, int velocidade) {
        return (distancia / velocidade);
    }

    public void validarDinheiro(float valorUsuario, float valorEncomenda) throws DinheiroException {
        if (valorUsuario < valorEncomenda) {
            throw new DinheiroException();
        }
    }

    public void setPeso(int peso) throws NumeroNegException {
        if (peso < 0) {
            peso = 0;
            throw new NumeroNegException();
        }
        this.peso = peso;
    }

    public void setNome(String nome) throws NomeException {
        if (nome.length() <= 3) {
            throw new NomeException();
        }
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDistancia(Integer distancia) throws NumeroNegException {
        if (distancia < 0) {
            distancia = 0;
            throw new NumeroNegException();
        }
        this.distancia = distancia;
    }

    public void setValor(float valor) throws NumeroNegException {
        if (valor < 0) {
            valor = 0;
            throw new NumeroNegException();
        }
        this.valor = valor;
    }

    public void setDuracao(float duracao) throws NumeroNegException {
        if (duracao < 0) {
            duracao = 0;
            throw new NumeroNegException();
        }
        this.duracao = duracao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public float getValor() {
        return valor;
    }

    public int getPeso() {
        return peso;
    }

    public float getDuracao() {
        return duracao;
    }

}
