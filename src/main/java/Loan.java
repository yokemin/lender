public class Loan {
    private String borrower;
    private int amount;
    private boolean isPaid;
    private double interestRate;

<<<<<<< HEAD
    private static int maxLoanAmount = 0;

=======
>>>>>>> 7cbb638fdb0e0e9234017e00b1f16c26fadf7a00
    public Loan(String borrower, int amount, double interestRate) {
        this.borrower = borrower;
        this.amount = amount;
        this.interestRate = interestRate;
        this.isPaid = false;
<<<<<<< HEAD

        if (amount > maxLoanAmount) {
            maxLoanAmount = amount;
        }
    }

    public static int getMaxLoanAmount() {
        return maxLoanAmount;
=======
    }

    public void setAsPaid() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
>>>>>>> 7cbb638fdb0e0e9234017e00b1f16c26fadf7a00
    }

    public String getBorrower() {
        return borrower;
    }

<<<<<<< HEAD

    public void setAsPaid() {
        this.isPaid = true;
    }
}

=======
    public String getDisplayString(){
        return borrower + ": " + amount;
    }

    public double getProfit(){
        return amount*interestRate;
    }
}
>>>>>>> 7cbb638fdb0e0e9234017e00b1f16c26fadf7a00
