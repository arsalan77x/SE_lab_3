package edu.sharif.selab.models;

public class TelegramMessage extends Message{
    private String sourceTelegramID;
    private String targetTelegramID;

    public String getSourceTelegramID() {
        return sourceTelegramID;
    }

    public void setSourceTelegramID(String sourceTelegramID) {
        this.sourceTelegramID = sourceTelegramID;
    }

    public String getTargetTelegramID() {
        return targetTelegramID;
    }

    public void setTargetTelegramID(String targetTelegramID) {
        this.targetTelegramID = targetTelegramID;
    }    
}
