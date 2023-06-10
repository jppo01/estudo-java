package Faculdade.aula02;

public class program {
    public static void main (String[] args){
        Aluno aluno1 = new Aluno(1001, "mario", "111.111.111-11");
        Aluno aluno2 = new Aluno(1002, "luigi", "222.222.222-22"); 
        Aluno antigo; // nesse caso antigo é um ponteiro que vai apontar para o objeto que for atribuído a ele.

        if(aluno1.getRegistration() < aluno2.getRegistration()){
            antigo = aluno1;
        } else {
            antigo = aluno2;
        }

        System.out.println("O aluno mais antigo:");
        antigo.info();
    }
}
