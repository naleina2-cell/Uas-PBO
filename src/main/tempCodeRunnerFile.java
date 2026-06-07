package main;

import battle.MatchManager;
import thread.ThreadManager;

public class MainGame {

    public static void main(String[] args) {
        try {
            Class<?> tm = Class.forName("thread.ThreadManager");
            java.lang.reflect.Method m = tm.getMethod("startThreads");
            m.invoke(null);
        } catch (ClassNotFoundException e) {
            System.err.println("thread.ThreadManager not found; skipping thread startup.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        MatchManager match =
                new MatchManager();

        match.startMatch();
    }
}