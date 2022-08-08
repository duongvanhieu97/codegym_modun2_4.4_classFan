public class Main {
    public static void main(String[] args) {
        Fan Fan1 = new Fan("Blue", 5);
        Fan Fan2 = new Fan("Yellow", 10);
        Fan1.turnOn();
        Fan1.plusSpeed();
        Fan1.plusSpeed();
        Fan1.plusSpeed();
        Fan1.turnOff();
        System.out.println(Fan1.showStatus());
        Fan2.turnOn();
        Fan2.plusSpeed();
        System.out.println(Fan2.showStatus());
    }
}
