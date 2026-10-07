class B{
    public static void main(String[] args) {
       int age =21;
       System.out.println("Age in 2027 is  "+(age));
       age+=1;
       System.out.println("Age in 2028 is  "+(age));
       int number = 100;
       number-=4;
       System.out.println("Number after decrement is "+(number));
       number*=5;
       System.out.println("Number after multiplication is "+(number));
       number/=4;
       System.out.println("Number after division is "+(number));
       number%=3;
       System.out.println("Number after modulus is "+(number));
       int a=10;
       int b=20;
       if (a>=b){
           System.out.println("A is greater than or equal to B");
       }
       else{
           System.out.println("A is less than B");
       }
       System.out.println(a>15 && b>15);
       System.out.println(a<15 || b>15);
       System.out.println(!(a<b));

}
}