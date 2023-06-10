package Faculdade.aula01;

import java.util.Scanner;

public class imc {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        final double IMC_ABAIXO_DO_PESO = 18.5;
        final double IMC_PESO_NORMAL = 25.0;
        final double IMC_EXCESSO_DE_PESO = 30.0;
        final double IMC_OBESIDADE_CLASSE_I = 35.0;
        final double IMC_OBESIDADE_CLASSE_II = 40.0;

        System.out.println("Informe sua altura (em metros): ");
        double height = input.nextDouble();
        System.out.println("Informe o seu peso (kg): ");
        double weight = input.nextDouble();

        double imc = (weight)/(height*height);

        if (imc <= IMC_ABAIXO_DO_PESO){
            System.out.printf("imc: %.2f\n Abaixo do peso!\n", imc);
        } else if (imc > IMC_ABAIXO_DO_PESO && imc <= IMC_PESO_NORMAL){
            System.out.printf("imc: %.2f\n Peso normal!\n", imc);
        } else if (imc > IMC_PESO_NORMAL && imc <= IMC_EXCESSO_DE_PESO){
            System.out.printf("imc: %.2f\n Excesso de peso!\n", imc);
        } else if (imc > IMC_EXCESSO_DE_PESO && imc <= IMC_OBESIDADE_CLASSE_I){
            System.out.printf("imc: %.2f\n Obesidade classe I!\n", imc);
        } else if (imc > IMC_OBESIDADE_CLASSE_I && imc <= IMC_OBESIDADE_CLASSE_II){
            System.out.printf("imc: %.2f\n Obesidade classe II!\n", imc);
        } else {
            System.out.printf("imc: %.2f\n Obesidade classe III!\n", imc);
        }
        input.close();
    }
}