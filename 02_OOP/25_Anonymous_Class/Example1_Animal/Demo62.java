public class Demo62 {
    public static void main(String[] args) {

        // 63. Anymouse class = An anonymous class is a class that has no name and is created at the same time you create its object.
        //                      Add custom behavior without having to create a new class.
        //                      often used for one time uses (TimeTask, Runnable, Callbacks) 

        Dog dog1 = new Dog();
        Dog dog2 = new Dog() {
            @Override 
            void speak() {
                System.out.print("Bennie say *HOOF!*.");
            }
        };



        dog1.speak();
        dog2.speak();
    }
}