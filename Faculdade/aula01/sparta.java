package Faculdade.aula01;

import java.util.Scanner;

public class sparta {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        final int NUM_SOLDIERS_LEONIDAS = 10000;
        int Soldiers = 0;

        System.out.println("Dê um palpite de quantos soldados Leônidas enfrentará: ");

        while(Soldiers != NUM_SOLDIERS_LEONIDAS){
            Soldiers = input.nextInt();

            if (Soldiers < NUM_SOLDIERS_LEONIDAS){
                System.out.printf("O número %d é menor que o número de soldados que Leônidas enfrentará\n", Soldiers);
            } else if (Soldiers > NUM_SOLDIERS_LEONIDAS){
                System.out.printf("O número %d é maior que o número de soldados que Leônidas enfrentará\n", Soldiers);
            } else {
                System.out.printf("Você acertou!!! Leônidas enfrentará %d soldados.\n", Soldiers);
                continue;
            }
            System.out.println("Tente novamente!!\n Quantos soldados Leônidas enfrentará: ");
        }
        input.close();
        System.out.println("Obrigado por jogar!");
    }
}
