package reminder;
import java.awt.*;
import java.text.CollationElementIterator;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Scanner;
import static reminder.ANSI.*;
public abstract class Reminder{
    enum Type{
        Household_chores,
        University,
        Work,
        Self_development,
        Sport,
        Birthday
    }
    public static int index=1;
    public int priority;
    public Scanner in = new Scanner(System.in);
    public String remind;
    public int yearFin, monthFin, dayFin;
    public LocalDate dateFin;
    public Type type;
    public Reminder(){
        index++;
    }
    public void setFinalDate(){
        System.out.println(ANSI_BLUE+"Insert a date of deadline - day/month/year" + ANSI_RESET);
        this.dayFin=in.nextInt();
        this.monthFin=in.nextInt();
        this.yearFin=in.nextInt();
        this.dateFin = LocalDate.of(yearFin, monthFin, dayFin);
    }
    public void setRemind(){
        System.out.println(ANSI_BLUE + "Insert a task: " + ANSI_RESET);
        String enter = in.nextLine();
        this.remind = in.nextLine();
    }
    public void setPriority(){
        System.out.println(ANSI_BLUE + "Insert a priority of the task" + ANSI_RESET);
        this.priority=in.nextInt();
    }
    public void timeLeft(){
        LocalDate dateNow=LocalDate.now();
        long days= ChronoUnit.DAYS.between(dateNow, dateFin);
        if (days>=30)
            System.out.println(ANSI_GREEN + "Days left - " + days + ANSI_RESET);
        else if(days<30 && days>=4)
            System.out.println(ANSI_YELLOW + "Days left - " + days + ANSI_RESET);
        else
            System.out.println(ANSI_RED + "DAYS LEFT - " + days + ANSI_RESET);
        System.out.println();
    }
    public void printIndex(){
        System.out.println(ANSI_BLUE +"!"+ index + "!"+ ANSI_RESET);
    }
    public void printFinalDate(){
        System.out.println(this.dateFin);
    }
    public void printRemind(){
        System.out.println(this.remind);
    }
    public void printPriority(){
        System.out.println(ANSI_CYAN + "The priority is - " + this.priority + ANSI_RESET);
    }
    static class SortPriority implements Comparator<Reminder> {
        @Override
        public int compare(Reminder o1, Reminder o2) {
            return o1.priority - o2.priority;
        }
    }
    static class SortIndex implements Comparator<Reminder>{
        @Override
        public int compare(Reminder o1, Reminder o2){
            return o1.index - o2.index;
        }
    }
    public void makePost(){
        setType();
        setPriority();
        setFinalDate();
        setRemind();
    }
    public void printType(){
        System.out.println(this.type);
    }
    public void printPost(){
//        printIndex();
        System.out.println();
        printPriority();
        printType();
        printRemind();
        printFinalDate();
        timeLeft();
    }
    public abstract Type getType();
    public abstract void setType();
}
