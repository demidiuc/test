import org.junit.Test;
import org.junit.Assert;

import java.util.Map;

public class DisplayWhatFigureSelectedTest {
    @Test
    public void ifConsole1KrugReturned(){

        DisplayWhatFigureSelected returnedFigure = new DisplayWhatFigureSelected();
        Map<Integer, String> mapWithFiguresTest = returnedFigure.getMapWithFigures();
        Integer consoleEm = 1;

        String res = mapWithFiguresTest.get(consoleEm);

        Assert.assertEquals("Круг", res);
    }

}
