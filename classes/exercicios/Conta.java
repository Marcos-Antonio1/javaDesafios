
import java.math.BigDecimal;

public class Conta {
    
    public Conta(long numero, BigDecimal saldo, BigDecimal limite){
        this.numero= numero;
        this.saldo = saldo;
        this.limite = limite;
    }

    private long numero;
    private BigDecimal saldo;
    private BigDecimal limite;

    public long getNumero() {
        return numero;
    }
    public BigDecimal getSaldo() {
        return saldo;
    }
    public BigDecimal getLimite() {
        return limite;
    }

    

}
