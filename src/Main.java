import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Main implements ActionListener {

    public static void main(String[] args) {
        Main myCalculator = new Main();
    /*    Scanner calcInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter operation #: 1. add, 2. subtract, 3. multiply, 4. divide, 5. power");
        int operation = calcInput.nextInt();
        //myCalculator.add(5, 8);
        if (operation == 1) {
            System.out.println("Enter first number: ");
            int a = calcInput.nextInt();
            System.out.println("Enter second number: ");
            int b = calcInput.nextInt();
            System.out.println("The sum is " + myCalculator.add(a, b));
        }
        else if (operation == 2) {
            System.out.println("Enter first number: ");
            int a = calcInput.nextInt();
            System.out.println("Enter second number: ");
            int b = calcInput.nextInt();
            System.out.println("The result is " + myCalculator.subtract(a, b));
        }
        else if (operation == 3) {
            System.out.println("Enter first number: ");
            double a = calcInput.nextInt();
            System.out.println("Enter second number: ");
            double b = calcInput.nextInt();
            System.out.println("The result is " + myCalculator.multiply(a, b));
        }
        else if (operation == 4) {
            System.out.println("Enter first number: ");
            double a = calcInput.nextInt();
            System.out.println("Enter second number: ");
            double b = calcInput.nextInt();
            System.out.println("The result is " + myCalculator.divide(a, b));
        }
        else if (operation == 5) {
            System.out.println("Enter base: ");
            int a = calcInput.nextInt();
            System.out.println("Enter exponent: ");
            int b = calcInput.nextInt();
            System.out.println("The result is " + myCalculator.power(a, b));
        } */
    /*        System.out.println("The sum is " + myCalculator.add(5, 8));
        System.out.println("The difference is " + myCalculator.subtract(20, 9));
        System.out.println("The product is " + myCalculator.multiply(5, 8));
        System.out.println("The quotient is " + myCalculator.divide(21, 2));
        System.out.println("The square is " + myCalculator.square(5));
        System.out.println("The cube is " + myCalculator.cube(5));
        System.out.println("The result is " + myCalculator.power(5, 6));*/


    }

    private JFrame frame;
    private JPanel panel;
    private JPanel labelPanel;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton equals;
    private JButton plus;
    private JButton minus;
    private JButton multiply;
    public JButton divide;
    public JButton modulus;
    public JButton negative;
    public JButton clear;
    public JButton decimal;
    public JButton exponent;
    public double a;
    public double b;
    public String operation;
    boolean isOperation = false;
    public String secondNumber;

    public JLabel result;
    public JLabel space;
    public JLabel equation;
    Calculator myCalculator = new Calculator();

    public Main() {


        frame = new JFrame();
        panel = new JPanel();
        labelPanel = new JPanel();
        result = new JLabel("", SwingConstants.RIGHT);
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        equals = new JButton("=");
        plus = new JButton("+");
        minus = new JButton("-");
        multiply = new JButton("x");
        divide = new JButton("/");
        modulus = new JButton("%");
        negative = new JButton("+/-");
        clear = new JButton("C");
        decimal = new JButton(".");
        exponent = new JButton("^");
        space = new JLabel();
        equation = new JLabel();

        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        equals.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        decimal.addActionListener(this);
        modulus.addActionListener(this);
        negative.addActionListener(this);
        clear.addActionListener(this);
        exponent.addActionListener(this);

        frame.setLayout(new BorderLayout(10, 10));
        panel.setLayout(new java.awt.GridLayout(5, 4));
        labelPanel.setLayout(new GridLayout(1, 2));

        frame.add(labelPanel, BorderLayout.NORTH);
        labelPanel.add(equation);
        labelPanel.add(result);
        frame.add(panel, BorderLayout.CENTER);
        panel.add(clear);
        panel.add(negative);
        panel.add(modulus);
        panel.add(divide);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(multiply);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(minus);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(plus);
        panel.add(decimal);
        panel.add(button0);
        panel.add(exponent);
        panel.add(equals);


//        pan.add(panel, BorderLayout.CENTER);
//        panel2.add(button1, BorderLayout.NORTH);
//        panel2.add(button3, BorderLayout.SOUTH);
//        panel.add(button2);
//        panel.add(label);
//        panel.add(button4);
//        panel.add(label2);
//        panel.add(button5);


//        button1.setSize(100, 100);
//        button2.setSize(100, 100);
//        button3.setSize(100, 100);
//        button4.setSize(100, 100);
//        button5.setSize(100, 100);
        frame.setSize(600, 400);
        labelPanel.setSize(600, 50);
        //frame.pack();
        frame.setVisible(true);

    }


    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();
        String command = e.getActionCommand();

        if (source == button0) {
            result.setText(result.getText() + "0");
            if (!isOperation) {
                    equation.setText(equation.getText() + "0");
            } else if (isOperation) {
                secondNumber = secondNumber + "0";
            }
        } else if (source == button1) {
            result.setText(result.getText() + "1");
            if (!isOperation) {
                    equation.setText(equation.getText() + "1");
            } else if (isOperation) {
                secondNumber = secondNumber + "1";
            }
        } else if (source == button2) {
            result.setText(result.getText() + "2");
            if (!isOperation) {
                equation.setText(equation.getText() + "2");
            } else if (isOperation) {
                secondNumber = secondNumber + "2";
            }
        } else if (source == button3) {
            result.setText(result.getText() + "3");
            if (!isOperation) {
                equation.setText(equation.getText() + "3");
            } else if (isOperation) {
                secondNumber = secondNumber + "3";
            }
        } else if (source == button4) {
            result.setText(result.getText() + "4");
            if (!isOperation) {
                equation.setText(equation.getText() + "4");
            } else if (isOperation) {
                secondNumber = secondNumber + "4";
            }
        } else if (source == button5) {
            result.setText(result.getText() + "5");
            if (!isOperation) {
                equation.setText(equation.getText() + "5");
            } else if (isOperation) {
                secondNumber = secondNumber + "5";
            }
        } else if (source == button6) {
            result.setText(result.getText() + "6");
            if (!isOperation) {
                equation.setText(equation.getText() + "6");
            } else if (isOperation) {
                secondNumber = secondNumber + "6";
            }
        } else if (source == button7) {
            result.setText(result.getText() + "7");
            if (!isOperation) {
                equation.setText(equation.getText() + "7");
            } else if (isOperation) {
                secondNumber = secondNumber + "7";
            }
        } else if (source == button8) {
            result.setText(result.getText() + "8");
            if (!isOperation) {
                equation.setText(equation.getText() + "8");
            } else if (isOperation) {
                secondNumber = secondNumber + "8";
            }
        } else if (source == button9) {
            result.setText(result.getText() + "9");
            if (!isOperation) {
                equation.setText(equation.getText() + "9");
            } else if (isOperation) {
                secondNumber = secondNumber + "9";
            }
        } else if (source == decimal) {
            result.setText(result.getText() + ".");
            if (!isOperation) {
                equation.setText(equation.getText() + ".");
            } else if (isOperation) {
                secondNumber = secondNumber + ".";
            }
        } else if (!isOperation) {
            if (source == negative && !(result.getText().substring(0, 1).equals("-"))) {
                System.out.println("substring: " + result.getText().substring(0, 1));
                result.setText("-" + result.getText());
                System.out.println("1");
                equation.setText("-" + equation.getText());
            } else if (source == negative && (result.getText().substring(0, 1).equals("-"))) {
                //equation.setText("-" + equation.getText());
                System.out.println("2");
                result.setText(result.getText().substring(1));
                equation.setText(equation.getText().substring(1));            }
        } else if (isOperation) {
            if (source == negative && !(result.getText().substring(0, 1).equals("-"))) {
                System.out.println("substring: " + result.getText().substring(0, 1));
                result.setText("-" + result.getText());
                System.out.println("1");
                secondNumber = (result.getText());
            } else if (source == negative && (result.getText().substring(0, 1).equals("-"))) {
                //equation.setText("-" + equation.getText());
                System.out.println("2");
                result.setText(result.getText().substring(1));
                //equation.setText(equation.getText() + result.getText());
                secondNumber = (result.getText());
            }
        }
        if (source == plus) {
            a = parseDouble(result.getText());
            result.setText("");
            operation = "plus";
            equation.setText(equation.getText() + " + ");
            isOperation = true;
        } else if (source == minus) {
            a = parseDouble(result.getText());
            result.setText("");
            operation = "minus";
            equation.setText(equation.getText() + " - ");
            isOperation = true;
        } else if (source == multiply) {
            a = parseDouble(result.getText());
            result.setText("");
            operation = "multiply";
            equation.setText(equation.getText() + " * ");
            isOperation = true;
        } else if (source == divide) {
            a = parseDouble(result.getText());
            result.setText("");
            operation = "divide";
            equation.setText(equation.getText() + " / ");
            isOperation = true;
        } else if (source == modulus) {
            a = parseDouble(result.getText());
            result.setText("");
            operation = "modulus";
            equation.setText(equation.getText() + " % ");
            isOperation = true;
        } else if (source == exponent) {
            a = parseDouble(result.getText());
            result.setText("");
            operation = "exponent";
            equation.setText(equation.getText() + " ^ ");
            isOperation = true;
        }
        if (source == equals) {
            b = parseDouble(result.getText());
            result.setText("");
            equation.setText(equation.getText() + secondNumber + " = ");


            if (operation == "plus") {
                result.setText("" + myCalculator.add(a, b));
            } else if (operation == "minus") {
                result.setText("" + myCalculator.subtract(a, b));
            } else if (operation == "multiply") {
                result.setText("" + myCalculator.multiply(a, b));
            } else if (operation == "divide") {
                result.setText("" + myCalculator.divide(a, b));
            } else if (operation == "modulus") {
                result.setText("" + myCalculator.modulus(a, b));
            } else if (operation == "exponent") {
                result.setText("" + myCalculator.power(a, b));
            }
            equation.setText(equation.getText() + result.getText());
        }
        if (source == clear) {
            result.setText("");
            a = 0;
            b = 0;
            operation = "";
            equation.setText("");
            isOperation = false;
        }

    }


}



