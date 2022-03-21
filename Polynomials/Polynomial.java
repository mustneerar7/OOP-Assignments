public class Polynomial{

    private int n;
    private int x;
    public int[] coff;

    // constructor
    public Polynomial(int max){
        coff = new int[max];
        this.n = max;
    }

    // setters
    public void setX(int x){ this.x = x; }
    public void setN(int n){ this.n = n; }

    // getters
    public int getX(){ return x; }
    public int getN(){ return n; }
    public int getCoff(int i){ return coff[i];}

    // sets the values of cofficients
    public void setConstant(int i, int value) {
        coff[i] = value;
    }

    // evaluates a polynomial by passing the value of x
    public double evaluate(int x){
        double result = 0;
    
        for(int i = 0; i < n; ++i){
            result += coff[i] * Math.pow(x, i);
        }
        return result;
    }

    // prints the polynomial
    public String toString(){
        String poly = "P(x) = ";

        for (int i = 0; i < n; ++i){

            if (coff[i] != 0 && (i == 0))
                poly += (coff[i]);

            if (coff[i] != 0 && (i == 1))
                poly += (coff[i] + "x");
                
            if (coff[i] != 0 && (i > 1))
                poly += (coff[i] + "x" + i);  
                     
            if (i < n - 1 && coff[i] != 0)
                poly += " + ";

        }
        return poly;
    }

    // adds another polynomial object to
    // polynomial on which it is called
    public void addPolynomial(Polynomial p2){

        int small;
        int large;

        if (p2.getN() > n){
            large = p2.getN();
            small = n;
        }
        else{
            large = n;
            small = p2.getN();
        }

        int[] temp = new int[large];
        int[] sum = new int[large];

        for (int i = 0; i < small; ++i){

            if (p2.getN() > n){
                temp[i] = this.coff[i];
            }
            else{
                temp[i] = p2.coff[i];
            }
        }

        for (int i = 0; i < large; ++i){
            if(p2.getN() > n){
                sum[i] = temp[i] + p2.coff[i];
            }
            else{
                sum[i] = temp[i] + this.coff[i];
            }
        }

        coff = sum;
    }

    // takes two parameters of type Polynomial
    // returns an object of type polynomial 
    public static Polynomial addPolynomial(Polynomial p1, Polynomial p2){

        int small;
        int large;

        if (p2.getN() > p1.getN()){
            large = p2.getN();
            small = p1.getN();
        }
        else{
            large = p1.getN();
            small = p2.getN();
        }

        Polynomial p = new Polynomial(large);
        int[] temp = new int[large];

        for (int i = 0; i < small; ++i){
            if (p2.getN() > p1.getN()){
                temp[i] = p1.getCoff(i);
            }
            else{
                temp[i] = p2.getCoff(i);
            }
        }
        for (int i = 0; i < large; ++i){
            if (p2.getN() > p1.getN()){
                p.coff[i] = temp[i] + p2.getCoff(i);
            }
            else{
                p.coff[i] = temp[i] + p1.getCoff(i);
            }
        }
        return p;
    }
}