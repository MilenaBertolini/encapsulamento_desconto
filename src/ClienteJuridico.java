public class ClienteJuridico extends Cliente{
    
    public ClienteJuridico(String nome, String tipo){
        super(nome, tipo);
    }

    @Override
    public Double aplicarDesconto(Double valor){
        return 0.2;
    }
}
