import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(139,231,139);
  
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // Set stroke weight and initial color  
        
    strokeWeight(4);
    fill(0,0,0);
    
    // Draw panda ears
    arc(175, 180, 200, 200, HALF_PI + QUARTER_PI, PI + HALF_PI + QUARTER_PI + radians(5), OPEN);
    arc(425, 180, 200, 200, PI + QUARTER_PI - radians(5), PI + PI + QUARTER_PI, OPEN);

    // Draw panda face
    fill(255,255,255);
    ellipse(300, 300, 450, 375);  
    
    // Draw Panda Eyes
    fill(0,0,0);
    arc(200, 295, 150, 150, HALF_PI + QUARTER_PI + radians(14), PI + HALF_PI + QUARTER_PI-radians(14), OPEN);
    arc(175, 270, 150, 150, radians(-32), HALF_PI + QUARTER_PI - radians(13), OPEN);

    arc(400, 295, 150, 150, PI + QUARTER_PI + radians(14), PI + PI+QUARTER_PI - radians(14), OPEN);
    arc(425, 270, 150, 150, HALF_PI + radians(-32), PI+QUARTER_PI - radians(13), OPEN);

    fill(255,255,255);
    ellipse(210, 262, 30,30);
    ellipse(390, 262, 30,30);
    

    // Draw panda nose
    fill(0,0,0);
    ellipse(300, 375, 75, 40);
    
    // Draw "Whiskers"
    noFill();
    strokeWeight(8);
    line(300, 375, 300, 405);
    arc(275, 405, 50, 40, 0, HALF_PI + QUARTER_PI);
    arc(325, 405, 50, 40, QUARTER_PI, PI);
     
  }
  
  // define other methods down here.
}