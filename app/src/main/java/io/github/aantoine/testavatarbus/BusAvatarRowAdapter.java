package io.github.aantoine.testavatarbus;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Agustin on 20/7/2017.
 */

public class BusAvatarRowAdapter extends
        RecyclerView.Adapter<BusAvatarRowAdapter.ViewHolder> {

    private final Context context;
    private ArrayList<BusAvatar> items = new ArrayList<>();
    private BusAvatarRowAdapter.ViewHolder selectedHolder;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView busBodyView;
        ImageView busColorView;
        View row;

        ViewHolder(View view) {
            super(view);
            busBodyView = (ImageView) itemView.findViewById(R.id.bus_body);
            busColorView = (ImageView) itemView.findViewById(R.id.bus_color);
            row = itemView;
        }
    }

    public BusAvatarRowAdapter(BusAvatar[] avatars, Context context) {
        this.context = context;
        Collections.addAll(items, avatars);
    }

    @Override
    public BusAvatarRowAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.row_avatar_bus_picker, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        final BusAvatar avatar = items.get(position);

        holder.busBodyView.setImageDrawable(ContextCompat.getDrawable(context, avatar.bodyId));
        holder.busColorView.setImageDrawable(ContextCompat.getDrawable(context, avatar.colorId));

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
