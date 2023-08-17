package HomeWorkOOP7;

import java.util.Scanner;

public class CalcView {
    public void displayResult(int result) {
        System.out.println("Результат: " + result);
    }

    public int getUserInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int input = scan.nextInt();
        return input;
    }

    public char chooseOperation(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Выберите операцию(+,-,*,/): ");
        return scan.next().charAt(0); 
    }

}
