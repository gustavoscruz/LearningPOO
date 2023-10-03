public class Carro {
    private String brand;
    private String model;
    private int year;

    public Carro(String marca, String modelo, int fabricacao){
        this.brand = marca;
        this.model = modelo;
        this.year = fabricacao;
    }

    public Carro(){
        this.brand = "";
        this.model = "";
        this.year = 0;
    }

    public String toString(){
        return "marca: " + this.brand + " modelo: " + this.model + " ano de fabricação: " + this.year;
    }
}
