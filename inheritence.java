class inheritence{
    public static void main(String[] args){
        class Parent{
            int z=10;
        }
        class child {
            int x = 20;
            void display(){
                System.out.println(z);
                System.out.println(super.x);
            }
        }

        child obj = new child();
        obj.display();
    }

}
