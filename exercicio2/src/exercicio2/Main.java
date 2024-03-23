package exercicio2;

public class Main {
    public static void main(String[] args) {
       
    	// criando um objeto
        Estudante estudante = new Estudante("Vitória", 15, 9.5);

        // Verificando se o estudante foi aprovado
        if (estudante.aprovado()) {
            System.out.println(estudante.getNome() + " foi aprovado(a)!");
        } else {
            System.out.println(estudante.getNome() + " foi reprovado(a)!");
        }
    }
}
