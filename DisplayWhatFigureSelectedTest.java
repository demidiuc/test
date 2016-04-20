import org.junit.Test;
import org.junit.Assert;

import java.util.Map;

public class DisplayWhatFigureSelectedTest {
    @Test
    public void ifConsole1CircleReturned(){

        DisplayWhatFigureSelected returnedFigure = new DisplayWhatFigureSelected();
        Map<Integer, String> mapWithFiguresTest = returnedFigure.getMapWithFigures();
        Integer consoleEm = 1;

        String res = mapWithFiguresTest.get(consoleEm);

        Assert.assertEquals("Circle", res);
    }

    @Test
    public void ifConsole999NullReturned(){

        DisplayWhatFigureSelected returnedFigure = new DisplayWhatFigureSelected();
        Map<Integer, String> mapWithFiguresTest = returnedFigure.getMapWithFigures();
        Integer consoleEm = 999;

        String res = mapWithFiguresTest.get(consoleEm);

        Assert.assertNull(res);
    }
}
