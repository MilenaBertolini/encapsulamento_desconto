public class App {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3000.00);

        Cliente cliente1 = new ClienteFisico("João", "PessoaFisica");
        Cliente cliente2 = new ClienteJuridico("Empresa X", "PessoaJuridica");

        // Precificacao pricingEngine = new Precificacao();

        double precoFinalPessoaFisica = produto.calcularPrecoFinal(cliente1);
        double precoFinalPessoaJuridica = produto.calcularPrecoFinal(cliente2);

        System.out.println("Preço final para " + cliente1.getNome() + ": " + precoFinalPessoaFisica);
        System.out.println("Preço final para " + cliente2.getNome() + ": " + precoFinalPessoaJuridica);
    }
}
