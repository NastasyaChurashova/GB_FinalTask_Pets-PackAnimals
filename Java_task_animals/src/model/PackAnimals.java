package src.model;

public class PackAnimals extends Animals {
    private String workType;

    private static int PackAnimalsCount = 0;

    public PackAnimals() {
        super();
        PackAnimalsCount++;
    }

    public static int getPackAnimalsCount() {
        return PackAnimalsCount;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }
}
