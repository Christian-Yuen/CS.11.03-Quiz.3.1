public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade){
        if (grade>=90){
            return 'A';
        }
        else if (grade < 90 && grade>=80){
            return 'B';
        }
        else if (grade < 80 && grade >=70){
            return 'C';
        }
        else if (grade < 70 && grade >= 60){
            return 'D';
        }
        else if (grade < 60 && grade >= 50){
            return 'E';
        }
        else{
            return 'F';
        }
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int a){
        if (a%5==0&&a%3==0){
            return "fizzbuzz";
        }
        else if (a%5==0){
            return "buzz";
        }
        else if (a%3==0){
            return"fizz";
        }
        else{
            return "unlucky";
        }
    }

    // Question 3 - frontBack
    public static String frontBack (String a){
        if (a.length()<2){
            return a;
        }
        String b = a.substring(0,2);
        return b+a+b;
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        if (a+b==c||a+c==b||c+b==a){
            return true;
        }
        else{
            return false;
        }
    }

    // Question 5 - endUp
    public static String endUp (String a){
        if (a.length()<=2){
            return a.toUpperCase();
        }
        String b = a.substring(a.length()-3);
        String c = a.substring(0,a.length()-3);
        String d = b.toUpperCase();
        return c+d;
    }

}
