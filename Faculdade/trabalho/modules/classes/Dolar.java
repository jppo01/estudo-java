package Faculdade.trabalho.modules.classes;

public class Dolar extends Moeda{

    public Dolar(double v){
        super();
        this.valor = v;
        this.simbolo = "$";
        this.nome = "Dolar (USD)";
    }
    public double converter(){
        // Estou utilizando uma API para pegar os valores das moedas utilizadas
        // API Utilizada: https://docs.awesomeapi.com.br/api-de-moedas
        // Para trabalhar com o consumo dessa API estou utiizando a classe Price
        Price price = new Price();
        double moedaConvertida = price.getUSDBRL() * getValor();
        return moedaConvertida;
    }
    public double getValor(){
        return this.valor;
    }
    public String getSimbolo(){
        return this.simbolo;
    }
    public String getNome(){
        return this.nome;
    }
}
