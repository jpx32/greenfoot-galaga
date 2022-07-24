import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class pincher extends Actor
{
    public int movemult = 1;
    public int health = 10;
    public void act() 
    {
        if(health<=0){
            getWorld().removeObject(this);
        }
        else if(this.isAtEdge()){
                movemult*=-1;
                move();
        }else if(isTouching(Shot.class)){
            removeTouching(Shot.class);
            health-=1;
        }else{
            move();
            if (isTouching(Ship.class)){
               getWorld().addObject(new GameOver(),300,400);
               removeTouching(Ship.class);
            }
        }
    }    
    public void move(){
           setLocation(getX(),getY()+(10*movemult));
    }
    
}
