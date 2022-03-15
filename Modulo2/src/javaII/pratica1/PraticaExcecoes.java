package javaII.pratica1;

public class PraticaExcecoes {

    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 300;
            System.out.println(b / a);
        } catch (ArithmeticException e) {
        System.out.println("Não pode ser dividido por zero");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
