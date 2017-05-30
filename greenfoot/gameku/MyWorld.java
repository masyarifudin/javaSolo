// WARNING: This file is auto-generated and any changes to it will be overwritten
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Tikus tikus =  new  Tikus();
        addObject(tikus, 91, 333);
        Roti roti =  new  Roti();
        addObject(roti, 454, 156);
        Roti roti2 =  new  Roti();
        addObject(roti2, 357, 71);
    }
}
