/*Okay, o que é necesário num e-commerce de produtos orgânicos?
		 * pensei melhor e acho que, por enquanto, é melhor
		 * que as funções de administrador e comprador sejam 
		 * conjuntas, para fins de praticidade na hora dos testes
		 * e desenvolvimento de funções.
		 * botões: adicionar produto, visualizar produto,
		 * atualizar informações do produto, 
		 * excluir produto, comprar produto e sair da aplicação.
		 */
package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	
	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int op = 0, classificacaoProduto;
		String nomeProduto, descricaoProduto;
		float valorProduto;
		
		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("           Produtos Orgânicos Tio Patatinhas         ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("            1 - Adicionar produto ao estoque         ");
			System.out.println("            2 - Listar todos os produtos             ");
			System.out.println("            3 - Atualizar informações do produto     ");
			System.out.println("            4 - Excluir produto                      ");
			System.out.println("            5 - Comprar produto                      ");
			System.out.println("            0 - Sair da aplicação                    ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			
			try {
				op = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
			}
			
			if(op == 0) {
				System.out.println("Saindo do sistema...");
				System.exit(0);
			}
			
			switch(op) {
			
			case 1:
				System.out.println("\nAdicionar produto:\n\n");
				System.out.println("Digite o nome do produto: ");
				leia.skip("\\R?");
				nomeProduto = leia.nextLine();
				
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
				
				System.out.println("Dê uma breve descrição do produto: ");
				leia.skip("\\R?");
				descricaoProduto = leia.nextLine();
				
				// armazenar esses dados
				
				System.out.println("\n\n Seu registro: ");
				System.out.println(" Nome: " + nomeProduto);
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
				System.out.println(" Valor: R$" + valorProduto);
				System.out.println(" Descrição: " + descricaoProduto + "\n\n");
				break;
				
			case 2:
				System.out.println("Listar todos os produtos");
				leia.skip("\\R?");
				leia.nextLine();
				break;
			case 3:
				System.out.println("Atualizar informações do produto");
				leia.skip("\\R?");
				leia.nextLine();
				break;
			case 4:
				System.out.println("Excluir produto");
				leia.skip("\\R?");
				leia.nextLine();
				break;
			case 5:
				System.out.println("Comprar produto");
				leia.skip("\\R?");
				leia.nextLine();
				break;
				
				}
			
			}
			
		}
		
	}


