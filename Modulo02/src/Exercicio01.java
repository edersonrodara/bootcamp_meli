public class Exercicio01 {
    public static void main(String[] args) {
        String cidades[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Asunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int[][] temperaturas = {{-2, 33}, {-3, 33}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};
        int cidadeA= 0;
        int cidadeB= 0;


        int temperaturaMinima = 0;
        int temperaturaMaxima = 0;

        for (int i = 0; i < temperaturas.length; i += 1) {
            int minima = temperaturas[i][0];
            int maxima = temperaturas[i][1];
            if (minima < temperaturaMinima) {
                temperaturaMinima = minima;
                cidadeA = i;
            }
            if (maxima > temperaturaMaxima) {
                temperaturaMaxima = maxima;
                cidadeB = i;
            }
        }

        System.out.printf("A temperatura mais baixa foi em %s, com %do C. \n", cidades[cidadeA], temperaturaMinima);
        System.out.printf("A temperatura mais alta foi em %s, com %do C. \n", cidades[cidadeB], temperaturaMaxima);

    }
}