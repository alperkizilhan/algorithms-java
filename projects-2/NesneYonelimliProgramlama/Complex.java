package Okul.NesneYonelimliProgramlama;

public class Complex {
    private double real;
    private double imaginary;


    /*
    public Complex(){
        this.real=0.0;
        this.imaginary=0.0;
        //default constructor
        //Biz constructor yazmasak bile default olarak var.


    }

     */
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;


    }

    //Accessor - Getter Methods
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    //  Mutator - setter Methods
    public void setReal(double real) {
        this.real = real;  //this dışarıdaki reali kasteder.
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }


    public Complex plus(Complex other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal, sumImaginary);

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        else if (obj == this)
            return true;

        if (!(obj instanceof Complex)) {
            return false;
        }
        Complex other=(Complex) obj;
        return this.real==other.real&&this.imaginary== other.imaginary;

    }


}
