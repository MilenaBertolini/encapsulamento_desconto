public class Produto {
    private String nome;
    private double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public Double aplicarImposto(){

        double imposto = 0.1; // 10% de imposto fixo para todos os produtos

        return imposto;
    }

    public Double aplicarTaxaAdicional(){

        double taxaAdicional = 50; // Taxa adicional fixa de 50 para todos os produtos

        return taxaAdicional;
    }

    public Double calcularPrecoFinal(Cliente cliente){

        double desconto = cliente.aplicarDesconto(this.precoBase);
        double precoComDesconto = this.precoBase * (1 - desconto);
        double precoFinal = precoComDesconto + (precoComDesconto * aplicarImposto()) + aplicarTaxaAdicional();

        return precoFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }
}
