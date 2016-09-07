package com.google.firebase.quickstart.database.viewholder;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.quickstart.database.R;
import com.google.firebase.quickstart.database.models.User;

public class UserViewHolder extends RecyclerView.ViewHolder {

    public TextView userName, user_online;
    ImageView imageView;

    public UserViewHolder(View itemView) {
        super(itemView);
        userName = (TextView) itemView.findViewById(R.id.post_author);
        user_online = (TextView) itemView.findViewById(R.id.user_online);
        imageView = (ImageView) itemView.findViewById(R.id.post_author_photo);
    }

    public void bindToPost(User user) {
        userName.setText(user.username);
        imageView.setVisibility(View.VISIBLE);
        user_online.setVisibility(View.VISIBLE);
        if (user.connections)
            user_online.setBackgroundColor(Color.parseColor("#08FF00"));
        else
            user_online.setBackgroundColor(Color.parseColor("#ff0000"));
    }
}
