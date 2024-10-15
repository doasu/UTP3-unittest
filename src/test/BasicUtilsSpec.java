package test;

import main.BasicUtils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.util.stream.Stream;

public class BasicUtilsSpec
{

@Test
public void reversingArbitraryStringProducesCorrectResult()
{
        Assertions.assertEquals(
                "txet modnar", BasicUtils.reversed("random text")
        );

        Assertions.assertEquals(
                "bd#sa6f3basż;", BasicUtils.reversed(";żsab3f6as#db")
        );
}

@Test
public void reversingNullReturnsNull()
{
        Assertions.assertNull(BasicUtils.reversed(null));
}

@Test
public void countingVowelsInArbitraryStringProducesCorrectResult()
{
        Assertions.assertEquals(
                5, BasicUtils.vowelCount("Ala ma kota")
        );

        Assertions.assertEquals(
                19, BasicUtils.vowelCount(
                        "Lorem ipsum dolor sit amet, "
                        + "consectetur adipiscing elit.")
        );
}

@Test
public void countingVowelsInEmptyStringReturnsZero()
{
        Assertions.assertEquals(0, BasicUtils.vowelCount(""));
}

@Test
public void countingVowelsInVowelStringProducesCorrectResult()
{
        Assertions.assertEquals(
                7, BasicUtils.vowelCount("aoieoyu")
        );

        Assertions.assertEquals(
                6, BasicUtils.vowelCount("yuoiea")
        );
}

@Test
public void countingVowelsInConsonantStringReturnsZero()
{
        Assertions.assertEquals(
                0, BasicUtils.vowelCount("qlmlqwnwbvmjbnfbm")
        );

        Assertions.assertEquals(
                0, BasicUtils.vowelCount("lslsnnzxcvvbbt")
        );
}

@Test
public void countingVowelsInNullReturnsThrowsException()
{
        Assertions.assertThrows(
                NullPointerException.class, () -> BasicUtils.vowelCount(null)
        );
}

@TestFactory
public Stream<DynamicTest> isVowelReturnsTrueForAllPossibleValues()
{
}

}
