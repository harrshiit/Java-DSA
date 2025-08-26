import java.util.*;
 class input{
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string sentence ");
        String s=sc.next();// takes one first word before the space 
        System.out.println(s); // give first word asc output 
        System.out.println("enter the sentence again ");
         s=sc.nextLine(); // return remaining word from the fiist sentence because it was already in its buffer doest take input 
         System.out.println("you entered ---" +s);
         sc.nextLine();// clears  the input buffer 
         System.out.println("enter again ");
        s= sc.nextLine();
         System.out.println("you entered--- " +s);

     }
 
    
}