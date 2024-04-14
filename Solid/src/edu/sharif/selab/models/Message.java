package edu.sharif.selab.models;

public class Message {
    String content;
    private String sourcePhoneNumber;
    private String targetPhoneNumber;

    public String getSource() {
        return sourcePhoneNumber;
    }

    public void setSource(String sourcePhoneNumber) {
        this.sourcePhoneNumber = sourcePhoneNumber;
    }

    public String getTarget() {
        return targetPhoneNumber;
    }

    public void setTarget(String targetPhoneNumber) {
        this.targetPhoneNumber = targetPhoneNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
