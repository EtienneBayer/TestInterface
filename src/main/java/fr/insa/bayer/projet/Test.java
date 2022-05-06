/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bayer.projet;

import java.util.ArrayList;

/**
 *
 * @author etien
 */
public class Test {
    public static void main (String[] args){
        Vecteur2D v1;
        NoeudSimple n1,nc;
        double cx,cy;
        
        ArrayList<Vecteur2D>tabv ;
        tabv=new ArrayList<Vecteur2D> (10);
        
        ArrayList<NoeudSimple>tabns ;
        tabns=new ArrayList<NoeudSimple> (10);
         
        ArrayList<NoeudAppuiSimple>tabnAs ;
        tabnAs=new ArrayList<NoeudAppuiSimple> (10);
        
        ArrayList<NoeudAppuiDouble>tabnAd ;
        tabnAd=new ArrayList<NoeudAppuiDouble> (10);
        
        v1=new Vecteur2D(0,0);
        v1.demandeVx();
        v1.demandeVy();
        n1=new NoeudSimple(0,0,v1);
        n1.demandePx();
        n1.demandePy();     
        tabv.add(v1);
        tabns.add(n1);
             
        System.out.print("v1 :"+v1.toString());
        System.out.println("");
        System.out.print("n1 :"+n1.toString());
        System.out.println("");
         
        Noeudcherche(tabns,tabnAs,tabnAd); //conversion objet en NoeudSimple
         
       
         int a=ChoixtypeNoeud();
          if (a==1){
          NoeudSimple ns;
          ns=(NoeudSimple) ENTRENOEUD(tabns, tabnAs, tabnAd, a);  //ici, on converti un objet en noeud Simple pour le mettre dans ns
          tabns.add(ns);  

        }
        if (a==2){
           NoeudAppuiSimple nAs;
          nAs=(NoeudAppuiSimple) ENTRENOEUD(tabns, tabnAs, tabnAd, a);
           tabnAs.add(nAs);
         
        }
        if (a==3){ 
            NoeudAppuiDouble nAd;
            nAd=(NoeudAppuiDouble) ENTRENOEUD(tabns, tabnAs, tabnAd, a);
          tabnAd.add(nAd); 
               
        }
        Noeudcherche(tabns,tabnAs,tabnAd);
        
        
        
        
        
    }
    
     public static NoeudSimple creerNoeudSimple(){
         Vecteur2D v1=new Vecteur2D(0,0);
           v1=creerVecteur();
            
            NoeudSimple ns = new NoeudSimple(0,0,v1);
            ns.demandePx();
            ns.demandePy();
            
            return(ns);
         
     }
     public static Object ENTRENOEUD(ArrayList<NoeudSimple> tabns,ArrayList<NoeudAppuiSimple> tabnAs,ArrayList<NoeudAppuiDouble> tabnAd,int a){
     if (a==1){
          NoeudSimple ns=creerNoeudSimple();   
          System.out.println("le noeud Simple creer : "+ns.toString());
          
          return(ns); 
        }
        if (a==2){
           NoeudAppuiSimple nAs=creerNoeudAppuiSimple();   
          System.out.println("le noeud Appui Simple creer : "+nAs.toString());
          return(nAs);
        }
            NoeudAppuiDouble nAd=creerNoeudAppuiDouble(); 
           System.out.println("le noeud  Appui Double creer : "+nAd.toString());    
            return(nAd);
     }
     public static NoeudAppuiSimple creerNoeudAppuiSimple(){
          Vecteur2D v2=new Vecteur2D(0,0);
            v2=creerVecteur();
            
            NoeudAppuiSimple nAs = new NoeudAppuiSimple(0,0,v2);
            nAs.demandePx();
            nAs.demandePy();
            
            return(nAs);
         
     }
     public static NoeudAppuiDouble creerNoeudAppuiDouble(){
          Vecteur2D v3=new Vecteur2D(0,0);
           v3=creerVecteur();
            
            NoeudAppuiDouble nAd = new NoeudAppuiDouble(0,0,v3);
            nAd.demandePx();
            nAd.demandePy();
            
            return(nAd);
         
     }

    /**
     *
     * @param tabns
     * @param tabnAs
     * @param tabnAd
     */
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
    
     public static Vecteur2D creerVecteur(){
         Vecteur2D v1=new Vecteur2D(0,0);
            v1.demandeVx();
            v1.demandeVy();
            return(v1);
     }
      public static int  ChoixtypeNoeud(){
        System.out.println("quelle type de noeud veux tu creer: 1 pour Noeud Simple, 2 Noeud Appui Simple,3 Noeud appui Double");
        int a=Lire.i();
        return(a);
      }
       
       
       public static int  nbrInconnues(Object noeud){
           if (noeud.getClass() == NoeudSimple.class) {
            return(0);
        } else if (noeud.getClass() == NoeudAppuiSimple.class) {
           return(1);
        } 
            return(2);
        //il retourne pour un noeud appuie double
           
       }
       
}
