public class Complex{
    double real;
    double imag;
    Complex(double real, double imag){
        this.real=real;
        this.imag=imag;
    }
    Complex add(Complex c){
        return  new Complex(this.real + c.real, this.imag + c.imag);
    }
    Complex multiply(Complex c){
        return new Complex((this.real * c.real) - (this.imag * c.imag), (this.real * c.imag) + (this.imag * c.real));
    }

    int compareMagnitude(Complex c){
        return Double.compare(
                Math.hypot(this.real, this.imag),
                Math.hypot(c.real, c.imag)
        );
    }

    Complex copy(){
        return new Complex(this.real, this.imag);
    }

    void display(){
        String sign = this.imag < 0 ? " - " : " + ";
        System.out.println(this.real + sign + Math.abs(this.imag) + "i");
    }
}