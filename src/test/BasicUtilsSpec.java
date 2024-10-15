package test;

import org.junit.jupiter.api.Test;

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

}
