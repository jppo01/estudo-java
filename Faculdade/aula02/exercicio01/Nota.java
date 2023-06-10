package Faculdade.aula02.exercicio01;

public class Nota {
    private double nota1;
    private double nota2;
    private double nota3;

    //constructor
    public Nota(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public double MediaAritmetica(){
        return (nota1 + nota2 + nota3)/3;
    }
    public double MediaPonderada(){
        final double PESO_NOTA1 = 2;
        final double PESO_NOTA2 = 3;
        final double PESO_NOTA3 = 4;

        return (nota1*PESO_NOTA1 + nota2*PESO_NOTA2 + nota3*PESO_NOTA3)/(PESO_NOTA1 + PESO_NOTA2 + PESO_NOTA3);
    }
}
