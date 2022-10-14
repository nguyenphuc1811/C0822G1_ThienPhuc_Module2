package ss5_access_modifier_and_static.exercise.build_class_in_java;

public class Student {
    private String name = "John";
    private String classes = "C02";

    Student() {
    }

    void setName(String name) {
        this.name = name;
    }
    protected void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
