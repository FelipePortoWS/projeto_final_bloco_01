/*Okay, o que é necesário num e-commerce de produtos orgânicos?
		 * pensei melhor e acho que, por enquanto, é melhor
		 * que as funções de administrador e comprador sejam 
		 * conjuntas, para fins de praticidade na hora dos testes
		 * e desenvolvimento de funções.
		 * botões: adicionar produto, visualizar produto,
		 * atualizar informações do produto, 
		 * excluir produto, comprar produto e sair da aplicação.
		 */
package produto;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.ProdutoController;
import model.Produto;
import model.ProdutoHortifruti;
import model.ProdutoLaticinio;

public class Menu {
	

	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		ProdutoController produto = new ProdutoController();
	
		int op = 0, classificacaoProduto = 0, latOrHort = 0;
		String nomeProduto = null, descricaoProduto, strClassificacaoProduto = null;
		float valorProduto;
		
		
		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("           Produtos Orgânicos Tio Patatinhas         ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("            1 - Adicionar produto ao estoque         ");
			System.out.println("            2 - Listar todos os produtos             ");
			System.out.println("            3 - Procurar produto		             ");
			System.out.println("            4 - Atualizar informações do produto     ");
			System.out.println("            5 - Excluir produto                      ");
			System.out.println("            6 - Comprar produto                      ");
			System.out.println("            7 - Verificar carrinho                   ");
			System.out.println("            0 - Sair da aplicação                    ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			
			try {
				op = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros...\n\n");
				leia.nextLine();
			}
			
			if(op > 6 || op < 0) {
				System.out.println("Digite um número válido...\n\n");
			}
			
			if(op == 0) {
				System.out.println("Saindo do sistema...");
				System.exit(0);
			}
			
			switch(op) {
			
			case 1:
				System.out.println("\nAdicionar produto:\n\n");
				
				//nome do produto:
				System.out.println("Digite o nome do produto: ");
				leia.skip("\\R?");
				nomeProduto = leia.nextLine();
				
				//classificação do produto
				do {
				try {
					System.out.println("Seu produto é \"(1) hortifruti\" ou \"(2) laticínio?\"? ");
					latOrHort = leia.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("Digite um número inteiro.");
					latOrHort = 0;
				}
				}while(latOrHort < 1 || latOrHort > 2);
				
				//para caso de hortifruti
				if(latOrHort == 1) {
				do {
					System.out.println("Classificação: \"(1) fruta\", \"(2) legume\", \"(3) verdura\" ou \"(4) vegetal\".  ");
					System.out.println("Digite a classificação do produto: ");
					try {
						classificacaoProduto = leia.nextInt();
					}catch(InputMismatchException e){
						System.out.println("\nDigite valores inteiros!");
						leia.nextLine();
						classificacaoProduto = 0;
					}
					
					if(classificacaoProduto < 1 || classificacaoProduto > 4) {
						System.out.println("Digite uma classificação válida!");
					}
				}
				while(classificacaoProduto < 1 || classificacaoProduto > 4);	
				}
				
				//para caso de laticínio
				if(latOrHort == 2) {
					do {
						System.out.println("Classificação: \"(1) leite\", \"(2) queijo\", \"(3) manteiga\" ou \"(4) yogurte\".  ");
						System.out.println("Digite a classificação do produto: ");
						try {
							classificacaoProduto = leia.nextInt();
						}catch(InputMismatchException e){
							System.out.println("\nDigite valores inteiros!");
							leia.nextLine();
							classificacaoProduto = 0;
						}
						
						if(classificacaoProduto < 1 || classificacaoProduto > 4) {
							System.out.println("Digite uma classificação válida!");
						}
					}
					while(classificacaoProduto < 1 || classificacaoProduto > 4);	
					}
				
				
				//valor do produto
				do {
				System.out.println("Digite o valor do produto (separando com \",\" e não com \".\"): ");
				try {
				valorProduto = leia.nextFloat();
				}catch(InputMismatchException e){
					System.out.println("\nDigite valores inteiros!");
					leia.nextLine();
					valorProduto = 0;
					}
				}
				while (valorProduto == 0);
				
				//descrição do produto
				System.out.println("Dê uma breve descrição do produto: ");
				leia.skip("\\R?");
				descricaoProduto = leia.nextLine();
				
				//reatribuição de classificacaoProduto
				if(latOrHort == 1) {
					if(classificacaoProduto == 1) {
						strClassificacaoProduto = "fruta";
					}
					if(classificacaoProduto == 2) {
						strClassificacaoProduto = "legume";
					}
					if(classificacaoProduto == 3) {
						strClassificacaoProduto = "verdura";
					}
					if(classificacaoProduto == 4) {
						strClassificacaoProduto = "vegetal";
					}
				}else if(latOrHort == 2) {
					if(classificacaoProduto == 1) {
						strClassificacaoProduto = "leite";
					}
					if(classificacaoProduto == 2) {
						strClassificacaoProduto = "queijo";
					}
					if(classificacaoProduto == 3) {
						strClassificacaoProduto = "manteiga";
					}
					if(classificacaoProduto == 4) {
						strClassificacaoProduto = "yogurte";
					}
				}
				
				if(latOrHort == 1) {
				produto.RegistrarProduto(new ProdutoHortifruti(produto.gerarNumero(), nomeProduto, 
						strClassificacaoProduto, valorProduto, descricaoProduto));
				}else{
				produto.RegistrarProduto(new ProdutoLaticinio(produto.gerarNumero(), nomeProduto, 
						strClassificacaoProduto, valorProduto, descricaoProduto));	
				}
				
				// mostrar esses dados
				
				System.out.println("\n\n Seu registro: ");
				System.out.println(" Nome: " + nomeProduto);
				
				if(latOrHort == 1) {
				switch(classificacaoProduto) {
				case 1:
				System.out.println(" Classificação: fruta");
				break;
				case 2:
					System.out.println(" Classificação: legume");
					break;
				case 3:
					System.out.println(" Classificação: verdura");
					break;
				case 4:
					System.out.println(" Classificação: vegetal");
					break;
					}
				}else{
				switch(classificacaoProduto) {
				case 1:
				System.out.println(" Classificação: leite");
				break;
				case 2:
					System.out.println(" Classificação: queijo");
					break;
				case 3:
					System.out.println(" Classificação: manteiga");
					break;
				case 4:
					System.out.println(" Classificação: yogurte");
					break;	
					}
				}
				
				System.out.println(" Valor: R$" + valorProduto);
				System.out.println(" Descrição: " + descricaoProduto + "\n\n");
				break;
				
				//case 2
			case 2:
				System.out.println("Listar todos os produtos");
				Produto.ListarProduto(); // arrumar dps
				break;
			case 3:
				System.out.println("Atualizar informações do produto");
				leia.skip("\\R?");
				leia.nextLine();
				break;
			case 4:
				System.out.println("Atualizar informações do produto");
				leia.skip("\\R?");
				leia.nextLine();
				break;
			case 5:
				System.out.println("Excluir produto");
				leia.skip("\\R?");
				leia.nextLine();
				break;
			case 6:
				System.out.println("Comprar produto");
				leia.skip("\\R?");
				leia.nextLine();
				break;
			case 7:
				System.out.println("Verificar carrinho");
				leia.skip("\\R?");
				leia.nextLine();
				break;
				
			}
				}
			
			}
			
		}
		



