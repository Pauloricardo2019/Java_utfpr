//Paulo Ricardo RA:2145332
public class Fisica extends Pessoa {
    private int cpf;

    public void setCPF(int cpf) throws CpfException {
        if (cpf < 0) {
            this.cpf = 0;
            throw new CpfException();
        }
        this.cpf = cpf;
    }

    public Integer getCPF() {
        return cpf;
    }

}
