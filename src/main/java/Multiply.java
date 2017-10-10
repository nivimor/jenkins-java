public class Multiply {

    int x;
    int y;

    public Multiply(int num1, int num2){
        this.x = num1;
        this.y = num2;
    }

    public int Result(){
        System.out.println("-------------------------------Calculating the results-----------------------");
        return x * y;
    }
}
