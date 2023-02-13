package it.develhope.ex_basics;

public class exercise_14_whileDo {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
    
    /**
     * 1a: Edit this while loop to stop once our currentInvestmentValueEuros reaches €100,000
     * <p>
     * 1b: Change the same line, but now instead of currentInvestmentValueEuros reaching €100,000
     * <p>
     * Let's just run it for 5 years OR until it reaches €15,000 use || just like an if!
     */
    private static void exercise1() {
        System.out.println("Exercise 1 - Compounding Interest:");
        
        double currentInvestmentValueEuros = 10_000;
        double averageReturnFromStockMarketIndexPercentage = 8;
        double perYearMultiplier = 1 + (averageReturnFromStockMarketIndexPercentage / 100);
        int yearsPast = 0;
        double interestGainedThisYearEuros = 0;
        
        while (yearsPast <= 5) {
            System.out.println("Investment value = €" + currentInvestmentValueEuros + " after " + yearsPast++ + " years" +
                                       ", interest this year €" + interestGainedThisYearEuros);
            double previousYearsInvestment = currentInvestmentValueEuros;
            currentInvestmentValueEuros = currentInvestmentValueEuros * perYearMultiplier;
            interestGainedThisYearEuros = currentInvestmentValueEuros - previousYearsInvestment;
        }
    }
    
    /**
     * 2: Write a while loop for our trading bot!
     * <p>
     * The bot is going through a financial catastrophe! It's holding 10,000 Great british pounds.
     * <p>
     * It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
     * It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
     * <p>
     * On days when it sells, it can only sell 1000 pounds for euros.
     * <p>
     * Write a while loop
     * <p>
     * Use the calculation for exchange rate below
     * 1 + (Math.random() * 0.2);
     * <p>
     * to recalculate our rate every day (once per loop)
     * <p>
     * Print the number of days it takes for our bot to sell its pounds
     */
    private static void exercise2() {
        System.out.println("Exercise 2 - Selling the pound:");
        int daysToSell = 0;
        int remainingPoundsToSell = 10_000;
        int maxPoundsToSellPerDay = 1_000;
        
        // Write your while loop here
        while (remainingPoundsToSell > 0) {
            double poundToEuroExchangeRate = 1 + (Math.random() * 0.2);
            if (poundToEuroExchangeRate > 1.15) {
                remainingPoundsToSell -= maxPoundsToSellPerDay;
            }
            daysToSell++;
        }
        
       
        System.out.println("It took " + daysToSell + " days to exit that cursed economy");
    }
    
    /**
     * 3: Write answers below for the following 4 situations, should we use a while, do while, fori or for each loop?
     *    Which would work best? Why?
     *
     * Q Example: Print out the numbers 1 to 10
     * A Example: fori
     *
     * Q1: A user inputs their actions into an ATM, they can withdraw, deposit, check balance or exit. What loop should we use?
     * A1: A while loop should be used, with the condition of (money in the bank > 0);
     *
     * Q2: We have a list of 1000 users to send emails to
     * A2: A for each would be perfect, for user in the list, email the user's email address'
     *
     * Q3: We want to print out the first 80 customer names from our bank database
     * A3: fori is the one, in this scenario we will be using System.out.println(customer[i].getName());
     *
     * Q4: We want to read a file 100 lines at a time, without loading the full file into our program
     * A4: a do/while loop should be used, with the condition of while(indexLineFile < 100) do readLine(indexLineFile);
     */
}
