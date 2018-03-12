
public class MyComplex {
	private double real;
	private double imag;
	//what is the difference if I initialize here or I initialize in the first constructor?
	
	public MyComplex() {
		this.real = 0.0;
		this.imag = 0.0;
	}
	
	public MyComplex(double real,double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public double getReal() {
		return real;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public double getImag() {
		return imag;
	}
	
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void setValue(double real,double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public String toString() {
		return String.format("%.1f+%.1fi", real,imag);
	}
	
	public boolean isReal() {
		if(imag==0.0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isImaginary() {
		if(real==0.0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean equals(double real,double imag) {
		if(((this.real-real)<0.00001)&&((this.imag-imag)<0.00001)) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean equals(MyComplex another) {
		double real;
		double imag;
		
		real = another.getReal();
		imag = another.getImag();
		
		if(((this.real-real)<0.00001)&&((this.imag-imag)<0.00001)) {
			return true;
		}else {
			return false;
		}
	}
	
	public double magnitude() {
		return Math.sqrt(real*real+imag*imag);
	}
	
	public MyComplex addInto(MyComplex right) {
		double real;
		double imag;
		
		real = right.getReal();
		imag = right.getImag();
		
		this.real += real;
		this.imag += imag;
		
		
		return this;
	}
	
	public MyComplex addNew(MyComplex right) {
		/*
		 * MyComplex temp = new MyComplex();
		temp.setValue(this.real+right.getReal(), this.imag+right.getImag());
		
		return temp;
		 */
		return new MyComplex(this.real + right.real, this.imag + right.imag);
	}
}
