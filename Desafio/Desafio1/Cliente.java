package Desafio1;

public class Cliente extends Pessoa {
    private String dataDeCompra;
    private String formaDePagamento;

    public Cliente(String nome, String idade, String dataDeCompra, String formaDePagamento) {
        super(nome, idade);
        this.dataDeCompra = dataDeCompra;
        this.formaDePagamento = formaDePagamento;
    }

    public String getDataDeCompra() {
        return dataDeCompra;
    }

    public void setDataDeCompra(String dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    @Override
    public String toString() {
        return "Desafio1.Cliente{" +
                "dataDeCompra='" + dataDeCompra + '\'' +
                ", formaDePagamento='" + formaDePagamento + '\'' +
                ", nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }
}
