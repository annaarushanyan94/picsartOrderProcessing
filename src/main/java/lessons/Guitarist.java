package lessons;

public class Guitarist extends Musician{
    @Override
    public void playMusic() {
        System.out.println("Playing piano");
    }



    @Override
    public void readNotes(String notes) {
        System.out.println("Reading guitar notes");

    }
}
