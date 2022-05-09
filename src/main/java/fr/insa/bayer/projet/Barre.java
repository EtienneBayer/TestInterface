/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bayer.projet;

/**
 *
 * @author etien
 */
import java.util.ArrayList;

/**
 *
 * @author etien
 */


public class Barre {
    private int ID;
    private Noeud nd;
    private Noeud na;
    private double tracmax;
    private double compressmax;
    private double cout;
            
    public Barre(int id,Noeud nd,Noeud na,double tracmax, double compressmax,double cout){
        this.ID=id;
        this.nd=nd;
        this.na=na;
        this.tracmax=tracmax;
        this.compressmax=compressmax;
        this.cout=cout;
    }
    public Barre(Noeud nd,Noeud na){
        this.ID=-1;
        this.nd=nd;
        this.na=na;
        this.tracmax=-1000;
        this.compressmax=-1000;
        this.cout=-1000;
    }
   
    
    public  Barre CreerBarre(Noeud n1,Noeud n2){
        System.out.println("shiiiiiiiiii");
        
        Barre b =new Barre(-1,n1,n2,0,0,0);
        System.out.println("quelle est est son ID");
        b.ID=Lire.i();
        System.out.println("quelle est est sa traction max");
        b.tracmax=Lire.i();
        System.out.println("quelle est est sa compression max");
        b.compressmax=Lire.i();
        System.out.println("quelle est est son cout");
        b.cout=Lire.i();
        
        return b;
    }
    
    public Barre ChoisiBarre(ArrayList<Barre>listBarres){
        System.out.println("quelle est l'ID de la barre");
        int idcherche=Lire.i();
        for(int i=0;i<listBarres.size();i++){
            if (listBarres.get(i).getID()==idcherche){
                return(listBarres.get(i));
            }
        }
        return(null);
        
    }
    

    
    
    public Noeud NoeudOppose (Noeud nrepere, Barre b){
        if (nrepere==b.nd){
            return(this.na);
        }
         //IF (nrepere==b.na)
            return(this.nd);
        
    }
    public Double Angle (double pxd,double pyd,double pxa,double pya){
        return(Math.atan(pya-pyd)/(pxa-pxd));
    }
    
    
    public int getID(){
        return (this.ID);
    }
    public Noeud getNd(){
        return (this.nd);
    }
    public Noeud getNa(){
        return (this.na);
    }
    public double getTracmax(){
        return (this.tracmax);
    }
    public double getCompressmax(){
        return (this.compressmax);
    }
    public double getCout(){
        return (this.cout);
    }
    
    
    public void setID(int ID) {
        this.ID = ID;
    }
    public void setNd(Noeud nd,Barre barreaoud) {
        
        barreaoud.nd = nd;
    }
    public void setNa(Noeud na,Barre barreaoud) {
        barreaoud.na = na;
    }
    public void setTracmax(double tracmax) {
        this.tracmax = tracmax;
    }
    public void setCompressmax(double compressmax) {
        this.compressmax = compressmax;
    }
    public void setCout(double cout) {
        this.cout = cout;
    }
    @Override
    public String toString(){
        return("LA BARRE: [id : "+getID()+" son noeud de depart "+getNd()+" son noeud d'arrivee "+getNa()+" sa traction max "+getTracmax()+" sa compression max :"+getCompressmax()+" et son cout "+getCout());
    } 
    
    
}
