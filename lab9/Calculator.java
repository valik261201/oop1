package lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame {

    TextField firstOperand;
    TextField secondOperand;
    TextField result;
    JLabel op1 = new JLabel("Operand1");
    JLabel op2 = new JLabel("Operand2");
    JLabel rs = new JLabel("Result");
    JLabel excp = new JLabel("Exception");

    public Calculator() {
        super("Calculator");
        initFrame();
    }

    private void initFrame() {
        this.setLayout(null);
        this.setBounds(650, 300, 500, 200);
        this.setResizable(false);
        this.setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        op1.setText("Operand 1");
        op1.setBounds(60, 30, 60, 30);
        this.add(op1);
        firstOperand = new TextField();
        firstOperand.setBounds(60, 60, 60, 30);
        this.add(firstOperand);

        op2.setText("Operand 2");
        op2.setBounds(60, 90, 60, 30);
        this.add(op2);
        secondOperand = new TextField();
        secondOperand.setBounds(60, 120, 60, 30);
        this.add(secondOperand);

        rs.setText("Result");
        rs.setBounds(245, 30, 60, 30);
        this.add(rs);
        result = new TextField();
        result.setBounds(245, 60, 80, 30);
        result.setEditable(false);
        this.add(result);

        excp.setBounds(245, 100, 200, 30);
        this.add(excp);

        JButton equalButton = new JButton("=");
        equalButton.setBounds(150, 90, 60, 30);
        this.add(equalButton);
        equalButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(firstOperand.getText().equals("0") && secondOperand.getText().equals("0"))) {
                    try {
                        double operandOne = Double.parseDouble(firstOperand.getText());
                        double operandTwo = Double.parseDouble(secondOperand.getText());
                        double divisionResult = operandOne/operandTwo;
                        if(operandTwo==0){
                            excp.setText("Can't divide by 0");
                            throw new ArithmeticException("Can't divide by 0");
                        } else if(operandTwo==13){
                            excp.setText("Can't divide by 13 (UnluckyException)");
                            throw new UnluckyException("Can't divide by 13 (UnluckyException)");
                        }
                        result.setText(""+divisionResult);
                    } catch (ArithmeticException exception) {
                        excp.setText("Arithmetic Exception");
                        displayErrorMessage("Arithmetic Exception", exception.getMessage());
                    } catch (NumberFormatException exception) {
                        excp.setText("Please insert valid input");
                        displayErrorMessage("Please insert valid input", exception.getMessage());
                    } catch (UnluckyException exception){
                        excp.setText("Unlucky Exception");
                        displayErrorMessage("Unlucky Exception",exception.getMessage());
                    }
                }
            }
        });
        this.add(equalButton);
        this.add(excp);
    }

    private void displayErrorMessage(String title, String message) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}