/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageTravelAgency;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Airplane;
import Business.Customer;
import Business.CustomerDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Abhilash Wase
 */
public class ManageTravelAgencyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTravelAgencyJPanel
     */
    private JPanel panelRight;
    private AirlinerDirectory airlineDirectory;
    private CustomerDirectory customerDirectory;

    public ManageTravelAgencyJPanel(JPanel panelRight, AirlinerDirectory airlineDirectory, CustomerDirectory customerDirectory) {
        initComponents();
        this.panelRight = panelRight;
        this.airlineDirectory = airlineDirectory;
        this.customerDirectory = customerDirectory;
        populateComboBox();
    }

    public void populateComboBox() {
        jComboBoxFromLocation.removeAllItems();
        jComboBoxFromLocation.addItem("Please choose from Below");
        jComboBoxToLocation.addItem("Please choose from Below");
        jComboBoxAirlinerName.addItem("Please choose from Below");
        Set<String> fromLocationList = new HashSet<>();
        Set<String> toLocationList = new HashSet<>();
        Set<String> airLinerNameList = new HashSet<>();

        for (Airliner airliner : airlineDirectory.getAirlinerList()) {
            for (Airplane airplane : airliner.getFlightFleet()) {
                fromLocationList.add(airplane.getFromLocation());
                toLocationList.add(airplane.getToLocation());
                airLinerNameList.add(airplane.getAirlinerName());

            }
        }
        for (String fromLoc : fromLocationList) {
            jComboBoxFromLocation.addItem(fromLoc);
        }
        for (String toLoca : toLocationList) {
            jComboBoxToLocation.addItem(toLoca);
        }
        for (String airlinerName : airLinerNameList) {
            jComboBoxAirlinerName.addItem(airlinerName);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        goBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        searchJButton = new javax.swing.JButton();
        bookingIdJText = new javax.swing.JTextField();
        jComboBoxFromLocation = new javax.swing.JComboBox<>();
        jComboBoxToLocation = new javax.swing.JComboBox<>();
        jComboBoxAirlinerName = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setText("Search Flight");

        jLabel2.setText("Form Location : ");

        jLabel3.setText("To Location : ");

        jLabel4.setText("Airliner Name :");

        goBtn.setText("Search");
        goBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel5.setText("Reshedule Flight Booking");

        jLabel6.setText("Enter Your Booking ID : ");

        searchJButton.setText("Submit");
        searchJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxAirlinerName, 0, 166, Short.MAX_VALUE)
                            .addComponent(jComboBoxToLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxFromLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(goBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(bookingIdJText, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(searchJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel5)))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxFromLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxToLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxAirlinerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(goBtn)
                .addGap(53, 53, 53)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bookingIdJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(searchJButton)
                .addContainerGap(119, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBtnActionPerformed
        // TODO add your handling code here:
        String airlinerText = jComboBoxAirlinerName.getSelectedItem().toString();
        List<Airplane> flightFleet = new ArrayList<>();
        boolean selectedAirLine = false;
        if (airlinerText.equals("Please choose from Below")) {
            selectedAirLine = true;
        }

        if (jComboBoxFromLocation.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please Select your Source Location");
            return;
        }

        if (jComboBoxToLocation.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Please Select your Destination Location");
            return;
        }

        if (jComboBoxFromLocation.getSelectedItem().toString().equals(jComboBoxToLocation.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Both Source and Destination Locations can't be same");
            return;
        } else {
            for (Airliner airliner : airlineDirectory.getAirlinerList()) {
                for (Airplane airPlane : airliner.getFlightFleet()) {
                    if (jComboBoxFromLocation.getSelectedItem().toString().equalsIgnoreCase(airPlane.getFromLocation()) && jComboBoxToLocation.getSelectedItem().toString().equalsIgnoreCase(airPlane.getToLocation())) {
                        if (selectedAirLine == false) {
                            if (airlinerText.equalsIgnoreCase(airPlane.getAirlinerName())) {
                                flightFleet.add(airPlane);
                            }
                        } else {
                            flightFleet.add(airPlane);
                        }
                    }
                }
            }
            if (!flightFleet.isEmpty()) {
                BookFlightJPanel bookFlightJPanel = new BookFlightJPanel(panelRight, airlineDirectory, flightFleet, customerDirectory);
                CardLayout layout = (CardLayout) panelRight.getLayout();
                panelRight.add("BookFlightJPanel", bookFlightJPanel);
                layout.next(panelRight);
            } else {
                JOptionPane.showMessageDialog(null, "No Flights Available");
            }
        }

    }//GEN-LAST:event_goBtnActionPerformed

    private void searchJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchJButtonActionPerformed
        // TODO add your handling code here:
        if (bookingIdJText.getText().equals(null) || bookingIdJText.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter bookingId to reschedule your flight.");
            return;
        }
        int bookingId = 0;
        int flightId = 0;
        String scheduleDate = "";

        try {
            bookingId = Integer.parseInt(bookingIdJText.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter Valid Booking Id.");
            return;
        }
        Customer cust = null;
        for (Customer customer : customerDirectory.getCustomerList()) {
            if (bookingId == customer.getBookingId()) {
                cust = customer;
                flightId = customer.getFlightId();
                break;
            }
        }
        if (flightId == 0) {
            JOptionPane.showMessageDialog(null, "BookingId you have entered is not available. Please enter valid bookingId.");
            return;
        } else {
            for (Airliner airliner : airlineDirectory.getAirlinerList()) {
                for (Airplane airplane : airliner.getFlightFleet()) {
                    if (flightId == airplane.getFlightId()) {
                        SeatSelectionJPanel seatSelectionJPanel = new SeatSelectionJPanel(panelRight, airlineDirectory, airplane, airliner.getFlightFleet(), customerDirectory);
                        seatSelectionJPanel.rescheduleBooking(cust);
                        CardLayout cardLayout = (CardLayout) this.panelRight.getLayout();
                        panelRight.add("SeatSelectionJPanel", seatSelectionJPanel);
                        cardLayout.next(panelRight);
                        break;
                    }
                }
            }
        }
    }//GEN-LAST:event_searchJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookingIdJText;
    private javax.swing.JButton goBtn;
    private javax.swing.JComboBox<String> jComboBoxAirlinerName;
    private javax.swing.JComboBox<String> jComboBoxFromLocation;
    private javax.swing.JComboBox<String> jComboBoxToLocation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton searchJButton;
    // End of variables declaration//GEN-END:variables

}
