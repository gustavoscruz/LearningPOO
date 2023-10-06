public class Restaurante {
    private String name;
    private String address;
    private float prize;
    private String kindFood;

    public Restaurante(String name, String address, float prize, String kindFood){
        this.name = name;
        this.address = address;
        this.prize = prize;
        this.kindFood = kindFood;
    }
    public Restaurante(){}

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setPrize(float prize){
        this.prize = prize;
    }

    public void setKindFood(String kindFood){
        this.kindFood = kindFood;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public float getPrize(){
        return this.prize;
    }

    public String getKindFood(){
        return this.kindFood;
    }

    @Override
    public String toString(){

    }

}
