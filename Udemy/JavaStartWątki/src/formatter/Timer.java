package formatter;

public class Timer extends Thread {
    public static void main(String[] args) {



        int time = 0;
        while (true) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Wątek zliczenia czaasu został przerwany.");
                return;
            }
            time++;
            int minutes = time/60;
            int sec = time%60;
            System.out.println(minutes + ":" + sec);
        }
    }
}
