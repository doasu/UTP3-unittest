package test;

import main.TrackingSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrackingSetSpec
{

// A new instance of a TrackingSet will
// be placed here before each test.
private TrackingSet<Object> trackingSet;

@BeforeEach
void setUpTestInstance()
{
        trackingSet = new TrackingSet<>();
        trackingSet.add("Ala ma kota");
        trackingSet.add("Hello, world!");
        trackingSet.add(2137);
        trackingSet.add(13.37D);
        trackingSet.add(4.20F);
}

}
