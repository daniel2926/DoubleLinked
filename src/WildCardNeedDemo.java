public class WildCardNeedDemo {
    public static void main(String[] args) {
        GenericStack<Double> Intstack = new GenericStack<>();
        Intstack.push(3.0);
        Intstack.push(1.0);
        Intstack.push(2.0);
        Intstack.push(-2.0);

        System.out.println("The max number is " + max(Intstack));

    }
    public static double max (GenericStack<Double>stack){
        double max = stack.pop();

        while ( !stack.isEmpty()){
            double value = stack.pop();
            if( value > max)
                max = value;
        }
        return max;
    }
}
