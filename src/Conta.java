/**
 * Created by willi on 02/05/2017.
 */
public class Conta {

    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void saca(double valor) {

        if (valor <= this.saldo) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo não é suficiente");
        }
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}
