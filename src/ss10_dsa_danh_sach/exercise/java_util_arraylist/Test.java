package ss10_dsa_danh_sach.exercise.java_util_arraylist;

public class Test {
    public static class Student {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Student() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Huy");
        Student b = new Student(2, "Hoa");
        Student c = new Student(3, "Hong");
        Student d = new Student(4, "Huan");
        Student e = new Student(5, "Hai");
        Student f = new Student(5, "Hai");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.add(d);
        studentMyArrayList.add(e);
        System.out.println(studentMyArrayList.elements[8]);
        studentMyArrayList.remove(2);
        studentMyArrayList.remove(0);
        for (int i = 0; i < studentMyArrayList.size(); i++) {
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.println(student.getId() + " + " + student.getName());
        }
        System.out.println(studentMyArrayList.get(2).getName());
        System.out.println(studentMyArrayList.indexOf(c));
        System.out.println(studentMyArrayList.contains(f));
        MyArrayList<Student> newArrayList = new MyArrayList<>();

        newArrayList = studentMyArrayList.clone();
        System.out.println(newArrayList);
        for (int i = 0; i <newArrayList.size() ; i++) {
            System.out.println(newArrayList.get(i).getName());
        }
    }
}
