package estacionamento;

public class Consignado extends Carros{
    public String proprietario;
    public double valordesejado;

    public Consignado(String proprietario, double valordesejado, String placa, int anodefabricacao, String modelo) {
        super(placa, anodefabricacao, modelo);
        this.proprietario = proprietario;
        this.valordesejado = valordesejado;
    }
    
    public boolean oferta(double valor){
        double cem = valor/100 * 5;
        double result = valor + cem;
        
        if (valordesejado < result) {
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
        double cem = valorvenda/100 * 5;
        double result = valorvenda - cem;
            
        if (disponivel == true && valordesejado < result) {
            System.out.println("carro Vendido");
            this.disponivel = false;
            return true;
        } else {
            System.out.println("carro nao vendido");
            return false;
        }
    }
    
    
    
    
}
