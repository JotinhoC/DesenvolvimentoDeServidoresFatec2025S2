package P1;

public class Cozinha extends Funcionario{
    private String funcao;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public void mostrarFuncionario() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("Função na Cozinha: " + getFuncao());
    }
}
