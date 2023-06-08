package faculdade;

import java.util.Scanner;

public class program {
    public static void main (String[] args){
        // além do int para inteiro, há o float e double para representar numeros com pto fluante
        // o double ocupa mais espaço na memoria e é mais preciso que o float
        int idade = 0;
        double peso = 0;
        String nome;

        // para receber um input, em java, é necessário estanciar um objeto do tipo scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite a idade, peso e nome");
        idade = teclado.nextInt();
        peso = teclado.nextDouble();
        nome = teclado.next();

        // println: escreve na tela e pula uma linha
        System.out.println("nome: " + nome);

        //printf: permite formatar %tipo_variavel. Ex: %d (para inteiro). obs:\n pula uma linha
        System.out.printf("Idade: %d \n", idade);
        //%f é para o tipo ponto fluante, o .2 é para formatar 2 digitos pós a vírgula
        System.out.printf("Peso: %.2f \n", peso);

        // condicional if else if e else
        if(idade < 18){
            System.out.println("menor de idade");
        } else if(idade < 65){
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso!");
            }
        
        if(idade < 18){
        // while:
            while(idade < 18){
                idade = idade +1;
                System.out.println("idade atul: " + idade);
            }
            System.out.println("agora não é mais menor de idade");
            System.out.printf("Idade atul: %d\n", idade);

            // para implementar a mesma coisa usando or:
            // for (idade; idade < 18; idade++)
        }


        // arrays:
        int NumerosAleatorios[] = {125, 514, 252, 5456};
        // printando os valores do array NumerosAleatorios.length para descobrir o tamanho do array
        for(int i=0; i < NumerosAleatorios.length; i++){
            System.out.println("Número: "+ NumerosAleatorios[i]);
        }
    }
}