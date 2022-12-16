package reminder;

import java.util.Scanner;

import static reminder.ANSI.*;

public class Menu {
    static int choicePost;
    static int choiceAction;
    public static Scanner in = new Scanner(System.in);
    static void printChoicePostMenu(){
        System.out.println(ANSI_BLUE + "Insert a choice of post\n1 - Usual notification\n2 - Birthday notification\n"
                +"3 - Action menu\n"+ "4 - Exit " +ANSI_RESET);
    }
    static void printChoiceAction(){
        System.out.println(ANSI_BLUE + "Insert a choice of action\n1 - Add new notification\n2 - Delete notification\n" +
                "3 - Sort notification via priority\n4 - Print posts" +
                ANSI_RESET);
    }
    static void setChoicePost(){
        printChoicePostMenu();
        choicePost=in.nextInt();
    }
    static void setChoiceAction(){
        printChoiceAction();
        choiceAction=in.nextInt();
    }
}
