package P1;

public class TestePizzaria {

    public static void main (String[] args){
        Gerente gerente = new Gerente();
        gerente.setNome("José");
        gerente.setSalario(3000.0);
        gerente.setDataContratado("25/09/2025");
        gerente.setUsuario("gerente");
        gerente.setSenha("8837238");

        Cozinha cozinha1 = new Cozinha();
        cozinha1.setNome("Amanda");
        cozinha1.setSalario(1500.0);
        cozinha1.setDataContratado("25/09/2025");
        cozinha1.setFuncao("Montagem de Pizzas");

        Cozinha cozinha2 = new Cozinha();
        cozinha2.setNome("Marcos");
        cozinha2.setSalario(1500.0);
        cozinha2.setDataContratado("25/09/2025");
        cozinha2.setFuncao("Montagem de porções");

        Entregador entregador1 = new Entregador();
        entregador1.setNome("Rayan");
        entregador1.setSalario(1300.0);
        entregador1.setDataContratado("25/09/2025");
        entregador1.setVeiculo("Yamaha");

        Pizzas pizza1 = new Pizzas();
        pizza1.setNome("Mussarela");
        pizza1.setValor(42.0);
        pizza1.setDescricao("Molho, Queijo, Tomate, e Azeitonas");

        Pizzas pizza2 = new Pizzas();
        pizza2.setNome("Frango");
        pizza2.setValor(50.0);
        pizza2.setDescricao("Molho, Queijo, Frango, Milho e Azeitonas");

        Porcoes porcao1 = new Porcoes();
        porcao1.setNome("Batata Frita");
        porcao1.setValor(24.0);
        porcao1.setDescricao("Batatas Fritas com molho rose a parte");
        porcao1.setMedida(450);

        Bebidas bebida1 = new Bebidas();
        bebida1.setNome("Coca Lata");
        bebida1.setValor(5.0);
        bebida1.setMedida(300);

        Bebidas bebida2 = new Bebidas();
        bebida2.setNome("Sprite");
        bebida2.setValor(5.0);
        bebida2.setMedida(300);

        System.out.println("Gerente");
        gerente.mostrarFuncionario();

        System.out.println("=============================");
        System.out.println("Cozinha");
        cozinha1.mostrarFuncionario();
        System.out.println(" ");
        cozinha2.mostrarFuncionario();

        System.out.println("=============================");
        System.out.println("Entregadores");
        entregador1.mostrarFuncionario();

        System.out.println("=============================");
        System.out.println("Pizzas");
        pizza1.mostrarProduto();
        System.out.println(" ");
        pizza2.mostrarProduto();

        System.out.println("=============================");
        System.out.println("Porções");
        porcao1.mostrarProduto();

        System.out.println("=============================");
        System.out.println("Bebidas");
        bebida1.mostrarProduto();
        System.out.println(" ");
        bebida2.mostrarProduto();
    }
}
