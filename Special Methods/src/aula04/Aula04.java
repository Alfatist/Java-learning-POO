package aula04;
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Amarelo", 0.5f);
        c1.setModelo("BIC");
        c1.setPonta(0.5f);
        c1.status();
        //System.out.println("Tenha uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
    }
    
}
