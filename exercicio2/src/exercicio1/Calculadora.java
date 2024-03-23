package exercicio1;

public class Calculadora {
  
	// Método para somar 
    public int somar(int num1, int num2) {
        return num1 + num2;
    }

    // Método para subtrair 
    public int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    // Método para multiplicar 
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    // Método para dividir 
    public int dividir(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Erro: divisão por zero.");
          
        }
        return num1 / num2;
    }
}

	
