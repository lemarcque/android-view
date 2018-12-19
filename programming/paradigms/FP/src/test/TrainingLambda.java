package test;

import anonymous.Function;

import java.util.Arrays;
import java.util.List;

public class TrainingLambda {


    public static void main(String[] args){
        new TrainingLambda();
    }



    public TrainingLambda() {

        final List<Bird> birds = Arrays.asList(
                new Bird("pigeon"),
                new Bird("perroquet"),
                new Bird("aigle"),
                new Bird("corbeau"),
                new Bird("corneille")
        );

        BirdFunction<Bird, String> funcName = (Bird bird) -> bird.getName();
        Birds<Bird>  birds1= new Birds<>();
        birds1
                // method chaining
                .add(new Bird("pigeon"))
                .add(new Bird("perroquet"))
                .add(new Bird("aigle"))
                .map(funcName)
                .print();

        String str = "Hello";
        str
                .

        Operation addition = new Operation() {
            @Override
            public int apply(int n, int m) {
                return n + m;
            }
        };
        calculate(addition);

        // This lambda functions take two variable in parameter
        // and his body expression define n substracting m
        // Lambda-Calculus notation : λn.λm.n - m or λnm.n+m
        calculate((n, m) -> n - m);
    }

    private void calculate(Operation operation) {
        System.out.println(operation.apply(12, 15));
    }
}
