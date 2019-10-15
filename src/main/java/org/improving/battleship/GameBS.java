package org.improving.battleship;

import org.improving.battleship.DataBaseSql.Map;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class GameBS {
    public static int computerShips;
    private static Object Map;

    public static void main(String[] args) {
        System.out.println(" Welcome to Battle Ships game ");
        //insert sql map here
        System.out.println("What coordinate do you want to attack?");
        System.out.println(Map);
        boolean loop = true;
        while (loop) {


            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            System.out.println("Attacking " + input);
        }
    }


}

