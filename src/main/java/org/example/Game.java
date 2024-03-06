package org.example;


import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Game {
    @Getter
    private int prizeDoor;
    @Getter private int openDoor;
    @Getter private int otherDoor;
    Random generator = new Random();

    public void refreshDoors() {
        List<Integer> doors = new ArrayList<>(List.of(1, 2, 3));
        Collections.shuffle(doors, generator);

        prizeDoor = doors.get(0);
        openDoor = doors.get(1);
        otherDoor = doors.get(2);
    }
    public boolean resultOfGame(int userDoor){
        //Проверим, угадал ли пользователь
        return userDoor == prizeDoor;
    }


}
