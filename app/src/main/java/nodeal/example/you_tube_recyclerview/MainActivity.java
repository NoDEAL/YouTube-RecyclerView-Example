package nodeal.example.you_tube_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import nodeal.example.you_tube_recyclerview.ui.YouTubeAdapter;
import nodeal.example.you_tube_recyclerview.ui.YouTubeContent;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<YouTubeContent> contents = new ArrayList<>();
        // 로꼬(Loco) - Party Band + OPPA
        contents.add(new YouTubeContent("ieZ_qkyhLwU"));
        // 헤이즈(Heize) - And July (Feat. DEAN, DJ Friz) MV
        contents.add(new YouTubeContent("rCeM57e2BfU"));

        RecyclerView recyclerView = findViewById(R.id.main_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(new YouTubeAdapter(contents));
    }
}
