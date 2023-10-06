public class Account {
    String accountNum;
    String accountHolder;//instance variable. access via object.
    float bal=0;
    static  String accountType; //static variable. Access via class.obj cannot access static variable
    
 Account(){
    accountHolder="name123";
    accountType="Savings";
}   

Account(String aString,float af){
    accountHolder=aString;
    accountType="Current";
    bal=bal+af;
    
}

//static method. accessed via class
    public static void accountType(){
        
        System.out.println(accountType);
    }
    

    public void deposit(float amount){
        bal=bal+amount;
    }
    public void balanceCheck(){
        System.out.println("Account balance is "+bal);
    }
    public void withdrawAmount(float withdrawAmount){
        bal=bal-withdrawAmount;
        System.out.println( "amount debited");
    }
}
