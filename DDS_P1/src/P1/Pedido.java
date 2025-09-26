package P1;

public class Pedido {
    private String cliente;
    private double total;
    private String bairro;
    private String endereco;

    private double taxa;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    private double incluirTaxa() {
        return this.taxa + this.total;
    }

    public void mostrarCliente(){
        System.out.println("Nome: " + getCliente());
        System.out.println("Bairro: " + getBairro());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Total do Pedido: " + getTotal());
        System.out.println("-------------------------------");
        System.out.println("Total + Taxa: " + incluirTaxa());
    }


}
