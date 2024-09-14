package viewCow;

import javax.swing.*;

public class RegisterPink extends JFrame {
    private CowController controller;

    public RegisterPink(CowController controller) {
        this.controller = controller;

        setTitle("Register Pink Cow");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.add(new JLabel("Cow ID:"));
        JTextField cowIdField = new JTextField(8);
        panel.add(cowIdField);

        panel.add(new JLabel("Farm ID:"));
        JTextField farmIdField = new JTextField(1);
        panel.add(farmIdField);

        panel.add(new JLabel("Owner First Name:"));
        JTextField firstNameField = new JTextField(8);
        panel.add(firstNameField);

        panel.add(new JLabel("Owner Last Name:"));
        JTextField lastNameField = new JTextField(8);
        panel.add(lastNameField);

        JButton submitButton = new JButton("Register");
        submitButton.addActionListener(e -> {
            String cowId = cowIdField.getText();
            String farmId = farmIdField.getText();
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();

            if (controller.validateCowId(cowId) && controller.validateFarmId(farmId)
                && controller.validatePinkCowOwner(firstName, lastName)) {
                controller.registerCow(cowId, farmId, "Pink");
                JOptionPane.showMessageDialog(null, "Pink cow registered successfully!");
                dispose(); // Close the form
            }
        });

        panel.add(submitButton);

        add(panel);
    }
}
