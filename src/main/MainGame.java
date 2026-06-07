package main;

import battle.MatchManager;

public class MainGame {

    public static void main(String[] args) {

        MatchManager match =
                new MatchManager();

        match.startMatch();
    }
}