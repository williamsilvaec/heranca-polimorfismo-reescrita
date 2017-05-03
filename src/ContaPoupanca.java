/**
 * Created by willi on 02/05/2017.
 */
public class ContaPoupanca extends Conta {

    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa * 3);
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
        this.saldo = this.saldo - 0.01;
    }
}
