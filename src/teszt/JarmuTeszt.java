
package teszt;
import modell.Auto;
public class JarmuTeszt {
    public static void main(String[] args) {
        new JarmuTeszt();
    }
    
    public JarmuTeszt(){
        //mintaSablonTeszt();
        //haladAutoBeinditasNelkulTest();
        //haladAutoBeinditassalTest();
        //haladAutoDefekttel();
        leallitottMotorralTankol();
    }
    
    private void mintaSablonTeszt(){
        int kapott = 7;
        int vart = 4;
        assert kapott == vart : "Nem egyenlőek";
    }

    private void haladAutoBeinditasNelkulTest() {
        Auto auto = new Auto();
        boolean kapott = auto.halad();
        boolean vart = false;
        assert kapott == vart : "Beinditás nélkül is haladt!";
    }
        private void haladAutoBeinditassalTest() {
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart : "Nem haladt";
        }
        
    private void haladAutoDefekttel(){
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.halad();
        boolean vart = true;
        assert kapott == vart : "Defektet kapott";
    }

    private void leallitottMotorralTankol() {
        Auto auto = new Auto();
        auto.beindit();
        boolean kapott = auto.tankol();
        boolean vart = false;
        assert kapott == vart : "A motor nincs leállitva, a tankolás nem lehetséges";
    }
    
    
}
