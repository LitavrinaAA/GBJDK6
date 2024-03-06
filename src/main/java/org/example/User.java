package org.example;

import lombok.Getter;

import java.util.Random;

public class User {
    Random generator = new Random();

    @Getter
    private int userDoor;

    public void selectDoor() {
        userDoor = generator.nextInt(3)+1;

    }

    public void changeDoor(int door1, int door2) {
        if (generator.nextBoolean()) {
             userDoor = generator.nextBoolean() ? door1 : door2;
        }
    }

}
