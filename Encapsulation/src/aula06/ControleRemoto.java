package aula06;
public class ControleRemoto implements Controlador {
    // atributos
    private int volume;
    private boolean ligando;
    private boolean tocando;
    //metodos especiais
    
    public ControleRemoto() {
        this.volume = 50;
        this.ligando = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigando() {
        return ligando;
    }

    public void setLigando(boolean ligando) {
        this.ligando = ligando;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //métodos abstratos

    @Override
    public void ligar() {
        this.setLigando(true);
    }

    @Override
    public void desligar() {
        this.setLigando(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("----- MENU -----");
        System.out.println("Está ligado? " + this.isLigando());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("|");
            
        }
        System.out.println("");
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if(this.isLigando()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigando()){
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigando() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigando() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigando() && !(this.isTocando())) {
            this.setTocando(true);
            
        }
    }

    public void pause() {
        if(this.isLigando() && !(this.isTocando())){
            this.setTocando(true);
        }
    }
    
    
}
