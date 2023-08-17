package HomeWorkOOP7;

abstract class CalcModel{
    private int result;

    public abstract int operation(int value1, int value2);
    
    public int getResult() {
        return result;
    }
}

class SumCalcModel extends CalcModel{
    @Override
    public int operation(int value1, int value2){
        return value1 + value2;
    }
}

class DivCalcModel extends CalcModel{
    @Override
    public int operation(int value1, int value2){
        if (value2 != 0) {
            return value1 / value2;
        } else {
            throw new IllegalArgumentException("Деление на ноль не допустимо!");
        }
    }
}

class MultCalcModel extends CalcModel{
    @Override
    public int operation(int value1, int value2){
        return value1 * value2;
    }
}

class SubtrackCalcModel extends CalcModel{
    @Override
    public int operation(int value1, int value2){
        return value1 - value2;
    }
}

class PowCalcModel extends CalcModel{
    @Override
    public int operation(int value1, int value2){
        return (int)Math.pow(value1,value2); 
    }
}

