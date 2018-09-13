/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arma;

import java.util.Set;


public class Gun {
    //Atributos das armas
    private String nome;
    private int precisao;
    private int recoil;
    private int sound;
    private int alcance;
    private int dano;
    private int capacidade;
    private float peso;
    //Acessórios
    private Set compatibilidade;
    private Sight mira;
    private Magazine pente;
    private ButtStock buttstock;
    private Barrel cano;

    public String getNome() {
        return nome;
    }

    public int getPrecisao() {
        return precisao;
    }

    public int getRecoil() {
        return recoil;
    }

    public int getSound() {
        return sound;
    }

    public int getAlcance() {
        return alcance;
    }

    public int getDano() {
        return dano;
    }

    public int getCapacidade() {
        if(this.pente != null){
            //return this.capacidade+this.pente.getCapacidade();
        }
        return capacidade;
    }

    public float getPeso() {
        return peso;
    }

    public Set getCompatibilidade() {
        return compatibilidade;
    }
    
    public boolean acceptsMira(Sight m){
        return this.compatibilidade.contains(m);
    }
    
    public void setMira(Sight m){
        this.mira = m;
    }
      
}
