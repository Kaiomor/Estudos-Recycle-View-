package aulas.android.digitalhouse.com.recycleviewexemplo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import aulas.android.digitalhouse.com.recycleviewexemplo.model.Android;


public class BlankFragment extends Fragment {

    // Criamos a lista de objetos Android para passarmos para o Adaptor e Exibir no RecycleView dentro da fragment.
    List<Android> list;
    public BlankFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Criamos uma View para Inflar O Fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        //Criamos os Objetos Android para Exibir na lista
        Android a1 = new Android("Android 4.0 - Ice Cream Sandwich", "O SDK para Android 4.0.1 (Ice Cream Sandwich), baseado no kernel Linux 3.0.1, foi lançado publicamente em 19 de outubro de 2011. Gabe Cohen, da Google, declarou que o Android 4.0 era teoricamente compatível com qualquer dispositivo Android 2.3.x em produção na época. O código fonte para o Android 4.0 tornou-se disponível em 14 de novembro de 2011. A atualização introduziu vários novos recursos");
        Android a2 = new Android("Android 4.4 - KitKat", "Após recente acordo com a Nestlé, o novo sistema Android leva o nome de um dos doces mais famosos da marca. Esse acordo prevê ainda campanhas de marketing em conjunto, com vale-brindes de aparelhos Nexus 4 Nexus 5 e de conteúdo na Play Store.");
        Android a3 = new Android("Android 5.0/5.1 - Lollipop", "O Android 5.0 Lollipop foi anunciado em Julho e lançado oficialmente em 3 de novembro de 2014 pela Google. No dia 9 de março de 2015 foi lançada a versão 5.1.\n" + "O Lollipop traz diversas novidades e uma nova política visual, intitulada de Material Design.");
        Android a4 = new Android("Android 6.0 - Marshmallow","Android 6.0 \"Marshmallow\" foi anunciado com o codinome \"Android M\" durante a Google I/O em 28 de maio de 2015, para os smartphones Nexus 5 e Nexus 6, o tablet Nexus 9 e o set-top box Nexus Player com o número de compilação MPZ44Q. A terceira prévia de desenvolvedor (MPA44G) foi lançada em 17 de agosto de 2015 para os dispositivos Nexus 5, Nexus 6, Nexus 9 e Nexus Player e foi atualizada para a versão MPA44I que trouxe correções relatadas para os perfis do Android for Work.");
        Android a5 = new Android("Android 7.0/7.1 - Nougat", "O Android 7.0 \"Nougat\" , com o codinome \"Android N\" foi lançado oficialmente em 2016, no dia 22 de agosto. Até agora, na lista, poucos vão receber o Android N, comparando com o Marshmallow.");

        //inicializamos a lista
        list = new ArrayList<>();
        //Adicionamos os objetos na lista
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);
        list.add(a5);

        //Cria  e linka o componente do Recycle view com o xml
        RecyclerView recyclerView = v.findViewById(R.id.recyclerView);
        //Seta o "LayoutManager" que pode Ser "GridLayoutManager" ou "LinearLayout"//
        recyclerView.setLayoutManager(new GridLayoutManager(v.getContext(),2));
        //Seta o Adapter no RecycleView
        recyclerView.setAdapter(new KaioAdapter(list));


        return v;
    }


}

