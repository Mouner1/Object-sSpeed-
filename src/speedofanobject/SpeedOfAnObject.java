/*
Mouner Dabjan
Oct 2 2018
This program was created to measure the speed of an object 
 */

package speedofanobject;
import java.util.Scanner; 
/**
 *
 * @author modab5310
 */
public class SpeedOfAnObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in); 
        
        //variuables needed for the speed 
        
        double distance;
        double time; 
        double speed; 
        
        //input 
        
        System.out.println("Plese enter the distance of the object:"); 
        distance = keyboard.nextDouble(); 
        
        System.out.println("Please enter the time of the object:"); 
        time = keyboard.nextDouble(); 
        
        //algorithm for caclulating the speed 
        
        speed = distance / time; 
        
        //output
        
        System.out.println("The speed of the obejct is " + speed + "."); 
        
      
    }
    
}
