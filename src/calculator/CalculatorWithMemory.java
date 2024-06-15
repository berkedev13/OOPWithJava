package calculator;

public class CalculatorWithMemory {
    int memoryNumber = 100;
    int[] firstArguments;
    int[] secondArguments;
    double[] results;
    char[] operations;
    Calculator calculator = new Calculator();
    int i = 0;
    int firstArgument;
    int secondArgument;
    double result;
    char operation;



    public int getFirstArgument() {
        return firstArgument;
    }

    public void setFirstArgument(int newFirstArgument) {
        firstArgument = newFirstArgument;
    }

    public int getSecondArgument() {
        return secondArgument;
    }

    public void setSecondArgument(int newSecondArgument) {
        secondArgument = newSecondArgument;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char newOperation) {
        operation = newOperation;
    }

    public double getResult() {
        switch(operation){
            case '+':	result = calculator.add(firstArgument, secondArgument); break;
            case '-':	result = calculator.subtract(firstArgument, secondArgument); break;
            case '*':	result = calculator.multiply(firstArgument, secondArgument); break;
            case '/':	result = calculator.divide(firstArgument, secondArgument); break;
        }
        firstArguments[i] = getFirstArgument();
        secondArguments[i] = getSecondArgument();
        operations[i] = getOperation();
        results[i] = result;
        i++;
        return result;
    }


    public int getMemoryNumber() {
        return memoryNumber;
    }

    public void setMemoryNumber(int memoryNumber) {
        this.memoryNumber = memoryNumber;
        operations = new char[memoryNumber];
        results = new double[memoryNumber];
        firstArguments = new int[memoryNumber];
        secondArguments = new int[memoryNumber];
    }

    public static void main(String[] args) {
        CalculatorWithMemory calculator = new CalculatorWithMemory();
        calculator.setMemoryNumber(3);
        calculator.setFirstArgument(1);
        calculator.setSecondArgument(2);
        calculator.setOperation('+');
        double first = calculator.getResult();
        calculator.setFirstArgument(3);
        calculator.setSecondArgument(-2);
        calculator.setOperation('-');
        double second = calculator.getResult();
        calculator.setFirstArgument(-2);
        calculator.setSecondArgument(-93);
        calculator.setOperation('*');
        double third = calculator.getResult();

        for(int firstArgs : calculator.firstArguments) {
            System.out.println(firstArgs);
        }
        for(int secondArgs : calculator.secondArguments) {
            System.out.println(secondArgs);
        }
        for(char operators : calculator.operations) {
            System.out.println(operators);
        }
        for(double results : calculator.results) {
            System.out.println(results);
        }

    }

}
