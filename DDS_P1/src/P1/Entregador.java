package P1;

public class Entregador extends Funcionario{
    private String veiculo;

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public void mostrarFuncionario(){
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("Veiculo: " + getVeiculo());
    }
}
