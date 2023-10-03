public class Triangulo {
    private double base;
    private double height;

    public Triangulo(double b, double h){
        this.base = b;
        this.height = h;
    }
    public Triangulo(){
    }

    public double getBase(){
        return this.base;
    }

    public double getBase(){
        return this.height;
    }

    public double calculateArea(){
        return this.base * this.height * 0.5;
    }
    public String toString(){
        return "Base: " + this.base + "\nAltura: " + this.height + "\nÁrea: " + this.base * this.height * 0.5 + "\n";
    }
}
