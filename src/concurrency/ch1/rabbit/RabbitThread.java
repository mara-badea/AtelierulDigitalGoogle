package concurrency.ch1.rabbit;

public class RabbitThread extends Thread{
    private int nr;

    public RabbitThread(int nr) {
        this.nr = nr;
    }

    public void run() {
        System.out.println("Rabbit " + this.nr + " is running");
    }
}
