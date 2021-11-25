import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField textStudentName;
    private JTextField textMarks1;
    private JTextField textMarks2;
    private JTextField textMarks3;
    private JTextField textMarks4;
    private JTextField textMarks5;
    private JTextField textTotal;
    private JTextField textPerc;
    private JTextField textGrade;
    private JButton calculateButton;
    private JPanel Main;
    private JTextField textMarks6;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                   int m1, m2, m3, m4, m5, m6;

                   int total;
                   float parcent;

                   m1 = Integer.parseInt(textMarks1.getText());
                   m2 = Integer.parseInt(textMarks2.getText());
                   m3 = Integer.parseInt(textMarks3.getText());
                   m4 = Integer.parseInt(textMarks4.getText());
                   m5 = Integer.parseInt(textMarks5.getText());
                   m6 = Integer.parseInt(textMarks6.getText());
                try {

                    total = m1 + m2 + m3 + m4 + m5 + m6;

                    parcent = ((m1 + m2 + m3 + m4 + m5 + m6) / 600.0f) * 100;

                    textTotal.setText(String.valueOf(total));
                    textPerc.setText(String.valueOf(parcent));

                    if (parcent>=50&&parcent<=60){
                        textGrade.setText("D");
                    }
                    else if (parcent>=60&&parcent<=70){
                        textGrade.setText("C");
                    }
                    else if (parcent>=70&&parcent<=80){
                        textGrade.setText("B");
                    }
                    else if (parcent>=80&&parcent<=90){
                        textGrade.setText("A");
                    }
                    else if (parcent>=90){
                        textGrade.setText("A+");
                    }
                    else{
                        textGrade.setText("Fail");
                    }

                }

                catch (Exception exception){
                   System.out.println("Good to go..");
               }

            }
        });
    }
}
