package thread;

public class ThreadManager {
    public static void  startThreads() {
        GoldGeneratorThread gold = 
        new GoldGeneratorThread();
        gold.start();

    }
}