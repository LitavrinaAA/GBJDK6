package org.example;

import lombok.Getter;

import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    @Getter
    private int userDoor;

    public int selectDoor() {
        userDoor = sc.nextInt();

        return userDoor;
    }

    public int changeDoor(int door1, int door2) {

        if (yesOrNo() == 'y') {
            System.out.println("ВЫ можете выбрать " + door1 + "или " + door2);
            userDoor = sc.nextInt();
            while (!(userDoor == door1 || userDoor == door2)) {
                System.out.println("Пожалуйста, выбирите " + door1 + "или " + door2);
                userDoor = sc.nextInt();
            }
        }
        return userDoor;
    }
    public char yesOrNo(){
        char userReply = sc.next().charAt(0);
        while (userReply != 'y' && userReply != 'n') {
            //Validation
            System.out.println("Please enter either y/n");
            userReply = sc.next().charAt(0);
        }
        return userReply;
    }
}
