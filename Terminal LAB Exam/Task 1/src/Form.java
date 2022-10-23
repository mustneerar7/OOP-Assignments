import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Form extends JFrame {

    // COMPONENTS DECLARED
    private JLabel rollNoLabel;
    private JTextField rollNoField;

    private JLabel nameLabel;
    private JTextField nameField;

    private JLabel dateLabel;
    private JComboBox dateComboBox;
    String[] dates = {"07-12-2022", "22,-7-2022", "24-12-2022"};

    private JCheckBox confirmCheckBox;

    private JButton addAttendance;

    private boolean isChecked;

    public Form(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(320,200);
        setVisible(true);

        setLayout(new FlowLayout());

        rollNoLabel = new JLabel("Roll Number: ");
        add(rollNoLabel);

        rollNoField = new JTextField("", 20);
        add(rollNoField);

        nameLabel = new JLabel("Name:    ");
        add(nameLabel);

        nameField = new JTextField("", 23);
        add(nameField);

        dateLabel = new JLabel("Date: ");
        add(dateLabel);

        dateComboBox = new JComboBox(dates);
        dateComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JOptionPane.showMessageDialog(null,"You selected " + (dateComboBox.getSelectedItem()+ " date"));
            }
        });
        add(dateComboBox);

        confirmCheckBox = new JCheckBox("I confirm that I took the class on this date");
        confirmCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(confirmCheckBox.isSelected()){
                    isChecked = true;
                    System.out.println("Checked");
                }else {
                    isChecked = false;
                    System.out.println("Unchecked");
                }
            }
        });
        add(confirmCheckBox);

        addAttendance = new JButton("Add Attendance");
        addAttendance.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (rollNoField.getText().contains("-")){
                    String[] components = rollNoField.getText().split("-");

                    String batch = components[0];
                    String course = components[1];
                    String id = components[2];

                    if (batch.length() < 4 ){
                        rollNoField.setText("");
                    }
                    if(course.length() < 3){
                        rollNoField.setText("");
                    }
                    if(id.length() < 3){
                        rollNoField.setText("");
                    }
                    if(rollNoField.getText().charAt(4) != '-'){
                        rollNoField.setText("");
                    }
                    if(rollNoField.getText().charAt(8) != '-'){
                        rollNoField.setText("");
                    }
                }
                else{
                    rollNoField.setText("");
                }


                //OPTIONAL TASK
                if (isChecked == true){
                    try {
                        PrintWriter printWriter = new PrintWriter(new FileOutputStream("attendance.txt", true));
                        printWriter.print(rollNoField.getText() + " " + dateComboBox.getSelectedItem() + " " + nameField.getText() + "\n");
                        printWriter.close();
                    } catch (FileNotFoundException ex) {}

                }
            }
        });
        add(addAttendance);
    }
}