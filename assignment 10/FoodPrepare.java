abstract class Food
{
    abstract void prepare();
}

class Pizza extends Food
{
    void prepare(){
        System.out.println("Prepare a pizza for the customer");
    }

}

class Burger extends Food
{
    void prepare(){
        System.out.println("Prepare a Burger for the customer");
    }

}
public class FoodPrepare {
    public static void main(String[] args) {
       Food f1 = new Pizza();
       f1.prepare();
       
       Food f2 = new Burger();
       f2.prepare();
    }
}
