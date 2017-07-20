package io.github.aantoine.testavatarbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private static final BusAvatar[] BUS_AVATARS = {
            new BusAvatar(R.drawable.bus_base_body, R.drawable.bus_base_color),
            new BusAvatar(R.drawable.bus_activo_base_body, R.drawable.bus_activo_base_color),
            new BusAvatar(R.drawable.bus_bala_body, R.drawable.bus_bala_color),
            new BusAvatar(R.drawable.bus_combi_body, R.drawable.bus_combi_color),
            new BusAvatar(R.drawable.bus_nave_body, R.drawable.bus_nave_color),
            new BusAvatar(R.drawable.bus_ovni_body, R.drawable.bus_ovni_color),
            new BusAvatar(R.drawable.bus_tanque_body, R.drawable.bus_tanque_color),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.bus_picker_recycler_view);

        BusAvatarRowAdapter adapter = new BusAvatarRowAdapter(BUS_AVATARS, this);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));

        recyclerView.setAdapter(adapter);
    }
}
