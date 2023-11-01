public class dragon extends NonPlayableCharacther{
    String color;
    public dragon(int vida, String color){
        super(vida);
        this.color = color;
    }

    public void moverse(){
        System.out.println("Soy un Dragon "+ color +" y vuelo maquia");
    }

     public void atacar(){
        System.out.println("Soy un Dragon y ataco maquia");
    }

    public void defender(){
        System.out.println("Soy un Dragon y defendo con yelo");
    }
}
