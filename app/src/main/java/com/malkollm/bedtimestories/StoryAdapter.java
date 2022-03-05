package com.malkollm.bedtimestories;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class StoryAdapter extends FirebaseRecyclerAdapter<StoryModel, StoryAdapter.myViewHolder> {

    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public StoryAdapter(@NonNull FirebaseRecyclerOptions<StoryModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewHolder holder, int position, @NonNull StoryModel model) {
        holder.title.setText(model.getTitle());
        holder.description.setText(model.getDescription());
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_stories, parent, false);
        return new myViewHolder(view);
    }

    static class myViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView title, description;

        public myViewHolder(@NonNull View itemView){
            super(itemView);

            img = itemView.findViewById(R.id.iv_story);
            title = itemView.findViewById(R.id.tvTitleStory);
            description = itemView.findViewById(R.id.tvDescStory);
        }
    }
}
