/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author etien
 */
public abstract class Figure {
    
    /**
     * null si aucun groupe
     */
    private Groupe groupe;

    /**
     * @return the groupe
     */
    public Groupe getGroupe() {
        return groupe;
    }

    /**
     * @param groupe the groupe to set
     */
    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }
    
    public abstract double maxX();
        
    
}
