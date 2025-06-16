package homeworks;

public class Main {
    public static void main(String[] args) {
         Sportsman chessPlayer = new Sportsman(SportCategory.TEAM) {
             @Override
             void play() {
                 System.out.println("I am playing chess");
             }
         };

             Sportsman futballPlayer = new Sportsman(SportCategory.SINGLE) {
                 @Override
                 void play() {
                     System.out.println(" I am playing futball");
                 }
         };

             Sportsman tenisPlayer = new Sportsman(SportCategory.TEAM) {
                 @Override
                 void play() {
                     System.out.println("I am playing tennis");

                 }
             };

             futballPlayer.play();
             chessPlayer.play();
             tenisPlayer.play();


    }
}
