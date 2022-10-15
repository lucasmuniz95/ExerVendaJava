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

    public calcularValor(int quantidadeItens, Produto.valorVenda, int desconto){
        valor = quantidadeItens * efetuarDesconto(int desconto);
        return valor;
    }

    public efetuarDesconto(int desconto){
        descontoReal = Produto.valorVenda - (Produto.valorVenda - desconto)
        return descontoReal;
    }

    public calcularComissao(Vendedor.comissao, Produto.valorVenda){
        if (Produto.promocao == true){
            comissaoReal = Produto.valorVenda * (Vendedor.comissao/2)
        } else {
            comissaoReal = Produto.valorVenda * comissao
        }
        return comissaoReal;
    }

    public Imprimir(){
        System.out.println('Codigo do vendedor: ' + Vendedor.codigo + " - Nome: " + Vendedor.nome + " - Comissão: " + Vendedor.comissao);
        System.out.println("Quantidade de itens vendidos: " + QuantidadeItens);
        System.out.println("Codigo do Produto: " + Produto.codigo + " - Descrisção do produto: " + Produto.descriscao);
        System.out.println("Valor de venda do produto: " + (Produto.valorVenda / quantidadeItens);
        System.out.println("Produto está em promoção: " + Produto.promocao);
        System.out.println("Valor do desconto sobre o produto: " + efetuarDesconto(desconto));
        System.out.println("Valor total da venda: " + Produto.valorVenda);
    }

}

