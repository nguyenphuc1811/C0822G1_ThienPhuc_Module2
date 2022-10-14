package ss4_class_object.exercise.BuildClassFan;

public class Test {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan1.setOn();
        System.out.println("fan1: " + fan1.toString());
        System.out.println("fan2: " + fan2.toString());
    }
}
