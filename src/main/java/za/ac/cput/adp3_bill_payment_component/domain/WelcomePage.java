package za.ac.cput.adp3_bill_payment_component.domain;

import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomelabel = new JLabel("Hello!");

    WelcomePage(String userID){

        welcomelabel.setBounds(0,0,0200,35);
        welcomelabel.setFont(new Font(null,Font.PLAIN,20));

        welcomelabel.setText("Hello"+userID);

        frame.add(welcomelabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,450);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
