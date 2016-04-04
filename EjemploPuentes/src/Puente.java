
import java.util.concurrent.Semaphore;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author distribuidos
 */
public class Puente {
    int cantidad;
    Semaphore semaforo1;
    Semaphore semaforo2;
    Semaphore init;
    
    public void Puente(){
        cantidad=10;
        semaforo1= new Semaphore(1, true);
        semaforo2= new Semaphore(1, true);
        init= new Semaphore(1, true);
        
        
    }
    
    public void iniciarPaso()throws  InterruptedException{
        
        init.acquire();
        semaforo2.acquire();
        cantidad=cantidad+1;
        if (cantidad==10) {
            semaforo1.acquire();
        }
        semaforo2.release();
        init.release();
        
    }
    
    
    public void paraPaso() throws InterruptedException{
        
        semaforo2.acquire();
        cantidad= cantidad-1;
        semaforo2.release();
        
        
    }
    
    public void iniciarPaso2()throws InterruptedException{
        
        init.acquire();
        semaforo1.acquire();
        
    }
    public void PararPaso2() throws InterruptedException{
        
    }
    
     
    
    
    
    
    
}
