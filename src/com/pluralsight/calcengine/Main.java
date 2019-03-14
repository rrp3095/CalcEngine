package com.pluralsight.calcengine;

public class Main {

    public static void main(String[] args) {

//        MathEquation testEquation = new MathEquation();
//        testEquation.excute();
//        System.out.print("test =");
//        System.out.println(testEquation.getResult());
        //-------------------------------
        //--- next is to try error handling
        //------------------------------

        String[] statements = {
                "divide 100.0 50.0",
                "add 25.0 92.0",
                "subtract 225.0 17.0",
                "multiply 11.0 3.0"
        };

        CalculateHelper helper = new CalculateHelper();
        for (String statement: statements) {
            helper.process(statement);
            System.out.println(helper);
        }


        MathEquation[] equations = new MathEquation[4];
        equations[0] = new MathEquation('d',100.0d, 50.0d);
        equations[1] = new MathEquation( 'a',25.0d, 92.0d);
        equations[2] = new MathEquation('s',225.0d, 17.0d);
        equations[3] = new MathEquation('m',11.0d, 3.0d);



        for(MathEquation equation: equations) {
            equation.excute();
            System.out.print("result = ");
            System.out.println(equation.getResult());
        }

        System.out.println();
        System.out.println("using overloading");
        System.out.println();

        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        int leftInt = 9;
        int rightInt = 4;

        MathEquation equationOverload = new MathEquation('d');

        equationOverload.excute(leftDouble,rightDouble);
        System.out.print("result =");
        System.out.println(equationOverload.getResult());

        equationOverload.excute(leftInt,rightInt);
        System.out.print("result =");
        System.out.println(equationOverload.getResult());


        System.out.println();
        System.out.println("Inheritence");
        System.out.println();

        CalculateBase[] calculators = {
                new Divider(100.0d,50.0d),
                new Adder(25.0d, 92.0d),
                new Subtractor(225.0d,17.0d),
                new Multiplier(11.0d, 3.0d),
        };

        for (CalculateBase calculator:calculators
             ) {
            calculator.calculate();

            System.out.print("Result = ");
            System.out.println(calculator.getResult());

            
        }
    }



//    public static  MathEquation create(double leftVal, double rightVal, char opCode){
//        MathEquation equation = new MathEquation();
//        equation.setLeftVal(leftVal);
//        equation.setRightVal(rightVal);
//        equation.setOpCode(opCode);
//
//        return equation;
//    }
}
