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
        this.brand = "Não especificada";
        this.model = "Não especificado";
        this.year = 0;
    }

    public String toString(){
        return "Marca: " + this.brand + "\nModelo: " + this.model + "\nAno de fabricação: " + this.year + "\n";
    }
}
