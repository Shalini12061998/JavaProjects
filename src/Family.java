public class Family {
    public static void main(String[] args) {
        System.out.println("----Sharma's family----");
        Shruthi sh = new Shruthi();
        sh.Introduces();
        sh.Business();
        sh.Introduces();
        sh.Stylist();
        sh.Introduces();
        sh.Engineer();

    }
}
class Introduce{
    public void Introduces(){
        System.out.println("Hi i belong to sharma family");

    }
}
class Mahesh extends Introduce{
    public static void Business(){
        System.out.println("I'm Mahesh, i do business");
    }
}
class Keerthi extends Mahesh{
    public static void Stylist(){
        System.out.println("I'm Keerthi,daughter of mahesh,works as stylist");
    }
}
 class Shruthi extends Keerthi{
    public static void Engineer(){
        System.out.println("I'm Shruthi, sister of keerthi and daughter of mahesh,works as engineer");
    }
}