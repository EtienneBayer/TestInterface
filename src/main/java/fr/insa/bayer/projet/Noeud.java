/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bayer.projet;

import static fr.insa.bayer.projet.Test.nbrInconnues;
import java.util.ArrayList;

/**
 *
 * @author etien
 */
public abstract class Noeud {
    private int  id=-1;
    private double px;
    private double py;
    private Vecteur2D v;
    private   ArrayList<Barre>BarreDepart =new ArrayList<Barre>() ;
    private   ArrayList<Barre>BarreArrivee =new ArrayList<Barre>() ;
    
    public Noeud(int ID, double PX, double PY, Vecteur2D V,ArrayList<Barre> barreArrivee,ArrayList<Barre> barreDepart){
        this.id=ID;
        this.px=PX;
        this.py=PY;
        this.v=V;
        this.BarreArrivee=barreArrivee;
        this.BarreDepart=barreDepart;
    }
    public Noeud(double PX, double PY, Vecteur2D V){
        this.id=-1;
        this.px=PX;
        this.py=PY;
        this.v=V; 
        this.BarreArrivee=new ArrayList<Barre>();
        this.BarreDepart=new ArrayList<Barre>();
    }
    public Noeud(double PX, double PY){
        Vecteur2D V=new Vecteur2D(0.0,0.0);
        this.id=-1;
        this.px=PX;
        this.py=PY;
        this.v=V;  
        this.BarreArrivee=new ArrayList<Barre>();
        this.BarreDepart=new ArrayList<Barre>();
    }
   
    //public Noeud trouvetonnoeud (double PX, double PY){
      //  for (int i=0; i<10;i++){
        //    if ((n(i).getPx()==PX)&&(n(i).getPy()==PX))
        //}
        
    //}
     
   
    
     public String toString(){
       return "TON POINT NARVALO : [id : "+this.id +" px:"+this.px+" py:"+this.py+" force:"+this.v.toString() ;
    
    } 
   
     public abstract ArrayList<Barre> barreIncidentes (Noeud noeud);
    
    
    
    public ArrayList<Barre> getbarresDepart(){
        return (this.BarreDepart);
    }
    public ArrayList<Barre> getbarresArrivee(){
        return (this.BarreArrivee);
    }
    
    
    public double getPx(){
        return (this.px);
    }
    public double getPy(){
        return (this.py);
    }
    public Vecteur2D getV(){
        return (this.v);
    }
    public int getId(){
        return (this.id);
    }
    
    public void setPx(double px) {
        this.px = px;
    }
    public void setPy(double py) {
        this.py = py;
    }
    public void setbarresDepart(ArrayList<Barre> barresDepart) {
        this.BarreDepart = barresDepart;
    }
    public void setbarresArrivee(ArrayList<Barre> barresArrivee) {
        this.BarreArrivee = barresArrivee;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
    public void demandePx(){
        System.out.println(" quelle es la coordonnÃƒÂ©e px");
       double pX=Lire.d();  
        this.px=pX  ;
    }
    public void demandePy(){
        System.out.println(" quelle est la coordonnÃƒÂ©e py");
        double pY=Lire.d();
        this.py=pY;
    }
    public static int  ChoixtypeNoeud(){
        System.out.println("quelle type de noeud veux tu creer: 1 pour Noeud Simple, 2 Noeud Appui Simple,3 Noeud appui Double");
        int a=Lire.i();
        return(a);
    }
    
    
    public static Noeud Noeudcherche(ArrayList<NoeudSimple> tabns,ArrayList<NoeudAppuiSimple> tabnAs,ArrayList<NoeudAppuiDouble> tabnAd){      
       
        System.out.println("quelle sont les coordonnees cx et cy du point recherchees ?");
        double cx,cy;
        
        NoeudSimple n0=new NoeudSimple(-100,-100);
         cx=Lire.d();
         cy=Lire.d();
         for (int i=0;i<tabns.size();i++){
             if ((tabns.get(i).getPx()==cx)&&(tabns.get(i).getPy()==cy)){
                 System.out.println(tabns.get(i).toString()+"son nombre d'inconnues "+nbrInconnues(tabns.get(i)) );
                 return(tabns.get(i));
               
             }  
         }
         for (int i=0;i<tabnAs.size();i++){
             if ((tabnAs.get(i).getPx()==cx)&&(tabnAs.get(i).getPy()==cy)){
                 System.out.println(tabnAs.get(i).toString()+"son nombre d'inconnues "+nbrInconnues(tabnAs.get(i)) );
                 return(tabnAs.get(i));
             }  
         }
         for (int i=0;i<tabnAd.size();i++){
             if ((tabnAd.get(i).getPx()==cx)&&(tabnAd.get(i).getPy()==cy)){
                 System.out.println(tabnAd.get(i).toString()+"son nombre d'inconnues "+nbrInconnues(tabnAd.get(i)) );
                return(tabnAd.get(i));
             }  
         }
         System.out.println("le noeud n'existe pas");
       return(null);
    }
    
    
   
}


