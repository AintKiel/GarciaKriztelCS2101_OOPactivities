import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Enter the year: ");
            int year = 0;
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
            } else {
                System.out.println("Invalid input for year. Please enter a valid integer.");
                scanner.next();
            }
            scanner.nextLine(); 
            
            System.out.print("Enter the genre: ");
            String genre = scanner.nextLine();
            
            
            System.out.print("Enter the album: ");
            String album = scanner.nextLine();
            
            
            System.out.print("Enter the song title: ");
            String title = scanner.nextLine();
            
            System.out.print("Enter the artist: ");
            String artist = scanner.nextLine();
            
            System.out.println("------------------------------");
            System.out.println("SONG DETAILS");
            System.out.println("------------------------------");
            System.out.println("Year Released: " + year);
            System.out.println("Genre: " + genre);
            System.out.println("Album: " + album);
            System.out.println("Title: \"" + title + "\"");
            System.out.println("Artist: " + artist);
        }
    }
}
