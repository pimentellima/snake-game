import javax.swing.*;

public class SnakeGame {

    private static void init() {
        JFrame window = new JFrame("Snake Game");
        Board board = new Board();
        window.add(board);
        window.pack();
        window.setResizable(false);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public static void main (String [] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                init();
            }
        });
    }
}


