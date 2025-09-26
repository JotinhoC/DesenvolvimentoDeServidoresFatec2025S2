package P1;

public class Bebidas extends Cardapio{
    private int medida;

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public void mostrarProduto(){
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getValor());
        System.out.println("Medida: " + getMedida() +"ml");
    }
}
