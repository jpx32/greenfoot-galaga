import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PinchBoss extends Actor
{
    public int movemult = 1;
    private GreenfootImage EnragedPinch;
    private GreenfootImage HappyPinch;
    public PinchBoss(){
        EnragedPinch = new GreenfootImage ("pbe.png");
        HappyPinch = new GreenfootImage ("pins boss.png");
    }
    public void act() 
    {
        if(this.isAtEdge()){
                movemult*=-1;
                move();
        }else{
            move();
            if (isTouching(Ship.class)){
               getWorld().addObject(new GameOver(),300,400);
               removeTouching(Ship.class);
            }
        }
    }    
    public void move(){
           int randm = Greenfoot.getRandomNumber(100);
           if(randm==2){
           setImage(EnragedPinch);
           setLocation(getX()+20*movemult, getY());
          
           setLocation(getX()-12*movemult, getY());
           
           setLocation(getX()-20*movemult, getY());
         
           setLocation(getX()-12*movemult, getY());
           setLocation(getX()+20*movemult, getY());
          
           setLocation(getX()-12*movemult, getY());
           
           setLocation(getX()-20*movemult, getY());
         
           setLocation(getX()-12*movemult, getY());
           setLocation(getX()+20*movemult, getY());
          
           setLocation(getX()-12*movemult, getY());
           
           setLocation(getX()-20*movemult, getY());
         
           setLocation(getX()-12*movemult, getY());
           setLocation(getX()+20*movemult, getY());
          
           setLocation(getX()-12*movemult, getY());
           
           setLocation(getX()-20*movemult, getY());
         
           setLocation(getX()-12*movemult, getY());
           setLocation(getX()+20*movemult, getY());
          
           setLocation(getX()-12*movemult, getY());
           
           setLocation(getX()-20*movemult, getY());
         
           setLocation(getX()-12*movemult, getY());
           setLocation(getX()+20*movemult, getY());
          
           setLocation(getX()-12*movemult, getY());
           
           setLocation(getX()-20*movemult, getY());
         
           setLocation(getX()-12*movemult, getY());
           setLocation(getX()+20*movemult, getY());
          
           setLocation(getX()-12*movemult, getY());
           
           setLocation(getX()-20*movemult, getY());
         
           setLocation(getX()-12*movemult, getY());
           for(int i = 0; i<100;i++){
               setLocation(getX()+20*movemult, getY());
               Greenfoot.delay(1);
               setLocation(getX()-12*movemult, getY());
               Greenfoot.delay(1);
               setLocation(getX()-20*movemult, getY());
               Greenfoot.delay(1);
               setLocation(getX()-12*movemult, getY());
               Greenfoot.delay(1);
               if(this.isAtEdge()){
                movemult*=-1;
               }
            }
           Greenfoot.delay(10);
       
           for(int i = 0; i<14;i++){
              setLocation(getX(), getY()+50);
              Greenfoot.delay(20);
           }
           if (isTouching(Ship.class)){
               getWorld().addObject(new GameOver(),300,400);
               removeTouching(Ship.class);
            }
           for(int i = 0; i<14;i++){
              setLocation(getX(), getY()-50);
              Greenfoot.delay(20);
           }
           Greenfoot.delay(15);
           setImage(HappyPinch);
        }else{
            setLocation(getX()+20*movemult, getY());
          
           setLocation(getX()-12*movemult, getY());
           
           setLocation(getX()-20*movemult, getY());
         
           setLocation(getX()-12*movemult, getY());
          
        }
        }
}
