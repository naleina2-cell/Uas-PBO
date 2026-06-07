package main;

import battle.MatchManager;
import thread.ThreadManager;

public class MainGame {

    public static void main(String[] args) {
        try {
            ThreadManager.startThreads();
        } catch (Exception e) {
            System.out.println("Thread failed to start");
        }
        MatchManager match =
                new MatchManager();

        match.startMatch();
    }
}