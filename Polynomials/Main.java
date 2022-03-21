public class Main {
    public static void main(String[] args) {

        Polynomial polynomial = new Polynomial(4);

        polynomial.setConstant(0, 3);
        polynomial.setConstant(1, 5);
        polynomial.setConstant(2, 0);
        polynomial.setConstant(3, 2);

        Polynomial polynomial2 = new Polynomial(3);

        polynomial2.setConstant(0, 3);
        polynomial2.setConstant(1, 5);
        polynomial2.setConstant(2, 5);;

        System.out.println(polynomial);
        System.out.println(polynomial2);
        //System.out.println(polynomial.evaluate(7));

        //polynomial2.addPolynomial(polynomial);
        //System.out.println(polynomial2);

        System.out.println(Polynomial.addPolynomial(polynomial2, polynomial));

    }
    
}
