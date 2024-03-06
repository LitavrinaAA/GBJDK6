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

    public void changeDoor(int otherDoor) {

        if (generator.nextBoolean()) {
             userDoor = otherDoor;
        }
    }


}
