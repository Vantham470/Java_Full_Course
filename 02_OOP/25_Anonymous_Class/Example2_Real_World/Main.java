interface Message {
    void sayHello();
}

public class Main {
    public static void main(String[] args) {
        Message chii = new Message(){

            @Override
            public void sayHello() {
                System.out.println("Hi Chii ❤️");
                System.out.println(" I just wanted to say hello to o chii!.");
                System.out.println("Have a nice day, pretty girl 😊");
            }
        }; // anonymous class end with this semicolon ';'
    
        chii.sayHello();
    }
}