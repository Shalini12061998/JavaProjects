public class AnimalInheritance {
    public static void main(String[] args) {
        System.out.println("-------Type of Animal and Behavior-------");
        Cat ct = new Cat();
        ct.eat();
        ct.bark();
        ct.Jumps();
    }
}
class Animal{
    public static void eat(){
        System.out.println("** Animal eats food **");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks.");
    }
}
class Cat extends Dog{
    void Jumps(){
        System.out.println("Cat Jumps.");
    }
}
