//Paulo Ricardo RA:2145332
public class Pessoa {
    private String nome;
    private float dinheiro;
    private int idade;
    private String genero;
    private Encomenda encomenda;

    public Pessoa() {
        nome = "";
        dinheiro = 0;
        idade = 0;
        genero = "";
        encomenda = new Encomenda();
    }

    public Pessoa(Pessoa p) {
        this.nome = p.getNome();
        this.dinheiro = p.getDinheiro();
        this.idade = p.getIdade();
        this.genero = p.getGenero();
        this.encomenda = new Encomenda();
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(Encomenda e) {
        this.encomenda = e;
    }

    public void setNome(String nome) throws NomeException {
        if (nome.length() <= 3) {
            throw new NomeException();
        }
        this.nome = nome;
    }

    public void setDinheiro(float dinheiro) throws NumeroNegException {
        if (dinheiro <= 0) {
            throw new NumeroNegException();
        }
        this.dinheiro = dinheiro;
    }

    public void setIdade(int idade) throws MenorIdadeException {
        if (idade < 18) {
            throw new MenorIdadeException();
        }
        this.idade = idade;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public int getIdade() {
        return idade;
    }

    public String getGenero() {
        return genero;
    }

}
