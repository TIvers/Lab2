import javax.swing.*;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JFrame;
public class OrderCalculator extends JFrame implements ActionListener {
private JLabel label;
private JRadioButton radioButton1, radioButton2, radioButton3;
private JTextField textField, sugarField, creamField;
private JButton button;

public OrderCalculator() {
    setTitle("Калькулятор заказа кофе");
    setSize(350, 300);
	setLocation(500, 700);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
    label = new JLabel("Выберите чашку:\n\n");
    radioButton1 = new JRadioButton("Маленькая");
    radioButton2 = new JRadioButton("Средняя");
    radioButton3 = new JRadioButton("Большая");
	
    ButtonGroup group = new ButtonGroup();
    group.add(radioButton1);
    group.add(radioButton2);
    group.add(radioButton3);
	
	textField = new JTextField(30);
    button = new JButton("Счёт\n");
    JPanel panel = new JPanel();

	panel.add(new JLabel("Количество"));
	textField = new JTextField(30);
	panel.add(textField);

	panel.add(new JLabel("Сахар\n"));
	sugarField = new JTextField(30);
	panel.add(sugarField);

	panel.add(new JLabel("Сливки\n"));
	creamField = new JTextField(30);
	panel.add(creamField);




    panel.add(label);
    panel.add(radioButton1);
    panel.add(radioButton2);
    panel.add(radioButton3);
    panel.add(button);
	
    add(panel);
	
    button.addActionListener(this);
}

public void actionPerformed(ActionEvent e) {
    double itemPrice = 0.0;
    if (radioButton1.isSelected()) {
        itemPrice = 10.0;
    } else if (radioButton2.isSelected()) {
        itemPrice = 20.0;
    } else if (radioButton3.isSelected()) {
        itemPrice = 30.0;
    }
	
	float y = Float.parseFloat(sugarField.getText()) * 5;
	float z = Float.parseFloat(creamField.getText()) * 15;
    double totalPrice = (itemPrice * Double.parseDouble(textField.getText())+y+z);
	
    JOptionPane.showMessageDialog(this, "Сумма: " + totalPrice + " руб." );
}

public static void main(String[] args) {
    OrderCalculator frame = new OrderCalculator();
    frame.setVisible(true);
}
}

