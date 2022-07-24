import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Invader extends Actor
{
    public int healthinv = 2;
    public Invader(){
        getImage().scale(50,50);
    }
    public void act() 
    {
        move();
        if(healthinv<=0){
            getWorld().removeObject(this);
        }
        else if
        (isTouching(Ship.class)){
            getWorld().addObject(new GameOver(),300,400);
            removeTouching(Ship.class);
        }else if(isTouching(Shot.class)){
            removeTouching(Shot.class);
            healthinv-=1;
        }
    }    
    public void move(){
                setLocation(getX()+2, getY()+1);

                setLocation(getX()+2, getY()+1);

                setLocation(getX()-2, getY()+1);

                setLocation(getX()-2, getY()+1);
        }
    }

