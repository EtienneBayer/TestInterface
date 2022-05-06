
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author etien
 */
public class Groupe extends Figure {
    private List<Figure> contient;
    
   
    
    public Groupe(){
        this.contient=(new ArrayList<Figure>());
    }
    public void add(Figure f){
     if(f.getGroupe()!=this){
         if(f.getGroupe()!=null){
             throw new Error("fugure déja dans un autre groupe");
         }
         this.contient.add(f);
         f.setGroupe(this);
     }   
    }

    @Override
    public double maxX() {
       if(this.contient.isEmpty()){
           return 0;
           
       }else {
           double max=this.contient.get(0).maxX();
           for(int i=1;i<this.contient.size();i++){
               double cur = this.contient.get(i).maxX();
               if(cur>max){
                   max=cur;
               }
           }
           return max;
       }
    }
}
