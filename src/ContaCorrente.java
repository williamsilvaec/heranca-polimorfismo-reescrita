/**
 * Created by willi on 02/05/2017.
 */
public class ContaCorrente extends Conta {

    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa * 2);
    }
}
