import Locations.*;
import Tourist.*;
public class App {
        public static void main(String[] args) throws Exception {
    
        Locations boracay = new Boracay();
        Locations cebu = new Cebu();
        Locations palawan = new Palawan();
        Locations siargao = new Siargao();
        Locations batanes = new Batanes();

        Tourist CENTENORAD = new CENTENO();
            
            boracay.accept(CENTENORAD);
            cebu.accept(CENTENORAD);
            palawan.accept(CENTENORAD);
            siargao.accept(CENTENORAD);
            batanes.accept(CENTENORAD);
            
        }
    }