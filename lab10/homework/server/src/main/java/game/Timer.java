package game;

public class Timer implements Runnable {
    private int durationInSeconds;
    //timerul trebuie activat la fiecare "start" joc probabil idk
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

    /*int durationInSeconds = 60; // Duration of the timer in seconds

    TimerThread timerThread = new TimerThread(durationInSeconds);
    Thread thread = new Thread(timerThread);
        thread.start();*/
}