package Scanner;

import java.util.HashMap;
import java.util.Scanner;

public class DisplayWhatFigureSelected {

    public static int getDataFromConsole() {
        Scanner cs = new Scanner(System.in);

        System.out.println("Enter the text:\n");
        String text = cs.nextLine();

        try{
            if((Integer.parseInt(text)<=6)&&(Integer.parseInt(text)!=0)) {
                return Integer.parseInt(text);
            }

            else {
                System.out.println("Err: Нет совпадений.\n");
            }

        }
        catch (NumberFormatException e){
            System.out.println("Err: Введенный символ не является целым числом\n");
        }

         return getDataFromConsole();
    }

    public static void selectGeomFigure() {
        HashMap<Integer, String> figureNumber = new HashMap<Integer, String>();
        figureNumber.put(1, "Круг");
        figureNumber.put(2, "Треугольник");
        figureNumber.put(3, "Квадрат");
        figureNumber.put(4, "Прямоугольник");
        figureNumber.put(5, "Ромб");
        figureNumber.put(6, "Трапеция");

        String figure = figureNumber.get(getDataFromConsole());
        System.out.println(figure);

    }

    public static void main(String[] args) {
        selectGeomFigure();
    }
}
