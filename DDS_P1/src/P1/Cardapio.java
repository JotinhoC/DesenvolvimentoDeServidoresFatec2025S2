package P1;

import java.lang.reflect.Array;

public class Cardapio {
    private String nome;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void mostrarProduto(){
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getValor());
    }
}
