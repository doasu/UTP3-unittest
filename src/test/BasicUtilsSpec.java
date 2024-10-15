package test;

import main.BasicUtils;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class BasicUtilsSpec
{

@Test
public void reversingArbitraryStringProducesCorrectResult()
{
        assertEquals(
                "txet modnar", BasicUtils.reversed("random text")
        );

        assertEquals(
                "bd#sa6f3basż;", BasicUtils.reversed(";żsab3f6as#db")
        );
}

@Test
public void reversingNullReturnsNull()
{
        assertNull(BasicUtils.reversed(null));
}

@Test
public void countingVowelsInArbitraryStringProducesCorrectResult()
{
        assertEquals(
                5, BasicUtils.vowelCount("Ala ma kota")
        );

        assertEquals(
                19, BasicUtils.vowelCount(
                        "Lorem ipsum dolor sit amet, "
                        + "consectetur adipiscing elit.")
        );
}

@Test
public void countingVowelsInEmptyStringReturnsZero()
{
        assertEquals(0, BasicUtils.vowelCount(""));
}

@Test
public void countingVowelsInVowelStringProducesCorrectResult()
{
        assertEquals(
                7, BasicUtils.vowelCount("aoieoyu")
        );

        assertEquals(
                6, BasicUtils.vowelCount("yuoiea")
        );
}

@Test
public void countingVowelsInConsonantStringReturnsZero()
{
        assertEquals(
                0, BasicUtils.vowelCount("qlmlqwnwbvmjbnfbm")
        );

        assertEquals(
                0, BasicUtils.vowelCount("lslsnnzxcvvbbt")
        );
}

@Test
public void countingVowelsInNullReturnsThrowsException()
{
        assertThrows(
                NullPointerException.class, () -> BasicUtils.vowelCount(null)
        );
}

@TestFactory
public Stream<DynamicTest> isVowelReturnsTrueForAllPossibleValues()
{
        return Stream.
                of('a', 'e', 'i', 'o', 'u', 'y').
                map(vowel -> DynamicTest.dynamicTest(
                        // Display name of the test:
                        "'" + vowel + "' is a vowel",
                        // Test to execute:
                        () -> assertTrue(BasicUtils.isVowel(vowel))));
}

}
