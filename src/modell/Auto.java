
package modell;

public class Auto extends Jarmu {

    private boolean defekt;
    
    public Auto(){
        defekt = false;
    }
    
    public void kereketCserel(){
        if(defekt)
            defekt=false;
    }
    
    @Override
    public boolean halad(){
        if(super.isBeinditva()){
            int def = (int)(Math.random()*4)+1;
            if (def == 1) {
                defekt = true;
            }
            if(defekt || !super.isUzemanyag()){
                return false;
            }
        }
    return true;
    }
    
}