public class multi {
    
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

        class Cat extends Dog{

            void meow(){
                System.err.println("cat is meowing");
            }
        }

        Cat c = new Cat();
        c.bark();
        c.eat();
        c.meow();






    }
}

