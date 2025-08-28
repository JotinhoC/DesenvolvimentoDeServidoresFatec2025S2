package exercicioMetodos;

public class Funcionario {
    String nome;
    Double salario;

    void aumentaSalario(Double aumento){
        this.salario += aumento;
    }

    void consultaDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
    }
}
