package homeworks.HW3;

/**
 * Created by Vahag on 4/6/2017.
 */
public class NumberAnalyzer<E extends Number> {
    E [] numbers;

    public NumberAnalyzer(E[] numbers) {
        this.numbers = numbers;
    }

    public E max(){
        E result = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i].doubleValue() < numbers[i + 1].doubleValue()){
                result = numbers[i + 1];
            }
        }
        return result;
    }

    public E min(){
        E result = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i].doubleValue() > numbers[i + 1].doubleValue()){
                result = numbers[i + 1];
            }
        }
        return result;
    }



}
