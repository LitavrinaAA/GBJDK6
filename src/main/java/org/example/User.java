package org.example;

import lombok.Getter;

import java.util.Random;
import java.util.Scanner;

public class User {
    Random generator = new Random();

    //    Scanner sc = new Scanner(System.in);
    @Getter
    private int userDoor;

    public int selectDoor() {
        userDoor = generator.nextInt(3)+1;//sc.nextInt();
        return userDoor;
    }

    public int changeDoor(int door1, int door2) {

        if (yesOrNo()) {
//            System.out.println("ВЫ можете выбрать " + door1 + "или " + door2);
//            userDoor = sc.nextInt();
            int userDoor = generator.nextBoolean() ? door1 : door2;
//            while (!(userDoor == door1 || userDoor == door2)) {
//                System.out.println("Пожалуйста, выбирите " + door1 + "или " + door2);
//                userDoor = sc.nextInt();
//            }
        }
        return userDoor;
    }

    public boolean yesOrNo() {
//        char userReply = sc.next().charAt(0);
//        while (userReply != 'y' && userReply != 'n') {
//            //Validation
//            System.out.println("Please enter either y/n");
//            userReply = sc.next().charAt(0);
//        }
        return  generator.nextBoolean();
//        return userReply;
    }
}
