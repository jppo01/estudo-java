package cofrinho.classes;

public class Bitcoin extends Moeda{

    public Bitcoin(double v){
        super();
        this.valor = v;
        this.simbolo = "\u20BF";
        this.nome = "Bitcoin (BTC)";
    }
    public double converter(){
        // Estou utilizando uma API para pegar os valores das moedas utilizadas
        // API Utilizada: https://docs.awesomeapi.com.br/api-de-moedas
        // Para trabalhar com o consumo dessa API estou utiizando a classe Price
        Price price = new Price();
        double moedaConvertida = price.getBTCBRL() * getValor();

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
