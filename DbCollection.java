import java.util.List;
import java.util.ArrayList;

public class DbCollection {

    public  List<Encomenda> bdEncomenda = new ArrayList<Encomenda>();

    public  void addEncomenda(Encomenda e){
        bdEncomenda.add(e);
    }

    public  void impEncomendas() {
        for (int i = 0; i < bdEncomenda.size(); i++) {
            System.out.println("\n\n");
            System.out.println("Nome: " + bdEncomenda.get(i).getNome());
            System.out.println("Descricao: " + bdEncomenda.get(i).getDescricao());
            System.out.println("Distancia: " + bdEncomenda.get(i).getDistancia()+"km");
            System.out.println("Peso: " + bdEncomenda.get(i).getPeso()+"kg");
            System.out.println("Valor: " + bdEncomenda.get(i).getValor()+"R$");
            System.out.println("Duracao: " + bdEncomenda.get(i).getDuracao()+"Hora(s)");
        }
    }

}
