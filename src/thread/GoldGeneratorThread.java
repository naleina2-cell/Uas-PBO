package thread;

public class GoldGeneratorThread extends Thread {

    @Override
    public void run() {
        while (true) {
            try{
                System.out.println("Gold +15");
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        }
    }
