public class NonPlayableCharacther{
    protected int vida;
    public NonPlayableCharacther(int vida){
        this.vida = vida;
    }
    public void moverse(){
        System.out.println("soy un maquia y me nuevo bro");
    }

    public void atacar(){
        System.out.println("soy un maquia y ataco bro");
    }

    public int getVida(){
        return vida;
    }

    public void setVida(int vida){
        this.vida = vida;
    }

    public void printVida(){
        System.out.println("Mi vida es " + vida);
    }
}