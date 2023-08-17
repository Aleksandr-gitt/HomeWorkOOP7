package HomeWorkOOP7;

public class CalcPresent {
    CalcView view;
    SumCalcModel summodel;
    DivCalcModel divmodel;
    MultCalcModel multmodel;
    SubtrackCalcModel submodel;
    PowCalcModel powmodel;
    
    public CalcPresent(SumCalcModel summodel, DivCalcModel divmodel, MultCalcModel multmodel, SubtrackCalcModel submodel, PowCalcModel powmodel, CalcView view) {
        this.summodel = summodel;
        this.view = view;
        this.divmodel = divmodel;
        this.multmodel = multmodel;
        this.submodel = submodel;
        this.powmodel = powmodel;
    }

    
    public void onAddButtonClicked() {
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();
        int result = summodel.operation(number1, number2);
        view.displayResult(result);

    }


    public void onDivButtonClicked() {
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();
        int result = divmodel.operation(number1, number2);
        view.displayResult(result);

    }

    public void onMultButtonClicked() {
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();
        int result = multmodel.operation(number1, number2);
        view.displayResult(result);

    }

    public void onSubtrackButtonClicked() {
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();
        int result = submodel.operation(number1, number2);
        view.displayResult(result);

    }

    public void onPowButtonClicked() {
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();
        int result = powmodel.operation(number1, number2);
        view.displayResult(result);

    }

}

