package SchoolClub;

public class MemberInfo
{
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;

    /** Constructs a MemberInfo object */
    public MemberInfo(String name, int gradYear, boolean hasGoodStanding)
    {
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }

    /** Returns the graduation year of the club member */
    public int getGradYear()
    {
        return gradYear;
    }

    /** Returns true if the member is in good standing */
    public boolean inGoodStanding()
    {
        return hasGoodStanding;
    }

    // Optional: helpful for debugging
    public String toString()
    {
        return name + " (" + gradYear + "), good standing: " + hasGoodStanding;
    }
}