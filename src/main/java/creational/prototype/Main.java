package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Shape referenceObject1 = new Circle(8, 8, 8);
        Shape referenceObject2 = new Rectangular(8, 8, 8, 8);

        System.out.println(referenceObject1);
        System.out.println(referenceObject2);

        Cloneable newConcreteCircle = referenceObject1.clone();
        Cloneable newConcreteRectangular = referenceObject2.clone();

        System.out.println(newConcreteCircle);
        System.out.println(newConcreteRectangular);
    }
}
