import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class FlyBoss extends Actor
{
    public int movemult = 1;
    public void act() 
    {
        if(this.isAtEdge()){
                movemult*=-1;
                move();
        }else{
            move();
            int rand = Greenfoot.getRandomNumber(50);
            if (isTouching(Ship.class)){
                getWorld().addObject(new GameOver(),300,400);
               removeTouching(Ship.class);
            }
            else if(rand == 20){
                getWorld().addObject(new Spittle(),getX(),getY()+100);
            }
        }
    }    
    public void move(){
           setLocation(getX()+(22*movemult), getY()+1);
    }
}
