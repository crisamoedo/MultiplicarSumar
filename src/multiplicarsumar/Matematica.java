/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiplicarsumar;

/**
 *
 * @author a21cristinaaf
 */
public class Matematica {
    
    private int num;

    public Matematica() {
    }

    
    public Matematica(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Matematica{" + "num=" + num + '}';
    }
    
    public void sumar(int num1, int num2){
        int resultado= num1+num2;
        
    }
    
    public void multiplicar(int multiplicacion){
        for (int i = 0; i < 10; i++) {
            multiplicacion= multiplicacion*i;
        }
        
    }
    
}
