package reminder;

public class Congratulations extends Reminder{
    @Override
    public Type getType(){
        return Type.Birthday;
    }
    @Override
    public void setType(){
        this.type=Type.Birthday;
    }
    public Congratulations(){
        super();
    }
    @Override
    public void setPriority() {
        this.priority=1;
    }
    @Override
    public void makePost(){
        setFinalDate();
        setPriority();
        setType();
        setRemind();
    }
}
