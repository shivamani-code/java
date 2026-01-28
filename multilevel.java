public class multilevel {
    public static void main(String[] args) {

        class Dept {
            void dept_name() {
                System.out.println("Department: CSE");
            }
            void floor() {
                System.out.println("Floor: 1st");
            }
        }

        class Student1 extends Dept {
            void stu_name() {
                System.out.println("Name: Karan");
            }
            void stu_id() {
                System.out.println("ID: 1");
            }
        }

        class Student2 extends Dept {
            void stu_name() {
                System.out.println("Name: Mani");
            }
            void stu_id() {
                System.out.println("ID: 2");
            }
        }

        class Student3 extends Dept {
            void stu_name() {
                System.out.println("Name: Shiv");
            }
            void stu_id() {
                System.out.println("ID: 3");
            }
        }

        Student1 a = new Student1();
        Student2 b = new Student2();
        Student3 c = new Student3();

        a.dept_name();
        a.floor();
        a.stu_name();
        a.stu_id();

        System.out.println();

        b.dept_name();
        b.floor();
        b.stu_name();
        b.stu_id();

        System.out.println();

        c.dept_name();
        c.floor();
        c.stu_name();
        c.stu_id();
    }
}
