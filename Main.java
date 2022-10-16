import java.util.Scanner;
import ExerVenda.Produto;
import ExerVenda.Vendedor;
import ExerVenda.Venda;


public class Main {

	

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Cadastre o funcionário: ");
		System.out.println("Informe o nome do vendedor: ");
		Vendedor.nome = leitor.nextln();
		System.out.println("Informe o código do vendedor: ");
		Vendedor.codigo = leitor.nextInt();
		System.out.println("Informe a comissão do de "+ Vendedor.nome);
		Vendedor.comissao = leitor.nextFloat();
		System.out.println("Informe o endereço de "+Vendedor.nome);
	    Vendedor.endereco = leitor.next();
		
		System.out.println("Informe o código do produto: ");
		Produto.codigo = leitor.nextInt();
		System.out.println("Informe a descrição do produto: ");
		Produto.descriscao = leitor.nextln();
		System.out.println("Informe o valor do produto: ");
		Produto.valorVenda = leitor.nextFloat();
		System.out.println("Informe o valor de custo do produto: ");
		Produto.valorCusto = leitor.nextFloat();
		System.out.println("Produto em promoção? ");
		Produto.promocao = leitor.nextBoolean();
		
		System.out.println("Informe o código do produto: ");
		Venda.desconto = leitor.nextInt();
		System.out.println("Informe a quantidade: ");
		Venda.quantidade = leitor.nextInt();
		System.out.println("Informe o valor do produto: ");
		Venda.valor = leitor.nextInt();
	
	}

}
