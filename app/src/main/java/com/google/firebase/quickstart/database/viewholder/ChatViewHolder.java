package com.google.firebase.quickstart.database.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.firebase.quickstart.database.R;
import com.google.firebase.quickstart.database.models.Chat;

public class ChatViewHolder extends RecyclerView.ViewHolder {


    private RelativeLayout mRlToView, mRlfromView;
    private TextView mComment_authorTo, mComment_bodyTo;
    private TextView mComment_authorFrom, mComment_bodyFrom;

    public ChatViewHolder(View itemView) {
        super(itemView);
        mRlToView = (RelativeLayout) itemView.findViewById(R.id.rlToView);
        mComment_authorTo = (TextView) itemView.findViewById(R.id.comment_authorTo);
        mComment_bodyTo = (TextView) itemView.findViewById(R.id.comment_bodyTo);
        mRlfromView = (RelativeLayout) itemView.findViewById(R.id.rlfromView);
        mComment_authorFrom = (TextView) itemView.findViewById(R.id.comment_authorFrom);
        mComment_bodyFrom = (TextView) itemView.findViewById(R.id.comment_bodyFrom);
    }

    public void bindToPost(Chat chat, boolean isSendingUser) {
        if (!isSendingUser) {
            mRlfromView.setVisibility(View.VISIBLE);
            mRlToView.setVisibility(View.GONE);
            mComment_authorFrom.setText(chat.user);
            mComment_bodyFrom.setText(chat.message);
        } else {
            mRlfromView.setVisibility(View.GONE);
            mRlToView.setVisibility(View.VISIBLE);
            mComment_authorTo.setText(chat.user);
            mComment_bodyTo.setText(chat.message);
        }
    }
}
