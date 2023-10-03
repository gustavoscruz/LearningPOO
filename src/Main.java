public class Main {
    public static void main(String[] args) {
        Carro gol = new Carro("Volkswagen", "Gol", 2020);
        Carro jeta = new Carro("Volkswagen", "Jeta", 2015);
        Carro jeep = new Carro("Jeep", "Renegade", 2021);
        Carro palio = new Carro("Fiat", "Palio", 2012);
        Carro creta = new Carro("Hyundai", "Creta", 2022);

        System.out.println(gol);
        System.out.println(jeta);
        System.out.println(jeep);
        System.out.println(palio);
        System.out.println(creta);
    }
}