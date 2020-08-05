package model;

public class ComparsionResult {
    private String firstObjectId;
    private int secondObjectId;
    private String comparsionMessage;

    public String getFirstObjectId() {
        return firstObjectId;
    }

    public void setFirstObjectId(String firstObjectId) {
        this.firstObjectId = firstObjectId;
    }

    public int getSecondObjectId() {
        return secondObjectId;
    }

    public void setSecondObjectId(int secondObjectId) {
        this.secondObjectId = secondObjectId;
    }

    public String getComparsionMessage() {
        return comparsionMessage;
    }

    public void setComparsionMessage(String comparsionMessage) {
        this.comparsionMessage = comparsionMessage;
    }
}
