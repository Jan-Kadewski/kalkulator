import java.util.Scanner;

public class Kalkulator {
    char c;
    int getFirstNumber;
    int getSecondNumber;
    double result;
    Scanner sc = new Scanner(System.in);


    public void getTwoNumbers(){
        System.out.println("Wprowadź liczbę");
        getFirstNumber =  sc.nextInt();
        System.out.println("Dziękuje, wprowadzono:" + getFirstNumber);
        System.out.println("Podaj drugą liczbę");
        getSecondNumber = sc.nextInt();
        System.out.println("Wprowadzono:" + getSecondNumber);
    }

    public void addition(){
        result = getFirstNumber + getFirstNumber;
        System.out.println("Result of the addition is: " +result);
    }

    public void subtraction(){
        result = getFirstNumber - getFirstNumber;
        System.out.println("Result of the substraction is: " +result);
    }

    public void multiplication(){
        result = getFirstNumber * getFirstNumber;
        System.out.println("Result of the multiplication is: " +result);
    }
    public void division(){
        result = (getFirstNumber / getFirstNumber);
        System.out.println("Result of the division is: " +result);
    }

    public void operationChoose(){
        do{
        System.out.println("Wybierz operacje:");
        System.out.println("A. addition two numbers");
        System.out.println("B. subtraction two numbers");
        System.out.println("C. multiplication two numbers");
        System.out.println("D. division two numbers");
        c = sc.next().charAt(0);
        switch(c){
            case 'A':
                addition();
                break;
            case 'B':
                subtraction();
            break;
            case 'C':
                multiplication();
                break;
            case 'D':
                division();
                break;
        }
       }
        while(sc.next().charAt(0) != '=');
    }

}
