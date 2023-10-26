public class CircleWithCustomException {
    private double radius;
    private static int numberOfObject = 0;
    public CircleWithCustomException() throws InvalidRadiusException{
        this(1.0);
    }
    public CircleWithCustomException(double newRadius)
        throws InvalidRadiusException{
        setRadius(newRadius);
        numberOfObject++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws InvalidRadiusException{
        if(newRadius >= 0)
            radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius);
    }
    public static int getNumberOfObject(){
        return numberOfObject;
    }
    public double findArea(){
        return radius * radius * 3.14159;
    }
}
