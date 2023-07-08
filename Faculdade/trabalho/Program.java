package Faculdade.trabalho;

public class Program {
    public static void main(String[] args) {
        Price price = new Price();
        System.out.println("DOLAR: " + price.getUSDBRL());
        System.out.println("EURO: " + price.getEURBRL());
        System.out.println("BitCoin: " + price.getBTCBRL());
    }
}
