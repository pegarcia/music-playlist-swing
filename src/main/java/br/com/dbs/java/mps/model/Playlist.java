
package br.com.dbs.java.mps.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Playlist {
   private String nome;
   private Integer qteExecucoes;
   private Date dtUltExec;
   private Date dtCriacao;
   private Integer duracaoTotal;
   private final List<Musica> musicas = new ArrayList<>();

    
    public void adicionaMusica(Musica musica){
        musicas.add(musica);
    }
   
    public List<Musica> getMusicas() {
        return musicas;
    } 
   
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public Integer getQteExecucoes() {
        return qteExecucoes;
    }

    
    public Date getDtUltExec() {
        return dtUltExec;
    }

   
    public Date getDtCriacao() {
        return dtCriacao;
    }

    
    public Integer getDuracaoTotal() {
        return duracaoTotal;
    }

}
