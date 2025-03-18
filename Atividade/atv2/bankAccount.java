public class bankAccount{
    
    private String title;
    private String accountNumber;
    private double sale;

    public bankAccount(){

    }

    public bankAccount(String title, String accountNumber){
        this.title = title;
        this.accountNumber = accountNumber;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getSale(){
        return sale;
    }

    public void setSale(double sale){
        this.sale = sale;
    }

    public void withDraw(double value) throws Exception{
        if(value > sale || value < 0){
            throw new Exception();
        }

        sale = sale - value;
        System.out.println("Update sale. New sale: " + sale);
    }

    public void deposit(double value) throws Exception{
        if(value <= 0){
            throw new Exception();
        }

        sale = sale + value;
        System.out.println("Update sale. New sale: " + sale);
    }
}