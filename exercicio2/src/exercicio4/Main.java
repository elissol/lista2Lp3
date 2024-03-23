package exercicio4;

public class Main {
    public static void main(String[] args) {
       
    	// objeto
        ContaBancaria conta = new ContaBancaria("302568A", 1500.0);

        //  métodos da conta bancária
        conta.verSaldo();

        conta.depositar(200.0);
        conta.verSaldo();

        conta.sacar(200.0);
        conta.verSaldo();

        conta.sacar(1500.0); 
        conta.verSaldo();
    }
}

