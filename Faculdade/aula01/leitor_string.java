/*
 * o programa irá solicitar ao usuário a quantidade de strings que ele deseja inserir. 
 * Em seguida, o programa lerá as strings e as armazenará em um array. 
 * Por fim, o programa imprimirá as strings na ordem inversa.
 */
package Faculdade.aula01;

import java.util.Scanner;

public class leitor_string {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas string você quer passar?");
        int qtdeStrings = scanner.nextInt();
        String[] strings = new String[qtdeStrings];

        for (int i=0; i < qtdeStrings; i++){
           strings[i] = scanner.next();
        }

        for(int i=qtdeStrings-1; i>=0; i--){
            System.out.println(strings[i]);
        }

    scanner.close();

    }
}
