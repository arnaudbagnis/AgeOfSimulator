package PNJ;

public class PNJ {
    private boolean life;
    private boolean seek;
    private int humor;
    private int sleep;
    private int item;
    private String Name;
    private String Job;

    public PNJ() {

    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public void Eat(int item){
        this.item -= item;
    }

    public boolean isLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public boolean isSeek() {
        return seek;
    }

    public void setSeek(boolean seek) {
        this.seek = seek;
    }

    public int getHumor() {
        return humor;
    }

    public void setHumor(int humor) {
        this.humor = humor;
    }

    public int getSleep() {
        return sleep;
    }

    public void setSleep(int sleep) {
        this.sleep = sleep;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
