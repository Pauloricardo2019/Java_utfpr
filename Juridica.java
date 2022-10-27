//Paulo Ricardo RA:2145332
public class Juridica extends Pessoa {
    private Integer cnpj;

    public void setCNPJ(Integer cnpj) throws CnpjNegException {
        if (cnpj < 0) {
            throw new CnpjNegException();
        }
        this.cnpj = cnpj;
    }

    public Integer getCNPJ() {
        return cnpj;
    }

}
