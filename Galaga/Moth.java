import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Moth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moth extends Actor
{
    public Moth(){
        getImage().scale(75,50);
    }
    public void act() 
    {
        move();
        if (isTouching(Ship.class)){
            getWorld().addObject(new GameOver(),300,400);
            removeTouching(Ship.class);
        }
    }    
    public void move(){
                setLocation(getX()+2, getY()+1);

                setLocation(getX()+2, getY()+1);
  
                setLocation(getX()-2, getY()+1);
                
                setLocation(getX()-2, getY()+1);

    }  
    
}
