enum TrafficLight {
    RED,
    YELLOW,
    GREEN
}

public class Traffic {
    public static void main(String[] args) {
        
        TrafficLight light = TrafficLight.RED;

        switch(light) {
            case RED:
                System.out.println("Stopped!");
                break;

            case YELLOW:
                System.out.println("Get Ready!");
                break;
            
            case GREEN:
                System.out.println("Go!");
                break;
        }
    }
}
