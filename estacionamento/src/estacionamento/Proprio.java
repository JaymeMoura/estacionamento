package estacionamento;

public class Proprio extends Carros{
    public double valordecompra;
    public String datacompra;

    public Proprio(double valordecompra, String datacompra, String placa, int anodefabricacao, String modelo) {
        super(placa, anodefabricacao, modelo);
        this.valordecompra = valordecompra;
        this.datacompra = datacompra;
    }
    
        public boolean oferta(double valor){
        double cem = valor/100 * 10;
        double result = valor - cem;
        
        if (valordecompra < result) {
            System.out.println("oferta aceita!");
            return true;
        } 
        else {
            System.out.println("Oferta recusada!");
            return false;
        }    
    }
        
        public boolean vendercarro(String Vendedor, double valorvenda){
        this.valorVenda = valorvenda;
        this.vendedor = Vendedor;
        double cem = valorvenda/100 * 10;
        double result = valorvenda - cem;
        if (disponivel == true && valordecompra < result) {
            System.out.println("carro Vendido");
            this.disponivel = false;
            return true;
        } else {
            return false;
        }
    }
        
        
        
        
}