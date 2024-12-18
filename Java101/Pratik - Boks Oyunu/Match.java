
public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;

    }

    public void run() {
        if (isChecked()) {
            boolean isF1Turn = Math.random() < 0.5;
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("=====YENİ ROUND=====");
                if (isF1Turn) {
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                } else {
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                }
                System.out.println(this.f1.name + " sağlığı " + this.f1.health + " kaldı.");
                System.out.println(this.f2.name + " sağlığı " + this.f2.health + " kaldı.");

            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isChecked() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandı !");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandı !");
            return true;
        }
        return false;
    }
}
