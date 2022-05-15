package za.ac.cput.adp3_bill_payment_component.domain;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;

public class ViewRestaurantItems implements ActionListener
{
    JFrame frame;

    JPanel panelNorth, panelSouth;

    String col[] = {"Food Name","Food Price"};

    DefaultTableModel tableModel = new DefaultTableModel(col, 0);

    JTable table;

    JButton calculateBillButton;

    JButton exitButton;

    RestaurantItems restaurantItem1;
    RestaurantItems restaurantItem2;
    RestaurantItems restaurantItem3;

    public ViewRestaurantItems()
    {
        frame = new JFrame("Bill Payment (Core Four)");
        panelNorth = new JPanel();
        panelSouth = new JPanel();
        panelNorth.setBorder(BorderFactory.createTitledBorder( BorderFactory.createEtchedBorder(), "FoodItems"));

        String col[] = {"Name", "Price"};

        DefaultTableModel tableModel = new DefaultTableModel(col, 0);

        table = new JTable(tableModel);

        restaurantItem1 = new RestaurantItems("Spaghetti", 30);
        restaurantItem2 = new RestaurantItems("Burger", 25);
        restaurantItem3 = new RestaurantItems("Salad", 15);
        tableModel.addRow(new String[]{restaurantItem1.getItemName(), String.valueOf(restaurantItem1.getItemPrice())});
        tableModel.addRow(new String[]{restaurantItem2.getItemName(), String.valueOf(restaurantItem2.getItemPrice())});
        tableModel.addRow(new String[]{restaurantItem3.getItemName(), String.valueOf(restaurantItem3.getItemPrice())});

        calculateBillButton = new JButton("Calculate Bill");
        exitButton = new JButton("Exit");
    }

    public void setGUI()
    {
        panelNorth.setLayout(new GridLayout(1, 1));
        panelSouth.setLayout(new GridLayout(1, 2));

        panelNorth.add(new JScrollPane(table));

        panelSouth.add(calculateBillButton);
        panelSouth.add(exitButton);

        frame.add(panelNorth, BorderLayout.NORTH);
        frame.add(panelSouth, BorderLayout.SOUTH);
        table.setRowSelectionAllowed(true);
        table.setRowSelectionInterval(1, 2);

        calculateBillButton.addActionListener(this);
        exitButton.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public double calculateBill(double value1, double value2)
    {
        double sum = value1 + value2;
        return sum;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == calculateBillButton)
        {
            int column = 1;
            table.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            int[] rows = table.getSelectedRows();

            double value1= Double.parseDouble(table.getModel().getValueAt(rows[1] , column).toString());
            double value2= Double.parseDouble(table.getModel().getValueAt(rows[0] , column).toString());
            if(restaurantItem1.getItemPrice()== value1 || restaurantItem2.getItemPrice() == value1 ||
                    restaurantItem3.getItemPrice() == value1 || restaurantItem1.getItemPrice()== value2
                    || restaurantItem2.getItemPrice() == value2 || restaurantItem3.getItemPrice() == value2)
            {
                showMessageDialog(null, "Total Bill: "+ calculateBill(value1, value2));
            }
           /* System.out.println(value1);
            System.out.println(value2);
            System.out.println("Total Bill: "+calculateBill(value1, value2));
            showMessageDialog(null, "Total Bill: "+ calculateBill(value1, value2));*/
        }

        if(e.getSource() == exitButton)
        {
            System.exit(0);
        }
    }

}


