public class ConstructorExample {
    
    ConstructorExample(){
      System.out.println("default constructor");
   }
   int ConstructorExample(int a){
      System.out.println("Number received:"+a);
      a=a+10;
      return(a);
   }
   

}
