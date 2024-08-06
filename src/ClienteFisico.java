
public class ClienteFisico extends Cliente{
    
    public ClienteFisico(String nome, String tipo){
        super(nome, tipo);
    }

    @Override
    public Double aplicarDesconto(Double valor){

        return 0.1;
    }

}
