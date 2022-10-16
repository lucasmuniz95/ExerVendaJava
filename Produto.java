package ExerVenda;

public class Produto {
    int codigo;
    String descriscao;
    float valorVenda;
    float valorCusto;
    boolean promocao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescriscao() {
        return descriscao;
    }

    public void setDescriscao(String descriscao) {
        this.descriscao = descriscao;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(int valorVenda) {
        this.valorVenda = valorVenda;
    }

    public float getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(int valorCusto) {
        this.valorCusto = valorCusto;
    }

    public boolean getPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

    public Produto(int codigo, String descriscao, int valorVenda, int valorCusto, boolean promocao) {
        this.codigo = codigo;
        this.descriscao = descriscao;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
        this.promocao = promocao;
    }
}
