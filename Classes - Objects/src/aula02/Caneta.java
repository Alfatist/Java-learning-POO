/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula02;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga; 
    private boolean tampada;
    
    public void status() {
        System.out.println("Uma caneta " + this.cor + " de ponta " + this.ponta);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Carga: " + this.carga);
    }
    private void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar pois estou tampada");
        } else{
            System.out.println("Estou rabiscando");
        }
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
