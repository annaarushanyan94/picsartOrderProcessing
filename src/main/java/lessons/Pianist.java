package lessons;

public class Pianist extends Musician{
    @Override
    public void playMusic() {
        System.out.println("Playing Piano");
    }

    @Override
    public void readNotes(String notes) {
        System.out.println("reading piano notes");

    }
}
//