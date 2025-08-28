enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Enums_looping {
    public static void main(String[] args) {
    for (Level myVar : Level.values()){
        System.out.println(myVar);
    }
}
}
