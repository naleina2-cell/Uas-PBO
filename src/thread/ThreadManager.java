package thread;

public class ThreadManager {
    public static void  startThreads() {
        RespawnThread respawnThread = new RespawnThread();
        GoldGeneratorThread goldThread = new GoldGeneratorThread();
        respawnThread.start();
        goldThread.start();
        
    }
}