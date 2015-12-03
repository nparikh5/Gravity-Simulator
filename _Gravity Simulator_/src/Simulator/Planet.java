package Simulator;



// This is Mohit's work. Unfortunately his Github has been crashed 
//due to some windows update. As a team member I am posting
//his work from my Github.

	import java.applet.Applet;
	import java.awt.Color;
	import java.awt.Graphics;

	public class Planet extends Applet{
		
		
		Universe sun = new Universe(100,100,40); // made sun object with parameters
		
		public void draw(Graphics d){ // drawing method
			sun.create(d);
			repaint();
		}

	}

