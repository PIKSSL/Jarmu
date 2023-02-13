
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
        boolean halad = false;
        if(this.isBeinditva()){
            int def =(int)(Math.random()*4)+1;
            if(def==1){
                defekt=true;
            }
            if(!defekt || this.isUzemanyag()){
                halad = true;
            }
        }
    return halad;
    }
    
}