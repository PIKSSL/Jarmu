
package modell;

public abstract class Jarmu {
    private boolean beinditva;
    private boolean uzemanyag;
    private boolean megerkezett;

    public void beindit(){
        if(!beinditva)
        beinditva = true; 
   }
    
    public void leallit(){
        if(beinditva)
        beinditva = false; 
    }

    public boolean tankol(){
        if(!uzemanyag && !beinditva){
            uzemanyag = true;
            return true;
        }
        return false;
    }
    
    public boolean halad(){
        return uzemanyag && beinditva;
    }
    
    public boolean isBeinditva() {
        return beinditva;
    }

    public boolean isUzemanyag() {
        return uzemanyag;
    }

    public boolean isMegerkezett() {
        return megerkezett;
    }
}
