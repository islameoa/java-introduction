public class Ascensor {
    public static void main(String args[]){
    
    String pis;
    String boto;
    
    System.out.println("pis?");
    pis = Entrada.readLine();
    System.out.println("boto?");
    boto = Entrada.readLine();
    
    if ((pis.equals("planta baixa") && boto.equals("pujar un")) || (((pis.equals("segon pis") && boto.equals("baixar un"))))){
        System.out.println("primer pis");
        } else if ((pis.equals("primer pis") && boto.equals("baixar un")) || (pis.equals("segon pis") && boto.equals("baixar dos"))) {
            System.out.println("planta baixa");
        } else if ((pis.equals("primer pis") && boto.equals("pujar un")) || (pis.equals("planta baixa") && boto.equals("pujar dos"))) {
            System.out.println("segon pis");
        } else {
            System.out.println("error");
        }
    }
}
