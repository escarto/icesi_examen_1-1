
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author distribuidos
 */
public class CarroIzq extends Thread{
    
    
    Puente puente;
    
    
    public CarroIzq(Puente puente){
        this.puente=puente;
        
    }
    
    
    
    public void run(){
        
        while (true) {            
            
            try {            
                
                try {
                    puente.iniciarPaso();
                } catch (InterruptedException ex) {
                    Logger.getLogger(CarroIzq.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                int timepoPaso=(int)(Math.random()*10);
                System.out.print("Se enviar los carros por "+timepoPaso + "Seg");
                
                try{
                    sleep(timepoPaso);
                    
                }catch(InterruptedException e){
                    
                }
                puente.paraPaso();
                System.out.println("Se para el paso de carros 1");
            } catch (InterruptedException ex) {
                Logger.getLogger(CarroIzq.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
}
}



  
