package it.develhope.ex_basics;

import java.time.LocalDate;

public class exercise_16_otherTypesJava {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }
    
    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        int myBankBalanceEuro = 500;
        
        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into\040
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;
        
        long questionableFundsEuro = 5_000_000_000L;
        
        //Add the questionable funds to your bank balance and print it out!
        long newBankBalanceEuro = myBankBalanceEuro + questionableFundsEuro;
        System.out.println(newBankBalanceEuro);
    }
    
    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age -> byte it stores more efficiently for a number that is always less than 127;
     *    2b: The age of a baby in months -> byte same as age exercise above;
     *    2c: Money in a hedge fund in euros -> int, in this case you can arrive to approximately over 2 billions, it
     *        would be enough;
     *    2d: Price of a good in euros on amazon.com -> a float, it would be less heavy than a double, and it can store decimals.
     *    2e: The exact weight of an apple measured by scientific equipment -> a double, if it has to be perfectly measured, it would store properly and
     *        more efficiently than other types.
     *    2f: The number of kilometers from any 2 places in the world -> a float is perfect, it can measure even a 7th decimal, so it's pretty accurate,
     *        and it can store more efficiently than other types, for "kilometers" parameter above.
     */
    
    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");
    
        LocalDate myDate = LocalDate.now();
    
        System.out.println(myDate +"\n -------------------------------- ");
        
        System.out.println(myDate.getDayOfMonth());
        System.out.println(myDate.getDayOfWeek());
        System.out.println(myDate.getDayOfYear());
        System.out.println(myDate.getMonth());
        System.out.println(myDate.getMonthValue());
    
        System.out.println(myDate.isBefore(LocalDate.of(2020, 1, 1)));
        System.out.println(myDate.isAfter(LocalDate.of(2020, 1, 1)));
        
    }
}
