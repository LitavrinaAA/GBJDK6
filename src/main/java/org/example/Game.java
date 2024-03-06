package org.example;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Game {
    @Getter
    private int prizeDoor;
    @Getter private int openDoor;
    @Getter private int otherDoor;
//    @Getter @Setter private int userDoor;
    public Game() {
        Random generator = new Random();
        List<Integer> doors = new ArrayList<>(List.of(1, 2, 3));

        Collections.shuffle(doors, generator);

        prizeDoor = doors.get(0);
        openDoor = doors.get(1);
        otherDoor = doors.get(2);
        System.out.println("*** Welcome to the game show! ***");
        System.out.println("Select the door (1, 2, or 3): ");
    }
    public boolean resultOfGame(int userDoor){
        System.out.println("Приз за дверью: " + prizeDoor);
        //Проверим, угадал ли пользователь
        if(userDoor == prizeDoor){

            System.out.println("Подравляю! Вы выйграли!");
            return true;
        } else {

            System.out.println("Сожалею. Вы проиграли.");
            return false;
        }
    }
public void dialogue(int userDoor) {
    System.out.println("Скоро мы узнаем где находится приз!");
    System.out.println("Но! Сперва я хочу показать вам другую дверь, за которой нет приза, но есть козел!");

    System.out.println("Вот!За дверью " + openDoor + " Козел!");
    System.out.println("Вы выбрали дверь под номером " + userDoor);
    System.out.println("Хотители вы изменить свой выбор(y/n)? ");
}
public boolean askSelectDoor (int userDoor) {

    while (!(userDoor >= 1 && userDoor <= 3)) {
        System.out.println("Пожалуйста, выбирите дверь  1, 2, или 3");
//        userDoor = sc.nextInt();
        return false;
    }
    return true;
}

}
