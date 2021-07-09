package huawei;

public class MathOperations {
    public int summ(int a, int b){
        return a+b;
    }
    public int summOrNegative(int a, int b){
        if(a>b)
            return a+b;
        else
            return b-a;
    }
}
