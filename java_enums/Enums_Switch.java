enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Enums_Switch {
    public static void main(String[] args) {
        Level myVar = Level.HIGH;

        switch (myVar) {
            case LOW:
                System.out.println("LOW level");
                break;
            case MEDIUM:
                System.out.println("MEDIUM level");
                break;
            case HIGH:
                System.out.println("HIGH level");
                break;
        }
    }
    
}
