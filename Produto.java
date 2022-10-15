package ExerVenda;

public class Produto {
    int codigo;
    String descriscao;
    int valorVenda;
    int valorCusto;
    bool promocao;

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

    public int getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(int valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(int valorCusto) {
        this.valorCusto = valorCusto;
    }

    public bool getPromocao() {
        return promocao;
    }

    public void setPromocao(bool promocao) {
        this.promocao = promocao;
    }

    public Produto(int codigo, String descriscao, int valorVenda, int valorCusto, bool promocao) {
        this.codigo = codigo;
        this.descriscao = descriscao;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
        this.promocao = promocao;
    }
}
