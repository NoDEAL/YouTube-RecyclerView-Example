package nodeal.example.you_tube_recyclerview.ui;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import nodeal.example.you_tube_recyclerview.R;

public class YouTubeViewHolder extends RecyclerView.ViewHolder {
    YouTubePlayerView youTubePlayerView;

    public YouTubeViewHolder(@NonNull View itemView) {
        super(itemView);

        youTubePlayerView = itemView.findViewById(R.id.card_content_player_view);
    }
}
