import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Ship extends Actor
{
    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("left")){
           setLocation(getX()-40, getY());
        }
        if(Greenfoot.isKeyDown("right")){
           setLocation(getX()+40, getY());
        }
        if(Greenfoot.isKeyDown("space")){
            getWorld().addObject(new Shot(),getX()-2,getY()-25);
        }
        //Greenfoot.delay(6);
    }    
}
