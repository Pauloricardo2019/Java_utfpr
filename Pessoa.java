public class Pessoa {
    private String nome;
    private float dinheiro;
    private int idade;
    private String genero;

    public Pessoa(){
        nome = "";
        dinheiro = 0;
        idade = 0;
        genero = "";
    }

    public Pessoa(Pessoa p){
        this.nome = p.getNome();
        this.dinheiro = p.getDinheiro();
        this.idade = p.getIdade();
        this.genero = p.getGenero();
    }

    public void setNome(String nome)throws NomeException{
        if (nome.length() <= 3){
            throw new NomeException();
        }
        this.nome = nome;
    }
    public void setDinheiro(float dinheiro)throws NumeroNegException{
        if (dinheiro <= 0){
            throw new NumeroNegException();
        }
        this.dinheiro = dinheiro;
    }
    public void setIdade(int idade)throws IdadeMenorException{
        if (idade < 18){
            throw new IdadeMenorException();
        }
        this.idade = idade;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getNome(){
        return nome;
    }

    public float getDinheiro(){
        return dinheiro;
    }

    public int getIdade(){
        return idade;
    }

    public String getGenero(){
        return genero;
    }


}
