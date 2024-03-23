package exercicio4;

public class ContaBancaria {
    private String numeroDaConta;
    private double saldo;

    // Construtor
    public ContaBancaria(String numeroDaConta, double saldoInicial) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldoInicial;
    }
    
    // Getters e setters
    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para depositar
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " Depósito realizado com sucesso.");
    }

    // Método para sacar 
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + "Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    // Método para verificar o saldo da conta
    public void verSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

   
}

