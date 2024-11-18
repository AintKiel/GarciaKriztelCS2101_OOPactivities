public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Charlie puth", 32, "Music");
        Artist singer = new Singer("Nayeon Im", 29, Genre.POP);
        Artist painter = new Painter("Jose Joya", 34, Medium.WATERCOLOR);
        Artist writer = new Writer("William Shakespeare", 52, WritingStyle.POETRY);
        Artist dancer = new Dancer("Misty Copeland", 41, DanceStyle.BALLET);

        System.out.println("Instance of Artist Class:");
        artist.displayInfo();
        System.out.println("\nInstance of Singer class:");
        singer.displayInfo();
        System.out.println("\nInstance of Painter class:");
        painter.displayInfo();
        System.out.println("\nInstance of Writer class:");
        writer.displayInfo();
        System.out.println("\nInstance of Dancer class:");
        dancer.displayInfo();
    }
}