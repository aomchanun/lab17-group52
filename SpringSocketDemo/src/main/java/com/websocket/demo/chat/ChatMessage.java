package com.websocket.demo.chat;


import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    private int onlineUser;
    private static int count;

    public static int getAddUserCount(){
        return ++count;
    }

    public static int getRemoveUserCount(){
        return --count;
    }

    public void setOnlineUser(int count){
        onlineUser = count;
    }


}
