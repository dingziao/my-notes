// Main.java
public class Main {
    public static void main(String[] args) {
        Core c1 = new Core();
        Core c2 = new Core();
        Core c3 = new Core();
        Core c4 = new Core();

        Engine e1 = new Engine(c1, c2);
        Engine e2 = new Engine(c3, c4);

        Vehicle v = new Vehicle(e1, e2);
    }
}
