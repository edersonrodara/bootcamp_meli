package javaII.pratica2;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        Pereciveis prod1 = new Pereciveis("arroz", 5.66,5);
        Pereciveis prod2 = new Pereciveis("arroz", 5.66,5);
        NaoPereciveis prod3 = new NaoPereciveis("Milho", 5.66,"Lata");
        Pereciveis prod4 = new Pereciveis("arroz", 5.66,1);
        Pereciveis prod5 = new Pereciveis("arroz", 5.66,2);

        produtos.add(prod1);
        produtos.add(prod2);
        produtos.add(prod3);
        produtos.add(prod4);
        produtos.add(prod5);

        prod1.calcular(5);

        System.out.println(prod1.calcular(5));

        for (Produto p : produtos) {
            System.out.println(p.calcular(5));
        }

    }
}
