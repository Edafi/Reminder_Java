package reminder;
import static reminder.ANSI.*;
public class Post extends Reminder{
    @Override
    public Type getType(){
        return this.type;
    }
    @Override
    public void setType(){
        boolean flag=false;
        System.out.println(ANSI_BLUE + "Choose a type of task" + ANSI_RESET);
        for(Type i : Type.values())
            System.out.println(i + " ");
        while(!flag){
            String inputType=in.nextLine();
            switch (inputType){
                case "Household_chores": {
                    this.type = Type.Household_chores;
                    flag=true;
                    break;
                }
                case "University":{
                    this.type=Type.University;
                    flag=true;
                    break;
                }
                case "Work":{
                    this.type=Type.Work;
                    flag=true;
                    break;
                }
                case "Self_development":{
                    this.type=Type.Self_development;
                    flag=true;
                    break;
                }
                case "Sport":{
                    this.type=Type.Sport;
                    flag=true;
                    break;
                }
                case "Birthday":{
                    this.type=Type.Birthday;
                    flag=true;
                    break;
                }
                default:{
                    System.out.println(ANSI_RED + "Wrong input!" + ANSI_RESET);
                    break;
                }
            }
        }
    }
    public Post(){
        super();
    }
}
