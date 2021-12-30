package main;
public class Options implements toString
{
    private boolean seatHeader;
    private int screenSize;
    private int wheelSize;
    private boolean glassRoof;

    public Options(boolean seatHeader, int screenSize, int wheelSize, boolean glassRoof) 
    {
        this.seatHeader = seatHeader;
        this.screenSize = screenSize;
        this.wheelSize = wheelSize;
        this.glassRoof = glassRoof;
    }

    @Override
    public String toString() 
    {
        return "Options\n" + "Seat Header: " + booleanConverter(seatHeader) + "\nScreen Size: " + screenSize + "\nWheel Size: " + wheelSize +
                booleanConverter(glassRoof);
    }
    
    private String booleanConverter(boolean bool)
    {
        if (bool)
        {
            return "Yes";
        }
        else
        {
            return "No";
        }
    }
}
