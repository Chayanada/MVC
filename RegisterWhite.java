package viewCow;

import javax.swing.*;

public class RegisterWhite extends JFrame {
    private CowController controller;

    public RegisterWhite(CowController controller) {
        this.controller = controller;

        setTitle("Register White Cow");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.add(new JLabel("Cow ID:"));
        JTextField cowIdField = new JTextField(8);
        panel.add(cowIdField);

        panel.add(new JLabel("Farm ID:"));
        JTextField farmIdField = new JTextField(1);
        panel.add(farmIdField);

        panel.add(new JLabel("Age (years):"));
        JTextField yearField = new JTextField(2);
        panel.add(yearField);

        panel.add(new JLabel("Age (months):"));
        JTextField monthField = new JTextField(2);
        panel.add(monthField);

        JButton submitButton = new JButton("Register");
        submitButton.addActionListener(e -> {
            String cowId = cowIdField.getText();
            String farmId = farmIdField.getText();
            int years = Integer.parseInt(yearField.getText());
            int months = Integer.parseInt(monthField.getText());

            if (controller.validateCowId(cowId) && controller.validateFarmId(farmId)
                && controller.validateWhiteCowAge(years, months)) {
                controller.registerCow(cowId, farmId, "White");
                JOptionPane.showMessageDialog(null, "White cow registered successfully!");
                dispose(); 
            }
        });

        panel.add(submitButton);

        add(panel);
    }
}
