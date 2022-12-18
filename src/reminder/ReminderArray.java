package reminder;
import static reminder.ANSI.*;
import java.util.*;

class ReminderArray{
    static Scanner in = new Scanner(System.in);
    private ArrayList<Reminder> array = new ArrayList<Reminder>();
    private ArrayList<Reminder> sortedArray = new ArrayList<Reminder>(array);
    public void addPost(){
        Reminder post = new Post();
        post.makePost();
        this.array.add(post);
        this.sortedArray.add(post);
    }
    public void addBirthday(){
        Congratulations birthday = new Congratulations();
        birthday.makePost();
        this.array.add(birthday);
        this.sortedArray.add(birthday);
    }
    public void SortArray(){
        Collections.sort(sortedArray, new Reminder.SortPriority());
    }
    public void indexSort(){
        Collections.sort(array, new Reminder.SortIndex());
    }
    public void printArraySorted(){
        int k=0;
        for(Reminder i : sortedArray){
            System.out.println();
            System.out.println(ANSI_PURPLE + "Index is - " + ++k + ANSI_RESET);
            i.printPost();
        }
    }
    public void printArray(){
        for(var i : array){
            i.printPost();
        }
    }
    public void deletePost(){
        int id;
        try{
            System.out.println(ANSI_BLUE + "Insert a index of post, witch you want to delete" + ANSI_RESET);
            id=in.nextInt();
            array.remove(id-1);
            sortedArray.remove(id-1);
        }
        catch(Exception e){
            System.out.println(ANSI_RED + "There is no such index" + ANSI_RESET);
        }
    }
}
