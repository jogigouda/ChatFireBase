package com.google.firebase.quickstart.database.models;

import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jogi on 8/2/2016.
 */
@IgnoreExtraProperties
public class Chat {
    public String message,user;
    public boolean isSent;

    public Chat() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Chat(String message,String user, boolean isSent) {
        this.message = message;
        this.isSent = isSent;
        this.user=user;
    }


    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("message", message);
        result.put("isSent", isSent);
        result.put("user", user);
        return result;
    }
}
