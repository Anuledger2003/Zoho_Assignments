package assignment13;

import java.util.Scanner;

interface Playable {
 void play();
 void pause();
 void stop();
}

//MP3Player class
class MP3Player implements Playable {

 public void play() {
     System.out.println("MP3 Player is playing.");
 }

 public void pause() {
     System.out.println("MP3 Player is paused.");
 }

 public void stop() {
     System.out.println("MP3 Player is stopped.");
 }
}

//CDPlayer class
class CDPlayer implements Playable {

 public void play() {
     System.out.println("CD Player is playing.");
 }

 public void pause() {
     System.out.println("CD Player is paused.");
 }

 public void stop() {
     System.out.println("CD Player is stopped.");
 }
}

//StreamingPlayer class
class StreamingPlayer implements Playable {

 public void play() {
     System.out.println("Streaming Player is playing.");
 }

 public void pause() {
     System.out.println("Streaming Player is paused.");
 }

 public void stop() {
     System.out.println("Streaming Player is stopped.");
 }
}

public class MusicPlayer {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Select the type of music player:");
     System.out.println("1. MP3 Player");
     System.out.println("2. CD Player");
     System.out.println("3. Streaming Player");
     int choice = scanner.nextInt();

     Playable player;
     switch (choice) {
         case 1:
             player = new MP3Player();
             break;
         case 2:
             player = new CDPlayer();
             break;
         case 3:
             player = new StreamingPlayer();
             break;
         default:
             System.out.println("Invalid choice!");
             scanner.close();
             return;
     }

     while (true) {
         System.out.println("\nControl the playback:");
         System.out.println("1. Play");
         System.out.println("2. Pause");
         System.out.println("3. Stop");
         System.out.println("4. Exit");
         int control = scanner.nextInt();

         switch (control) {
             case 1:
                 player.play();
                 break;
             case 2:
                 player.pause();
                 break;
             case 3:
                 player.stop();
                 break;
             case 4:
                 scanner.close();
                 return;
             default:
                 System.out.println("Invalid control choice!");
         }
     }
 }
}

