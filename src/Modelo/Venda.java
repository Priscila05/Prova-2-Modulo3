package Modelo;

public class Venda {

    private int DataDaVenda;
    private int ProdutoVendido;
    private int QuantidadeVendida;

    public Venda(int dataDaVenda, int produtoVendido, int quantidadeVendida) {
        DataDaVenda = dataDaVenda;
        ProdutoVendido = produtoVendido;
        QuantidadeVendida = quantidadeVendida;
    }
    
    public int getDataDaVenda() {
        return DataDaVenda;
    }
    public void setDataDaVenda(int dataDaVenda) {
        DataDaVenda = dataDaVenda;
    }
    public int getProdutoVendido() {
        return ProdutoVendido;
    }
    public void setProdutoVendido(int produtoVendido) {
        ProdutoVendido = produtoVendido;
    }
    public int getQuantidadeVendida() {
        return QuantidadeVendida;
    }
    public void setQuantidadeVendida(int quantidadeVendida) {
        QuantidadeVendida = quantidadeVendida;
   
    
    }
    
}
