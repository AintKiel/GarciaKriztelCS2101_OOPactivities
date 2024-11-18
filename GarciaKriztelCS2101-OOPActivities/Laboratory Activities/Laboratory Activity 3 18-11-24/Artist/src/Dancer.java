public class Dancer extends Artist {
    private final DanceStyle danceStyle;

    public Dancer(String name, int age, DanceStyle danceStyle) {
        super(name, age, "Dance");
        this.danceStyle = danceStyle;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Dance Style: " + danceStyle);
    }
}

enum DanceStyle {
    BALLET, HIPHOP, JAZZ, CONTEMPORARY
}
