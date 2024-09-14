import javax.swing.*;

public class CowController {
    private Farm farm;

    public CowController(Farm farm) {
        this.farm = farm;
    }

    public boolean registerCow(String cowId, String farmId, String color) {
        if (!farm.canAcceptCow(color)) {
            JOptionPane.showMessageDialog(null, "This farm can only accept cows of color: " + farm.getAllowedColor());
            return false;
        }

        Cow newCow = new Cow(cowId, farmId, color);
        farm.addCow(newCow);
        JOptionPane.showMessageDialog(null, "Cow registered successfully! Farm now has " +
            farm.getCowCount() + " cows of color " + farm.getAllowedColor());
        return true;
    }

    public boolean validateCowId(String cowId) {
        if (cowId.length() != 8 || cowId.charAt(0) == '0') {
            JOptionPane.showMessageDialog(null, "Invalid Cow ID.");
            return false;
        }
        return true;
    }

    public boolean validateFarmId(String farmId) {
        if (farmId.length() != 1 || farmId.equals("0")) {
            JOptionPane.showMessageDialog(null, "Invalid Farm ID.");
            return false;
        }
        return true;
    }

    public boolean validateWhiteCowAge(int years, int months) {
        if (years < 0 || years > 10 || months < 0 || months > 11) {
            JOptionPane.showMessageDialog(null, "Invalid age.");
            return false;
        }
        return true;
    }

    public boolean validatePinkCowOwner(String firstName, String lastName) {
        if (firstName.length() > 8 || !firstName.matches("[a-z]+") ||
            lastName.length() > 8 || !lastName.matches("[a-z]+")) {
            JOptionPane.showMessageDialog(null, "Invalid owner name.");
            return false;
        }
        return true;
    }

    public boolean validateMotherId(String motherId) {
        return validateCowId(motherId); 
    }
    
}
