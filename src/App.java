public class App {
    public static void main(String[] args) throws Exception { 
        import java.util.ArrayList;
        import java.util.List;
        import Modelo.Venda;
        import Modelo.Produto;

        List<Produto> produto = new ArrayList<>()
        
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Incluir produto ");  ok
            System.out.println("2 - Consultar produto ");
            System.out.println("3 - Listagem de produtos "); ok
            System.out.println("4 - Vendas por periodo - detalhado ");
            System.out.println("5 - Realizar venda ");
            System.out.println("0 - Sair ");
            System.out.print("Opcao: ");

            opcao = in.nextInt();
            in.nextLine(); 

            if (opcao == 1) {

                Produto produto= new Produto();
                   
                System.out.println("Informe o nome: ");
                Produto.setNome(in.nextLine());

                System.out.println("Informe o codigo: ");
                Produto.setCodigo(in.nextLine());

                System.out.println("Informe o valor: ");
                Produto.setValor(in.nextLine());

                System.out.println("Informe a quantidade em estoque: ");
                Produto.setQuantidadeemestoque(in.nextLine());

                listaProduto.add(Produto);
                    voltarMenu(in);
                    continue; 

                 else if (opcao == 3) {
                    if (listaProduto.isEmpty) {
                       
                        for (Produto produto : produto){
                        System.out.println(produto);
                        voltarMenu(in);
                        continue;
                    }





    }

