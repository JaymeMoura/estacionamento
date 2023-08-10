package estacionamento;
public class Estacionamento {

    public static void main(String[] args) {
        Consignado c1 = new Consignado("Jose", 100, "Caju", 1999, "corsa");
        Proprio p1 = new Proprio (1000, "15/10/2002", "manga", 1990, "jetta");
        
        p1.disponivel();
        p1.oferta(1200);
        p1.vendercarro("tiao", 2000);
        p1.imprimirdados();
        
        System.out.println("\n\n\n");
        
        c1.disponivel();
        c1.oferta(104);
        c1.vendercarro("carlos", 110);
        c1.imprimirdados();

    }
    
}
