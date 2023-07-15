package cofrinho.classes;


public abstract class Moeda {
    protected double valor;
    protected String simbolo;
    protected String nome;

    public void info(){
        System.out.println("Esssa moeda é do tipo " + getNome());
        System.out.println("Valor da Moeda: " + getSimbolo() + " "+ getValor());
    };
    public double getValor(){
        return this.valor;
    }
    public String getSimbolo(){
        return this.simbolo;
    }  
    public String getNome(){
        return this.nome;
    }
    public abstract double converter();
}
