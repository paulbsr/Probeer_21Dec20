package ie.bester;

public class Main { //GENESIS CLASS

        public static void main(String[] args) { // GENESIS METHOD

            int principal = (int) Vrae.leesInsette("Hoeveel het jy geleen? ", 1_000, 1_000_000); //METHOD BEING CALLED FROM THE CONSOLE CLASS with parameters
            float annualInterest = (float) Vrae.leesInsette("Jaarlikse rentekoers? ", 1, 30); //METHOD BEING CALLED FROM THE CONSOLE CLASS
            byte years = (byte) Vrae.leesInsette("Tydperk (in jare)? ", 1, 30); //METHOD BEING CALLED FROM THE CONSOLE CLASS

            // THE ABOVE "PROMPT", "MIN" AND "MAX" ARE BEING USED BY Console.readNumber()

           // var calculator = new MortgageCalculator(principal, annualInterest, years); //CALLING ANOTHER CLASS

            // var report = new MortgageReport(calculator); //CALLING ANOTHER CLASS
            // report.printMortgage();
            // report.printPaymentSchedule();
        }

    }
    // public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        //CONSTANTS
        // final byte MONTHS_IN_YEAR = 12;
        // final byte PERCENT = 100;

        // DATE
        // Date rightNow = new Date();
        // System.out.println("Local Date/Time right now is: " + rightNow);

        // DATA COLLECTION
        // System.out.print("Enter your first name: ");
    // String firstName = scanner.next().toUpperCase();
        //  System.out.print("Enter your last name: ");
    // String lastName = scanner.next().toUpperCase();
    // System.out.println(firstName + lastName);

        //INPUT QUESTIONS
        //  System.out.print("Q1. How much did you borrow?");
    // int Q1 = scanner.nextInt();

    //  System.out.print("Q2. What was the Annual % Interest Rate?: ");
    //  float Q2 = scanner.nextFloat();
    //  float monthlyInterest = Q2 / PERCENT / MONTHS_IN_YEAR;

    //  System.out.print("Q3. Over how many years?: ");
    //  int Q3 = scanner.nextByte();

        //CALCULATIONS
        // double result = Q1 + Q2r + Q3n;
        //  int Q1p = Q1;
        // double Q2r = Q2 / PERCENT / MONTHS_IN_YEAR;
        // int Q3n = Q3 * MONTHS_IN_YEAR;
        // double resultA = 1 + Q2r;
        // double resultB = Math.pow(resultA, Q3n);
        // double resultTop = Q2r * resultB;
        // double resultBottom = resultB - 1;
        // double resultC = resultTop / resultBottom;
    // float resultD = (float) (Q1p * resultC);


        //Number Formatting
        //  NumberFormat currency = NumberFormat.getCurrencyInstance();
        // String resultE = currency.format(Q1);
        // String resultF = currency.format(resultD);
    // float monthly = resultD;
        // System.out.println(resultE);

        //CONDITIONALS
    //  if (monthly < 1500)
    //      System.out.println(firstName + " " + lastName + " you borrowed " + resultE + " at " + Q2 + "% APR over " + Q3 + " years, giving you a monthly repayment of " + resultF + " per month, you STAR" );

    //  else if (monthly > 1500)
    //      System.out.println(firstName + " " + lastName + " you borrowed " + resultE + " at " + Q2 + "% APR over " + Q3 + " years, giving you a monthly repayment of " + resultF + " per month, you PLANK!!!" );

        // System.out.println(firstName + " " + lastName + " you borrowed " + resultE + " at " + Q2 + "% APR over " + Q3 + " years, giving you a monthly repayment of " + resultF + " per month, you plank" );
        // System.out.println(firstName + " " + lastName + " you borrowed " + resultF + " at " + Q2 + "% APR over " + Q3 + " years, giving you a monthly repayment of Daniel#" + resultE + " per month, you plank" );

        //FINAL OUTPUT
        //System.out.println(firstName + " " + lastName + " you borrowed " + resultE + " at " + Q2 + "% APR over " + Q3 + " years, giving you a monthly repayment of " + resultF + " per month, you plank" );

        // LAST AMENDMENT
        // Sat 12 Dec @ 20:30
        // Sun 13 Decc @ 11:00......

    //}
//}


