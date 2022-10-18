import ExerVenda.Produto;
import ExerVenda.Vendedor;
import static ExerVenda.Vendedor.comissao;

public class Venda {
    private Produto produto;
    private Vendedor vendedor;

    private float desconto;
    private int quantidadeItens;
    private float valor;

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

    public void descontoParaPorcetagem(float desconto){
        float descontoP = (desconto * 100) / valor;
    }

    public void calcularValor(){
       float valor = (quantidadeItens * getProduto().getValorVenda()) - desconto;
    }


    public void efetuarDesconto(float descontoP){
        descontoParaPorcetagem(float desconto;);
        float valorReal = valor - desconto;
        float valoresProdutos = valorReal / quantidadeItens;
        if (valoresProdutos < getProduto().getValorCusto()){
            System.out.println("Desconto acima do permitido.");;
        } else {
            System.out.println("Desconto permitido.");
        }
    }

    public void calcularComissao(float Vendedor.comissao){
        if (getProduto().isPromocao()){
            float comissaoReal = getProduto().getValorVenda() * (Vendedor.comissao/2);
        } else{
            float comissaoReal = getProduto().getValorVenda() * Vendedor.comissao;
        }
    }

    public  void Imprimir(){
        System.out.println("Codigo do vendedor: " + getVendedor().getCodigo() + " - Nome: " + getVendedor().getNome() + " - Comissão: " + Vendedor.comissao);
        System.out.println("Quantidade de itens vendidos: " + quantidadeItens);
        System.out.println("Codigo do Produto: " + getc + " - Descrisção do produto: " + produto.descriscao);
        System.out.println("Valor de venda do produto: " + produto.valorVenda / quantidadeItens);
        System.out.println("Produto está em promoção: " + produto.promocao);
        System.out.println("Valor do desconto sobre o produto: " + efetuarDesconto(desconto));
        System.out.println("Valor total da venda: " + produto.valorVenda);
    }

}
