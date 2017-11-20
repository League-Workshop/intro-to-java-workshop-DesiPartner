int xposition = 10;
void setup(){
  size(800,800);
  
  
  
  
}
void draw(){
  background(220);
  fill(#FF0000);
  if(mousePressed && mouseButton == RIGHT){
    fill(#0000FF);
    xposition = xposition +1;
  }
  else{
    xposition = xposition -1;
  }
  
  
 ellipse(xposition, 250, 200, 200);
  }