package Simulator;

import java.awt.*;

public class Universe {

	int x_cord,y_cord,d; // start with to draw only one planet Sun  
	
	//Constructor for creating universe and assign coordinates and diameter of Sun
	public Universe (int x,int y, int d){
			this.x_cord = x;
			this.y_cord = y;
			this.d = d;
	}
	public void create (Graphics p){ //create method to paint Sun object. Reference: http://stackoverflow.com/questions/10768619/paint-and-repaint-in-java
		p.setColor(Color.yellow);
		p.fillOval(x_cord,y_cord,d,d);
	}
}
