package Faculdade.aula02.exercicio01;
/*
 * 1. Crie uma classe Nota, com três atributos reais chamados: nota1, nota2, nota3.
 * E crie também dois métodos, cada um para calcular e retornar diferentes tipos de média. 
 * Média Aritmética; e Média ponderada (pesos 2, 3 e 4 respectivamente).
 */

public class Program {
   public static void main (String[] args){
     Nota nota = new Nota(7, 8, 5);
    
     System.out.printf("Média Aritmética: %.2f \n", nota.MediaAritmetica());
     System.out.printf("Média Ponderada: %.2f \n", nota.MediaPonderada());
   }
    
}
