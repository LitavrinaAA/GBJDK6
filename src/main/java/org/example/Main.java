package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Map<Integer, Boolean> statistica = new HashMap<>();
        int count = 0;
        Game game = new Game();
        User user = new User();

        while (count < 1000) {

            count++;

            game.putPrize();

            user.selectDoor();

            game.openNoPrizeDoor(user.getUserDoor());

            user.randomizeDecisionChangeDoorOrNo(game.getOtherDoor());

            statistica.put(count, game.resultOfGame(user.getUserDoor()));
        }

        Map<Boolean, Long> counts = statistica.values().stream()
                .collect(Collectors.groupingBy(Boolean::booleanValue, Collectors.counting()));


        System.out.println("Количество побед: " + counts.getOrDefault(true, 0L));
        System.out.println("Количество поражений: " + counts.getOrDefault(false, 0L));

    }


}