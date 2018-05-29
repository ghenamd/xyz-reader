package com.example.xyzreader.ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xyzreader.R;

public class BodyTextViewAdapter extends RecyclerView.Adapter<BodyTextViewAdapter.ViewHolder> {

    private String[] bodyText;

    public BodyTextViewAdapter(String[] bodyText) {
        this.bodyText = bodyText;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.body_text_item_sample,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        for (String textPart : bodyText) {
            holder.bodyPart.setText(textPart);
        }
    }

    @Override
    public int getItemCount() {
        return bodyText.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView bodyPart;
        public ViewHolder(View itemView) {
            super(itemView);
            bodyPart = itemView.findViewById(R.id.article_body);
        }
    }
}
