package pl.zabrze.zs10.testzwierzetataknie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PodpowiedzActivity extends AppCompatActivity {
    private TextView textViewPodpowiedz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podpowiedz);
        int ktorePytanie = getIntent().getIntExtra("NR",0);
        textViewPodpowiedz = findViewById(R.id.textView3);
        textViewPodpowiedz.setText(RepozytoriumPytan.podajPytania().get(ktorePytanie).getPodpowiedz());
    }
}