package ss5_access_modifier_and_static.exercise.build_class_in_java;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setClasses("C0822G1");
        student.setName("Phúc");
        System.out.println(student.getName() + " " + student.getClasses());
    }
}
