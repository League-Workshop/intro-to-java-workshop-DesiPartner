PImage beard;
boolean stick = false;
PImage Friend;
int mx = 0;
int my = 0;
void setup(){
  Friend = loadImage ("Friend.jpg");
  size(800,600);
Friend.resize(width,height);
beard = loadImage ("beard.png");


}


void draw(){
  background(Friend);
image(beard, mouseX,mouseY,460,200);
if(stick == true){
  image(beard, mx, my, 460, 200);
}else{
  image(beard, mouseX, mouseY,460, 200);
  
  
}
if(mousePressed){
  stick = true;
  mx = mouseX;
  my = mouseY;
  
}

}