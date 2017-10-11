package lab1.task2;

import javax.swing.*;
import java.io.*;
import java.util.Random;

/**
 * Created by zorka_000 on 10/9/2017.
 */
public class GuessGame {

    //public int max = 50; //max number for guess game
    public static void play(Integer max, BestScore _bestScores) {

        System.out.println("Starting a game from 0 to "+max.toString());
        int task = new Random().nextInt(max); //what we need to guess
        //System.out.println(task);
        boolean guessed = false; //flag to check if guessed
        int guess;
        int counter = 0;
        String player_name;

        String message = "Input number from 0 to "+max.toString(); // with input dialog
        while (!guessed) {
            counter++;
            try {
                guess = Integer.parseInt(JOptionPane.showInputDialog(message));
                message="";
                if (guess < task && guess>=0){
                    message="Try bigger number from 0 to "+max.toString();
                } else if (guess > task && guess<=max){
                    message="Try smaller number from 0 to "+max.toString();
                } else if (guess == task){
                    player_name = (JOptionPane.showInputDialog("Congratulations! It is correct. Please input your name"));
                    _bestScores.addScore(max/counter,player_name);
                    guessed = true;
                } else {
                    throw new Exception("Too big or too small number");
                }
            } catch (Exception e){
                System.out.println(e);
                if (e.toString().equals("java.lang.NumberFormatException: null")){
                    guessed = true; //to exit the game if you close input
                }
                message="Incorrect input. Please input valid number from 0 to "+max.toString();
            }
        }

        int answer = JOptionPane.showConfirmDialog(null,
                "Wanna play another game", "Another play", JOptionPane.YES_NO_OPTION);
        if (answer == 0){
            play(max, _bestScores);
        }
    }
    public static void printBestScore() throws IOException, ClassNotFoundException {
        File file = new File("bestScore.txt");

        if (file.exists()){
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            if (o instanceof BestScore) {
                System.out.println(o);
            }else {
                System.out.println("INCOMPATIBLE TYPES!");
            }
        }

    }
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException {
        File file = new File("bestScore.txt");
        BestScore bestScores = new BestScore();
        if (file.exists()){
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            if (o instanceof BestScore) {
                bestScores = (BestScore) o;
            }else {
                System.out.println("INCOMPATIBLE TYPES!");
            }
        }
        printBestScore();
        int max = 50;
        try {
            max = Integer.parseInt(JOptionPane.showInputDialog("Set maximum number in the game"));
        } catch (Exception e){
            System.out.println("Your input is not valid, playing for default maximum = 50");
        }

        play(max, bestScores);
        printBestScore();
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(bestScores);


    }
}
