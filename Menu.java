import java.io.*;
import java.util.*;
import java.awt.Toolkit;
class Menu
    {   
       static int amount_st;
       static int amount_mc;
       static int amount_ds;
       static int amount_bv; 
       static int sum;
       static int n, y1;
       static int tax;
       static double gross;
       static double taxes;
       static boolean flag1;
       static int ch;
       static int choice;
       static String exit;
       static Toolkit tk = Toolkit.getDefaultToolkit();
       static boolean flag2;
       static boolean flag3, flag4, flag5;
       static int loop_end;
       Menu()
            {
              amount_st = 0;
              amount_mc = 0;
              amount_ds = 0;
              amount_bv = 0;
              n = 0;
              sum = 0; 
              tax = 0;
              gross = 0;
              flag1 = false;
              flag2 = false;
              flag3 = false;
              flag4 = false;
              flag5 = false;
            }
       public static void food()throws IOException
        {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          Scanner in = new Scanner (System.in);
          int[] cps = {0,150,250,350,450,550,650,750,850,850,750,1550,950,1050};
          int[] cpm = {0,350,450,550,650,750,850,950,1050,1150,1250,1350,1350,2550};
          int[] cpd = {0,50,75,100,125,150,200};
          int[] cpb = {0,25,25,30,35,25,20};
          int[] ips = {0,25,25,35,45,55,35,25,35,45,40,50,15,15,45,40,20,15};
          int[] ipm = {0,30,30,25,45,50,40,35,35,40,50,55,55,60,25,35,15,10,15,15,25,30,40,45,55,25,25,10,15,40,20,25,15,10,15,20,35,40,45,30,25,25,30,15,30};
          int[] ipd = {0,10,10,15,20,15,15,20,25,25,20,20,20,25,20,25,20,20,20,25,20};
          int[] ipb = {0,25,25,30,35,25,20,20,20,15,15,15,20,10,10,20,20,20};
          int[] chps = {0,150,250,350,450,550,600,550,250,150,450,150,350,150,200,150,100,150,45,100,25,30,40};
          int[] chpm = {0,50,100,100,150,150,250,550,150,115,250,135,130,250,250,350,150,100,150,200,250,300,450,450,500,250,150,100,150,150,200,250,150,150,150,200,350,150,150,300,150,125,130,150,250};
          int[] chpd = {0,50,75,100,125,50,20,50,50,110,25,50,30,200,150,150};
          int[] chpb = {0,25,25,30,35,25,20,50,50,30,25,50,30,20,15,15};
          int[] fps = {0,20,25,20,45,50,15,75,85,50,20,100,25,50};
          int[] fpm = {0,35,45,55,990,75,85,95,100,150,20,35,150,25,50,150,150,100,150,200,250,350,150,100,400,250,150,150};
          int[] fpd = {0,15,50,20,50,50,25,75,50};
          int[] fpb = {0,25,25,30,35,25,10,10,10,20,20,25,20};
          System.out.println();
          System.out.println("Would you like to order your food now?");
          System.out.println(" ");
          System.out.println("1. Yes " + '\n' + "2. No");
          System.out.println(" "); 
          while(flag3==false)
           {
              try
                {
                    System.out.println("Enter your choice:");
                    System.out.println();
                    choice = Integer.parseInt(br.readLine());
                    System.out.println();
                    flag3 = true;
                }
              catch(NumberFormatException a)
                {
                    tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                    System.out.println();
                }
            }
          flag3 = false;
          System.out.println();
          if (choice == 1)
                { 
                    System.out.println("Please enter the choice of food you would like to have.");
                    System.out.println(" ");
                    System.out.println("1. Continental");
                    System.out.println("2. Indian");
                    System.out.println("3. Chinese");
                    System.out.println("4. Fast Food");
                    System.out.println(" ");
                    flag1 = false;
                    flag2 = false;
                        while(flag1==false)
                    {
                        try
                            {
                                ch = Integer.parseInt(br.readLine());
                                System.out.println();
                                while(ch<1 || ch>4)
                                    {
                                        tk.beep();
                                        System.out.println();
                                        System.out.println("Invalid choice. Please try again.");
                                        System.out.println();
                                        ch = Integer.parseInt(br.readLine());
                                        System.out.println();
                                    }
                                flag1=true;
                            }
                            catch(NumberFormatException a)
                                {
                                    tk.beep();
                                    System.out.println();
                                    System.out.println("Invalid Choice. Please Try Again.");
                                    System.out.println();
                                }
                    }
                    System.out.println();
                    switch (ch)
                        {
                            case 1 :
                            {
                               System.out.println(" ");
                               System.out.println("Please choose a starter or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Potato Croquet                                                                Rs. 150");
                               System.out.println("2.  Mashed New Potatoes Coated with Bread Crumbs                                  Rs. 250");
                               System.out.println("3.  Vol-au-vent                                                                   Rs. 350 ");
                               System.out.println("4.  Short crushed flaky crispy mould stuffed with various fillings                Rs. 450 ");
                               System.out.println("5.  Lamb Sizzler                                                                  Rs. 550");
                               System.out.println("6.  Grilled Prawns and Baked Rolls                                                Rs. 650");
                               System.out.println("7.  Grilled Prawn with Sweet Chilli Sauce                                         Rs. 750 ");
                               System.out.println("8.  Cocktail Prawns                                                               Rs. 850");
                               System.out.println("9.  Black Tiger Prawns Grilled with Peppers and served with Chilli Sauce          Rs. 850");
                               System.out.println("10. Fish Orly � l'anglaise                                                        Rs. 750");
                               System.out.println("11. Boneless Chicken Crumbed and Deep Fried Chicken Liver                         Rs. 1550");
                               System.out.println("12. Deep Fried Calamari                                                           Rs. 950");
                               System.out.println("13. Grilled minted Lamb Kebab served with tabouleh                                Rs. 1050");
                               System.out.println(" ");
                               amount_st = 0;
                               amount_mc = 0;
                               amount_ds = 0;
                               amount_bv = 0;
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Main Course or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>13)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<14)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_st = amount_st + cps[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Main Course or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Cauliflower Mornay                                                                Rs. 350 ");
                               System.out.println("2.  Legume Diane                                                                      Rs. 450 ");
                               System.out.println("3.  Chicken Stroganoff                                                                Rs. 550 ");
                               System.out.println("4.  Beef Stroganoff                                                                   Rs. 650 ");
                               System.out.println("5.  Lamb Sizzler                                                                      Rs. 750");
                               System.out.println("6.  Roast Chicken with Roast Gravy                                                    Rs. 850");
                               System.out.println("7.  Fillet of beef with boiled vegetable and Mash potato                              Rs. 950");
                               System.out.println("8.  Cocktail Prawns                                                                   Rs. 1050");
                               System.out.println("9.  Poached salmon                                                                    Rs. 1150");
                               System.out.println("10. Grilled Salmon                                                                    Rs. 1250 ");
                               System.out.println("11. Spaghetti                                                                         Rs. 1350");
                               System.out.println("12. Spiral Pasta                                                                      Rs. 1350");
                               System.out.println("13. Bow Pasta                                                                         Rs. 2550");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Desserts or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>13)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<14)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_mc = amount_mc + cpm[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Dessert or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1. Cheese cakes                                             Rs. 50");
                               System.out.println("2. Brownie with chocolate Sauce                             Rs. 75");
                               System.out.println("3. Profiteroles                                             Rs. 100");
                               System.out.println("4. Gateaux                                                  Rs. 125");
                               System.out.println("5. Ice cream(Vanilla Chocolatte)                            Rs. 150");
                               System.out.println("6. Fruit Platter                                            Rs. 200");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Beverages or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>6)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<7)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_ds = amount_ds + cpd[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Beverage or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1. Pepsi                                                    Rs. 25");
                               System.out.println("2. Coca-Cola                                                Rs. 25");
                               System.out.println("3. Fanta                                                    Rs. 30");
                               System.out.println("4. Maaza                                                    Rs. 35");
                               System.out.println("5. Sprite                                                   Rs. 25");
                               System.out.println("6. Bisleri Mineral Water                                    Rs. 20");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to billing or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>6)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<7)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_bv = amount_bv + cpb[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Starters:               Rs. " + amount_st);
                               System.out.println("Main Course:            Rs. " + amount_mc);
                               System.out.println("Dessert:                Rs. " + amount_ds);
                               System.out.println("Beverages:              Rs. " + amount_bv);
                               sum = amount_st+amount_ds+amount_mc+amount_bv;
                               break;
                            }
                            case 2:
                                {
                               System.out.println(" ");
                               System.out.println("Please choose a starter or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Aloo ki Tikki                                                                Rs. 25");
                               System.out.println("2.  Momo                                                                         Rs. 25");
                               System.out.println("3.  Vada pav                                                                     Rs. 35");
                               System.out.println("4.  Amritsari fish                                                               Rs. 45");
                               System.out.println("5.  Butter Chicken                                                               Rs. 55");
                               System.out.println("6.  Chaat                                                                        Rs. 35");
                               System.out.println("7.  Dum Aloo                                                                     Rs. 25");
                               System.out.println("8.  Gajar ka Halwa                                                               Rs. 35");
                               System.out.println("9.  Jeera aloo                                                                   Rs. 45");
                               System.out.println("10. Kadai paneer                                                                 Rs. 40");
                               System.out.println("11. Paneer butter masala                                                         Rs. 50");
                               System.out.println("12. Pani Puri                                                                    Rs. 15");
                               System.out.println("13. Samosa                                                                       Rs. 15");
                               System.out.println("14. Shahi paneer                                                                 Rs. 45");
                               System.out.println("15. Chicken 65                                                                   Rs. 40");
                               System.out.println("16. Omlette                                                                      Rs. 20");
                               System.out.println("17. Vada                                                                         Rs. 15");
                               System.out.println(" ");
                               amount_st = 0;
                               amount_mc = 0;
                               amount_ds = 0;
                               amount_bv = 0;
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Main Course or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>17)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<18)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_st = amount_st + ips[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Main Course or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Plain Rice                                                                       Rs. 30");
                               System.out.println("2.  Jeera Rice                                                                       Rs. 30");
                               System.out.println("3.  Lemon Rice                                                                       Rs. 25");
                               System.out.println("4.  Chicken Biryani                                                                  Rs. 45");
                               System.out.println("5.  Mutton Biryani                                                                   Rs. 50");
                               System.out.println("6.  Veg Pulao                                                                        Rs. 40");
                               System.out.println("7.  Chicken Pulao                                                                    Rs. 35");
                               System.out.println("8.  Mutton Pulao                                                                     Rs. 35");
                               System.out.println("9.  Veg Fried Rice                                                                   Rs. 40");
                               System.out.println("10. Chicken Fried Rice                                                               Rs. 50");
                               System.out.println("11. Mutton Fried Rice                                                                Rs. 55");
                               System.out.println("12. Mixed Fried Rice                                                                 Rs. 55");
                               System.out.println("13. French Toast                                                                     Rs. 60");
                               System.out.println("14. Red Rice                                                                         Rs. 25");
                               System.out.println("15. Paratha                                                                          Rs. 35");
                               System.out.println("16. Chapathi                                                                         Rs. 15");
                               System.out.println("17. Roti                                                                             Rs. 10");
                               System.out.println("18. Vada Pao                                                                         Rs. 15");
                               System.out.println("19. Palak Paneer                                                                     Rs. 15");
                               System.out.println("20. Kadai Paneer                                                                     Rs. 25");
                               System.out.println("21. Chicken Tikka                                                                    Rs. 30");
                               System.out.println("22. Chicken Kadai Masala                                                             Rs. 40");
                               System.out.println("23. Khichdi                                                                          Rs. 45");
                               System.out.println("24. Gajar ka Halwa                                                                   Rs. 55");
                               System.out.println("25. Poha                                                                             Rs. 25");
                               System.out.println("26. Dal                                                                              Rs. 25");
                               System.out.println("27. Chole Bature                                                                     Rs. 10");
                               System.out.println("28. Chicken Razala                                                                   Rs. 15");
                               System.out.println("29. Aloo Paratha                                                                     Rs. 40");
                               System.out.println("30. Paneer Paratha                                                                   Rs. 20");
                               System.out.println("31. Dosa                                                                             Rs. 25");
                               System.out.println("32. Idli                                                                             Rs. 15");
                               System.out.println("33. Bisi Bele Bath                                                                   Rs. 10");
                               System.out.println("34. Uttapam                                                                          Rs. 15");
                               System.out.println("35. Fish Fry                                                                         Rs. 20");
                               System.out.println("36. Fish Tikka                                                                       Rs. 35");
                               System.out.println("37. Hilsa Fish Curry                                                                 Rs. 40");
                               System.out.println("38. Bombay Duck Curry                                                                Rs. 45");
                               System.out.println("39. Rohu Curry                                                                       Rs. 30");
                               System.out.println("40. Catla Chops                                                                      Rs. 25");
                               System.out.println("41. Baked Fish                                                                       Rs. 25");
                               System.out.println("42. Puri                                                                             Rs. 30");
                               System.out.println("43. Pav Bhajji                                                                       Rs. 15");
                               System.out.println("44. Chicken Lollipop                                                                 Rs. 30");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Desserts or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>44)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<45)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_mc = amount_mc + ipm[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Dessert or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Til Pitha                                            Rs. 10");
                               System.out.println("2.  Tenga Doi                                            Rs. 10");
                               System.out.println("3.  Mishti Doi                                           Rs. 15");
                               System.out.println("4.  Shondesh                                             Rs. 20");
                               System.out.println("5.  Rasgulla                                             Rs. 15");
                               System.out.println("6.  Peda                                                 Rs. 15");
                               System.out.println("7.  Gulab Jamun                                          Rs. 20");
                               System.out.println("8.  Caramel Pudding                                      Rs. 25");
                               System.out.println("9.  Mango Custard                                        Rs. 25");
                               System.out.println("10. Son papdi                                            Rs. 20");
                               System.out.println("11. Modak                                                Rs. 20");
                               System.out.println("12. Laddu                                                Rs. 20");
                               System.out.println("13. Jalebi                                               Rs. 25");
                               System.out.println("14. Dhokla                                               Rs. 20");
                               System.out.println("15. Dahi Vada                                            Rs. 25");
                               System.out.println("16. Chaat                                                Rs. 20");
                               System.out.println("17. Barfi                                                Rs. 20");
                               System.out.println("18. Kulfi                                                Rs. 20");
                               System.out.println("19. Ice Cream                                            Rs. 25");
                               System.out.println("20. Salad                                                Rs. 20");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Beverages or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>20)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<21)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_ds = amount_ds + ipd[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Beverage or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Pepsi                                                    Rs. 25");
                               System.out.println("2.  Coca-Cola                                                Rs. 25");
                               System.out.println("3.  Fanta                                                    Rs. 30");
                               System.out.println("4.  Maaza                                                    Rs. 35");
                               System.out.println("5.  Sprite                                                   Rs. 25");
                               System.out.println("6.  Mango Shake                                              Rs. 20");
                               System.out.println("7.  Strawberry Shake                                         Rs. 20");
                               System.out.println("8.  Orange Juice                                             Rs. 15");
                               System.out.println("9.  Mango Juice                                              Rs. 15");
                               System.out.println("10. Watermelon Juice                                         Rs. 15");
                               System.out.println("11. Banana Shake                                             Rs. 20");
                               System.out.println("12. Lassi                                                    Rs. 10");
                               System.out.println("13. Curd                                                     Rs. 10");
                               System.out.println("14. Vanilla Shake                                            Rs. 20");
                               System.out.println("15. Thumbs Up                                                Rs. 20");
                               System.out.println("16. Bisleri Mineral Water                                    Rs. 20");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to billing or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>16)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<17)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_bv = amount_bv + ipb[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Starters:               Rs. " + amount_st);
                               System.out.println("Main Course:            Rs. " + amount_mc);
                               System.out.println("Dessert:                Rs. " + amount_ds);
                               System.out.println("Beverages:              Rs. " + amount_bv);
                               System.out.println(" ");
                               sum = amount_st+amount_ds+amount_mc+amount_bv;
                               break;
                            }
                            case 3:
                                {
                               System.out.println(" ");
                               System.out.println("Please choose a starter or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Prawn and Chive Potstickers                                                                 Rs. 150");
                               System.out.println("2.  Steam Pork and Mushroom Dumplings                                                           Rs. 250");
                               System.out.println("3.  Smoky Hot Scallops and Chives                                                               Rs. 350 ");
                               System.out.println("4.  Spicy Soy Ribs with Sweet and Sour Slaw                                                     Rs. 450 ");
                               System.out.println("5.  Grilled Coconut Lobster                                                                     Rs. 550");
                               System.out.println("6.  Pork and Prawn Dumplings                                                                    Rs. 600");
                               System.out.println("7.  Golden Gate Chilli Ribs                                                                     Rs. 550 ");
                               System.out.println("8.  Pork and Prawn Boiled Wontons                                                               Rs. 250");
                               System.out.println("9.  Chinese Chicken Salad                                                                       Rs. 150");
                               System.out.println("10. Mini Taiwanese Meatballs                                                                    Rs. 450");
                               System.out.println("11. Vegetable Lettuce Wraps                                                                     Rs. 150");
                               System.out.println("12. Crispy Salt and Pepper Chicken                                                              Rs. 350");
                               System.out.println("13. Steamed Egg with Scallops and Caviar                                                        Rs. 150");
                               System.out.println("14. Lettuce Cups with Tofu and Beef                                                             Rs. 200");
                               System.out.println("15. Tea Smoked Chicken                                                                          Rs. 150");
                               System.out.println("16. Baked Spring Rolls                                                                          Rs. 100");
                               System.out.println("17. Zesty Chilli Tiger Prawn                                                                    Rs. 150");
                               System.out.println("18. Stir Fried Vegetable Wraps                                                                  Rs. 45");
                               System.out.println("19. Five-Spice Roasted Chicken Drumsticks                                                       Rs. 100");
                               System.out.println("20. Veg Momo                                                                                    Rs. 25");
                               System.out.println("21. Chicken Momo                                                                                Rs. 30");
                               System.out.println("22. Hot and Sour Chicken Soup                                                                   Rs. 40");
                               System.out.println(" ");
                               amount_st = 0;
                               amount_mc = 0;
                               amount_ds = 0;
                               amount_bv = 0;
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Main Course or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>22)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<23)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_st = amount_st + chps[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Main Course or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Egg Fried Rice                                                                        Rs. 50 ");
                               System.out.println("2.  Veg Fried Rice                                                                        Rs. 100 ");
                               System.out.println("3.  Chicken Fried Rice                                                                    Rs. 100 ");
                               System.out.println("4.  Beef Fried Rice                                                                       Rs. 150 ");
                               System.out.println("5.  Lamb Fried Rice                                                                       Rs. 150");
                               System.out.println("6.  Noodles with Beef in Brown Sauce                                                      Rs. 250");
                               System.out.println("7.  Sliced Noodles                                                                        Rs. 550");
                               System.out.println("8.  Rice Noodles in Red Oil                                                               Rs. 150");
                               System.out.println("9.  Steamed Turtle                                                                        Rs. 115");
                               System.out.println("10. King Prawns                                                                           Rs. 250 ");
                               System.out.println("11. Macao Portuguese Fresh Garden Oysters                                                 Rs. 135");
                               System.out.println("12. Dry-Fried Shredded Squid with Peppers                                                 Rs. 130");
                               System.out.println("13. Yangshuo Beer Fish                                                                    Rs. 250");
                               System.out.println("14. West Lake Vinegar Fish                                                                Rs. 250");
                               System.out.println("15. Sichuan Poached Fish Fillets in Hot Chili                                             Rs. 350");
                               System.out.println("16. Broth-Steamed Bass                                                                    Rs. 150");
                               System.out.println("17. Five Spice Pigeon                                                                     Rs. 100");
                               System.out.println("18. Deep Fried Pigeon in Spicy Sauce                                                      Rs. 150");
                               System.out.println("19. Pigeons Marinated in Soya Paste Sauce                                                 Rs. 200");
                               System.out.println("20. Deep-Fried Pigeon                                                                     Rs. 250");
                               System.out.println("21. Roast Goose                                                                           Rs. 300");
                               System.out.println("22. Steamed Goose Feet                                                                    Rs. 450");
                               System.out.println("23. Beijing Roast Duck                                                                    Rs. 450");
                               System.out.println("24. Quanzhou Ginger Duck                                                                  Rs. 500");
                               System.out.println("25. Nanjing Brine-Boiled Duck                                                             Rs. 250");
                               System.out.println("26. Hangzhou Old Duck Soup                                                                Rs. 150");
                               System.out.println("27. Kung Pao Chicken                                                                      Rs. 100");
                               System.out.println("28. Xinjiang Large Tray Chicken                                                           Rs. 150");
                               System.out.println("29. Chicken in Sweet and Sour Sauce                                                       Rs. 150");
                               System.out.println("30. Soft�Fried Chicken with Lemon Sauce                                                 Rs. 200");
                               System.out.println("31. Five Spice Sauce Donkey                                                               Rs. 250");
                               System.out.println("32. Ili Horse Meat                                                                        Rs. 150");
                               System.out.println("33. Roast Pork                                                                            Rs. 150");
                               System.out.println("34. Sweet and Sour Fillet of Pork                                                         Rs. 150");
                               System.out.println("35. Steamed Pork                                                                          Rs. 200");
                               System.out.println("36. Xinjiang Roast Whole Lamb                                                             Rs. 350");
                               System.out.println("37. Northeast Mutton Slice Hot Pot                                                        Rs. 150");
                               System.out.println("38. Skillet Beef                                                                          Rs. 150");
                               System.out.println("39. Stir-Fried Beef and Potatoes                                                          Rs. 300");
                               System.out.println("40. Tofu Soup                                                                             Rs. 150");
                               System.out.println("41. Vegetarian Drumstick with Western Gravy                                               Rs. 125");
                               System.out.println("42. Fried Pickle Cabbage and Bean Sprouts                                                 Rs. 130");
                               System.out.println("43. Black Pepper Beef                                                                     Rs. 150");
                               System.out.println("44. Inner Mongolia Roast Mutton                                                           Rs. 250");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Desserts or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>44)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<45)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_mc = amount_mc + chpm[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Dessert or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Alomond Jelly                                            Rs. 50");
                               System.out.println("2.  Black Sesame Roll with Soup                              Rs. 75");
                               System.out.println("3.  Chao hong guo                                            Rs. 100");
                               System.out.println("4.  Chongyang Cake                                           Rs. 125");
                               System.out.println("5.  Ice cream(Vanilla Chocolatte)                            Rs. 50");
                               System.out.println("6.  Custard tart                                             Rs. 20");
                               System.out.println("7.  Dragon's beard candy                                     Rs. 50");
                               System.out.println("8.  Egg tart                                                 Rs. 50");
                               System.out.println("9.  Funing big cake                                          Rs. 110");
                               System.out.println("10. Ginger milk curd                                         Rs. 25");
                               System.out.println("11. Mango pudding                                            Rs. 50");
                               System.out.println("12. Orange jelly candy                                       Rs. 30");
                               System.out.println("13. White sugar sponge cake                                  Rs. 200");
                               System.out.println("14. Tapioca pudding                                          Rs. 150");
                               System.out.println("15. Tanghulu                                                 Rs. 150");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Beverages or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>15)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<16)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_ds = amount_ds + chpd[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Beverage or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Pepsi                                                   Rs. 25");
                               System.out.println("2.  Coca-Cola                                               Rs. 25");
                               System.out.println("3.  Fanta                                                   Rs. 30");
                               System.out.println("4.  Maaza                                                   Rs. 35");
                               System.out.println("5.  Sprite                                                  Rs. 25");
                               System.out.println("6.  Bisleri Mineral Water                                   Rs. 20");
                               System.out.println("7.  Sinkiang Black Beer                                     Rs. 50");
                               System.out.println("8.  Chivas mixed with green tea                             Rs. 50");
                               System.out.println("9.  Tieguanyin                                              Rs. 30");
                               System.out.println("10. Jiuniang                                                Rs. 25");
                               System.out.println("11. Soybean milk                                            Rs. 50");
                               System.out.println("12. Yunnan coffee                                           Rs. 30");
                               System.out.println("13. White sugar sponge cake                                 Rs. 20");
                               System.out.println("14. Kvass                                                   Rs. 15");
                               System.out.println("15. Osmanthus wine                                          Rs. 15");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to billing or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>15)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<16)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_bv = amount_bv + chpb[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Starters:             Rs. " + amount_st);
                               System.out.println("Main Course:          Rs. " + amount_mc);
                               System.out.println("Dessert:              Rs. " + amount_ds);
                               System.out.println("Beverages:            Rs. " + amount_bv);
                               sum = amount_st+amount_ds+amount_mc+amount_bv;
                               break;
                            }     
                            case 4:
                            {
                                System.out.println(" ");
                               System.out.println("Please choose a starter or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Veg Nuggets                                                                Rs. 20");
                               System.out.println("2.  Chicken Nuggets                                                            Rs. 25");
                               System.out.println("3.  Fish Fingers                                                               Rs. 20");
                               System.out.println("4.  Chicken Wings                                                              Rs. 45");
                               System.out.println("5.  Paneer Chops                                                               Rs. 50");
                               System.out.println("6.  Hash Brown                                                                 Rs. 15");
                               System.out.println("7.  Mash Potato                                                                Rs. 75");
                               System.out.println("8.  Spring Rolls                                                               Rs. 85");
                               System.out.println("9.  Chicken Popcorn                                                            Rs. 50");
                               System.out.println("10. French Fries                                                               Rs. 20");
                               System.out.println("11. Cheesy Chicken Fries                                                       Rs. 100");
                               System.out.println("12. Breadsticks                                                                Rs. 25");
                               System.out.println("13. Garlic Bread with Cheese                                                   Rs. 50");
                               System.out.println(" ");
                               amount_st = 0;
                               amount_mc = 0;
                               amount_ds = 0;
                               amount_bv = 0;
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Main Course or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>13)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<14)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_st = amount_st + fps[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Main Course or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Veg Burger                                                                Rs. 35");
                               System.out.println("2.  Chicken Burger                                                            Rs. 45");
                               System.out.println("3.  Mutton Burger                                                             Rs. 55");
                               System.out.println("4.  King Chicken Burger                                                       Rs. 90");
                               System.out.println("5.  Veg Wrap                                                                  Rs. 75");
                               System.out.println("6.  Egg Wrap                                                                  Rs. 85");
                               System.out.println("7.  Chicken Wrap                                                              Rs. 95");
                               System.out.println("8.  Chicken-Egg Wrap                                                          Rs. 100");
                               System.out.println("9.  Mutton Wrap                                                               Rs. 150");
                               System.out.println("10. Fish-Fillet Burger                                                        Rs. 20");
                               System.out.println("11. Egg Burger                                                                Rs. 35");
                               System.out.println("12. Chicken Sausages                                                          Rs. 150");
                               System.out.println("13. Paneer Wraps                                                              Rs. 25");
                               System.out.println("14. Sausage Burger                                                            Rs. 50");
                               System.out.println("15. Pancakes with Maple Sirrup                                                Rs. 150");
                               System.out.println("16. Chicken Wings                                                             Rs. 150");
                               System.out.println("17. Foccaccia Buns                                                            Rs. 100");
                               System.out.println("18. Chicken Pizza                                                             Rs. 150");
                               System.out.println("19. Chilly Chicken Pizza                                                      Rs. 200");
                               System.out.println("20. Chicken Tikka Pizza                                                       Rs. 250");
                               System.out.println("21. Chicken Supreme                                                           Rs. 350");
                               System.out.println("22. Veg Piza                                                                  Rs. 150");
                               System.out.println("23. Cheese Pizza                                                              Rs. 100");
                               System.out.println("24. Muton Chops Pizza                                                         Rs. 400");
                               System.out.println("25. Sausago - Pizza                                                           Rs. 250");
                               System.out.println("26. Paneer Pizza                                                              Rs. 150");
                               System.out.println("27. Spicy Hot Chilli Pepper Pizza                                             Rs. 150");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Desserts or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>27)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<28)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_mc = amount_mc + fpm[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Dessert or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1. Cheese cakes                                             Rs. 15");
                               System.out.println("2. Brownie with Chocolate Sauce                             Rs. 50");
                               System.out.println("3. Soft Serve                                               Rs. 20");
                               System.out.println("4. Coka-Cola Float                                          Rs. 50");
                               System.out.println("5. Ice cream(Vanilla Chocolatte)                            Rs. 50");
                               System.out.println("6. Choco Mousse                                             Rs. 25");
                               System.out.println("7. Choco Truffle Cake                                       Rs. 75");
                               System.out.println("8. Choco Chip Lava                                          Rs. 50");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Beverages or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>8)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<9)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_ds = amount_ds + fpd[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Beverage or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1. Pepsi                                                    Rs. 25");
                               System.out.println("2. Coca-Cola                                                Rs. 25");
                               System.out.println("3. Fanta                                                    Rs. 30");
                               System.out.println("4. Maaza                                                    Rs. 35");
                               System.out.println("5. Sprite                                                   Rs. 25");
                               System.out.println("6. Tea                                                      Rs. 10");
                               System.out.println("7. Coffee                                                   Rs. 10");
                               System.out.println("8. Cold Coffee                                              Rs. 10");
                               System.out.println("9. Strawberry Milkshake                                     Rs. 20");
                               System.out.println("10. Mango Milkshake                                         Rs. 20");
                               System.out.println("11. Chocolate Milkshake                                     Rs. 25");
                               System.out.println("12. Bisleri Mineral Water                                   Rs. 20");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Main Course or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>12)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<13)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_bv = amount_bv + fpb[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Starters:               Rs. " + amount_st);
                               System.out.println("Main Course:            Rs. " + amount_mc);
                               System.out.println("Dessert:                Rs. " + amount_ds);
                               System.out.println("Beverages:              Rs. " + amount_bv);
                               sum = amount_st+amount_ds+amount_mc+amount_bv;
                               break;
                            }   
                        }
                    }
              else 
                    {
                        System.out.println("Are you sure of your decision?");
                        System.out.println(" ");
                        System.out.println("1. Yes. (I'm satisfied)");
                        System.out.println("2. No.  (Take me to the available options.) ");
                        System.out.println();
                        while(flag4==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                loop_end = Integer.parseInt(br.readLine());
                                System.out.println();
                                flag4 = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();
                                System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        flag4 = false;
                        System.out.println();
                        if(loop_end == 2)
                        {      
                            System.out.println("Please enter the choice of food you would like to have.");
                            System.out.println(" ");
                            System.out.println("1. Continental");
                            System.out.println("2. Indian");
                            System.out.println("3. Chinese");
                            System.out.println("4. Fast Food");
                            System.out.println(" ");
                            flag1 = false;
                            flag2 = false;
                        while(flag1==false)
                    {
                        try
                            {
                                ch = Integer.parseInt(br.readLine());
                                System.out.println();
                                while(ch<1 || ch>4)
                                    {
                                        tk.beep();
                                        System.out.println();
                                        System.out.println("Invalid choice. Please try again.");
                                        System.out.println();
                                        ch = Integer.parseInt(br.readLine());
                                        System.out.println();
                                    }
                                flag1=true;
                            }
                            catch(NumberFormatException a)
                                {
                                    tk.beep();
                                    System.out.println();
                                    System.out.println("Invalid Choice. Please Try Again.");
                                    System.out.println();
                                }
                    }
                    System.out.println();
                    switch (ch)
                        {
                            case 1 :
                            {
                               System.out.println(" ");
                               System.out.println("Please choose a starter or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Potato Croquet                                                                Rs. 150");
                               System.out.println("2.  Mashed New Potatoes Coated with Bread Crumbs                                  Rs. 250");
                               System.out.println("3.  Vol-au-vent                                                                   Rs. 350 ");
                               System.out.println("4.  Short crushed flaky crispy mould stuffed with various fillings                Rs. 450 ");
                               System.out.println("5.  Lamb Sizzler                                                                  Rs. 550");
                               System.out.println("6.  Grilled Prawns and Baked Rolls                                                Rs. 650");
                               System.out.println("7.  Grilled Prawn with Sweet Chilli Sauce                                         Rs. 750 ");
                               System.out.println("8.  Cocktail Prawns                                                               Rs. 850");
                               System.out.println("9.  Black Tiger Prawns Grilled with Peppers and served with Chilli Sauce          Rs. 850");
                               System.out.println("10. Fish Orly � l'anglaise                                                        Rs. 750");
                               System.out.println("11. Boneless Chicken Crumbed and Deep Fried Chicken Liver                         Rs. 1550");
                               System.out.println("12. Deep Fried Calamari                                                           Rs. 950");
                               System.out.println("13. Grilled minted Lamb Kebab served with tabouleh                                Rs. 1050");
                               System.out.println(" ");
                               amount_st = 0;
                               amount_mc = 0;
                               amount_ds = 0;
                               amount_bv = 0;
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Main Course or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {

                                            if(n<1 || n>13)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<14)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_st = amount_st + cps[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Main Course or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Cauliflower Mornay                                                                Rs. 350 ");
                               System.out.println("2.  Legume Diane                                                                      Rs. 450 ");
                               System.out.println("3.  Chicken Stroganoff                                                                Rs. 550 ");
                               System.out.println("4.  Beef Stroganoff                                                                   Rs. 650 ");
                               System.out.println("5.  Lamb Sizzler                                                                      Rs. 750");
                               System.out.println("6.  Roast Chicken with Roast Gravy                                                    Rs. 850");
                               System.out.println("7.  Fillet of beef with boiled vegetable and Mash potato                              Rs. 950");
                               System.out.println("8.  Cocktail Prawns                                                                   Rs. 1050");
                               System.out.println("9.  Poached salmon                                                                    Rs. 1150");
                               System.out.println("10. Grilled Salmon                                                                    Rs. 1250 ");
                               System.out.println("11. Spaghetti                                                                         Rs. 1350");
                               System.out.println("12. Spiral Pasta                                                                      Rs. 1350");
                               System.out.println("13. Bow Pasta                                                                         Rs. 2550");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Desserts or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>13)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<14)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_mc = amount_mc + cpm[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Dessert or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1. Cheese cakes                                             Rs. 50");
                               System.out.println("2. Brownie with chocolate Sauce                             Rs. 75");
                               System.out.println("3. Profiteroles                                             Rs. 100");
                               System.out.println("4. Gateaux                                                  Rs. 125");
                               System.out.println("5. Ice cream(Vanilla Chocolatte)                            Rs. 150");
                               System.out.println("6. Fruit Platter                                            Rs. 200");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Beverages or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>6)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<7)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_ds = amount_ds + cpd[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Beverage or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1. Pepsi                                                    Rs. 25");
                               System.out.println("2. Coca-Cola                                                Rs. 25");
                               System.out.println("3. Fanta                                                    Rs. 30");
                               System.out.println("4. Maaza                                                    Rs. 35");
                               System.out.println("5. Sprite                                                   Rs. 25");
                               System.out.println("6. Bisleri Mineral Water                                    Rs. 20");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to billing or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>6)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<7)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_bv = amount_bv + cpb[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Starters:               Rs. " + amount_st);
                               System.out.println("Main Course:            Rs. " + amount_mc);
                               System.out.println("Dessert:                Rs. " + amount_ds);
                               System.out.println("Beverages:              Rs. " + amount_bv);
                               sum = amount_st+amount_ds+amount_mc+amount_bv;
                               break;
                            }
                            case 2:
                                {
                               System.out.println(" ");
                               System.out.println("Please choose a starter or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Aloo ki Tikki                                                                Rs. 25");
                               System.out.println("2.  Momo                                                                         Rs. 25");
                               System.out.println("3.  Vada pav                                                                     Rs. 35");
                               System.out.println("4.  Amritsari fish                                                               Rs. 45");
                               System.out.println("5.  Butter Chicken                                                               Rs. 55");
                               System.out.println("6.  Chaat                                                                        Rs. 35");
                               System.out.println("7.  Dum Aloo                                                                     Rs. 25");
                               System.out.println("8.  Gajar ka Halwa                                                               Rs. 35");
                               System.out.println("9.  Jeera aloo                                                                   Rs. 45");
                               System.out.println("10. Kadai paneer                                                                 Rs. 40");
                               System.out.println("11. Paneer butter masala                                                         Rs. 50");
                               System.out.println("12. Pani Puri                                                                    Rs. 15");
                               System.out.println("13. Samosa                                                                       Rs. 15");
                               System.out.println("14. Shahi paneer                                                                 Rs. 45");
                               System.out.println("15. Chicken 65                                                                   Rs. 40");
                               System.out.println("16. Omlette                                                                      Rs. 20");
                               System.out.println("17. Vada                                                                         Rs. 15");
                               System.out.println(" ");
                               amount_st = 0;
                               amount_mc = 0;
                               amount_ds = 0;
                               amount_bv = 0;
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Main Course or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>17)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<18)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_st = amount_st + ips[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Main Course or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Plain Rice                                                                       Rs. 30");
                               System.out.println("2.  Jeera Rice                                                                       Rs. 30");
                               System.out.println("3.  Lemon Rice                                                                       Rs. 25");
                               System.out.println("4.  Chicken Biryani                                                                  Rs. 45");
                               System.out.println("5.  Mutton Biryani                                                                   Rs. 50");
                               System.out.println("6.  Veg Pulao                                                                        Rs. 40");
                               System.out.println("7.  Chicken Pulao                                                                    Rs. 35");
                               System.out.println("8.  Mutton Pulao                                                                     Rs. 35");
                               System.out.println("9.  Veg Fried Rice                                                                   Rs. 40");
                               System.out.println("10. Chicken Fried Rice                                                               Rs. 50");
                               System.out.println("11. Mutton Fried Rice                                                                Rs. 55");
                               System.out.println("12. Mixed Fried Rice                                                                 Rs. 55");
                               System.out.println("13. French Toast                                                                     Rs. 60");
                               System.out.println("14. Red Rice                                                                         Rs. 25");
                               System.out.println("15. Paratha                                                                          Rs. 35");
                               System.out.println("16. Chapathi                                                                         Rs. 15");
                               System.out.println("17. Roti                                                                             Rs. 10");
                               System.out.println("18. Vada Pao                                                                         Rs. 15");
                               System.out.println("19. Palak Paneer                                                                     Rs. 15");
                               System.out.println("20. Kadai Paneer                                                                     Rs. 25");
                               System.out.println("21. Chicken Tikka                                                                    Rs. 30");
                               System.out.println("22. Chicken Kadai Masala                                                             Rs. 40");
                               System.out.println("23. Khichdi                                                                          Rs. 45");
                               System.out.println("24. Gajar ka Halwa                                                                   Rs. 55");
                               System.out.println("25. Poha                                                                             Rs. 25");
                               System.out.println("26. Dal                                                                              Rs. 25");
                               System.out.println("27. Chole Bature                                                                     Rs. 10");
                               System.out.println("28. Chicken Razala                                                                   Rs. 15");
                               System.out.println("29. Aloo Paratha                                                                     Rs. 40");
                               System.out.println("30. Paneer Paratha                                                                   Rs. 20");
                               System.out.println("31. Dosa                                                                             Rs. 25");
                               System.out.println("32. Idli                                                                             Rs. 15");
                               System.out.println("33. Bisi Bele Bath                                                                   Rs. 10");
                               System.out.println("34. Uttapam                                                                          Rs. 15");
                               System.out.println("35. Fish Fry                                                                         Rs. 20");
                               System.out.println("36. Fish Tikka                                                                       Rs. 35");
                               System.out.println("37. Hilsa Fish Curry                                                                 Rs. 40");
                               System.out.println("38. Bombay Duck Curry                                                                Rs. 45");
                               System.out.println("39. Rohu Curry                                                                       Rs. 30");
                               System.out.println("40. Catla Chops                                                                      Rs. 25");
                               System.out.println("41. Baked Fish                                                                       Rs. 25");
                               System.out.println("42. Puri                                                                             Rs. 30");
                               System.out.println("43. Pav Bhajji                                                                       Rs. 15");
                               System.out.println("44. Chicken Lollipop                                                                 Rs. 30");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Desserts or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>44)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<45)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_mc = amount_mc + ipm[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Dessert or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Til Pitha                                            Rs. 10");
                               System.out.println("2.  Tenga Doi                                            Rs. 10");
                               System.out.println("3.  Mishti Doi                                           Rs. 15");
                               System.out.println("4.  Shondesh                                             Rs. 20");
                               System.out.println("5.  Rasgulla                                             Rs. 15");
                               System.out.println("6.  Peda                                                 Rs. 15");
                               System.out.println("7.  Gulab Jamun                                          Rs. 20");
                               System.out.println("8.  Caramel Pudding                                      Rs. 25");
                               System.out.println("9.  Mango Custard                                        Rs. 25");
                               System.out.println("10. Son papdi                                            Rs. 20");
                               System.out.println("11. Modak                                                Rs. 20");
                               System.out.println("12. Laddu                                                Rs. 20");
                               System.out.println("13. Jalebi                                               Rs. 25");
                               System.out.println("14. Dhokla                                               Rs. 20");
                               System.out.println("15. Dahi Vada                                            Rs. 25");
                               System.out.println("16. Chaat                                                Rs. 20");
                               System.out.println("17. Barfi                                                Rs. 20");
                               System.out.println("18. Kulfi                                                Rs. 20");
                               System.out.println("19. Ice Cream                                            Rs. 25");
                               System.out.println("20. Salad                                                Rs. 20");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Beverages or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>20)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<21)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_ds = amount_ds + ipd[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Beverage or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Pepsi                                                    Rs. 25");
                               System.out.println("2.  Coca-Cola                                                Rs. 25");
                               System.out.println("3.  Fanta                                                    Rs. 30");
                               System.out.println("4.  Maaza                                                    Rs. 35");
                               System.out.println("5.  Sprite                                                   Rs. 25");
                               System.out.println("6.  Mango Shake                                              Rs. 20");
                               System.out.println("7.  Strawberry Shake                                         Rs. 20");
                               System.out.println("8.  Orange Juice                                             Rs. 15");
                               System.out.println("9.  Mango Juice                                              Rs. 15");
                               System.out.println("10. Watermelon Juice                                         Rs. 15");
                               System.out.println("11. Banana Shake                                             Rs. 20");
                               System.out.println("12. Lassi                                                    Rs. 10");
                               System.out.println("13. Curd                                                     Rs. 10");
                               System.out.println("14. Vanilla Shake                                            Rs. 20");
                               System.out.println("15. Thumbs Up                                                Rs. 20");
                               System.out.println("16. Bisleri Mineral Water                                    Rs. 20");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to billing or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>16)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<17)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_bv = amount_bv + ipb[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Starters:               Rs. " + amount_st);
                               System.out.println("Main Course:            Rs. " + amount_mc);
                               System.out.println("Dessert:                Rs. " + amount_ds);
                               System.out.println("Beverages:              Rs. " + amount_bv);
                               System.out.println(" ");
                               sum = amount_st+amount_ds+amount_mc+amount_bv;
                               break;
                            }
                            case 3:
                                {
                               System.out.println(" ");
                               System.out.println("Please choose a starter or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Prawn and Chive Potstickers                                                                 Rs. 150");
                               System.out.println("2.  Steam Pork and Mushroom Dumplings                                                           Rs. 250");
                               System.out.println("3.  Smoky Hot Scallops and Chives                                                               Rs. 350 ");
                               System.out.println("4.  Spicy Soy Ribs with Sweet and Sour Slaw                                                     Rs. 450 ");
                               System.out.println("5.  Grilled Coconut Lobster                                                                     Rs. 550");
                               System.out.println("6.  Pork and Prawn Dumplings                                                                    Rs. 600");
                               System.out.println("7.  Golden Gate Chilli Ribs                                                                     Rs. 550 ");
                               System.out.println("8.  Pork and Prawn Boiled Wontons                                                               Rs. 250");
                               System.out.println("9.  Chinese Chicken Salad                                                                       Rs. 150");
                               System.out.println("10. Mini Taiwanese Meatballs                                                                    Rs. 450");
                               System.out.println("11. Vegetable Lettuce Wraps                                                                     Rs. 150");
                               System.out.println("12. Crispy Salt and Pepper Chicken                                                              Rs. 350");
                               System.out.println("13. Steamed Egg with Scallops and Caviar                                                        Rs. 150");
                               System.out.println("14. Lettuce Cups with Tofu and Beef                                                             Rs. 200");
                               System.out.println("15. Tea Smoked Chicken                                                                          Rs. 150");
                               System.out.println("16. Baked Spring Rolls                                                                          Rs. 100");
                               System.out.println("17. Zesty Chilli Tiger Prawn                                                                    Rs. 150");
                               System.out.println("18. Stir Fried Vegetable Wraps                                                                  Rs. 45");
                               System.out.println("19. Five-Spice Roasted Chicken Drumsticks                                                       Rs. 100");
                               System.out.println("20. Veg Momo                                                                                    Rs. 25");
                               System.out.println("21. Chicken Momo                                                                                Rs. 30");
                               System.out.println("22. Hot and Sour Chicken Soup                                                                   Rs. 40");
                               System.out.println(" ");
                               amount_st = 0;
                               amount_mc = 0;
                               amount_ds = 0;
                               amount_bv = 0;
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Main Course or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>22)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<23)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_st = amount_st + chps[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Main Course or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Egg Fried Rice                                                                        Rs. 50 ");
                               System.out.println("2.  Veg Fried Rice                                                                        Rs. 100 ");
                               System.out.println("3.  Chicken Fried Rice                                                                    Rs. 100 ");
                               System.out.println("4.  Beef Fried Rice                                                                       Rs. 150 ");
                               System.out.println("5.  Lamb Fried Rice                                                                       Rs. 150");
                               System.out.println("6.  Noodles with Beef in Brown Sauce                                                      Rs. 250");
                               System.out.println("7.  Sliced Noodles                                                                        Rs. 550");
                               System.out.println("8.  Rice Noodles in Red Oil                                                               Rs. 150");
                               System.out.println("9.  Steamed Turtle                                                                        Rs. 115");
                               System.out.println("10. King Prawns                                                                           Rs. 250 ");
                               System.out.println("11. Macao Portuguese Fresh Garden Oysters                                                 Rs. 135");
                               System.out.println("12. Dry-Fried Shredded Squid with Peppers                                                 Rs. 130");
                               System.out.println("13. Yangshuo Beer Fish                                                                    Rs. 250");
                               System.out.println("14. West Lake Vinegar Fish                                                                Rs. 250");
                               System.out.println("15. Sichuan Poached Fish Fillets in Hot Chili                                             Rs. 350");
                               System.out.println("16. Broth-Steamed Bass                                                                    Rs. 150");
                               System.out.println("17. Five Spice Pigeon                                                                     Rs. 100");
                               System.out.println("18. Deep Fried Pigeon in Spicy Sauce                                                      Rs. 150");
                               System.out.println("19. Pigeons Marinated in Soya Paste Sauce                                                 Rs. 200");
                               System.out.println("20. Deep-Fried Pigeon                                                                     Rs. 250");
                               System.out.println("21. Roast Goose                                                                           Rs. 300");
                               System.out.println("22. Steamed Goose Feet                                                                    Rs. 450");
                               System.out.println("23. Beijing Roast Duck                                                                    Rs. 450");
                               System.out.println("24. Quanzhou Ginger Duck                                                                  Rs. 500");
                               System.out.println("25. Nanjing Brine-Boiled Duck                                                             Rs. 250");
                               System.out.println("26. Hangzhou Old Duck Soup                                                                Rs. 150");
                               System.out.println("27. Kung Pao Chicken                                                                      Rs. 100");
                               System.out.println("28. Xinjiang Large Tray Chicken                                                           Rs. 150");
                               System.out.println("29. Chicken in Sweet and Sour Sauce                                                       Rs. 150");
                               System.out.println("30. Soft�Fried Chicken with Lemon Sauce                                                   Rs. 200");
                               System.out.println("31. Five Spice Sauce Donkey                                                               Rs. 250");
                               System.out.println("32. Ili Horse Meat                                                                        Rs. 150");
                               System.out.println("33. Roast Pork                                                                            Rs. 150");
                               System.out.println("34. Sweet and Sour Fillet of Pork                                                         Rs. 150");
                               System.out.println("35. Steamed Pork                                                                          Rs. 200");
                               System.out.println("36. Xinjiang Roast Whole Lamb                                                             Rs. 350");
                               System.out.println("37. Northeast Mutton Slice Hot Pot                                                        Rs. 150");
                               System.out.println("38. Skillet Beef                                                                          Rs. 150");
                               System.out.println("39. Stir-Fried Beef and Potatoes                                                          Rs. 300");
                               System.out.println("40. Tofu Soup                                                                             Rs. 150");
                               System.out.println("41. Vegetarian Drumstick with Western Gravy                                               Rs. 125");
                               System.out.println("42. Fried Pickle Cabbage and Bean Sprouts                                                 Rs. 130");
                               System.out.println("43. Black Pepper Beef                                                                     Rs. 150");
                               System.out.println("44. Inner Mongolia Roast Mutton                                                           Rs. 250");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Desserts or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>44)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<45)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_mc = amount_mc + chpm[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Dessert or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Alomond Jelly                                            Rs. 50");
                               System.out.println("2.  Black Sesame Roll with Soup                              Rs. 75");
                               System.out.println("3.  Chao hong guo                                            Rs. 100");
                               System.out.println("4.  Chongyang Cake                                           Rs. 125");
                               System.out.println("5.  Ice cream(Vanilla Chocolatte)                            Rs. 50");
                               System.out.println("6.  Custard tart                                             Rs. 20");
                               System.out.println("7.  Dragon's beard candy                                     Rs. 50");
                               System.out.println("8.  Egg tart                                                 Rs. 50");
                               System.out.println("9.  Funing big cake                                          Rs. 110");
                               System.out.println("10. Ginger milk curd                                         Rs. 25");
                               System.out.println("11. Mango pudding                                            Rs. 50");
                               System.out.println("12. Orange jelly candy                                       Rs. 30");
                               System.out.println("13. White sugar sponge cake                                  Rs. 200");
                               System.out.println("14. Tapioca pudding                                          Rs. 150");
                               System.out.println("15. Tanghulu                                                 Rs. 150");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Beverages or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>15)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<16)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_ds = amount_ds + chpd[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Beverage or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Pepsi                                                   Rs. 25");
                               System.out.println("2.  Coca-Cola                                               Rs. 25");
                               System.out.println("3.  Fanta                                                   Rs. 30");
                               System.out.println("4.  Maaza                                                   Rs. 35");
                               System.out.println("5.  Sprite                                                  Rs. 25");
                               System.out.println("6.  Bisleri Mineral Water                                   Rs. 20");
                               System.out.println("7.  Sinkiang Black Beer                                     Rs. 50");
                               System.out.println("8.  Chivas mixed with green tea                             Rs. 50");
                               System.out.println("9.  Tieguanyin                                              Rs. 30");
                               System.out.println("10. Jiuniang                                                Rs. 25");
                               System.out.println("11. Soybean milk                                            Rs. 50");
                               System.out.println("12. Yunnan coffee                                           Rs. 30");
                               System.out.println("13. White sugar sponge cake                                 Rs. 20");
                               System.out.println("14. Kvass                                                   Rs. 15");
                               System.out.println("15. Osmanthus wine                                          Rs. 15");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to billing or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>15)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<16)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_bv = amount_bv + chpb[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Starters:             Rs. " + amount_st);
                               System.out.println("Main Course:          Rs. " + amount_mc);
                               System.out.println("Dessert:              Rs. " + amount_ds);
                               System.out.println("Beverages:            Rs. " + amount_bv);
                               sum = amount_st+amount_ds+amount_mc+amount_bv;
                               break;
                            }     
                            case 4:
                            {
                                System.out.println(" ");
                               System.out.println("Please choose a starter or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Veg Nuggets                                                                Rs. 20");
                               System.out.println("2.  Chicken Nuggets                                                            Rs. 25");
                               System.out.println("3.  Fish Fingers                                                               Rs. 20");
                               System.out.println("4.  Chicken Wings                                                              Rs. 45");
                               System.out.println("5.  Paneer Chops                                                               Rs. 50");
                               System.out.println("6.  Hash Brown                                                                 Rs. 15");
                               System.out.println("7.  Mash Potato                                                                Rs. 75");
                               System.out.println("8.  Spring Rolls                                                               Rs. 85");
                               System.out.println("9.  Chicken Popcorn                                                            Rs. 50");
                               System.out.println("10. French Fries                                                               Rs. 20");
                               System.out.println("11. Cheesy Chicken Fries                                                       Rs. 100");
                               System.out.println("12. Breadsticks                                                                Rs. 25");
                               System.out.println("13. Garlic Bread with Cheese                                                   Rs. 50");
                               System.out.println(" ");
                               amount_st = 0;
                               amount_mc = 0;
                               amount_ds = 0;
                               amount_bv = 0;
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Main Course or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>13)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<14)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_st = amount_st + fps[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Main Course or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1.  Veg Burger                                                                Rs. 35");
                               System.out.println("2.  Chicken Burger                                                            Rs. 45");
                               System.out.println("3.  Mutton Burger                                                             Rs. 55");
                               System.out.println("4.  King Chicken Burger                                                       Rs. 90");
                               System.out.println("5.  Veg Wrap                                                                  Rs. 75");
                               System.out.println("6.  Egg Wrap                                                                  Rs. 85");
                               System.out.println("7.  Chicken Wrap                                                              Rs. 95");
                               System.out.println("8.  Chicken-Egg Wrap                                                          Rs. 100");
                               System.out.println("9.  Mutton Wrap                                                               Rs. 150");
                               System.out.println("10. Fish-Fillet Burger                                                        Rs. 20");
                               System.out.println("11. Egg Burger                                                                Rs. 35");
                               System.out.println("12. Chicken Sausages                                                          Rs. 150");
                               System.out.println("13. Paneer Wraps                                                              Rs. 25");
                               System.out.println("14. Sausage Burger                                                            Rs. 50");
                               System.out.println("15. Pancakes with Maple Sirrup                                                Rs. 150");
                               System.out.println("16. Chicken Wings                                                             Rs. 150");
                               System.out.println("17. Foccaccia Buns                                                            Rs. 100");
                               System.out.println("18. Chicken Pizza                                                             Rs. 150");
                               System.out.println("19. Chilly Chicken Pizza                                                      Rs. 200");
                               System.out.println("20. Chicken Tikka Pizza                                                       Rs. 250");
                               System.out.println("21. Chicken Supreme                                                           Rs. 350");
                               System.out.println("22. Veg Piza                                                                  Rs. 150");
                               System.out.println("23. Cheese Pizza                                                              Rs. 100");
                               System.out.println("24. Muton Chops Pizza                                                         Rs. 400");
                               System.out.println("25. Sausago - Pizza                                                           Rs. 250");
                               System.out.println("26. Paneer Pizza                                                              Rs. 150");
                               System.out.println("27. Spicy Hot Chilli Pepper Pizza                                             Rs. 150");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Desserts or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>27)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<28)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_mc = amount_mc + fpm[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Dessert or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1. Cheese cakes                                             Rs. 15");
                               System.out.println("2. Brownie with Chocolate Sauce                             Rs. 50");
                               System.out.println("3. Soft Serve                                               Rs. 20");
                               System.out.println("4. Coka-Cola Float                                          Rs. 50");
                               System.out.println("5. Ice cream(Vanilla Chocolatte)                            Rs. 50");
                               System.out.println("6. Choco Mousse                                             Rs. 25");
                               System.out.println("7. Choco Truffle Cake                                       Rs. 75");
                               System.out.println("8. Choco Chip Lava                                          Rs. 50");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Beverages or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>8)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<9)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_ds = amount_ds + fpd[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Please choose a Beverage or press ENTER:");
                               System.out.println(" ");
                               System.out.println("1. Pepsi                                                    Rs. 25");
                               System.out.println("2. Coca-Cola                                                Rs. 25");
                               System.out.println("3. Fanta                                                    Rs. 30");
                               System.out.println("4. Maaza                                                    Rs. 35");
                               System.out.println("5. Sprite                                                   Rs. 25");
                               System.out.println("6. Tea                                                      Rs. 10");
                               System.out.println("7. Coffee                                                   Rs. 10");
                               System.out.println("8. Cold Coffee                                              Rs. 10");
                               System.out.println("9. Strawberry Milkshake                                     Rs. 20");
                               System.out.println("10. Mango Milkshake                                         Rs. 20");
                               System.out.println("11. Chocolate Milkshake                                     Rs. 25");
                               System.out.println("12. Bisleri Mineral Water                                   Rs. 20");
                               System.out.println(" ");
                               exit = null;
                               flag1 = flag2 = false;
                               while(exit != "")
                                    {
                                        System.out.println("Are you done? press ENTER to skip to Main Course or Type dish number to continue:");
                                        System.out.println();
                                        exit = br.readLine();
                                        System.out.println();
                                        if(exit.equals("") || exit.equals("") || exit.equals(""))
                                        break;
                                        else 
                                        {
                                            n = Integer.parseInt(exit);
                                            if(n<1 || n>12)
                                                {
                                                    flag2 = false;
                                                    while(flag2==false)
                                                        {
                                                            tk.beep();
                                                            System.out.println("Invalid Choice. Please try again.");
                                                            System.out.println();
                                                            n = Integer.parseInt(br.readLine());
                                                            System.out.println();
                                                            if(n>0 && n<13)
                                                            flag2= true;
                                                        }
                                                }
                                            amount_bv = amount_bv + fpb[n];
                                        }
                                    }
                               System.out.println(" ");
                               System.out.println("Starters:               Rs. " + amount_st);
                               System.out.println("Main Course:            Rs. " + amount_mc);
                               System.out.println("Dessert:                Rs. " + amount_ds);
                               System.out.println("Beverages:              Rs. " + amount_bv);
                               sum = amount_st+amount_ds+amount_mc+amount_bv;
                               break;
                            }
                        }
                    }
                } 
          int y1 = calc(sum);
       } 
       public static int calc(int sum)
       {
            tax =(int)((14.0/100.0)*sum);
            System.out.println();
            System.out.println("Amount :                Rs. " + sum);
            System.out.println("Taxes :                 Rs. " + tax);
            gross = sum + tax;
            System.out.println();
            System.out.println("Your Net Amount :       Rs. " + gross); 
            System.out.println();
            return ((int)(gross));
       }
        public static void bill2()
       {
           System.out.println("In-flight dining:           Rs. "+ gross);
       }
}








