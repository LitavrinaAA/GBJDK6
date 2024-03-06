package org.example;


import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Game {
    @Getter
    private int prizeDoor;
    @Getter
    private int openDoor;
    @Getter
    private int otherDoor;
    List<Integer> doors = new ArrayList<>(List.of(1, 2, 3));
    Random generator = new Random();

    public void openNoPrizeDoor(int userDoor) {

        if (userDoor == prizeDoor) {
            if (generator.nextBoolean()) {
                otherDoor = doors.get(1);
                openDoor = doors.get(2);
            }
        } else {
            if (userDoor == doors.get(1)) {
                openDoor = doors.get(2);
                otherDoor = doors.get(1);
            } else {
                openDoor = doors.get(1);
                otherDoor = doors.get(2);
            }
        }
    }


    public void putPrize() {
        Collections.shuffle(doors, generator);
        prizeDoor = doors.get(0);
    }

    public boolean resultOfGame(int userDoor) {
        //Проверим, угадал ли пользователь
        return userDoor == prizeDoor;
    }


}
