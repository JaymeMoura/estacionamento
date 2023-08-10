package estacionamento;

public class Carros {
    private String placa;
    private int anodefabricacao;
    private String modelo;
    public boolean disponivel;
    public String vendedor;
    public double valorVenda;

    public Carros(String placa, int anodefabricacao, String modelo) {
        this.placa = placa;
        this.anodefabricacao = anodefabricacao;
        this.modelo = modelo;
        this.disponivel = true;
        this.vendedor = "";
    }
    
    public boolean disponivel(){
        if (disponivel == true) {
            System.out.println("carro disponivel");
            return true;
        } else {
            System.out.println("carro nao disponivel");
            return false;
        }
    }
    public void imprimirdados(){
        System.out.println("placa: " + this.getPlaca());
        System.out.println("ano:" + this.getAnodefabricacao());
        System.out.println("modelo: " + this.getModelo());
        System.out.println("disponivel: " + this.disponivel );
        if (disponivel == true) {
            System.out.println("carro sem vendedor");
        } else {
            System.out.println("vendedor:" + this.vendedor); 
        }
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnodefabricacao() {
        return anodefabricacao;
    }

    public void setAnodefabricacao(int anodefabricacao) {
        this.anodefabricacao = anodefabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
