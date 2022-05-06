/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.bayer.projet;

import static fr.insa.bayer.projet.Test.ENTRENOEUD;
import java.util.ArrayList;
/**
 *
 * @author etien
 */
public class Treillis {
    private   ArrayList<Barre>listBarres;
    private   ArrayList<Noeud>listNoeuds;
    
    public void MenuTexte(){
        ArrayList<Barre>listBarres = new ArrayList<Barre>();
         ArrayList<NoeudSimple>tabns ;
        tabns=new ArrayList<NoeudSimple> (10);
         
        ArrayList<NoeudAppuiSimple>tabnAs ;
        tabnAs=new ArrayList<NoeudAppuiSimple> (10);
        
        ArrayList<NoeudAppuiDouble>tabnAd ;
        tabnAd=new ArrayList<NoeudAppuiDouble> (10);
        
        
     System.out.println(" (1) afficher le treillis");
     System.out.println(" (2) creer un nouveau noeud");
     System.out.println(" (3) créer une nouvelle barre entre deux noeuds existants");
     System.out.println(" (4) supprimer une barre");
     System.out.println(" (5) supprimer une noeud");
     System.out.println(" (0) quitter");
    
     int choix = Lire.i();
     
     if (choix==1){
         
     }
     if (choix==2){
        
        
        int a =Noeud.ChoixtypeNoeud();
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
     if (choix==3){
        
        Noeud n1= Noeud.Noeudcherche(tabns, tabnAs, tabnAd);
        Noeud n2= Noeud.Noeudcherche(tabns, tabnAs, tabnAd); 
        Barre b = Barre.CreerBarre(n1, n2);
        listBarres.add(b);
     
     }
      if (choix==4){
          Barre barrasupr = Barre.ChoisiBarre(listBarres);
          listBarres.remove(barrasupr);
          
     }
     
         
     }
      
    }
    
     
    
            
            
            
            
            
            
            
            
            
            
    public Treillis(ArrayList<Barre>listBarres,ArrayList<Noeud>listNoeuds){
        this.listBarres=listBarres;
        this.listNoeuds=listNoeuds;
    } 
    public Treillis(ArrayList<Barre>listBarres){
        this.listBarres=listBarres;
    } 
    public void afficherTreillis(){
        
       affichbarre();
       affichnoeud();
                
    }
             
    
    
    public void affichbarre (){
        
        for(int i=0;i<listBarres.size();i++)
        {
            
            System.out.print("la barre "+i+listBarres.get(i).toString()+" ");
        }
         System.out.println();       
        
    }
     public void affichnoeud (){
        for(int i=0;i<listNoeuds.size();i++)
        {
            System.out.print(listNoeuds.get(i).toString()+" ");
        }
         System.out.println();       
        
    }
    
     public int maxIdNoeud (ArrayList<Noeud> listNoeuds){
         this.listNoeuds=listNoeuds;
         int i,max=0;
         
         for (i=0;i<listNoeuds.size();i++){
             if (listNoeuds.get(i).getId()>max){
                 max=listNoeuds.get(i).getId();
             }  
         }
         return (max); 
     }
     public int maxIdBarre (ArrayList<Barre> listBarres){
         this.listBarres=listBarres;
         int i,max=0;
         
         for (i=0;i<listBarres.size();i++){
             if (listBarres.get(i).getID()>max){
                 max=listBarres.get(i).getID();
             }  
         }
         return (max); 
     }
     
     public void ajouteNoeud(Noeud n){
      if (listNoeuds.contains(n)){
          System.out.print("le noeud est déja dans contenu dans le treillis");
      }else{
          n.setId(maxIdNoeud(listNoeuds)+1);
          listNoeuds.add(n);
          
      }   
     }
     public void ajouteBarre(Barre b){
      if (listBarres.contains(b)){     
          System.out.print("le noeud est déja dans contenu dans le treillis");
      }else{
          if(listNoeuds.contains(b.getNd())){
             //on fait rien   
            }else{
              listNoeuds.add(b.getNd());             
          }
          if(listNoeuds.contains(b.getNa())){
             //on fait rien   
            }else{
              listNoeuds.add(b.getNa());             
          }
          
          b.setID(maxIdNoeud(listNoeuds)+1);
          listBarres.add(b);
          
      }   
     }
    
    
    
    public ArrayList<Barre> getlistBarres(){
        return (this.listBarres);
    }
    public ArrayList<Noeud> getlistNoeuds(){
        return (this.listNoeuds);
    }
     public void setlistBarres(ArrayList<Barre> barres) {
        this.listBarres = barres;
    }
    public void setlistNoeuds(ArrayList<Noeud>noeuds) {
        this.listNoeuds = noeuds;
    }
    
}
