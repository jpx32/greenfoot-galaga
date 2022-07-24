import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Shot extends Actor
{
    public static double score = 0;
    public static int bosshealth = 375;
    public static int bosstwohealth = 270;
    public static int bossthreehealth = 650;
    public static int bossultimatehealth = 5000;
    public static boolean waveded = false;
    public static boolean pinch = false;
    public Shot(){
        getImage().scale(5,20);
    }
    public void act() 
    {
        setLocation(getX(), getY()-20);
        getWorld().showText("Score: "+ score, 100,200);
        //getWorld().showText("Boss One Health: "+ bosshealth, 100,100);
        //getWorld().showText("Boss Two Health: "+ bosstwohealth, 100,150);
        //getWorld().showText("Boss Three Health: "+ bossthreehealth, 100,200);
        if(this.isAtEdge()){
                getWorld().removeObject(this);
            }
        else if (isTouching(Fly.class)){
            removeTouching(Fly.class);
            getWorld().removeObject(this);
            addScore(20);
        }
        else if (isTouching(Moth.class)){
            removeTouching(Moth.class);
            getWorld().removeObject(this);
            addScore(10);
        }
        else if(score>=1800&pinch==false){
            //Greenfoot.delay(1);
            for(int i = 0; i<5; i++){
               getWorld().addObject(new pincher(),i*120+25,30);
            }
            getWorld().addObject(new PinchBoss(),100,75);
            pinch=true;
        }else if(bosshealth<=0&&isTouching(Boss.class)){
            //Greenfoot.delay(115);
            for(int n = 0; n<10; n++){
                getWorld().addObject(new Fly(),n*60+25,330);
            }
            getWorld().addObject(new FlyBoss(),100,20);
            removeTouching(Boss.class);
            getWorld().removeObject(this);
        }else if(bosstwohealth<=0&&isTouching(FlyBoss.class)){
            for(int i = 0; i<10; i++){
            getWorld().addObject(new Invader(),i*60+25,30);
        }
        for(int j = 0; j<10; j++){
            getWorld().addObject(new Invader(),j*60+25,90);
        }
        for(int k = 0; k<10; k++){
            getWorld().addObject(new Invader(),k*60+25,150);
        }
        for(int l = 0; l<10; l++){
            getWorld().addObject(new Moth(),l*60+25,210);
        }
        for(int m = 0; m<10; m++){
            getWorld().addObject(new Moth(),m*60+25,270);
        }
        for(int n = 0; n<10; n++){
            getWorld().addObject(new Fly(),n*60+25,330);
        }
            removeTouching(FlyBoss.class);
            getWorld().removeObject(this);
        }else if(bossthreehealth<=0&&isTouching(PinchBoss.class)){
            //Greenfoot.delay(115);
            removeTouching(PinchBoss.class);
            getWorld().addObject(new UltimateBoss(),300,25);
        }
        else if (isTouching(Boss.class)){
            minusHealth(1);
            addScore(1.1);
            getWorld().removeObject(this);
        }else if (isTouching(FlyBoss.class)){
            minustwoHealth(1);
            addScore(1.5);
            getWorld().removeObject(this);
        }
        else if (isTouching(PinchBoss.class)){
            minusthreeHealth(1);
            addScore(2);
            getWorld().removeObject(this);
        }
        else if (isTouching(UltimateBoss.class)){
            minusultimateHealth(1);
            addScore(10);
            getWorld().removeObject(this);
        }
        else if(score>=400&&waveded==false){
            //Greenfoot.delay(100);
            getWorld().addObject(new Boss(),100,20);
            waveded=true;
        }
        else if(bossultimatehealth<=0&&isTouching(UltimateBoss.class)){
            removeTouching(UltimateBoss.class);
            getWorld().addObject(new GameOver(),300,400);
        }
    }    
    public void addScore(double pn)
    {
        pn = pn;
        score = score + pn;
     }
     public void minusHealth(int pa)
    {
        pa = pa;
        bosshealth = bosshealth - pa;
     }
     public void minustwoHealth(int pf)
    {
        pf = pf;
        bosstwohealth = bosstwohealth - pf;
     }
     public void minusthreeHealth(int pp)
    {
        pp = pp;
        bossthreehealth = bossthreehealth - pp;
     }
     public void minusultimateHealth(int pu)
    {
        pu = pu;
        bossultimatehealth = bossultimatehealth - pu;
     }
}
