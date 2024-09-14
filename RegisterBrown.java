package viewCow;

import javax.swing.*;

public class RegisterBrown extends JFrame {
    private CowController controller;

    public RegisterBrown(CowController controller) {
        this.controller = controller;

        setTitle("Register Brown Cow");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.add(new JLabel("Cow ID:"));
        JTextField cowIdField = new JTextField(8);
        panel.add(cowIdField);

        panel.add(new JLabel("Farm ID:"));
        JTextField farmIdField = new JTextField(1);
        panel.add(farmIdField);

        panel.add(new JLabel("Mother ID:"));
        JTextField motherIdField = new JTextField(8);
        panel.add(motherIdField);

        JButton submitButton = new JButton("Register");
        submitButton.addActionListener(e -> {
            String cowId = cowIdField.getText();
            String farmId = farmIdField.getText();
            String motherId = motherIdField.getText();

            if (controller.validateCowId(cowId) && controller.validateFarmId(farmId)
                && controller.validateMotherId(motherId)) {
                controller.registerCow(cowId, farmId, "Brown");
                JOptionPane.showMessageDialog(null, "Brown cow registered successfully!");
                dispose(); 
            }
        });

        panel.add(submitButton);

        add(panel);
    }
}
