public class CarInheritance {
    public static void main(String[] args) {

        Tesla shalini = new Tesla();
        Hyundai shalini1 = new Hyundai();
        shalini1.engine();
        shalini1.model();

        System.out.println("Car drives too fast");
    }
}
class Tesla{
    static void engine(){
        System.out.println("Tesla Engine");
    }
}
class Hyundai extends Tesla{
    static void model() {
        System.out.println("Car Color is red");
    }
    }
