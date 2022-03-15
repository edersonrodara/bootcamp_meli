package javaII.pratica1;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Ederson", 18, "01");
        Pessoa pessoa3 = new Pessoa("Ederson", 18, "02", 71.4f, 1.82f);
//        Pessoa pessoa4 = new Pessoa("Ederson", 18);
        System.out.println(pessoa3);
        float imc = pessoa3.calcularIMC();
        boolean heMaiorIdade = pessoa3.ehMaiorIdade();

        System.out.println("Indíce de massa corporal (IMC)");
        if (imc == -1) {
            System.out.println("Abaixo do peso");
        } else if (imc == 0) {
            System.out.println("Peso saudável");
        } else {
            System.out.println("Sobrepeso");
        }

        System.out.println("\n");

        System.out.println("É maior de idade?");
        if (heMaiorIdade) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }
    }
}
