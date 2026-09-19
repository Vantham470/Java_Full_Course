// 48 interface
interface Remote {
    void powerOn(); // Contract: Everything using Remote must implememnts this 
}

class SamsungTV implements Remote {
    public void powerOn() {
        System.out.println("Samsung TV is on... Loading Tizen os.");
    }
}

class LGTV implements Remote {
    public void powerOn() {
        System.out.println("LG TV is turning on... loading webOS.");
    }
}

public class RealLifeAnalog {
    public static void main(String[] args) {
        // The real power of your analogy: Polymorphism
        // You can use single "Remote" variable to control different Tvs.

        Remote myRemote;

        // Pointing the remote to a Samsung TV
        myRemote = new SamsungTV();
        myRemote.powerOn(); 

        // Pointing the same remote to an LG TV
        myRemote = new LGTV();
        myRemote.powerOn(); 
    }
}
