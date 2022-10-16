import java.util.Date;

public class CartaoDeCredito {
    
    CartaoDeCredito(Date dataDeValidade, int numero){
        this.dataDeValidade = dataDeValidade;
        this.numero = numero;
    }

    private Date dataDeValidade;
    
    private int numero;


    public Date getDataDeValidade() {
        return dataDeValidade;
    }
    public int getNumero() {
        return numero;
    }
}
