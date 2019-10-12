import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class WordGameInteface extends JFrame {
    private JButton startButton;
    private JButton next;
    private JButton check;
    private JTextField wordField;
    private JTextField translationField;


    public WordGameInteface() throws IOException {
        setTitle("Word Game");
        BufferedImage img = ImageIO.read(new File("src/c3c8e52e7d1d92ca323a06ad4fb08d9b.jpg"));
        MyImagePanel panel = new MyImagePanel(img);
        panel.setLayout(null);
        wordField = new JTextField("word");
        translationField = new JTextField("слово  (перевод слова)");
        wordField.setLayout(null);
        translationField.setLayout(null);
        wordField.setBounds(100,90,200,30);
        translationField.setBounds(100,130,200,30);
        wordField.setFont(new Font("Arial", Font.ROMAN_BASELINE,16));
        translationField.setFont(new Font("Arial", Font.ROMAN_BASELINE,16));
        startButton = new JButton("Начать");
        startButton.setLayout(null);
        startButton.setBounds(100,55,200,30);
        startButton.setBackground(new Color(214, 0, 10));
        startButton.setForeground(Color.GREEN);
        startButton.setFont(new Font("Arial", Font.BOLD,26));
        startButton.setFocusPainted(false);

setContentPane(panel);
setSize(1980,1040);
setVisible(true);




}

    public static void main(String[] args)throws IOException {
        new WordGameInteface();
    }
}