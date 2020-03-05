 import java.util.*;
 import java.io.*;
 import java.awt.Toolkit;
 class Movies
        {
        static int amount, again;
        static int amt, y, cost;
        static int amt1;
        static int choice;
        static int c1;
        static int c2;
        static int c3;
        static int[]eng= {0,300,350,400,350,250,250,250,250,300,400};
        static int[]hind= {0,250,300,300,250,250,200,200,200,250,250};
        static int[]ita= {0,200,250,200,250,200,250,200,250,200,250};
        static int[]ben= {0,150,200,150,200,150,200,150,200,150,200};
        static Scanner in= new Scanner(System.in);
        static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        static Toolkit tk = Toolkit.getDefaultToolkit();
        Movies()
            {    
                amount = 0;
                amt1=0; 
            }  
        public static void films()throws IOException
            {
                System.out.println();
                System.out.println ("Would you like to watch a movie?");
                System.out.println();
                System.out.println ("1. Yes");
                System.out.println ("2. No");
                System.out.println();
                boolean flag = false;
                while(flag==false)
                    {
                        try
                    {
                        System.out.println("Enter a Number:");
                        System.out.println();
                        choice= Integer.parseInt(br.readLine());
                        System.out.println();
                        flag = true;
                    }
                    catch(NumberFormatException atryu)
                        {
                            tk.beep();
                            System.out.println("Invalid Input. Please Try Entering a number.");
                            System.out.println();
                        }
                    }        
                    switch (choice)
                {
                        case 1:
                        {
                            choices(); 
                            break;
                        }
                        case 2:
                        {
                            System.out.println ("Are you quite certain?");
                            System.out.println();
                            System.out.println ("1. Yes");
                            System.out.println ("2. No");
                            System.out.println();  
                            flag = false;
                            while(flag==false)
                            {
                                try
                                {
                                    System.out.println("Enter a Number:");
                                    System.out.println();
                                    c3 = Integer.parseInt(br.readLine());
                                    System.out.println();
                                    flag = true;
                                }
                                catch(NumberFormatException aba)
                                {
                                    tk.beep();
                                    System.out.println("Invalid Input. Please Try  Entering a number.");
                                    System.out.println();
                                }
                            }
                            if (c3==2)
                            {
                                choices();
                            }   
                            else if (c3==1)
                            System.out.println("You shall Now be redirected to the final bill.");
                            break;
                        }
                        default:
                        {
                            System.out.println ("Enter 1 or 2.");
                            System.out.println ("The number 1 is often depicted by raising a single finger.");
                            System.out.println ("the number 2 is depicted using 2 fingers. Perhaps enter one of these? ");
                             films();
                        }
                }
                }
        public static int calc(int x) throws IOException
                {       
                    String s,s1;
                    double tax= (14.0/100.0)*(double)x; 
                    int finals= (int)tax; 
                    int amt1;
                    System.out.println ();
                    System.out.println ("Would you like an ad-free experience?");
                    System.out.println();
                    System.out.println ("Enter your choice");
                    System.out.println();
                    System.out.println ("1. Yes");
                    System.out.println ("2. No");
                    System.out.println();
                    BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
                    s= br.readLine();
                    System.out.println();
                    if (s.equals("2"))
                    {
                        System.out.println ();
                        amt1= x+ finals;
                        cost = amt1;
                        System.out.println ("Cost of movie= Rs."+x);
                        System.out.println ("Tax          = Rs. "+finals);
                        System.out.println ("              -------");
                        System.out.println ("Amount       = Rs."+amt1);
           
                    }
                    else 
                    {    
                        System.out.println("Thank you. An additional charge of Rs. 30 has been added to your bill");
                        System.out.println ();
                        amt1= x+ finals + 30;
                        cost = amt1;
                        System.out.println ("Cost of movie= Rs."+x);
                        System.out.println ("Tax          = Rs. "+finals);
                        System.out.println ("Ad-free      = Rs. 30");
                        System.out.println ("               -------");
                        System.out.println ("Final Amount = Rs."+amt1);
            
                    } 
                    System.out.println ();
                    againr();
                    return x;
                }        
                public static int choices () throws IOException
                {      
                BufferedReader br= new BufferedReader (new InputStreamReader (System.in));
                System.out.println("Pick a language");
                System.out.println();
                System.out.println ("1. English");
                System.out.println ("2. Hindi");
                System.out.println ("3. Italian");
                System.out.println ("4. Bengali");
                System.out.println();
                boolean flag = false;
                while(flag==false)
                {
                      try
                         {
                                System.out.println("Enter a Number:");
                                System.out.println();
                                c1 = Integer.parseInt(br.readLine());
                                System.out.println();
                                flag = true;
                         }
                             catch(NumberFormatException a)
                         {
                                tk.beep();
                                System.out.println("Invalid Input. Please Try  Entering a number.");
                                System.out.println();
                         }
                }               
                    switch (c1) 
                    {
                    case 1:
                        {   
                          System.out.println("Pick a Movie");
                          System.out.println();
                          System.out.println ("1.  Frozen                                              Rs.300 ");
                          System.out.println ("2.  Airplane                                            Rs.350 ");
                          System.out.println ("3.  Monty Python and the Holy Grail                     Rs.400 ");
                          System.out.println ("4.  Ted                                                 Rs.350 ");
                          System.out.println ("5.  Stormbreaker                                        Rs.250 ");
                          System.out.println ("6.  Avengers                                            Rs.250 ");
                          System.out.println ("7.  The Amazing Spiderman                               Rs.250 ");
                          System.out.println ("8.  Ace Ventura: Pet Detective                          Rs.250 ");
                          System.out.println ("9.  Suck                                                Rs.300 ");
                          System.out.println ("10. Flight 666: The Iron Maiden Documentary             Rs.400 ");
                          System.out.println();
                          flag = false;
                          while(flag==false)
                          { 
                              try
                              {
                                  System.out.println("Enter a Number:");
                                  System.out.println();
                                  c2 = Integer.parseInt(br.readLine());
                                  System.out.println();
                                  flag = true;
                                }
                                catch(NumberFormatException b)
                                {
                                    tk.beep();
                                    System.out.println("Invalid Input. Please Try  Entering a number.");
                                    System.out.println();
                                }
                            }
                          switch (c2)
                          { 
                                case 1:
                                {  
                                    amount = amount+eng[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    System.out.println("Final Price = Rs. "+amount);
                                    y = calc(amount); return y;

                                }
                                case 2:
                                {
                                    amount = amount+eng[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                 
                                }
                                case 3:
                                {
                                    amount = amount+eng[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }
                                case 4:
                                {
                                    amount = amount+eng[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }
                                case 5:
                                {
                                    amount = amount+eng[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }
                                case 6:
                                {
                                    amount = amount+eng[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }
                                case 7:
                                {
                                    amount = amount+eng[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }
                                case 8:
                                {
                                    amount = amount+eng[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }
                                case 9:
                                {
                                    amount = amount+eng[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }
                                case 10:
                                {
                                    amount = amount+eng[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }   
                                default:
                                {
                                    System.out.println ("The numbers from 1 to 10 may be remembered by the following Horror movie rhyme");
                                    System.out.println ("1,2 Freddie's coming for you");
                                    System.out.println ("3,4 Better lock your door"); 
                                    System.out.println ("5,6 Got a crucifix"); 
                                    System.out.println ("7,8 Got to stay up late"); 
                                   System.out.println ("9,10 Falling asleep again. Try one of these numbers please"); 
                                    choices(); 
                                }
                            }
                          break;
                    }
                    case 2:
                      {
                          System.out.println("Pick a Movie");
                          System.out.println();
                          System.out.println ("1.  Ashiqui 2            Rs.250 ");
                          System.out.println ("2.  3 Idiots             Rs.300 ");
                          System.out.println ("3.  Pk                   Rs.300 ");
                          System.out.println ("4.  Piku                 Rs.250 ");
                          System.out.println ("5.  Pa                   Rs.250 ");
                          System.out.println ("6.  Taare Zameen Par     Rs.200 ");
                          System.out.println ("7.  Ghajini              Rs.200 ");
                          System.out.println ("8.  Saawariya            Rs.200 ");
                          System.out.println ("9.  Golmaal              Rs.250 ");
                          System.out.println ("10. Hera Pheri           Rs.250 ");
                          System.out.println();      
                          flag = false;
                          while(flag==false)
                         {
                              try
                              {
                                  System.out.println("Enter a Number:");
                                  System.out.println();
                                  c2 = Integer.parseInt(br.readLine());
                                  System.out.println();
                                  flag = true;
                                }
                                catch(NumberFormatException aa)
                                {
                                    tk.beep();
                                    System.out.println("Invalid Input. Please Try  Entering a number.");
                                    System.out.println();
                                }
                            }
                            switch (c2)
                            {
                             case 1:
                             {
                                 amount = amount+hind[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 2:
                             {
                                 amount = amount+hind[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 3:
                             {
                                 amount = amount+hind[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 4:
                             {
                                 amount = amount+hind[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 5:
                             {
                                 amount = amount+hind[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 6:
                             {
                                 amount = amount+hind[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 7:
                             {
                                 amount = amount+hind[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 8:
                             {
                                 amount = amount+hind[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 9:
                             {
                                 amount = amount+hind[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 10:
                             {
                                 amount = amount+hind[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }   
                             default:
                                {
                                    System.out.println ("The numbers from 1 to 10 may be remembered by the following Horror movie rhyme");
                                    System.out.println ("1,2 Freddie's coming for you");
                                    System.out.println ("3,4 Better lock your door"); 
                                    System.out.println ("5,6 Got a crucifix"); 
                                    System.out.println ("7,8 Got to stay up late"); 
                                    System.out.println ("9,10 Falling asleep again. Try one of these numbers please"); 
                                    choices();
                                }
                         }
                         break;
                    }
                    case 3:
                      {
                          System.out.println("Pick a Movie");
                          System.out.println();
                          System.out.println ("1.  La Bella Italiana            Rs.200");
                          System.out.println ("2.  Niente da Fare               Rs.250");
                          System.out.println ("3.  Qui                          Rs.200");
                          System.out.println ("4.  Mamma Roma                   Rs.250");
                          System.out.println ("5.  Mi Ricordo                   Rs.200");
                          System.out.println ("6.  Felice Natale                Rs.250");
                          System.out.println ("7.  Dark Shadows (Italian)       Rs.200");
                          System.out.println ("8.  Viaggiare                    Rs.250");
                          System.out.println ("9.  Superalcolici                Rs.200");
                          System.out.println ("10. Mi Piace                     Rs.250");
                          System.out.println();   
                          flag = false;
                         while(flag==false)
                          {
                              try
                              {
                                  System.out.println("Enter a Number:");
                                  System.out.println();
                                  c2 = Integer.parseInt(br.readLine());
                                  System.out.println();
                                  flag = true;
                                }
                                catch(NumberFormatException c)
                                {
                                    tk.beep();
                                    System.out.println("Invalid Input. Please Try  Entering a number.");
                                    System.out.println();
                                }
                            }
                            switch (c2)
                            {
                                case 1:
                                {
                                    amount = amount+ita[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }
                                case 2:
                                {
                                    amount = amount+ita[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }
                                case 3:
                                {
                                    amount = amount+ita[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }
                                case 4:
                                {
                                    amount = amount+ita[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }
                                case 5:
                                {
                                    amount = amount+ita[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }
                                case 6:
                                {
                                    amount = amount+ita[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }
                                case 7:
                                {
                                    amount = amount+ita[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }
                                case 8:
                                {
                                    amount = amount+ita[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }
                                case 9:
                                {
                                    amount = amount+ita[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }
                                case 10:
                                {
                                    amount = amount+ita[c2];
                                    System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                    System.out.println();
                                    y = calc(amount); return y;
                                }    
                                default:
                                {
                                    System.out.println ("The numbers from 1 to 10 may be remembered by the following Horror movie rhyme");
                                    System.out.println ("1,2 Freddie's coming for you");
                                    System.out.println ("3,4 Better lock your door"); 
                                    System.out.println ("5,6 Got a crucifix"); 
                                    System.out.println ("7,8 Got to stay up late"); 
                                    System.out.println ("9,10 Falling asleep again. Try one of these numbers please"); 
                                    choices(); 
                                }
                         }
                         break;
                    }
                    case 4:
                      {
                          System.out.println("Pick a Movie                         ");
                          System.out.println();
                          System.out.println ("1.  Bhooter Bhobishyath              Rs.150");
                          System.out.println ("2.  Khad                             Rs.200");
                          System.out.println ("3.  Gorosthaney Shabdhan             Rs.150");
                          System.out.println ("4.  The Royal Bengal Tiger           Rs.200");
                          System.out.println ("5.  Gangtok e Gondogol               Rs.150");
                          System.out.println ("6.  Sonar Kella                      Rs.200");
                          System.out.println ("7.  Badshahi Angti                   Rs.150");
                          System.out.println ("8.  Joy Baba Felunath                Rs.200");
                          System.out.println ("9.  Bombaiyer Bombete                Rs.150");
                          System.out.println ("10. Kailashey Kelenkari              Rs.200");
                          System.out.println();      
                          flag = false;
                         while(flag==false)
                          {
                              try
                              {
                                  System.out.println("Enter a Number:");
                                  System.out.println();
                                  c2 = Integer.parseInt(br.readLine());
                                  System.out.println();
                                  flag = true;
                                }
                                catch(NumberFormatException ab)
                                {
                                    tk.beep();
                                    System.out.println("Invalid Input. Please Try  Entering a number.");
                                    System.out.println();
                                }
                            }
                            switch (c2)
                            {
                             case 1:
                             {
                                 amount = amount+ben[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 2:
                             {
                                 amount = amount+ben[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 3:
                             {
                                 amount = amount+ben[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 4:
                             {
                                 amount = amount+ben[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 5:
                             {
                                 amount = amount+ben[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 6:
                             {
                                 amount = amount+ben[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 7:
                             {
                                 amount = amount+ben[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 8:
                             {
                                 amount = amount+ben[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 9:
                             {
                                 amount = amount+ben[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y;
                             }
                             case 10:
                             {
                                 amount = amount+ben[c2];
                                 System.out.println("Thank You, The price has been added to your bill. Enjoy your movie");
                                 System.out.println();
                                 y = calc(amount); return y; 
                             } 
                             default:
                                {
                                    System.out.println ("The numbers from 1 to 10 may be remembered by the following Horror movie rhyme");
                                    System.out.println ("1,2 Freddie's coming for you");
                                    System.out.println ("3,4 Better lock your door"); 
                                    System.out.println ("5,6 Got a crucifix"); 
                                    System.out.println ("7,8 Got to stay up late"); 
                                    System.out.println ("9,10 Falling asleep again. Try one of these numbers please"); 
                                    choices();
                                }
                         }                    
                    } 
                    default:
                        {
                            System.out.println ("Enter 1,2,3 or 4.");
                            System.out.println ("The number 1 is often depicted by raising a single finger."); 
                            System.out.println ("the number 2 is depicted using 2 fingers."); 
                            System.out.println ("the number 3 is depicted using 3 fingers."); 
                            System.out.println ("the number 4 is depicted using 4 fingers."); 
                            System.out.println ("perhaps enter one of these? ");
                             choices();
                        }
                }
                cost = y;
                return cost;
        }
            public static void againr() throws IOException    
            {
                    BufferedReader br= new BufferedReader(new InputStreamReader (System.in));
                    System.out.println ("Would you like to select another movie?");
                    System.out.println();
                    System.out.println ("1. Yes");
                    System.out.println ("2. No");
                    System.out.println();      
                    boolean flag = false;
                   while(flag==false)
                        {
                        try
                        {
                            System.out.println("Enter a Number:");
                            System.out.println();
                            again = Integer.parseInt(br.readLine());
                            System.out.println();
                            flag = true;
                        }
                        catch(NumberFormatException asdfghjk)
                        {
                            tk.beep();
                            System.out.println("Invalid Input. Please Try  Entering a number.");
                            System.out.println();
                        }
                    }
                   switch (again)
                   {
                       case 1:
                       {
                           choices();
                           break;
                       }
                       case 2:
                       {
                            System.out.println();
                            System.out.println("Thank you");
                            System.out.println();
                            break;
                       }
                       default:
                        {
                            System.out.println ("Enter 1 or 2.");
                            System.out.println ("The number 1 is often depicted by raising a single finger."); 
                            System.out.println ("the number 2 is depicted using 2 fingers."); 
                            againr();
                        }
                    }
        }
        public static void bill3() throws IOException
        {
            System.out.println("In-flight entairtenment:    Rs. "+cost);
        }
 }    
