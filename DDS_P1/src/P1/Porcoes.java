package P1;

public class Porcoes extends Cardapio{
    private String descricao;
    private int medida;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getMedida() {
        return medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    @Override
    public void mostrarProduto(){
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getValor());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Medida: " + getMedida() +"g");
    }
}
