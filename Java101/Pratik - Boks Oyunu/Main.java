
public class Main {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 30, 95, 92, 30);
        Fighter f2 = new Fighter("B", 20, 90, 94, 50);

        Match match = new Match(f1, f2, 90, 95);
        match.run();
    }
}
