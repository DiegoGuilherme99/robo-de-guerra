package competiçao;
import robocode.*;
import java.awt.Color;
/**
 * Blade - a class by (Diego Guilherme Gualberto)
 */
 public class Blade extends Robot {
        public void run() {
		   setColors(Color.darkGray,Color.black,Color.lightGray,Color.white,Color.green);
		   while (true) {
			   ahead(100);
			   turnRight(90);
		   }
	    }
		//tank robô inimigo detectado
		public void onScannedRobot(ScannedRobotEvent e) {
			String robotank = e.getName();
			double distancia = e.getDistance();
			System.out.println(robotank + " distancia " + distancia);
			if (distancia < 135) {
				fire(3);
			} else {	
			    fire(1);
            }
			
		}
        //colisão cpm a parede
		public void onHitWall(HitWallEvent e) {
			back(50);
			turnRight(90);
		}


}









	
        


	    

	

