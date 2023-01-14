import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JComboBox comboBox1;
    private JPanel mainPanel;

    public Main() {
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                shapeTypeLabel.setText("" + comboBox1.getSelectedItem());
            }
        });
    }
}