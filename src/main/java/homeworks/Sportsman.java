package homeworks;

public abstract class  Sportsman {
    SportCategory category;

    public Sportsman (SportCategory category) {
        this.category = category;
    }
    abstract  void play ();



}
