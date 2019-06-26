package com.example.unoscorecounter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder> {

    ArrayList<PlayerItem> players_list = new ArrayList<>();

    public static class PlayerViewHolder extends RecyclerView.ViewHolder {

        public TextView first_name, last_name;

        public PlayerViewHolder(@NonNull View itemView) {
            super(itemView);
            first_name = itemView.findViewById(R.id.textView_playerFname);
            last_name = itemView.findViewById(R.id.textView_playerLname);
        }
    }

    public PlayerAdapter(ArrayList<PlayerItem> players){
        players_list = players;
    }

    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.player_layout, viewGroup, false);
        PlayerViewHolder playerViewHolder = new PlayerViewHolder(v);
        return playerViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder playerViewHolder, int i) {
        PlayerItem currentPlayer = players_list.get(i);
        playerViewHolder.first_name.setText(currentPlayer.getFname());
        playerViewHolder.last_name.setText(currentPlayer.getLname());
    }

    @Override
    public int getItemCount() {
        return players_list.size();
    }


}
