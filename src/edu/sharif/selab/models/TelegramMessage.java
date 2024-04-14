package edu.sharif.selab.models;

public class TelegramMessage {
    private String sourceTelegramID;
    private String targetTelegramID;

    public String getSourcePhoneNumber() {
        return sourceTelegramID;
    }

    public void setSourcePhoneNumber(String sourceTelegramID) {
        this.sourceTelegramID = sourceTelegramID;
    }

    public String getTargetPhoneNumber() {
        return targetTelegramID;
    }

    public void setTargetPhoneNumber(String targetTelegramID) {
        this.targetTelegramID = targetTelegramID;
    }    
}
