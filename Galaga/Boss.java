import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Boss extends Actor
{
    public int movemult = 1;
    public Boss(){
        getImage().scale(515,230);
    }
    public void act() 
    {
        if(this.isAtEdge()){
                movemult*=-1;
                move();
        }else{
            move();
            int rando = Greenfoot.getRandomNumber(100);
            if (isTouching(Ship.class)){
               getWorld().addObject(new GameOver(),300,400);
               removeTouching(Ship.class);
            }
            else if(rando == 20){
                getWorld().addObject(new Shotput(),getX(),getY()+100);
            }
        }
    }    
    public void move(){
           setLocation(getX()+(20*movemult), getY()+1);
    }
}

