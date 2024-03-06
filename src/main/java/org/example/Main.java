package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        boolean wantToPlay = true;
        Map<Integer, Boolean> statistica = new HashMap();
        int count = 0;
        while (wantToPlay) {
            count++;
            Game game = new Game();
            User user = new User();

            // Begin Game

            user.selectDoor();
            while (!game.askSelectDoor(user.getUserDoor())) {
                user.selectDoor();
            }


            game.dialogue(user.getUserDoor());
            //Может поменяет дверь
            user.changeDoor(game.getOtherDoor(), game.getPrizeDoor());
            statistica.put(count, game.resultOfGame(user.getUserDoor()));
            System.out.println("хотите еще сиграть?");
            if (user.yesOrNo() != 'y') {
                wantToPlay = false;
            }
        }


    }
}