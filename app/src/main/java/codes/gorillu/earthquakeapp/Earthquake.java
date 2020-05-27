package codes.gorillu.earthquakeapp;

public class Earthquake {

    private String mMagnitude;

    private String mLocation;

    private long mTimeInMilliseconds;

    public Earthquake(String magnitude, String location, long TimeInMilliseconds) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = TimeInMilliseconds;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


}
