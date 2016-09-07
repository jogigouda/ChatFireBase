package com.google.firebase.quickstart.database.models;

import com.google.firebase.database.IgnoreExtraProperties;

// [START comment_class]
@IgnoreExtraProperties
public class LocationTrack {

    public String uid;
    public double timeStamp, latitude, longitude;

    public LocationTrack() {
        // Default constructor required for calls to DataSnapshot.getValue(Comment.class)
    }

    public LocationTrack(double latitude, double longitude, double timeStamp, String uid) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.timeStamp = timeStamp;
        this.uid = uid;
    }
}
// [END comment_class]
