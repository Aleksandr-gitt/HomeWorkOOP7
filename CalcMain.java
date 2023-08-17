package HomeWorkOOP7;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class CalcMain {
    public static void main(String[] args) throws IOException{

        Logger logger = Logger.getLogger(CalcPresent.class.getName());
        FileHandler fh = new FileHandler("HomeWorkOOP7//log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.log(Level.WARNING, "Начало работы!");

        // Создание экземпляров модели, представления и презентера
        SumCalcModel model = new SumCalcModel();
        DivCalcModel divmodel = new DivCalcModel();
        MultCalcModel multmodel = new MultCalcModel();
        SubtrackCalcModel submodel = new SubtrackCalcModel();
        PowCalcModel powmodel = new PowCalcModel();
        CalcView view = new CalcView();
        CalcPresent presenter = new CalcPresent(model, divmodel, multmodel, submodel, powmodel, view);

        char userChoose = view.chooseOperation();
        switch (userChoose) {
            case '+':
                presenter.onAddButtonClicked();
                logger.info("Выполнена операция сложения");
                break;
            case '/':
                presenter.onDivButtonClicked();
                logger.info("Выполнена операция деления");
                break;
            case '*':
                presenter.onMultButtonClicked();
                logger.info("Выполнена операция умножения");
                break;
            case '-':
                presenter.onSubtrackButtonClicked();
                logger.info("Выполнена операция разницы");
                break;
            case '^':
                presenter.onPowButtonClicked();
                logger.info("Выполнена операция возведения в степень");
                break;
            default:
                System.out.println("Введена неверная операция!");
        }
        logger.log(Level.WARNING,"Конец работы");

    }

}
