class clatop {
    public static void main(String[] args) {

        class A {
            int i, j;

            void showij() {
                System.out.println("i and j: " + i + " " + j);
            }
        }

        class B extends A {
            int k;

            void showk() {
                System.out.println("k: " + k);
            }

            void sum() {
                System.out.println("i + j + k = " + (i + j + k));
            }
        }

        A SuperObj = new A();
        SuperObj.i=93;
        SuperObj.j=3;
        SuperObj.showij();

        B SubObj = new B();
        SubObj.k=90;
        SubObj.showk();

        SubObj.showij();
        SubObj.showk();
        SubObj.sum();

    }
}
