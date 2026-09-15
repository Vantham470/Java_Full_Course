public class Demo48 {
    public static void main(String[] args) {

        // 49. Interface = A blueprint for a class that specifies a set of abstract methods 
        //                 that implement class MUST define.
        //                 Supports mutiple inheritance-like behavior.

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();

        fish.flee();
        fish.hunt();



    }
}

