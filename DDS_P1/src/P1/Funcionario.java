package P1;

public class Funcionario {
    private String nome;
    private double salario;
    private String dataContratado;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getDataContratado(){
        return dataContratado;
    }

    public void setDataContratado(String dataContratado){
        this.dataContratado = dataContratado;
    }

    public void mostrarFuncionario(){
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
    }
}
