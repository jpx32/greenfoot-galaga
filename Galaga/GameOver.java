import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class GameOver extends Actor
{
    
    public GameOver(){
        getImage().scale(600,800);
    }
    public void act(){
        removeTouching(Ship.class);
        removeTouching(Fly.class);
        removeTouching(FlyBoss.class);
        removeTouching(GameOver.class);
        removeTouching(Invader.class);
        removeTouching(Moth.class);
        removeTouching(PinchBoss.class);
        removeTouching(Ship.class);
        removeTouching(Shot.class);
        removeTouching(Spittle.class);
        removeTouching(Shotput.class);
        removeTouching(pincher.class);
    }
}
