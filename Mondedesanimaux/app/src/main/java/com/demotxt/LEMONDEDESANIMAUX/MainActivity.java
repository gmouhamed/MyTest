package com.demotxt.LEMONDEDESANIMAUX;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.demotxt.LEMONDEDESANIMAUX.Animal;
import com.demotxt.LEMONDEDESANIMAUX.R;
import com.demotxt.LEMONDEDESANIMAUX.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Animal> lstAnimal ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstAnimal = new ArrayList<>();
        lstAnimal.add(new Animal("Singe","sylla","Sylla le plus grand des singes",R.drawable.photo1));
        lstAnimal.add(new Animal("Corivelle","","S",R.drawable.corivelle));
        lstAnimal.add(new Animal("","","Description ",R.drawable.photo3));
        lstAnimal.add(new Animal("Hyéne","","Description",R.drawable.photo4));
        lstAnimal.add(new Animal("","","Description ",R.drawable.photo5));
        lstAnimal.add(new Animal("Coucal noir","Coucal noir","S",R.drawable.coucal_noir));
        lstAnimal.add(new Animal("Euplecte_franciscain","Euplecte_franciscain","Description ",R.drawable.euplecte_franciscain));
        lstAnimal.add(new Animal("Euplecte_vorabe","Categorie","Description",R.drawable.euplecte_vorabe));
        lstAnimal.add(new Animal("Gazelle_dama","Categorie","Description ",R.drawable.gazelle_dama));
        lstAnimal.add(new Animal("Girafe","Girafe","La girafe ou 'Ndiambala'au Senegal est un genre de mammifères africains d'ongulés à doigts égaux, les plus hauts animaux terrestres vivants et les plus grands ruminants. \n" +
                "Afficher la description d'origine\n" +
                "Nom scientifique : Giraffa\n" +
                "Taille : Girafe: 4,6 m 6,1 m\n" +
                "Période de gestation : Girafe: 15 mois \n" +
                "Poids : Girafe: 800 kg \n" +
                "Vitesse : 60 km/h \n" +
                "Sommeil quotidien : 4,6 heures ",R.drawable.giraf));
        lstAnimal.add(new Animal("","","Description ",R.drawable.pithji_ramatou));
        lstAnimal.add(new Animal("","","Description ",R.drawable.sans_titre));
        lstAnimal.add(new Animal("Souimanga_a_poitrine_rouge","","Description ",R.drawable.souimanga_a_poitrine_rouge));
        lstAnimal.add(new Animal("Souimanga_a_ventre_olive","","S",R.drawable.souimanga_a_ventre_olive));
        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstAnimal);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}
