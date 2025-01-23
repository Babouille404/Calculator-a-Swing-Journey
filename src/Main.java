import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] oppButtons = new JButton[10];
    JButton addButton, subtractButton, multiplyButton, divideButton;
    JButton decimalButton, equalButton, deleteButton, clearButton;
    JButton linkedInButton, gitHubButton;

    JPanel panel;

    Font myFont = new Font("Serif", Font.BOLD, 20);

    double num1 =0, num2 = 0, result = 0;
    String operator;

    public Main(){

        frame = new JFrame("Babo Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 550);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);

        textField = new JTextField();
        textField.setBounds(31, 10, 420, 50);
        textField.setFont(myFont);
        textField.setEditable(false);

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        decimalButton = new JButton(".");
        equalButton = new JButton("=");
        deleteButton = new JButton("Delete");
        clearButton = new JButton("Clear");
        linkedInButton = new JButton("LinkedIn");
        gitHubButton = new JButton("GitHub");

        //Opperation buttons

        oppButtons[0] = addButton;
        oppButtons[1] = subtractButton;
        oppButtons[2] = multiplyButton;
        oppButtons[3] = divideButton;
        oppButtons[4] = decimalButton;
        oppButtons[5] = equalButton;
        oppButtons[6] = deleteButton;
        oppButtons[7] = clearButton;
        oppButtons[8] = linkedInButton;
        oppButtons[9] = gitHubButton;

        frame.add(oppButtons[0]);
        frame.add(oppButtons[1]);
        frame.add(oppButtons[2]);
        frame.add(oppButtons[3]);
        frame.add(oppButtons[4]);
        frame.add(oppButtons[5]);
        frame.add(oppButtons[6]);
        frame.add(oppButtons[7]);
        frame.add(oppButtons[8]);
        frame.add(oppButtons[9]);

        oppButtons[0].setFont(myFont);
        oppButtons[1].setFont(myFont);
        oppButtons[2].setFont(myFont);
        oppButtons[3].setFont(myFont);
        oppButtons[4].setFont(myFont);
        oppButtons[5].setFont(myFont);
        oppButtons[6].setFont(myFont);
        oppButtons[7].setFont(myFont);
        oppButtons[8].setFont(myFont);
        oppButtons[9].setFont(myFont);

        //Number buttons

        numberButtons[0] = new JButton("0");
        numberButtons[1] = new JButton("1");
        numberButtons[2] = new JButton("2");
        numberButtons[3] = new JButton("3");
        numberButtons[4] = new JButton("4");
        numberButtons[5] = new JButton("5");
        numberButtons[6] = new JButton("6");
        numberButtons[7] = new JButton("7");
        numberButtons[8] = new JButton("8");
        numberButtons[9] = new JButton("9");

        numberButtons[0].setFont(myFont);
        numberButtons[1].setFont(myFont);
        numberButtons[2].setFont(myFont);
        numberButtons[3].setFont(myFont);
        numberButtons[4].setFont(myFont);
        numberButtons[5].setFont(myFont);
        numberButtons[6].setFont(myFont);
        numberButtons[7].setFont(myFont);
        numberButtons[8].setFont(myFont);
        numberButtons[9].setFont(myFont);

        frame.add(numberButtons[0]);
        frame.add(numberButtons[1]);
        frame.add(numberButtons[2]);
        frame.add(numberButtons[3]);
        frame.add(numberButtons[4]);
        frame.add(numberButtons[5]);
        frame.add(numberButtons[6]);
        frame.add(numberButtons[7]);
        frame.add(numberButtons[8]);
        frame.add(numberButtons[9]);

        //ActionListener

        oppButtons[0].addActionListener(this);
        oppButtons[1].addActionListener(this);
        oppButtons[2].addActionListener(this);
        oppButtons[3].addActionListener(this);
        oppButtons[4].addActionListener(this);
        oppButtons[5].addActionListener(this);
        oppButtons[6].addActionListener(this);
        oppButtons[7].addActionListener(this);

        numberButtons[0].addActionListener(this);
        numberButtons[1].addActionListener(this);
        numberButtons[2].addActionListener(this);
        numberButtons[3].addActionListener(this);
        numberButtons[4].addActionListener(this);
        numberButtons[5].addActionListener(this);
        numberButtons[6].addActionListener(this);
        numberButtons[7].addActionListener(this);
        numberButtons[8].addActionListener(this);
        numberButtons[9].addActionListener(this);

        //Utils Buttons

        deleteButton.setBounds(31,430,125,50);
        clearButton.setBounds(162,430,125,50);
        linkedInButton.setBounds(292,430,77,50);
        gitHubButton.setBounds(374,430,77,50);

        panel = new JPanel();
        panel.setBounds(31,70,420,350);
        panel.setLayout(new GridLayout(4,4,10,10));

        //FirstRow
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(divideButton);
        //SecondRow
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(multiplyButton);
        //ThirdRow
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(subtractButton);
        //FourthRow
        panel.add(numberButtons[0]);
        panel.add(equalButton);
        panel.add(decimalButton);
        panel.add(addButton);

        frame.add(panel);
        frame.add(textField);
        frame.setVisible(true);

    }

    public static void main(String[] args) {

        Main calculator = new Main();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //Affichage numberButtons
        if(e.getSource() == numberButtons[0]) {
            textField.setText(textField.getText().concat(String.valueOf(numberButtons[0].getText())));
        }
        else if(e.getSource() == numberButtons[1]) {
            textField.setText(textField.getText().concat(String.valueOf(numberButtons[1].getText())));
        }
        else if(e.getSource() == numberButtons[2]) {
            textField.setText(textField.getText().concat(String.valueOf(numberButtons[2].getText())));
        }
        else if(e.getSource() == numberButtons[3]) {
            textField.setText(textField.getText().concat(String.valueOf(numberButtons[3].getText())));
        }
        else if(e.getSource() == numberButtons[4]) {
            textField.setText(textField.getText().concat(String.valueOf(numberButtons[4].getText())));
        }
        else if(e.getSource() == numberButtons[5]) {
            textField.setText(textField.getText().concat(String.valueOf(numberButtons[5].getText())));
        }
        else if(e.getSource() == numberButtons[6]) {
            textField.setText(textField.getText().concat(String.valueOf(numberButtons[6].getText())));
        }
        else if(e.getSource() == numberButtons[7]) {
            textField.setText(textField.getText().concat(String.valueOf(numberButtons[7].getText())));
        }
        else if(e.getSource() == numberButtons[8]) {
            textField.setText(textField.getText().concat(String.valueOf(numberButtons[8].getText())));
        }
        else if(e.getSource() == numberButtons[9]) {
            textField.setText(textField.getText().concat(String.valueOf(numberButtons[9].getText())));
        }

        if (e.getSource() == decimalButton) {
            textField.setText(textField.getText().concat(String.valueOf(decimalButton.getText())));
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = "+";
            textField.setText("");
        }
        if (e.getSource() == subtractButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = "-";
            textField.setText("");
        }
        if (e.getSource() == equalButton) {
            num2 = Double.parseDouble(textField.getText());

            switch(operator) {
                case"+":
                    result = num1 + num2;
                    break;
                case"-":
                    result = num1 - num2;
                    break;
                case"*":
                    result = num1 * num2;
                    break;
                case"/":
                    result = num1 / num2;
                    break;
            }
            textField.setText(String.valueOf(result));
            num1 = result;
        }
        if (e.getSource() == divideButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = "/";
            textField.setText("");
        }
        if (e.getSource() == multiplyButton) {
            num1 = Double.parseDouble(textField.getText());
            operator = "*";
            textField.setText("");
        }
        if (e.getSource() == clearButton) {
            textField.setText("");
        }
        if (e.getSource() == deleteButton) {
            String string = textField.getText();
            textField.setText("");
            for (int i = 0; i < string.length(); i++) {
                textField.setText(textField.getText()+string.charAt(i));
            }
        }

    }
}