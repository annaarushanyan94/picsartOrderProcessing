
    public class Main {
        public static void main(String[] args) {
            // Task 1: Box
            Box<String> stringBox = new Box<>();
            stringBox.setItem("Hello");
            System.out.println("Box contains: " + stringBox.getItem());

            // Task 2: Pair
            Pair<Integer, String> pair = new Pair<>(1, "One");
            System.out.println("Pair: key = " + pair.getKey() + ", value = " + pair.getValue());

            // Modify Pair
            pair.setKey(2);
            pair.setValue("Two");
            System.out.println("Updated Pair: key = " + pair.getKey() + ", value = " + pair.getValue());
        }
    }
