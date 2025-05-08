class Account{
    String account_number = "45189004646";
    String name = "Govinda";
    double amount = 15000;
    double interest;
    
    public double interestCalc(){
        return interest =  (amount * 8 ) / 100;
   
    }

    public void showDetails(){
        double total = amount + interest;
        System.out.println("Name : " + name);
        System.out.println("Account number : " + account_number);
        System.out.println("Total amount after adding 8% interest rate : " + total);
    }
}

class lab13{
    public static void main(String[] args) {
        Account obj = new Account();
        obj.interestCalc();
        obj.showDetails();
    }
}