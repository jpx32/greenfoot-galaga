import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Shotput extends Spittle
{
    public Shotput(){
        getImage().scale(50,50);
    }
    public void act() 
    {
        setLocation(getX()+5, getY()+20);
        if (isTouching(Ship.class)){
            getWorld().addObject(new GameOver(),300,400);
            removeTouching(Ship.class);
            getWorld().removeObject(this);
        }
        else if(getX()>=570){
            getWorld().removeObject(this);
        }
    }    
    
}
