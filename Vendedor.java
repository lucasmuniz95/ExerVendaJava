package ExerVenda;

class Vendedor{
    private String nome;
    private int codigo;
    private static float comissao;
    private String endereco;
    
    public Vendedor(){
    }

    public Vendedor(String nome, int codigo, String endereco) {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public static float getComissao() {
        return comissao;
    }

    public static void setComissao(float comissao) {
        Vendedor.comissao = comissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
