package aula.pkg11;
public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setSexo("M");
        v1.setIdade(30);
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Enzo");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(17);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Ryan");
        b1.pagarMensalidade();
    }
    
}
