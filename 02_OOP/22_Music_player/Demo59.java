import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Demo59 {
    public static void main(String[] args) {

        // 60. How to PLAY AUDIO with Java (.wav, au, .aiff)

        String filePath = "D:\\Java Lesson (Organized)\\Fake Love BTS.wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in);
             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
            
            
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            clip.start();

            String response = "";

            while (!response.equals("Q")) {
                System.out.println("\n--- MENU ---");
                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P":
                        if (clip.getMicrosecondPosition() >= clip.getMicrosecondLength()) {
                            clip.setMicrosecondPosition(0);
                        }
                        clip.start();
                        System.out.println("Playing..."); 
                        break;

                        case "S":
                            clip.stop();
                            System.out.println("Stopped.");
                            break;
                        
                        case "R":
                            clip.setMicrosecondPosition(0);
                            System.out.println("Reset to start.");
                            break;
                        case "Q":
                            clip.stop();
                            break;

                        default:
                            System.out.println("Not a valid response!");
                }

            }


            System.out.println("No problem detected, audio is playing...");


            clip.close();
            audioStream.close();
        }
        catch(FileNotFoundException e) {
            System.out.println("Audio file not found: " + e.getMessage());
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file format is not supported: " + e.getMessage());
        }
        catch (LineUnavailableException e) {
            System.out.println("Audio line is unavailable: " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage()    );

        }
        finally {
            System.out.println("Bye!");
        }
        
        

    }
}