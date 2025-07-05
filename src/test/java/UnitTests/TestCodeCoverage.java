package UnitTests;

import compare.CompareStrings;
import org.testng.annotations.Test;

public class TestCodeCoverage
{
    @Test
    public void positiveTest()
    {
        CompareStrings objCompare=new CompareStrings();
        objCompare.containsOrNot("Selenium is Test Automation framework");
    }

    @Test
    public void NegativeTest()
    {
        CompareStrings objCompare=new CompareStrings();
        objCompare.containsOrNot("Jenkins is a CI tool");
    }
}
