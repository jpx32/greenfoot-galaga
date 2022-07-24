import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Fly extends Actor
{
    /**
     * Act - do whatever the Fly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fly(){
        getImage().scale(40,40);
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
                setLocation(getX()+Greenfoot.getRandomNumber(21)-10, getY()+Greenfoot.getRandomNumber(30)-14);

        }
    }

