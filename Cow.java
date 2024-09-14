public class Cow {
    private String cowId;
    private String farmId;
    private String color;

    public Cow(String cowId, String farmId, String color) {
        this.cowId = cowId;
        this.farmId = farmId;
        this.color = color;
    }

    public String getCowId() {
        return cowId;
    }

    public String getFarmId() {
        return farmId;
    }

    public String getColor() {
        return color;
    }
    
}
