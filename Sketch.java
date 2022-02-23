import processing.core.PApplet;
/**
   * Description: This program draws a panda face using processing
   * @Author: G. Ge
   */

public class Sketch extends PApplet {
	
  public void settings() {
    size(600, 600);
  }

  public void setup() {
    background(91, 153, 74);
  }

  public void draw() {
	  
    // Set initial stroke weight  
    strokeWeight(4);
    
    // Draw background bamboo
    fill(8, 133, 68);
    rect(30, 0, 45, 600);
    rect(160, 0, 45, 600);
    rect(280, 0, 45, 600);
    rect(400, 0, 45, 600);
    rect(520, 0, 45, 600);
    
    // Draw Left side bamboo horizontal lines
    line(30, 100, 75, 110);
    line(30, 250, 75, 230);
    line(30, 400, 75, 420);
    line(30, 550, 75, 570);

    // Draw right side bamboo horizontal lines
    line(520, 100, 565, 90);
    line(520, 260, 565, 245);
    line(520, 410, 565, 425);
    line(520, 545, 565, 540);

    // Draw central bamboo horizontal lines
    line(160, 50, 205, 65);
    line(280, 55, 325, 58);
    line(400, 44, 445, 28);
    line(160, 501, 205, 491);
    line(280, 550, 325, 557);
    line(400, 510, 445, 530);

    // Draw panda ears
    fill(0, 0, 0);
    arc(175, 180, 200, 200, radians(135), radians(320), OPEN);
    arc(425, 180, 200, 200, radians(220), radians(405), OPEN);

    // Draw panda face
    fill(255, 255, 255);
    ellipse(300, 300, 450, 375);  
    
    // Draw Panda Eyes (Black Area)
    fill(0, 0, 0);
    arc(200, 285, 150, 150, radians(149), radians(301), OPEN);
    arc(175, 260, 150, 150, radians(-32), radians(122), OPEN);
    arc(400, 285, 150, 150, radians(239), radians(391), OPEN);
    arc(425, 260, 150, 150, radians(58), radians(212), OPEN);

    // Draw Panda Eyes (WhitePupils)
    fill(255, 255, 255);
    ellipse(210, 252, 30, 30);
    ellipse(390, 252, 30, 30);

    // Draw panda nose
    fill(0, 0, 0);
    ellipse(300, 375, 75, 40);

    // Draw Panda Cheeks
    fill(247, 202, 213);
    strokeWeight(0);
    ellipse(165, 380, 60, 35);
    ellipse(435, 380, 60, 35);

    // Draw Panda "Whiskers"
    strokeWeight(8);
    line(300, 375, 300, 405);
    noFill();
    arc(275, 405, 50, 40, 0, radians(135));
    arc(325, 405, 50, 40, radians(45), radians(180));
  }
}