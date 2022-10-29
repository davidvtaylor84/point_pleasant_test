import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game  extends JFrame{

    JFrame window;
    Container container;
    JPanel titleNamePanel;
    JPanel startButtonPanel;
    JPanel mainTextPanel;
    JPanel choiceButtonPanel;
    JPanel imagePanel;
    JPanel locationPanel;

    JPanel inventoryPanel;
    JPanel playerStatsPanel;
    JLabel titleNameLabel;

    JLabel pictureLabel;
    JPanel picturePanel;
    JButton startButton;

    JButton continueButton;
    JButton choice1, choice2, choice3, choice4, choice5;
    JTextArea mainTextArea;
    JTextArea locationTextArea;

//    Players Stats
    JLabel healthLabel, healthLabelStat, insightLabel, insightLabelStat, defenceLabel, defenceLabelStat, intelligenceLabel, intelligenceLabelStat, inspirationLabel, inspirationLabelStat;


    titleScreenHandler titleScreenHandler = new titleScreenHandler();
    ChoiceHandler choiceHandler = new ChoiceHandler();

    Font font = new Font("Old Century", Font.PLAIN, 100);
    Font font2 = new Font("Old Centruy", Font.PLAIN, 20);
    Font font3 = new Font("Old Centruy", Font.PLAIN, 15);

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
        locationPanel.setBounds(330, 30, 750, 40);
        locationPanel.setBackground(Color.MAGENTA);

        locationTextArea = new JTextArea("Town Square");
        locationTextArea.setBounds(250, 30, 750, 40);
        locationTextArea.setBackground(Color.BLACK);
        locationTextArea.setForeground(Color.WHITE);
        locationTextArea.setFont(font2);
        locationPanel.add(locationTextArea);
        container.add(locationPanel, BorderLayout.PAGE_START);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(330, 490, 750, 140);
        mainTextPanel.setBackground(Color.BLUE);
        container.add(mainTextPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(330, 490, 750, 140);
        mainTextArea.setBackground(new Color(0,0,0,0));
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setFont(font2);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        imagePanel = new JPanel();
        imagePanel.setBounds(330, 80, 750, 400);
        imagePanel.setBackground(Color.CYAN);
        container.add(imagePanel);

        inventoryPanel = new JPanel();
        container.add(inventoryPanel, BorderLayout.LINE_START);
        inventoryPanel.setBounds(20, 80, 290, 500);
        inventoryPanel.setBackground(Color.yellow);

        choiceButtonPanel = new JPanel();
        container.add(choiceButtonPanel, BorderLayout.LINE_END);
        choiceButtonPanel.setBounds(1100, 80, 320, 300);
        choiceButtonPanel.setBackground(Color.BLACK);
        choiceButtonPanel.setLayout(new GridLayout(5,1));

        choice1 = new JButton("choice 1");
        choice1.setBackground(Color.BLACK);
        choice1.setForeground(Color.BLACK);
        choice1.setFont(font2);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("c1");

        choice2 = new JButton("choice 2");
        choice2.setBackground(Color.BLACK);
        choice2.setForeground(Color.BLACK);
        choice2.setFont(font2);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("c2");



        choice3 = new JButton("choice 3");
        choice3.setBackground(Color.BLACK);
        choice3.setForeground(Color.BLACK);
        choice3.setFont(font2);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("c3");



        choice4 = new JButton("choice 4");
        choice4.setBackground(Color.BLACK);
        choice4.setForeground(Color.BLACK);
        choice4.setFont(font2);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("c4");



        choice5 = new JButton("choice 5");
        choice5.setBackground(Color.BLACK);
        choice5.setForeground(Color.BLACK);
        choice5.setFont(font2);
        choice5.addActionListener(choiceHandler);
        choice5.setActionCommand("c5");



        choiceButtonPanel.add(choice1);
        choiceButtonPanel.add(choice2);
        choiceButtonPanel.add(choice3);
        choiceButtonPanel.add(choice4);
        choiceButtonPanel.add(choice5);

        playerStatsPanel = new JPanel();
        playerStatsPanel.setBounds(100, 650, 1220, 50);
        playerStatsPanel.setBackground(Color.RED);
        playerStatsPanel.setLayout(new GridLayout(1,10));
        container.add(playerStatsPanel, BorderLayout.PAGE_END);

        healthLabel = new JLabel("HP:");
        healthLabel.setFont(font3);
        healthLabel.setForeground(Color.WHITE);
        playerStatsPanel.add(healthLabel);
        healthLabelStat = new JLabel();
        healthLabelStat.setFont(font3);
        healthLabelStat.setForeground(Color.WHITE);
        playerStatsPanel.add(healthLabelStat);

        insightLabel = new JLabel("INSIGHT:");
        insightLabel.setFont(font3);
        insightLabel.setForeground(Color.WHITE);
        playerStatsPanel.add(insightLabel);
        insightLabelStat = new JLabel();
        insightLabelStat.setFont(font3);
        insightLabelStat.setForeground(Color.WHITE);
        playerStatsPanel.add(insightLabelStat);

        defenceLabel = new JLabel("DEFENCE:");
        defenceLabel.setFont(font3);
        defenceLabel.setForeground(Color.WHITE);
        playerStatsPanel.add(defenceLabel);
        defenceLabelStat = new JLabel();
        defenceLabelStat.setFont(font3);
        defenceLabelStat.setForeground(Color.WHITE);
        playerStatsPanel.add(defenceLabelStat);

        intelligenceLabel = new JLabel("INTELLIGENCE:");
        intelligenceLabel.setFont(font3);
        intelligenceLabel.setForeground(Color.WHITE);
        playerStatsPanel.add(intelligenceLabel);
        intelligenceLabelStat = new JLabel();
        intelligenceLabelStat.setFont(font3);
        intelligenceLabelStat.setForeground(Color.WHITE);
        playerStatsPanel.add(intelligenceLabelStat);

        inspirationLabel = new JLabel("INSPIRATION:");
        inspirationLabel.setFont(font3);
        inspirationLabel.setForeground(Color.WHITE);
        playerStatsPanel.add(inspirationLabel);
        inspirationLabelStat = new JLabel();
        inspirationLabelStat.setFont(font3);
        inspirationLabelStat.setForeground(Color.WHITE);
        playerStatsPanel.add(inspirationLabelStat);



    }



//    Listens for the click of start button. Calls createGameScreen
    public class titleScreenHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){createGameScreen();
            enteringTheTown();
        }
    }

//    call functions like these at the start of each.
    public void enteringTheTown(){
        mainTextArea.setText("You pull in and park in a small spot off the town square. A few people meander around doing early morning errands. There is a stillness that at first hearing seems normal but then you realise that there are no children in this town. A man with a hat is eating chips. What do you do?");
        choice1.setText("Talk to the man");
        choice2.setText("Go to post office");
        choice3.setText("Meet your mother");
        choice4.setText("Kiss a dog on the lips");
        choice5.setText("");
        locationIdentifier("enteringTheTown");
    }


//    set stats labels using these:
//    label.setText(Integer.toString(intValue));

    public void talkMan(){
        mainTextArea.setText("Man: What do you want you lunatic?");
    }

    public void postOffice(){
        mainTextArea.setText("You walk into the post office. /nThere is a man in the corner filling out a postcard. An agitated woman behind the desk pacing back and forth declaiming on the things she has seen.");
        choice1.setText("Ask the woman what is wrong.");
        choice2.setText("Introduce yourself to the room.");
        choice3.setText("Buy a postcard.");
        choice4.setText("Leave the post office.");
        choice5.setText("");
    }

//    Put this as a player variable.
    public void locationIdentifier(String newLocation){
        String location = newLocation;
    }

    //    Listens to button choices
    public class ChoiceHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            String choice = event.getActionCommand();
            switch (locationIdentifier()){
                case "enteringTheTown";
            }
            if(choice.equals("c1")){
                talkMan();
            }
            if(choice.equals("c2")){
                postOffice();
            }
            if(choice.equals("c3")){
                enteringTheTown();
            }
        }
    }

}
