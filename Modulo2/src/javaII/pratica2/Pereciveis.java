package javaII.pratica2;

public class Pereciveis extends Produto {
    private int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public Pereciveis(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        double newPreco = getPreco();
        if (diasParaVencer <= 1) {
            newPreco = this.getPreco() / 4;
        } else if (diasParaVencer <= 2) {
            newPreco = this.getPreco() / 3;
        } else if (diasParaVencer <= 3) {
            newPreco = this.getPreco() / 2;
        }

        return (newPreco * quantidadeDeProdutos / 100) * 100;
    }

    @Override
    public String toString() {
        return super.toString() + " " +
                "diasParaVencer=" + diasParaVencer +
                '}';
    }
}
