package pl.zabrze.zs10.testzwierzetataknie;

import java.util.ArrayList;

public class RepozytoriumPytan {
    public static ArrayList<Pytanie> podajPytania(){
        ArrayList<Pytanie> pytania = new ArrayList<>();
        pytania.add(new Pytanie("Czy żyrafa jest symbolem siły",
                false,
                R.drawable.zyrafa,
                "Słowo„żyrafy” symbolizuje szczerość, umiejętność słuchania, rozumienie punktu widzenia innych. Słowo„żyrafy” symbolizuje szczerość, umiejętność słuchania, rozumienie punktu widzenia innych. Słowo„żyrafy” symbolizuje szczerość, umiejętność słuchania, rozumienie punktu widzenia innych. Słowo„żyrafy” symbolizuje szczerość, umiejętność słuchania, rozumienie punktu widzenia innych. Słowo„żyrafy” symbolizuje szczerość, umiejętność słuchania, rozumienie punktu widzenia innych. Słowo„żyrafy” symbolizuje szczerość, umiejętność słuchania, rozumienie punktu widzenia innych."));
        pytania.add(new Pytanie("Czy niedawno odkrytym zwierzęciem jest okapi",
                true,
                R.drawable.okapi,
                "Zwierzę zostało odkryte przez Europejczyków dopiero w 1900 roku i po raz pierwszy opisane naukowo w 1901 roku przez angielskiego zoologa Philipa Sclater."
                ));
        pytania.add(new Pytanie("Czy słonie są zwięrzętami drapieżnymi",
                false,
                R.drawable.slon,
                "Słonie są wyłącznie roślinożerne. Pożerają różnego rodzaju trawy, liście, mniejsze gałęzie i konary oraz owoce. Nieliczne zęby, jakie posiadają słonie, wykorzystywane są do rozdrabniania pożywienia. Słonie najczęściej umierają śmiercią głodową w 70. roku życia z powodu straty wszystkich zębów. Uniemożliwia im to dalsze pobieranie pokarmu."
                ));

        return pytania;
    }
}
