/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author Reynaldo
 */
public class NTRP {
    private double x;
    
    
    NTRP() {
        x = 0;
    }

    NTRP(double x) {
        this.x = x;
    }

    void setX(double x) {
        this.x = x;
    }

    double getX() {
        return x;
    }
    
    double getX1(double x){
        double resultado=0;
        double fx =((2*x)*(Math.cos(2*x))-Math.pow((x-2),2));
        double fxp =((2*(Math.cos(2*x)))-((4*x)*(Math.sin(2*x)-(2*(x-2)))));
        resultado =x-(fx/fxp);
        resultado = Math.rint(resultado*100000)/100000;
        return resultado;
    }
    
    double getfx(double x){
      double fx =((2*x)*(Math.cos(2*x))-Math.pow((x-2),2));
      fx = Math.rint(fx*100000)/100000;
      return fx;
    }
    
    double getfxp(double x){
      double fxp =((2*(Math.cos(2*x)))-((4*x)*(Math.sin(2*x)-(2*(x-2)))));
      fxp = Math.rint(fxp*100000)/100000;
      return fxp;
    }
    
    
    
}
