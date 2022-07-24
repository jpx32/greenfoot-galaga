import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 800, 1); 
        setBackground(new GreenfootImage("spinv.png"));
        prepare();
    }
    private void prepare()
    {
        for(int i = 0; i < 200; i++){
        Ship ship = new Ship();
        addObject(ship,80, 749);
    }
        Shot shot = new Shot();
        addObject(shot,80, 749);
        Shot.score=0;
        Shot.bosshealth = 375;
        Shot.bosstwohealth = 270;
        Shot.bossthreehealth = 650;
        Shot.bossultimatehealth = 5000;
        Shot.waveded = false;
        Shot.pinch = false;
        for(int i = 0; i<10; i++){
            addObject(new Invader(),i*60+25,30);
        }
        for(int j = 0; j<10; j++){
            addObject(new Invader(),j*60+25,90);
        }
        for(int k = 0; k<10; k++){
            addObject(new Invader(),k*60+25,150);
        }
        for(int l = 0; l<10; l++){
            addObject(new Moth(),l*60+25,210);
        }
        for(int m = 0; m<10; m++){
            addObject(new Moth(),m*60+25,270);
        }
        for(int n = 0; n<10; n++){
            addObject(new Fly(),n*60+25,330);
        }
    }
}
