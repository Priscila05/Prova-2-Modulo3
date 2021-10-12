public class App {
    public static void main(String[] args) throws Exception { 
        
        
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Incluir produto ");
            System.out.println("2 - Conlsultar produto ");
            System.out.println("3 - Listagem de produtos ");
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



                    voltarMenu(in);
                    continue;
                }
                Scanner ler = new Scanner(System.in);
                ler.nextLine();



    }

