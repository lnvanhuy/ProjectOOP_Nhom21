package main;

import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {

        // WINDOW SETTINGS
        JFrame window = new JFrame();	// create window
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// when click X, window closes
        window.setResizable(false);		// window is not resizable
        window.setTitle("Blue Adventure");	// set window's title

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);	// add game panel to window

        window.pack();

        window.setLocationRelativeTo(null); 	// window is displayed at the center
        window.setVisible(true);	// we can see this window

        // START GAME
        gamePanel.setupGame();
        gamePanel.startGameThread();
    }
}
