package Modelo;

public class Produto {

    private String Nome;
    private int Codigo;
    private int Valor;
    private int QuantidadeEmEstoque;

    public Produto(String nome, int codigo, int valor, int quantidadeEmEstoque) {
        Nome = nome;
        Codigo = codigo;
        Valor = valor;
        QuantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int codigo) {
        Codigo = codigo;
    }
    public int getValor() {
        return Valor;
    }
    public void setValor(int valor) {
        Valor = valor;
    }
    public int getQuantidadeemestoque() {
        return QuantidadeEmEstoque;
    }
    public void setQuantidadeemestoque(int quantidadeemestoque) {
        QuantidadeEmEstoque = quantidadeemestoque;
    }
}
    

