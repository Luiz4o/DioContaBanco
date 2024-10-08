package Conta;

public class ContaBanco {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaBanco(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return String.format("Nome: ") + nomeCliente + "\n" +
                String.format("Agencia: ") + agencia + "\n" +
                String.format("Numero: ") + numero + "\n" +
                String.format("saldo: ") + saldo
                ;
    }
}
