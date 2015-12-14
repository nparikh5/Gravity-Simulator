package Simulator;

import java.awt.*;

public class Universe {

	int x_cord,y_cord,d; // start with to draw only one planet Sun  
	double dx = 0; // stepsize
	double dr = 0; 
	private double orbitPosition;
	private Color color = Color.yellow;
	//Constructor for creating universe and assign coordinates and diameter of Sun
	public Universe (int x,int y, int d, Color c){
			this.x_cord = x;
			this.y_cord = y;
			this.d = d;
			this.color = c;
	}
	public void create (Graphics p){ //create method to paint Sun object. Reference: http://stackoverflow.com/questions/10768619/paint-and-repaint-in-java
		p.setColor(color);
		p.fillOval(x_cord,y_cord,d,d);
	//	setBackground(color.BLACK);
	}
	public void speed(){
		orbitPosition += Planet.dx;
		x_cord = Planet.x_cord + (int)(Planet.dr * Math.cos(orbitPosition));
		y_cord = Planet.y_cord + (int)(Planet.dr * Math.sin(orbitPosition));
		
	}
	

}
