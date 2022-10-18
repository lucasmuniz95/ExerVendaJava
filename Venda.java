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

    public static void setProduto(Produto produto) {
        this.produto = produto;
    }

    public static Vendedor getVendedor() {
        return vendedor;
    }

    public static void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public static int getQuantidadeItens() {
        return quantidadeItens;
    }

    public static void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public static void descontoParaPorcetagem(float desconto){
        float descontoP = (desconto * 100) / valor;
    }

    public static void calcularValor(){
       float valor = (quantidadeItens * Produto.getValorVenda()) - desconto;
    }


    public void efetuarDesconto(float desconto){
        float valorReal = valor - desconto;
        float valoresProdutos = valorReal / quantidadeItens;
        if (valoresProdutos < Produto.getValorCusto()){
            System.out.println("Desconto acima do permitido.");;
        } else {
            System.out.println("Desconto permitido.");
        }
    }

    public void calcularComissao(float Vendedor.comissao){
        if (Produto.isPromocao()){
            float comissaoReal = Produto.getValorVenda() * (Vendedor.comissao/2);
        } else{
            float comissaoReal = Produto.getValorVenda() * Vendedor.comissao;
        }
    }

    public void Imprimir(){
        System.out.println("Codigo do vendedor: " + Vendedor.getCodigo() + " - Nome: " + Vendedor.getNome() + " - Comissão: " + Vendedor.comissao);
        System.out.println("Quantidade de itens vendidos: " + quantidadeItens);
        System.out.println("Codigo do Produto: " + Produto.getCodigoProduto() + " - Descrisção do produto: " + Produto.getDescricao());
        System.out.println("Valor de venda do produto: " + Produto.getValorVenda() / quantidadeItens);
        System.out.println("Produto está em promoção: " + Produto.isPromocao());
        System.out.println("Valor do desconto sobre o produto: " + (efetuarDesconto(desconto);
        System.out.println("Valor total da venda: " + Produto.getValorVenda());
    }

}
