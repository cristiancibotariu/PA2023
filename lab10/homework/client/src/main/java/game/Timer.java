package game;

public class Timer implements Runnable {
    private int durationInSeconds;
    //aici trebuie cumva introdus un obiect game, de fiecare data
    // cand se conecteaza al doilea jucator
    // si cand timer ul atinge zero, sa castige celalalt jucator
    // lazy way: afiseaza ca a castigat celalalt player xD
    //TODO
    public Timer(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(durationInSeconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Timer finished!");
    }
}