/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mikel-PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
    
    public void onclick(){
        System.out.println("Commit #2");
    }
    
    public void onCheck(){
        System.out.println("Commit #3");
    }
    
    public void datos(){
        int datos = 0;
        if (datos == 0) {
            System.out.println("Los datos no han sido alterados");
        } else {
            System.out.println("Los datos fueron alterados!!");
        }
    }
    
}
