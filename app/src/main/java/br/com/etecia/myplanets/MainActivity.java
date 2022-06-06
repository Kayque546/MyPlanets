package br.com.etecia.myplanets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Declarando os componentes
    ListView listaPlanetas;

    //Criando os vetores com os dados para lista
    String nomePlaneta[] = {"Jupiter", "Lua", "Marte", "Mercurio", "Netuno",
                            "Plutão", "Saturno", "Sol", "Terra", "Urano", "Venus"};
    int ImagemPlanetas[] = {R.drawable.jupiter, R.drawable.lua, R.drawable.marte, R.drawable.mercurio,
                            R.drawable.netuno, R.drawable.plutao, R.drawable.saturno, R.drawable.sol,
                            R.drawable.terra, R.drawable.urano, R.drawable.venus};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPlanetas = findViewById(R.id.idListaPlaneta);

        MyAdapter adapter = new MyAdapter();

        listaPlanetas.setAdapter(adapter);
    }

    //Criando a classe interna
    public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }

}