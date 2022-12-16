package reminder;
import static reminder.ANSI.*;

public class Main {
    public static void main(String[] args) {
        ReminderArray array = new ReminderArray();
        while(Menu.choicePost!=4){
            Menu.setChoicePost();
                if(Menu.choicePost==4){
                    System.out.println(ANSI_BLUE + "Exiting program" + ANSI_RESET);
                    break;
                }
            Menu.setChoiceAction();
            switch(Menu.choiceAction){
                case 1:{
                    if(Menu.choicePost==1)
                        array.addPost();
                    else if(Menu.choicePost==2)
                        array.addBirthday();
                    break;
                }
                case 2:{
                    array.deletePost();
                    break;
                }
                case 3:{
                    array.SortArray();
                    break;
                }
                case 4:{
                    array.printArraySorted();
                    break;
                }
            }
        }
    }
}