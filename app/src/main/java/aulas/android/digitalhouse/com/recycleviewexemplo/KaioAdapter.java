package aulas.android.digitalhouse.com.recycleviewexemplo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import aulas.android.digitalhouse.com.recycleviewexemplo.model.Android;




public class KaioAdapter extends RecyclerView.Adapter<KaioAdapter.ViewHolder> {

// Criando a lista de objeto do tipo Android (Classe Model)//
    List<Android>lista;



    // metodo construtor do Adapter, que envocado quando o adapter for instanciado na classe Blank Fragment//
    public KaioAdapter(List<Android>lista){

        // no momento que o adapter for inicializado, ira passar uma lista do objeto (Android)
        this.lista = lista;

    }
// Metodo que Cria o ViewHolder, onde infla o XML item, que esta sendo exibido no RecycleView//
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // inflando o layout
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        // inflando o
        return new ViewHolder(inflater.inflate(R.layout.item, parent, false));
    }

    //Metodo que será responsável por inserir os dados do RecycleVierw "Metodo que Recicla" //
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Android androidB = lista.get(position);
        holder.bind(androidB.getNome(),androidB.getTexto());
    }

    // metodo que retorna o tamanho da lista //
    @Override
    public int getItemCount() {
        return lista.size();
    }

    // Metodo responsável por inserir os dados no componente do visual do RecycleView//
    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView nome;
        TextView texto;


        // metodo construtor do ViewHolder//
        // ViewHolder é responsavél por manipular os dados apresentados no recycleView.//
        //veja como o ViewHolder é que faz o " findviewById." e não a Activiy que exibirá os dados //
        public ViewHolder(View itemView) {
            super(itemView);

            nome = (TextView)itemView.findViewById(R.id.nomeAndroid);
            texto = (TextView) itemView.findViewById(R.id.text);


        }

        //Metodo bind do ViewHolder, não do Adapter. Esse metodo é usado no Bind do Adapter//
        public void bind(String nome,String texto){

            this.nome.setText(nome);
            this.texto.setText(texto);
        }
    }
}
