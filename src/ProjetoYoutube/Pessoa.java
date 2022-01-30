/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoYoutube;

/**
 *
 * @author Usuario
 */
public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float esperiencia;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.esperiencia=0;
    }
    
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getEsperiencia() {
        return esperiencia;
    }

    public void setEsperiencia(float esperiencia) {
        this.esperiencia = esperiencia;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + 
                ", idade=" + idade + 
                ", sexo=" + sexo + 
                ", esperiencia=" + esperiencia + '}';
    }
    
    
    
    
    
}
