import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DisplayWhatFigureSelected {

    public String getFigureName() {
        Integer xtext = getDataFromConsole();
        Map<Integer, String> xFigureg = getMapWithFigures();

        return xFigureg.get(xtext);
    }

    public Integer getDataFromConsole() {
        Scanner cs = new Scanner(System.in);

        System.out.println("Enter the number from 1 to 6:");
        String text = cs.nextLine();

        try{
            return Integer.parseInt(text);
        }
        catch (NumberFormatException e){
            System.out.println("Err: character is not an integer\n");
        }

        return getDataFromConsole();
    }

    public Map<Integer, String> getMapWithFigures() {
        HashMap<Integer, String> figureNumber = new HashMap<Integer, String>();
        figureNumber.put(1, "Circle");
        figureNumber.put(2, "Triangle");
        figureNumber.put(3, "Square");
        figureNumber.put(4, "Rectangle");
        figureNumber.put(5, "Rhombus");
        figureNumber.put(6, "Trapeze");
        return figureNumber;
    }



    public static void main(String[] args) {
        DisplayWhatFigureSelected xu = new DisplayWhatFigureSelected();
        System.out.println("Your choise is: " + xu.getFigureName());
    }
}
