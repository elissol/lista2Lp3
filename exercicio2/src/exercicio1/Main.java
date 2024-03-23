package exercicio1;

public class Main {
    public static void main(String[] args) {
      
    	// Criando um objeto 
        Calculadora calc = new Calculadora();

        // Métodos
        int resultadoSoma = calc.somar(20, 10);
        System.out.println("20 + 10 = " + resultadoSoma);

        int resultadoSubtracao = calc.subtrair(30, 5);
        System.out.println("30 - 5 = " + resultadoSubtracao);

        int resultadoMultiplicacao = calc.multiplicar(10, 5);
        System.out.println("10 * 5 = " + resultadoMultiplicacao);

        int resultadoDivisao = calc.dividir(60, 5);
        System.out.println("60 / 5 = " + resultadoDivisao);
    }
}

