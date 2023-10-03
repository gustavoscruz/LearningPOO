public class Produto {
    private String name;
    private float price;
    private int quantify;

    public Produto(String nome, float preco, int quantidade){
        this.name = nome;
        this.price = preco;
        this.quantify = quantidade;
    }
    public Produto(){
    }

    public String getNome(){
        return this.name;
    }

    public float getPrice(){
        return this.price;
    }

    public void setPrice(float preco){
        this.price = preco;
    }

    public int getQuantify(){
        return this.quantify;
    }

    public void setQuantify(int quantidade){
        this.quantify = quantidade;
    }

    public float valueTotal(){
        return this.price * this.quantify;
    }

    public boolean add(int quantidade){
        this.quantify += quantidade;
        return true;
    }

    public boolean remove(int quantidade){
        if (this.quantify <= 0){
            return false;
        }
        else{
            this.quantify -= quantidade;
            return true;
        }
    }

    public String toString(){
        return "Nome: " + this.name + "\nPreço: " + this.price + "\nQuantidade: " + this.quantify + "\n";
    }

}
