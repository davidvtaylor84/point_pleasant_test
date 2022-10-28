import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import static javax.swing.SwingConstants.CENTER;

public class Game  extends JFrame{

    JFrame window;
    Container container;
    JPanel titleNamePanel;
    JPanel startButtonPanel;
    JPanel mainTextPanel;
    JPanel choiceButtonPanel;
    JPanel imagePanel;
    JPanel locationPanel;
    JLabel titleNameLabel;

    JLabel pictureLabel;
    JPanel picturePanel;
    JButton startButton;

    JButton continueButton;
    JTextArea mainTextArea;
    JTextArea locationTextArea;

    titleScreenHandler titleScreenHandler = new titleScreenHandler();

    Font font = new Font("Old Century", Font.PLAIN, 100);
    Font font2 = new Font("Old Centruy", Font.PLAIN, 20);

    public static void main(String[] args){
        new Game();
    }

    public Game(){

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        window = new JFrame();
        window.setSize(screenSize.width, screenSize.height);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);


        container = window.getContentPane();
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(300, 150, 800, 150);
        titleNamePanel.setBackground(new Color(0,0,0,0));
        titleNameLabel = new JLabel("Point Pleasant");
        titleNameLabel.setForeground(Color.WHITE);
        titleNameLabel.setFont(font);
        titleNamePanel.add(titleNameLabel);
        container.add(titleNamePanel);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(600, 600, 200, 100);
        startButtonPanel.setBackground(new Color(0,0,0,0));

        startButton = new JButton("Start New Game");
        startButton.setFont(font2);
        startButton.setBackground(new Color(0,0,0,0));
        startButton.setForeground(Color.BLACK);
        startButton.addActionListener(titleScreenHandler);

        continueButton = new JButton("Continue Game");
        continueButton.setFont(font2);
        continueButton.setBackground(new Color(0,0,0,0));
        continueButton.setForeground(Color.BLACK);

        startButtonPanel.add(startButton);
        startButtonPanel.add(continueButton);
        container.add(startButtonPanel);

        window.setVisible(true);



    }

    public void createGameScreen(){
        titleNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        locationPanel = new JPanel();
        locationPanel.setBounds(330, 20, 750, 50);
        locationPanel.setBackground(Color.MAGENTA);


        locationTextArea = new JTextArea("Town Square");
        locationTextArea.setBounds(250, 20, 750, 50);
        locationTextArea.setBackground(Color.BLACK);
        locationTextArea.setForeground(Color.WHITE);
        locationTextArea.setFont(font2);
        locationPanel.add(locationTextArea);
        container.add(locationPanel, BorderLayout.PAGE_START);


        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(330, 550, 750, 100);
        mainTextPanel.setBackground(Color.BLUE);
        container.add(mainTextPanel);

        imagePanel = new JPanel();
        imagePanel.setBounds(330, 80, 750, 450);
        imagePanel.setBackground(Color.CYAN);
        container.add(imagePanel);

        mainTextArea = new JTextArea("Here we go baby. This game is going top be awesome my g.");
        mainTextArea.setBounds(330, 550, 700, 100);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(font2);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        container.add(choiceButtonPanel, BorderLayout.LINE_END);
        choiceButtonPanel.setBounds(1100, 100, 320, 300);
        choiceButtonPanel.setBackground(Color.RED);
        container.add(choiceButtonPanel);
    }

    public class titleScreenHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            createGameScreen();
        }
    }

}
