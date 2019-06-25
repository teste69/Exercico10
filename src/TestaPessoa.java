/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emilly
 */
public class TestaPessoa {
    public static void main(String[]args){
        try{
        Pessoa p = new Pessoa("Rodrigo",-38);
    }
        catch (IdadeInvalidaException x){
                System.out.println(x.getMessage());
                }
    }
    
}
