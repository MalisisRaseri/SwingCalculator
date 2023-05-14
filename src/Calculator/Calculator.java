package Calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {

    private boolean isClicked = false;
    private boolean isInitialized = false;
    private boolean isPointActive = false;

    private String isOperator;
    private String oldValue;
    private String newValue;
    private String result;

    private final JFrame frame;
    private final JLabel display;

    private final JButton zero;
    private final JButton one;
    private final JButton two;
    private final  JButton three;
    private final JButton four;
    private final JButton five;
    private final JButton six;
    private final JButton seven;
    private final JButton eight;
    private final JButton nine;
    private final JButton plus;
    private final JButton minus;
    private final JButton multiply;
    private final JButton divide;
    private final JButton equal;

    private JButton C;
    private final JButton point;
    private final JButton clear;

    public Calculator( ) {

        frame = new JFrame("My SwingCalculator");
        frame.setLayout(null);
        frame.setSize(600, 600);
        frame.setLocation(500, 125);
        frame.getContentPane().setBackground(Color.GRAY);


        display = new JLabel("0");
        display.setBounds(20, 30, 545, 60);
        display.setBackground(Color.white);
        display.setOpaque(true);
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setForeground(Color.black);
        display.setFont(new Font("Arial", Font.PLAIN, 50));
        frame.add(display);

        seven = new JButton("7");
        seven.setBounds(20, 140, 80, 80);
        seven.setFont(new Font("Arial", Font.PLAIN, 30));
        seven.setBackground(Color.white);
        seven.addActionListener(this);
        frame.add(seven);

        eight = new JButton("8");
        eight.setBounds(120, 140, 80, 80);
        eight.setFont(new Font("Arial", Font.PLAIN, 30));
        eight.setBackground(Color.white);
        eight.addActionListener(this);
        frame.add(eight);

        nine = new JButton("9");
        nine.setBounds(220, 140, 80, 80);
        nine.setFont(new Font("Arial", Font.PLAIN, 30));
        nine.setBackground(Color.white);
        nine.addActionListener(this);
        frame.add(nine);

        four = new JButton("4");
        four.setBounds(20, 240, 80, 80);
        four.setFont(new Font("Arial", Font.PLAIN, 30));
        four.setBackground(Color.white);
        four.addActionListener(this);
        frame.add(four);

        five = new JButton("5");
        five.setBounds(120, 240, 80, 80);
        five.setFont(new Font("Arial", Font.PLAIN, 30));
        five.setBackground(Color.white);
        five.addActionListener(this);
        frame.add(five);

        six = new JButton("6");
        six.setBounds(220, 240, 80, 80);
        six.setFont(new Font("Arial", Font.PLAIN, 30));
        six.setBackground(Color.white);
        six.addActionListener(this);
        frame.add(six);

        one = new JButton("1");
        one.setBounds(20, 340, 80, 80);
        one.setFont(new Font("Arial", Font.PLAIN, 30));
        one.setBackground(Color.white);
        one.addActionListener(this);
        frame.add(one);

        two = new JButton("2");
        two.setBounds(120, 340, 80, 80);
        two.setFont(new Font("Arial", Font.PLAIN, 30));
        two.setBackground(Color.white);
        two.addActionListener(this);
        frame.add(two);

        three = new JButton("3");
        three.setBounds(220, 340, 80, 80);
        three.setFont(new Font("Arial", Font.PLAIN, 30));
        three.setBackground(Color.white);
        three.addActionListener(this);
        frame.add(three);

        zero = new JButton("0");
        zero.setBounds(20, 440, 80, 80);
        zero.setFont(new Font("Arial", Font.PLAIN, 30));
        zero.setBackground(Color.white);
        zero.addActionListener(this);
        frame.add(zero);

        point = new JButton(".");
        point.setBounds(120, 440, 80, 80);
        point.setFont(new Font("Arial", Font.PLAIN, 30));
        point.setBackground(Color.white);
        point.setForeground(Color.black);
        point.addActionListener(this);
        frame.add(point);


        equal = new JButton("=");
        equal.setBounds(485, 440, 80, 80);
        equal.setFont(new Font("Arial", Font.PLAIN, 30));
        equal.setBackground(Color.GREEN);
        equal.setForeground(Color.white);
        equal.addActionListener(this);
        frame.add(equal);

        clear = new JButton("C");
        clear.setBounds(220, 440, 80, 80);
        clear.setFont(new Font("Arial", Font.PLAIN, 30));
        clear.setBackground(Color.PINK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        frame.add(clear);

        divide = new JButton("/");
        divide.setBounds(485, 240, 80, 80);
        divide.setFont(new Font("Arial", Font.PLAIN, 30));
        divide.setBackground(Color.black);
        divide.setForeground(Color.white);
        divide.addActionListener(this);
        frame.add(divide);

        plus = new JButton("+");
        plus.setBounds(385, 340, 80, 180);
        plus.setFont(new Font("Arial", Font.PLAIN, 30));
        plus.setBackground(Color.black);
        plus.setForeground(Color.white);
        plus.addActionListener(this);
        frame.add(plus);

        multiply = new JButton("x");
        multiply.setBounds(485, 340, 80, 80);
        multiply.setFont(new Font("Arial", Font.PLAIN, 30));
        multiply.setBackground(Color.black);
        multiply.setForeground(Color.white);
        multiply.addActionListener(this);
        frame.add(multiply);

        minus = new JButton("-");
        minus.setBounds(385, 240, 80, 80);
        minus.setFont(new Font("Arial", Font.PLAIN, 30));
        minus.setBackground(Color.black);
        minus.setForeground(Color.white);
        minus.addActionListener(this);
        frame.add(minus);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == seven) {
            if(Objects.equals(display.getText(), "0")) {
                display.setText("7");
            }else {
                if(isClicked) {
                    display.setText("7");
                    isClicked=false;
                }else {
                    display.setText(display.getText()+"7");
                }
            }
        } else if(e.getSource() == eight) {
            if(Objects.equals(display.getText(), "0")) {
                display.setText("8");
            }else {
                if(isClicked) {
                    display.setText("8");
                    isClicked=false;
                }else {
                    display.setText(display.getText()+"8");
                }
            }
        }else if(e.getSource() == nine) {
            if(Objects.equals(display.getText(), "0")) {
                display.setText("9");
            }else {
                if(isClicked) {
                    display.setText("9");
                    isClicked = false;
                }else {
                    display.setText(display.getText()+"9");
                }
            }
        }else if(e.getSource() == four) {
            if(Objects.equals(display.getText(), "0")) {
                display.setText("4");
            }else {
                if(isClicked) {
                    display.setText("4");
                    isClicked = false;
                }else {
                    display.setText(display.getText()+"4");
                }
            }
        }else if(e.getSource() == five) {
            if(Objects.equals(display.getText(), "0")) {
                display.setText("5");
            }else {
                if(isClicked) {
                    display.setText("5");
                    isClicked=false;
                }else {
                    display.setText(display.getText()+"5");
                }
            }
        }else if(e.getSource() == six) {
            if(Objects.equals(display.getText(), "0")) {
                display.setText("6");
            }else {
                if(isClicked) {
                    display.setText("6");
                    isClicked=false;
                }else {
                    display.setText(display.getText()+"6");
                }
            }
        }else if(e.getSource() == one) {
            if(Objects.equals(display.getText(), "0")) {
                display.setText("1");
            }else {
                if(isClicked) {
                    display.setText("1");
                    isClicked=false;
                }else {
                    display.setText(display.getText()+"1");
                }
            }
        }else if(e.getSource() == two) {
            if(Objects.equals(display.getText(), "0")) {
                display.setText("2");
            }else {
                if(isClicked) {
                    display.setText("2");
                    isClicked=false;
                }else {
                    display.setText(display.getText()+"2");
                }
            }
        }else if(e.getSource() == three) {
            if(Objects.equals(display.getText(), "0")) {
                display.setText("3");
            }else {
                if(isClicked) {
                    display.setText("3");
                    isClicked=false;
                }else {
                    display.setText(display.getText()+"3");
                }
            }
        }else if(e.getSource() == zero) {
            if(Objects.equals(display.getText(), "0")) {
                display.setText("0");
            }else {
                if(isClicked) {
                    display.setText("0");
                    isClicked=false;
                }else {
                    display.setText(display.getText()+"0");
                }
            }
        }else if(e.getSource() == point) {
            if (!isPointActive) {
                if(isClicked) {
                    display.setText("0.");
                    isClicked = false;
                }else {
                    display.setText(display.getText()+".");
                }
                isPointActive=true;
            }
        }else if(e.getSource() == equal) {

            newValue = display.getText();

            result = calculate(newValue);

            display.setText(result+"");

            isInitialized = false;

            isPointActive = false;

        }else if(e.getSource() == clear) {
            display.setText("0");
            isPointActive = false;

        } else if(e.getSource() == divide ) {
            if(isInitialized) {
                if(isClicked) {
                    isOperator="/";
                }else {
                    newValue = display.getText();

                    result = calculate(newValue);

                    display.setText(result+"");

                    isClicked=true;
                    oldValue=result+"";
                    isOperator="/";
                }
            }else {
                isClicked=true;
                isInitialized = true;
                isOperator = "/";
                oldValue = display.getText();
            }
            isPointActive = false;
        }else if(e.getSource() == plus) {
            if(isInitialized) {
                if(isClicked) {
                    isOperator = "+";
                }else {
                    newValue = display.getText();

                    result = calculate(newValue);

                    display.setText(result+"");

                    isClicked=true;
                    oldValue=result+"";
                    isOperator="+";
                }
            }else {
                isClicked = true;
                isInitialized = true;
                isOperator = "+";
                oldValue = display.getText();
            }
            isPointActive = false;
        }else if(e.getSource() == multiply) {
            if(isInitialized) {
                if (isClicked) {
                    isOperator="*";
                }else {
                    newValue = display.getText();

                    result = calculate(newValue);

                    display.setText(result+"");

                    isClicked=true;
                    oldValue=result+"";
                    isOperator="*";
                }
            }else {
                isClicked = true;
                isInitialized = true;
                isOperator="*";
                oldValue = display.getText();
            }
            isPointActive = false;
        }else if(e.getSource() == minus) {
            if(isInitialized) {
                if (isClicked) {
                    isOperator="-";
                }else {
                    newValue = display.getText();

                    result = calculate(newValue);

                    display.setText(result+"");

                    isClicked = true;
                    oldValue = result +"";
                    isOperator = "-";
                }
            }else {
                isClicked = true;
                isInitialized = true;
                isOperator = "-";
                oldValue = display.getText();
            }
            isPointActive = false;
        }

    }

    public String calculate(String value) {

        float firstValue = Float.parseFloat(oldValue);
        float secondValue = Float.parseFloat(value);

        if (Objects.equals(isOperator, "+")) {
            if ((firstValue + secondValue) % 1 == 0)
                return Integer.toString((int) firstValue + (int) secondValue);
            else
                return Float.toString(firstValue + secondValue);
        } else if (Objects.equals(isOperator, "-")) {
            if ((firstValue - secondValue) % 1 == 0)
                return Integer.toString((int) firstValue - (int) secondValue);
            else
                return Float.toString(firstValue - secondValue);
        } else if (Objects.equals(isOperator, "*")) {
            if ((firstValue * secondValue) % 1 == 0)
                return Integer.toString((int) firstValue * (int) secondValue);
            else
                return Float.toString(firstValue * secondValue);
        } else if (Objects.equals(isOperator, "/")) {
            if (secondValue == 0) {
                return "Division by zero!";
            }
            if ((firstValue / secondValue) % 1 == 0)
                return Integer.toString((int) firstValue / (int) secondValue);
            else
                return Float.toString(firstValue / secondValue);
        } else {
            return "Error!";
        }
    }

}