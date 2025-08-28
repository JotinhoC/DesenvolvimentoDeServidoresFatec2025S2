package exercicioMetodos;

public class TestaFuncionario {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario();
        f1.nome = "João";
        f1.salario = 2000.0;

        Funcionario f2 = new Funcionario();
        f2.nome = "Manuel";
        f2.salario = 3000.0;

        System.out.println("Nome: "+f1.nome);
        System.out.println("Salario: "+f1.salario);
        System.out.println("Nome: "+f2.nome);
        System.out.println("Salario: "+f2.salario);
        System.out.println("--------------------");
        f1.aumentaSalario(2000.0);
        f1.consultaDados();

        f2.aumentaSalario(1000.0);
        f2.consultaDados();
    }
}
