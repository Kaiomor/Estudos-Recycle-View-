package aulas.android.digitalhouse.com.recycleviewexemplo.model;

import android.widget.ImageView;


/*Classe Model

Usada Para modelar a classe do objeto que sera renderizado no RecycleView
A classe model " Android " contém como atributos os dados que serão preenchidos no componente do Card View
 */


public class Android {
    private String nome;
    private String texto;


    public Android(String nome, String texto) {

        this.nome = nome;
        this.texto = texto;
    }

        public String getNome() {
        return nome;
    }

        public void setNome(String nome) {
        this.nome = nome;
    }

        public String getTexto() {
        return texto;
    }

        public void setTexto(String texto) {
        this.texto = texto;
    }
}


