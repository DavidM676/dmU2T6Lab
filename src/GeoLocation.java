public class GeoLocation
{
    private double latitude;
    private double longitude;

    public GeoLocation(double lat, double lon)
    {
        latitude = lat;
        longitude = lon;
    }

    public String getCoords()
    {
        String coords = "(" + latitude + ", " + longitude + ")";
        return coords;
    }

    public String printCoords()
    {
        String coords = getCoords();
        return coords;
    }
}
