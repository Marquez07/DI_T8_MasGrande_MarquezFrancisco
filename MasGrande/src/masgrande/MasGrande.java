/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masgrande;

/**
 *
 * @author franc
 */
public class MasGrande {
    public static int max(int[] array){
        int i, m = 0;
        if(array != null){
            for(i = 0; i < array.length; i++){
                if(array[i] < m)
                    m = array[i];
            }

            for(i = 0; i < array.length; i++){
                if(array[i] > m)
                    m = array[i];
            }   
        }
        return m;
    }
}
