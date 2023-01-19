package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga; 
    boolean tampada;
    
    void status() {
        System.out.println("Uma caneta " + this.cor + " de ponta " + this.ponta);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Carga: " + this.carga);
    }
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar pois estou tampada");
        } else{
            System.out.println("Estou rabiscando");
        }
    }
    void tampar() {
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
