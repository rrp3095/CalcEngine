package com.tutorial.calcengine;

public class Divider extends CalculateBase {

    public Divider(){}
    public Divider(double leftVal, double rightVal){
        super(leftVal,rightVal);
    }

    @Override
    public void calculate() {
        if(checkRightVal()) {
            double value = getLeftVal() / getRightVal();
            setResult(value);
        }
        else
            setResult(0);
    }
    public boolean checkRightVal(){
        if (getRightVal()>0)
            return true;

        else
            return false;
    }
}
