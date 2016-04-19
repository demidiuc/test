package Scanner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DisplayWhatFigureSelected {

    public String getFigureName() {
        //Integer xtext = getDataFromConsole();
        Integer xtext = 1;
        Map<Integer, String> xFigureg = getMapWithFigures();

        return xFigureg.get(xtext);
    }

    public Integer getDataFromConsole() {
        Scanner cs = new Scanner(System.in);

        System.out.println("Enter the text:\n");
        String text = cs.nextLine();

        try{
            return Integer.parseInt(text);
        }
        catch (NumberFormatException e){
            System.out.println("Err: Введенный символ не является целым числом\n");
        }

        return getDataFromConsole();
    }

    public Map<Integer, String> getMapWithFigures() {
        HashMap<Integer, String> figureNumber = new HashMap<Integer, String>();
        figureNumber.put(1, "Круг");
        figureNumber.put(2, "Треугольник");
        figureNumber.put(3, "Квадрат");
        figureNumber.put(4, "Прямоугольник");
        figureNumber.put(5, "Ромб");
        figureNumber.put(6, "Трапеция");
        return figureNumber;
    }



    public static void main(String[] args) {
        DisplayWhatFigureSelected xu = new DisplayWhatFigureSelected();
        System.out.println(xu.getFigureName());
    }
}
