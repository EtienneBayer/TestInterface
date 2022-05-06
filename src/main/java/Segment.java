
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author etien
 */
public class Segment extends FigureSimple{
    
    private Point debut;
    private Point fin;
    
    public Segment (Point debut, Point fin, Color couleur){
        super(couleur);
        this.debut=debut;
        this.fin=fin;   
    }
    public Segment (Point debut, Point fin){
        this(debut,fin,Color.blue);
    }

    public String toString(){
    return  ("Segment debut= "+this.debut+" fin ="+ this.fin);   
    }
    /**
     * @return the debut
     */
    public Point getDebut() {
        return debut;
    }

    /**
     * @param debut the debut to set
     */
    public void setDebut(Point debut) {
        this.debut = debut;
    }

    /**
     * @return the fin
     */
    public Point getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(Point fin) {
        this.fin = fin;
    }

    @Override
    public double maxX() {
       return Math.max(this.debut.maxX(), this.fin.maxX());
    }

    
    
}
