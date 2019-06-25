/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emilly
 */
public class Pessoa {
   private String nome;
   private int idade;
   
   public Pessoa (String n, int id)throws IdadeInvalidaException{
    setNome(n);
    setIdade(id);
   }
   public void setNome(String n){
       this.nome=n;
       
   }
     public void setIdade(int id)throws IdadeInvalidaException{
         this.idade=id;
         if(idade<=0){
             throw new IdadeInvalidaException("IdadeInvalida");
     }
     }
    public String getNome(){
        return this.nome ;
    }
    public int getidade(){
        return this.idade;
    }
}


        


