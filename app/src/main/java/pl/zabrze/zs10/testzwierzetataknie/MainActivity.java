package pl.zabrze.zs10.testzwierzetataknie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewZwierze;
    private TextView textViewTrescPytania;
    private Button buttonTak;
    private Button buttonNie;
    private Button buttonCzit;
    private Button buttonDalej;
    private int aktualne;
    private int punkty;

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("PUNKTY",punkty);
        outState.putInt("NRPYTANIA",aktualne);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO wypełnić widok treścią i zdjęciem pytania
        imageViewZwierze = findViewById(R.id.imageView);
        textViewTrescPytania = findViewById(R.id.textView);
        if(savedInstanceState == null) {
            aktualne = 0;
            punkty = 0;
        }
        else{
            aktualne = savedInstanceState.getInt("NRPYTANIA");
            punkty = savedInstanceState.getInt("PUNKTY");
        }
        wypelnijPytaniem(aktualne);



        //TODO Obsłużyć przycisk następne pytanie
        buttonDalej = findViewById(R.id.button4);
       buttonDalej.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       aktualne++;
                       if(aktualne<RepozytoriumPytan.podajPytania().size())
                            wypelnijPytaniem(aktualne);
                       else {
                           buttonDalej.setVisibility(View.INVISIBLE);
                           textViewTrescPytania.setText(String.format("Zakończono test z wynikiem %d punkty",punkty));
                       }
                   }
               }
       );
        //TODO Podliczyć punkty
//TODO zabezpieczyć przed wieloktrotnym klikaniem tak nie
        buttonTak = findViewById(R.id.button);
        buttonTak.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sprawdzOdpowiedz(true);
                    }
                }
        );

        buttonNie = findViewById(R.id.button2);
        buttonNie.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        sprawdzOdpowiedz(false);
                    }
                }
        );

    }

    private void sprawdzOdpowiedz(boolean odp){
        Pytanie aktualnePytanie = RepozytoriumPytan.podajPytania().get(aktualne);
        if(aktualnePytanie.isOdpowiedz() == odp){
            aktualnePytanie.setCzyUdzielonoPoprawnejOdpowiedzi(true);
            punkty++;
        }
    }



    private void wypelnijPytaniem(int indeks){
        Pytanie aktualnePytanie = RepozytoriumPytan.podajPytania().get(indeks);
        textViewTrescPytania.setText(aktualnePytanie.getTrescPytania());
        imageViewZwierze.setImageResource(aktualnePytanie.getIdObrazu());
    }
}