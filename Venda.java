package ExerVenda;

public class Venda {
    Produto produto;
    Vendedor vendedor;
    int desconto;
    int quantidadeItens;
    int  valor;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public float calcularValor(){
        float valor = quantidadeItens * produto.getValorVenda();
        return valor;
    }

    public float efetuarDesconto(){
        float valorDesconto = produto.getValorVenda()*100;
        float valorProdutoDesconto = produto.getValorVenda()-valorDesconto;
        if(valorProdutoDesconto<produto.getValorCusto()) {
        	System.out.printf("Cupom de desconto não se aplica");
        	return produto.getValorVenda();
        }
        return valorProdutoDesconto;
        
    }

    public float calcularComissao(){
    	float valorComissao = (float)(valor*vendedor.getComissao());
        if (produto.getPromocao()){
            valorComissao = valorComissao/2;
        } 
        return valorComissao;
    }
    

    public  void Imprimir(){
        System.out.println("Codigo do vendedor: " + vendedor.codigo + " - Nome: " + vendedor.nome + " - Comissão: " + vendedor.comissao);
        System.out.println("Quantidade de itens vendidos: " + quantidadeItens);
        System.out.println("Codigo do Produto: " + produto.codigo + " - Descrisção do produto: " + produto.descriscao);
        System.out.println("Valor de venda do produto: " + produto.valorVenda / quantidadeItens);
        System.out.println("Produto está em promoção: " + produto.promocao);
        System.out.println("Valor do desconto sobre o produto: " + efetuarDesconto(desconto));
        System.out.println("Valor total da venda: " + produto.valorVenda);
    }

	private String efetuarDesconto(int desconto2) {
		// TODO Auto-generated method stub
		return null;
	}

}
