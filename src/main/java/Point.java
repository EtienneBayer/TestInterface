
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author etien
 */
public class Point extends FigureSimple {
    private double px;
    private double py;
    
    public Point (double px, double py, Color couleur){
        super(couleur);
        this.px=px;
        this.py=py;
        
    }
    public Point (double px, double py){
         this(px,py,Color.black);
    }
    
    @Override
    public String toString() {
    
    return ("( "+this.px+","+this.py+")"); 
}

    /**
     * @return the px
     */
    public double getPx() {
        return px;
    }

    /**
     * @param px the px to set
     */
    public void setPx(double px) {
        this.px = px;
    }

    /**
     * @return the py
     */
    public double getPy() {
        return py;
    }

    /**
     * @param py the py to set
     */
    public void setPy(double py) {
        this.py = py;
    }

    @Override
    public double maxX() {
        return this.px;
   }
}
