class Single {
    public static void main(String[] args) {
        
        class Animal {

            void eat() {
                System.out.println("animal is eating");
            }

        }
        
        class Dog extends Animal{

            void bark(){
                System.err.println("dog is barking");
            }

        }

        Dog d = new Dog();
        d.bark();
        d.eat();






    }
}
