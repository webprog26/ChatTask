package com.example.webprog26.firebase2;

import java.util.Date;

/**
 * Created by webprog26 on 02.12.2016.
 */

public class ChatMessage {

    private String mMessageText;
    private String mMessageUser;
    private long mMessageTime;

    public ChatMessage(String mMessageText, String mMessageUser) {
        this.mMessageText = mMessageText;
        this.mMessageUser = mMessageUser;
        this.mMessageTime = new Date().getTime();
    }

    public ChatMessage() {
    }

    public String getMessageText() {
        return mMessageText;
    }

    public void setMessageText(String messageText) {
        this.mMessageText = messageText;
    }

    public String getMessageUser() {
        return mMessageUser;
    }

    public void setMessageUser(String messageUser) {
        this.mMessageUser = messageUser;
    }

    public long getMessageTime() {
        return mMessageTime;
    }

    public void setMessageTime(long messageTime) {
        this.mMessageTime = messageTime;
    }
}
