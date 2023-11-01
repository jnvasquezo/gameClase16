public class Main {
    public static void main(String[] args) {
        NonPlayableCharacther npc = new NonPlayableCharacther(100);
        npc.moverse();
        npc.atacar();

        dragon d1 = new dragon(150, "rojo");
        d1.moverse();
        d1.atacar();
        d1.defender();
        d1.printVida();

         orco o1 = new orco(25);
        o1.moverse();
        o1.atacar();
        o1.printVida();
    }
}
