package test;

import main.TrackingSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrackingSetSpec
{

// Object is final, we don't want to change it
private static final Object              testObject = "foo";
// A new instance of a TrackingSet will
// be placed here before each test.
private static       TrackingSet<Object> trackingSet;

@BeforeEach
void setUpTestInstance()
{
        trackingSet = new TrackingSet<>();
        trackingSet.add(testObject);
}

@Test
void removingItemIncrementsRemovalsCounter()
{
        int RCSnapshot = trackingSet.getRemovalsCount();
        trackingSet.remove(testObject);

        assertEquals(
                RCSnapshot + 1, trackingSet.getRemovalsCount()
        );
}

@Test
void removingNonExistentItemThrowsException()
{
        assertThrows(
                IllegalArgumentException.class,
                () -> trackingSet.remove("nonexistant object")
        );
}
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
