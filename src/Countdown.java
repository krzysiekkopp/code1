public class Countdown {

    public static void countdown(int n) {
    if (n == 0) {
        System.out.println("Odpalamy!");
    } else {
        System.out.println(n);
        countdown(n - 1);
    }
}
}
