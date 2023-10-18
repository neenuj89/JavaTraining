public class factorialMethod {
   public static void main(String[] args){
    int fact=0;
    
    fact= factorial(5);
   } 
   public static int factorial(int n){
    if(n==1)
    return 1;
    else
    return(n* factorial(n-1)) ;
   }
}
