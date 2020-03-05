import java.util.*;
import java.io.*;
import java.awt.Toolkit;
 class Payment
 {
     static Toolkit tk = Toolkit.getDefaultToolkit();
     static int choose=0,cc,dc,cvv, otp,ch;
     public static void pay()throws IOException
     {   
         String date;
         Scanner in = new Scanner(System.in);
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         boolean flag1;
         System.out.println();
         System.out.println("Please enter a mode of payment");
         System.out.println();
         System.out.println("1. Credit Card");
         System.out.println("2. Net Banking");
         System.out.println("3. Debit Card");
         System.out.println();
         flag1 = false;
         while(flag1==false)
         { 
           try
           {
              System.out.println("Enter choice:");
              System.out.println();
              choose = Integer.parseInt(br.readLine());
              System.out.println();
              while (choose<0 || choose>3)
                {
                    System.out.println("Invalid choice. Please try again.");
                    choose = Integer.parseInt(br.readLine());
                    System.out.println();
                }
              flag1 = true;
            }
             catch(NumberFormatException b)
             {
              tk.beep();
              System.out.println("Invalid Input. Please Try  Entering a number.");
              System.out.println();
              }
          }
         switch(choose)
         {
           case 1:
           {
         flag1 = false;
             while(flag1==false)
         { 
           try
           {
              System.out.println("Enter Your Credit Card Number. ");
              System.out.println();
              cc = Integer.parseInt(br.readLine());
              System.out.println();
              flag1 = true;
            }
             catch(NumberFormatException b)
             {
              tk.beep();
              System.out.println("Invalid Input. Please Try  Entering a number.");
              System.out.println();
              }
          } 
         System.out.println("Enter date of expiry.");
         System.out.println();
         date = br.readLine();
         System.out.println();
         System.out.println("Enter CVV");
         System.out.println();
         flag1 = false;
             while(flag1==false)
         { 
           try
           {
              cvv = Integer.parseInt(br.readLine());
              System.out.println();
              flag1 = true;
            }
             catch(NumberFormatException b)
             {
              tk.beep();
              System.out.println("Invalid Input. Please Try  Entering a number.");
              System.out.println();
              }
          } 
         System.out.println("A four digit One Time Password (OTP) number has been sent to your registered mobile number." + '\n' + "Please enter your OTP to continue");
         System.out.println();
         tk.beep();
         flag1 = false;
          while(flag1==false)
         { 
           try
           {
              otp = Integer.parseInt(br.readLine());
              System.out.println();
              flag1 = true;
            }
             catch(NumberFormatException b)
             {
              tk.beep();
              System.out.println("Invalid Input. Please Try  Entering a number.");
              System.out.println();
              }
          } 
         System.out.println("Thank you. Your order has been processed.");
         System.out.println();
         break;  
            }
           case 2:
           {
             System.out.println("Enter Your Preferred Bank "); 
             System.out.println();
             System.out.println("1. CitiBank");
             System.out.println("2. ICICI Bank");
             System.out.println("3. Canara Bank");
             System.out.println("4. State Bank of India");
             System.out.println();
             ch = Integer.parseInt(br.readLine());
             System.out.println();
             while(ch<0 || ch>4)
                {
                    System.out.println("Invalid Choice. Please try again.");
                    System.out.println();
                    ch = Integer.parseInt(br.readLine());
                    System.out.println();
                }
             tk.beep();
             System.out.println("Thank you. Your order has been processed. You will automatically redirected to the bank's website to continue.");
             System.out.println();
             break;
            }
           case 3:
           {
         System.out.println("Enter Your Debit Card Number. "); 
         System.out.println();
         flag1 = false;
             while(flag1==false)
         { 
           try
           {
              dc = Integer.parseInt(br.readLine());
              System.out.println();
              flag1 = true;
            }
             catch(NumberFormatException b)
             {
              tk.beep();
              System.out.println("Invalid Input. Please Try  Entering a number.");
              System.out.println();
              }
          }  
         System.out.println("Enter date of expiry.");
         System.out.println();
         date = br.readLine();
         System.out.println("Enter CVV");
         System.out.println();
         flag1 = false;
             while(flag1==false)
         { 
           try
           {
              cvv = Integer.parseInt(br.readLine());
              System.out.println();
              
              flag1 = true;
            }
             catch(NumberFormatException b)
             {
              tk.beep();
              System.out.println("Invalid Input. Please Try  Entering a number.");
              System.out.println();
              }
          } 
         System.out.println("A four digit One Time Password (OTP) number has been sent to your registered mobile number." + '\n' + "Please enter your OTP to continue");
         System.out.println();
         tk.beep();
         flag1 = false;
         while(flag1==false)
         { 
           try
           {
              otp = Integer.parseInt(br.readLine());
              System.out.println();
              flag1 = true;
            }
             catch(NumberFormatException b)
             {             
              tk.beep();
              System.out.println("Invalid Input. Please Try  Entering a number.");
              System.out.println();
              }
          } 
         System.out.println("Thank you. Your order has been processed.");
         break; 
            }
            }
        }
    }