package com.company;

public class Main{
    public static void main(String[] args){
        System.out.println(getDigitCount(101));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(reverse(1000)));
        System.out.println(getDigitCount(1000));
        System.out.println(reverse(101));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));
        numberToWords(4);

    }
    public static int getDigitCount(int x){
        int digit;
        int digitCount = 0;
        if (x<0){
            return -1;
        }
        if (x==0){
            return 1;
        }
        while(x>0){
            digit = x % 10;
            if (digit >= 0) {

                digitCount += 1;
                x/=10;
            }
        }return digitCount;

    }
    public static int reverse (int x){
        int num = x;
        if (x<0){
            x *= (-1);
        }
        int y = x;
        int reverse=0;
        int digit ;
        while(true){
            digit = y % 10;
            reverse += digit;
            y/=10;
            if (y<=0){

                break;
            }
            reverse*=10;

        } if (num<0){
            reverse*=(-1);
        }
        return reverse;
    }
    public static void numberToWords(int x){
        int num = reverse(x);
        int digitCount = getDigitCount(x);
        int digit;
        if (num<0){
            System.out.println("Invalid Value");
        }
        if (num==0){
            System.out.println("Zero");
        }

        while(num>0){



            digit = num % 10;

            num/=10;


            switch(digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

        }
        for(int i = digitCount - getDigitCount(reverse(x)); i>0; i--){
            System.out.println("Zero");
        }


    }

}
