package org.example;

import lombok.Getter;

import java.util.Random;

public class User {
    Random generator = new Random();

    @Getter
    private int userDoor;

    public int selectDoor() {
        userDoor = generator.nextInt(3)+1;
        return userDoor;
    }

    public int changeDoor(int door1, int door2) {

        if (yesOrNo()) {
             userDoor = generator.nextBoolean() ? door1 : door2;
        }
        return userDoor;
    }

    public boolean yesOrNo() {

        return  generator.nextBoolean();

    }
}
