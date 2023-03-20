public class Main {
    public static void main(String[] args) {

        int startingScore = 100;
        int refill = 1100;

        int bonus;
        int total;

        if (refill > 1000) {
            bonus = refill / 100;
            total = startingScore + refill + bonus;
        } else {
            total = startingScore + refill;
        }

        System.out.println(total);

    }
}