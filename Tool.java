/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * This class contains the tool object
 * It consists of the Tool ID, the tool's name, the type of tool it is,
 * where it is ordered from (optional), as well as the location in the toolbox.
 * @author Jonathan
 */
public class Tool {
    
    final private int id;
    private String name;
    private String type;
    private String orderedFrom;
    private int drawer;
    private int place;
    private int status = 0;
    
    //Overloaded constructor since where tool was ordered from is optional
    public Tool(int tID, String tName, String typ, String order, int drwr, int plc)
    {
        id = tID;
        name = tName;
        type = typ;
        orderedFrom = order;
        drawer = drwr;
        place = plc;
    }
    
    //Sets ordered from to an empty string to avoid null exceptions
    public Tool(int tID, String tName, String typ, int drwr, int plc)
    {
        id = tID;
        name = tName;
        type = typ;
        orderedFrom = "";
        drawer = drwr;
        place = plc;
    }
    
    public int getID()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getType()
    {
        return type;
    }
    
    public String getOrderedFrom()
    {
        return orderedFrom;
    }
    
    public int getDrawer()
    {
        return drawer;
    }
    
    public int getPlace()
    {
        return place;
    }
    
    public int getStatus()
    {
        return status;
    }
    
    public void setDrawer(int newDrawer)
    {
        drawer = newDrawer;
    }
    
    public void setPlace(int newPlace)
    {
        place = newPlace;
    }
    
    public void setStatus(int stat)
    {
        status = stat;
    }
}
