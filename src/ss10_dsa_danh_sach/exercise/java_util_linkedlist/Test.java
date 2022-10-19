package ss10_dsa_danh_sach.exercise.java_util_linkedlist;

public class Test {
    public static void main(String[] args) {
        class Student {
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
        MyLinkedList<Student> myLinkedList = new MyLinkedList<Student>();
        Student student1 = new Student(1, "Tung1");
        Student student2 = new Student(2, "Tung2");
        Student student3 = new Student(3, "Tung3");
        Student student4 = new Student(4, "Tung4");
        Student student5 = new Student(4, "Tung4");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.add(1, student3);
        myLinkedList.addLast(student4);
        myLinkedList.remove(0);
        myLinkedList.remove(student4);
        myLinkedList.addLast(myLinkedList.getFirst());
        myLinkedList.addLast(myLinkedList.getLast());

        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student =  myLinkedList.get(i);
            System.out.println(student.getName());
        }

        System.out.println(myLinkedList.contains(student5));
        System.out.println(myLinkedList.indexOf(student3));

        MyLinkedList<Student> myLinkedList1 = myLinkedList.clone();

        for (int i = 0; i < myLinkedList1.size(); i++) {
            Student student =  myLinkedList1.get(i);
            System.out.println(student.getName());
        }
        myLinkedList1.clear();
        System.out.println(myLinkedList.getFirst().getName());


    }
}
