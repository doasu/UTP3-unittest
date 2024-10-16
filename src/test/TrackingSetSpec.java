package test;

import main.TrackingSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrackingSetSpec
{

// A new instance of a TrackingSet will
// be placed here before each test.
private static       TrackingSet<Object> trackingSet;

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

@Test
void addingItemIncrementsAdditionsCounter()
{// TODO implement this test
}

@Test
void removingItemIncrementsRemovalsCounter()
{// TODO implement this test

}

@Test
void gettingOperationsCountReturnsSumOfAdditionsAndRemovals()
{// TODO implement this test
        gettingAdditionsCountReturnsCorrectResult();
        gettingRemovalsCountReturnsCorrectResult();
}

@Test
void gettingAdditionsCountReturnsCorrectResult()
{// TODO implement this test

}

@Test
void gettingRemovalsCountReturnsCorrectResult()
{// TODO implement this test

}

@Test
void comparingIdenticalSetsReturnsTrue()
{// TODO implement this test

}

@Test
void comparingTwoDifferentSetsReturnsFalse()
{// TODO implement this test

}

}
