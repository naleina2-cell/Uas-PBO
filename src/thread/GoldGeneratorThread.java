package thread;

public class GoldGeneratorThread extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("Gold +15");
            try{
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                break;
            }
            }
        }
    }
