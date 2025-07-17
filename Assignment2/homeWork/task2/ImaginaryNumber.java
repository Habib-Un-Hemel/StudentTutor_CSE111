package Assignment2.homeWork.task2;

public class ImaginaryNumber {
    int realPart;
    int imaginaryPart;

    public ImaginaryNumber() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }

    public String printNumber() {
        if (imaginaryPart >= 0) {
            return realPart + " + " + imaginaryPart + "i";
        } else {
            return realPart + " - " + Math.abs(imaginaryPart) + "i";
        }
    }

    
}