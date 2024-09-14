import java.util.ArrayList;
import java.util.List;

public class Farm {
    private String farmId;
    private List<Cow> cows;
    private String allowedColor; 

    public Farm(String farmId) {
        this.farmId = farmId;
        this.cows = new ArrayList<>();
        this.allowedColor = null; 
    }

    public String getAllowedColor() {
        return allowedColor;
    }

    public boolean canAcceptCow(String color) {
        return allowedColor == null || allowedColor.equals(color);
    }

    public void addCow(Cow cow) {
        if (canAcceptCow(cow.getColor())) {
            cows.add(cow);
            allowedColor = cow.getColor(); 
        } else {
            throw new IllegalArgumentException("Cannot add cow of color: " + cow.getColor());
        }
    }

    public int getCowCount() {
        return cows.size();
    }

    public String getFarmId() {
        return farmId;
    }
    
}
