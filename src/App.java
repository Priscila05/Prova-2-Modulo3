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
                    System.out.println("\nNão há espaço para cadastrar novos pilotos.");
                    voltarMenu(in);
                    continue;
                }
                Scanner ler = new Scanner(System.in);
                ler.nextLine();



    }

