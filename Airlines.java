import java.util.*;
import java.io.*;
import java.awt.Toolkit;
class Airlines 
{
    static Toolkit tk = Toolkit.getDefaultToolkit();
    static boolean flag;
    static int ch,no,total;
    static double tax;
    static String fullname, email, phone;
    static int i, ctr, finalprice, choice, choice2, choice3, y2;
    static String deptime[] = {"6:40", "6:50", "7:45", "8:20", "9:40", "10:20", "10:40", "10:55", "11:45", "13:10", "14:55", "17:45", "19:25", "22:15"};
    static String deploc[] = {"Bangalore", "Delhi", "Mumbai", "Chennai", "Kolkata", "Bhubaneshwar", "Srinagar", "Hyderabad", "Varanasi", "Andaman and Nicobar Islands"};
    static String arrloc[] = {"Bangalore", "Delhi", "Mumbai", "Chennai", "Kolkata", "Bhubaneshwar", "Srinagar", "Hyderabad", "Varanasi", "Andaman and Nicobar Islands", "Panaji"};
    static int price_per_head1[] = {1943, 2500, 1900, 2190, 1234, 2283, 1233, 1456, 1567, 3456, 1245, 3478, 3435, 3334};
    static String airlines[] = {"AirIndia", "Air India Express", "AirAsia India", "Air Costa", "Blue Dart Aviation", "Deccan Charters", "Fly Easy", "Go Air", "Indigo", "Invision Air", "Jagson Airlines", "JetKonnect", "Jet Airways", "Spicejet"};
    Airlines()
    {
     ch = 0; 
     choice = 0;
     choice3 = 0;
     flag = false;
    }
    public static void planes() throws IOException
    {
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        System.out.println("IMPORTANT NOTE: If you enter a choice apart from the available options, for security reasons, you shall be redirected to the in-flight cuisine options." + '\n' + "Thank you for your consideration. We hope you enjoy your experience with us." + '\n');
        System.out.println("Enter location of departure");
        System.out.println();
        System.out.println("1 -  Bangalore");
        System.out.println("2 -  Delhi");
        System.out.println("3 -  Mumbai");
        System.out.println("4 -  Chennai");
        System.out.println("5 -  Kolkata");
        System.out.println("6 -  Bhubaneshwar");
        System.out.println("7 -  Srinagar");
        System.out.println("8 -  Hyderabad");
        System.out.println("9 -  Varanasi");
        System.out.println("10 - Andaman and Nicobar Islands");
        System.out.println();
        while(flag==false)
           {
              try
                {
                    System.out.println("Enter your choice:");
                    System.out.println();
                    choice = Integer.parseInt(br.readLine());
                    System.out.println();
                    flag = true;
                }
              catch(NumberFormatException a)
                {
                    tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                    System.out.println();
                }
            }
        flag = false;
        switch (choice)
        {
            case 1:
            {
                System.out.println("Enter location of arrival");
                System.out.println();
                System.out.println("1 -  Delhi");
                System.out.println("2 -  Mumbai");
                System.out.println("3 -  Chennai");
                System.out.println("4 -  Kolkata");
                System.out.println("5 -  Bhubaneshwar");
                System.out.println("6 -  Srinagar");
                System.out.println("7 -  Hyderabad");
                System.out.println("8 -  Varanasi");
                System.out.println("9 - Andaman and Nicobar Islands");
                System.out.println("10 - Panaji");
                System.out.println();
                while(flag==false)
                {
                    try
                    {
                        System.out.println("Enter your choice:");
                        System.out.println();
                        choice2 = Integer.parseInt(br.readLine());
                        System.out.println();
                        flag = true;
                    }
                    catch(NumberFormatException b)
                    {
                        tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                        System.out.println();
                    }
                }
                flag = false; 
                switch(choice2)
                {
                    case 1:
                    { 
                        System.out.println("Possible airline options for selected departure and arrival location");
                        System.out.println();
                        System.out.println("1  -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2  -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3  -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4  -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5  -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40");
                        System.out.println("6  -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7  -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8  -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9  -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 -  Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 -  Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 -  JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 -  Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 -  SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                        System.out.println();
                        flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                System.out.println();
                                flag = true;
                            }
                            catch(NumberFormatException c)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        System.out.println();
                        no = in.nextInt();
                        System.out.println();
                        total = price_per_head1[ch-1]*no;
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");
                        System.out.println();
                        fullname = br.readLine();
                        System.out.println();
                        System.out.println("Enter your email id");
                        System.out.println();
                        email = br.readLine();
                        System.out.println();
                        System.out.println("Enter your 10 digit phone number");
                        System.out.println();
                        phone = br.readLine();
                        System.out.println();
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           " + email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: " + deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();  
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                System.out.println();
                                flag = true;
                            }
                            catch(NumberFormatException d)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        System.out.println();
                        no = in.nextInt();
                        System.out.println();
                        total = price_per_head1[ch-1]*no;
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");
                        System.out.println();
                        fullname = br.readLine();
                        System.out.println();
                        System.out.println("Enter your email id");
                        System.out.println();
                        email = br.readLine();
                        System.out.println();
                        System.out.println("Enter your 10 digit phone number");
                        System.out.println();
                        phone = br.readLine();
                        System.out.println();
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 3: 
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException e)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException f)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException g)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException h)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException i)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 8:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException j)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 9:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException k)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 10:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException l)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }//End of case10
                }//End of case 1
                break;
            }
            case 2:
                {
                System.out.println("Enter location of arrival");
                
                System.out.println("1 - Bangalore");
                System.out.println("2 - Mumbai");
                System.out.println("3 - Chennai");
                System.out.println("4 - Kolkata");
                System.out.println("5 - Bhubaneshwar");
                System.out.println("6 - Srinagar");
                System.out.println("7 - Hyderabad");
                System.out.println("8- Varanasi");
                System.out.println("9 - Andaman and Nicobar Islands");
                System.out.println("10 - Panaji");
                
                System.out.println("Enter your choice (1-10)");
                while(flag==false)
                {
                    try
                    {
                        System.out.println("Enter your choice:");
                        System.out.println();
                        choice2 = Integer.parseInt(br.readLine());
                        flag = true;
                    }
                    catch(NumberFormatException a)
                    {
                        tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                        System.out.println();
                    }
                }
                
                flag = false; switch(choice2)
                {
                    case 1:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");
                        fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        break;
                    }
                    case 3: 
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                    }
                    case 5:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        break;
                    }
                    case 8:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        break;
                    }
                    case 9:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        break;
                    }
                    case 10:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }//End of case11
                }
                break;
            }
            case 3:
            {
                System.out.println("Enter location of arrival");
                
                System.out.println("1 - Bangalore");
                System.out.println("2 - Delhi");
                System.out.println("3 - Chennai");
                System.out.println("4 - Kolkata");
                System.out.println("5 - Bhubaneshwar");
                System.out.println("6 - Srinagar");
                System.out.println("7 - Hyderabad");
                System.out.println("8 - Varanasi");
                System.out.println("9 - Andaman and Nicobar Islands");
                System.out.println("10 - Panaji");
                
                System.out.println("Enter your choice (1-10)");
                while(flag==false)
                {
                    try
                    {
                        System.out.println("Enter your choice:");
                        System.out.println();
                        choice2 = Integer.parseInt(br.readLine());
                        flag = true;
                    }
                    catch(NumberFormatException a)
                    {
                        tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                        System.out.println();
                    }
                }
                
                flag = false; switch(choice2)
                {
                    case 1:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");
                        fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 2:
                    { 
                        
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();    
                        break;
                    }
                    case 3: 
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 8:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 9:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 10:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }//End of case11
                }
                break;
            }
            case 4:
            {
                System.out.println("Enter location of arrival");
                
                System.out.println("1 - Bangalore");
                System.out.println("2 - Delhi");
                System.out.println("3 - Mumbai");
                System.out.println("4 - Kolkata");
                System.out.println("5 - Bhubaneshwar");
                System.out.println("6 - Srinagar");
                System.out.println("7 - Hyderabad");
                System.out.println("8 - Varanasi");
                System.out.println("9 - Andaman and Nicobar Islands");
                System.out.println("10 - Panaji");
                
                System.out.println("Enter your choice (1-10)");
                while(flag==false)
                {
                    try
                    {
                        System.out.println("Enter your choice:");
                        System.out.println();
                        choice2 = Integer.parseInt(br.readLine());
                        flag = true;
                    }
                    catch(NumberFormatException a)
                    {
                        tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                        System.out.println();
                    }
                }
                
                flag = false; switch(choice2)
                {
                    case 1:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");
                        fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 2:
                    { 
                        
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 8:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 9:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 10:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }//End of case11
                } 
                break;
            }
            case 5:
            {
                System.out.println("Enter location of arrival");
                
                System.out.println("1 - Bangalore");
                System.out.println("2 - Delhi");
                System.out.println("3 - Mumbai");
                System.out.println("4 - Chennai");
                System.out.println("5 - Bhubaneshwar");
                System.out.println("6 - Srinagar");
                System.out.println("7 - Hyderabad");
                System.out.println("8 - Varanasi");
                System.out.println("9 - Andaman and Nicobar Islands");
                System.out.println("10 - Panaji");
                
                System.out.println("Enter your choice (1-10)");
                while(flag==false)
                {
                    try
                    {
                        System.out.println("Enter your choice:");
                        System.out.println();
                        choice2 = Integer.parseInt(br.readLine());
                        flag = true;
                    }
                    catch(NumberFormatException a)
                    {
                        tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                        System.out.println();
                    }
                }
                
                flag = false; switch(choice2)
                {
                    case 1:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");
                        fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 2:
                    { 
                        
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();  
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 4: 
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 8:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 9:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 10:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }//End of case11
                }
                break;
            }
            case 6:
            {
                System.out.println("Enter location of arrival");
                
                System.out.println("1 - Bangalore");
                System.out.println("2 - Delhi");
                System.out.println("3 - Mumbai");
                System.out.println("4 - Chennai");
                System.out.println("5 - Kolkata");
                System.out.println("6 - Srinagar");
                System.out.println("7 - Hyderabad");
                System.out.println("8 - Varanasi");
                System.out.println("9 - Andaman and Nicobar Islands");
                System.out.println("10 - Panaji");
                
                System.out.println("Enter your choice (1-10)");
                while(flag==false)
                {
                    try
                    {
                        System.out.println("Enter your choice:");
                        System.out.println();
                        choice2 = Integer.parseInt(br.readLine());
                        flag = true;
                    }
                    catch(NumberFormatException a)
                    {
                        tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                        System.out.println();
                    }
                }
                
                flag = false; switch(choice2)
                {
                    case 1:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");
                        fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 2:
                    { 
                        
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println(); 
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 4: 
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 8:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 9:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 10:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }//End of case11
                }
                break;
            }
            case 7:
            {
                System.out.println("Enter location of arrival");
                
                System.out.println("1 - Bangalore");
                System.out.println("2 - Delhi");
                System.out.println("3 - Mumbai");
                System.out.println("4 - Chennai");
                System.out.println("5 - Kolkata");
                System.out.println("6 - Bhubaneshwar");
                System.out.println("7 - Hyderabad");
                System.out.println("8 - Varanasi");
                System.out.println("9 - Andaman and Nicobar Islands");
                System.out.println("10 - Panaji");
                
                
                System.out.println("Enter your choice (1-10)");
                while(flag==false)
                {
                    try
                    {
                        System.out.println("Enter your choice:");
                        System.out.println();
                        choice2 = Integer.parseInt(br.readLine());
                        flag = true;
                    }
                    catch(NumberFormatException a)
                    {
                        tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                        System.out.println();
                    }
                }
                
                flag = false; switch(choice2)
                {
                    case 1:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");
                        fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 2:
                    { 
                        
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();  
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 4: 
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 8:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 9:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 10:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }//End of case11
                }
                break;
            }
            case 8:
            {
                System.out.println("Enter location of arrival");
                
                System.out.println("1 - Bangalore");
                System.out.println("2 - Delhi");
                System.out.println("3 - Mumbai");
                System.out.println("4 - Chennai");
                System.out.println("5 - Kolkata");
                System.out.println("6 - Bhubaneshwar");
                System.out.println("7 - Srinagar");
                System.out.println("8 - Varanasi");
                System.out.println("9 - Andaman and Nicobar Islands");
                System.out.println("10 - Panaji");
                ;
                
                System.out.println("Enter your choice (1-10)");
                while(flag==false)
                {
                    try
                    {
                        System.out.println("Enter your choice:");
                        System.out.println();
                        choice2 = Integer.parseInt(br.readLine());
                        flag = true;
                    }
                    catch(NumberFormatException a)
                    {
                        tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                        System.out.println();
                    }
                }
                
                flag = false; switch(choice2)
                {
                    case 1:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");
                        fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 2:
                    { 
                        
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 4: 
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 8:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 9:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 10:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }//End of case11
                }
                break;
            }
            case 9:
            {
                System.out.println("Enter location of arrival");
                
                System.out.println("1 - Bangalore");
                System.out.println("2 - Delhi");
                System.out.println("3 - Mumbai");
                System.out.println("4 - Chennai");
                System.out.println("5 - Kolkata");
                System.out.println("6 - Bhubaneshwar");
                System.out.println("7 - Srinagar");
                System.out.println("8 - Hyderabad");
                System.out.println("9 - Andaman and Nicobar Islands");
                System.out.println("10 - Panaji");
                
                System.out.println("Enter your choice (1-10)");
                while(flag==false)
                {
                    try
                    {
                        System.out.println("Enter your choice:");
                        System.out.println();
                        choice2 = Integer.parseInt(br.readLine());
                        flag = true;
                    }
                    catch(NumberFormatException a)
                    {
                        tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                        System.out.println();
                    }
                }
                
                flag = false; switch(choice2)
                {
                    case 1:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 - Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 - Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 - AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 - Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 - Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 - Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 - Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 - GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 - IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                  Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines               Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                    Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                   Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                      Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");
                        fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 2:
                    { 
                        
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();           
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 4: 
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        ch = in.nextInt();
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 8:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 9:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 10:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }//End of case11
                }
                break;
            }
            case 10:
            {
                System.out.println("Enter location of arrival");
                
                System.out.println("1 - Bangalore");
                System.out.println("2 - Delhi");
                System.out.println("3 - Mumbai");
                System.out.println("4 - Chennai");
                System.out.println("5 - Kolkata");
                System.out.println("6 - Bhubaneshwar");
                System.out.println("7 - Srinagar");
                System.out.println("8 - Hyderabad");
                System.out.println("9 - Varanasi");
                System.out.println("10 - Panaji");
                
                System.out.println("Enter your choice (1-10)");
                while(flag==false)
                {
                    try
                    {
                        System.out.println("Enter your choice:");
                        System.out.println();
                        choice2 = Integer.parseInt(br.readLine());
                        flag = true;
                    }
                    catch(NumberFormatException a)
                    {
                        tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                        System.out.println();
                    }
                }
                
                flag = false; switch(choice2)
                {
                    case 1:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");
                        fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 2:
                    { 
                        
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();   
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 4: 
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 5:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 6:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:     Rs. " + total);
                        System.out.println();
                        break;
                    }
                    case 7:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println();
                        System.out.println();
                        break;
                    }
                    case 8:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name: " + fullname);
                        System.out.println("Email id: "+ email);
                        System.out.println("Phone number: " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location: " + arrloc[choice2]);
                        System.out.println("Airline name: " + airlines[ch - 1]);
                        System.out.println("Departure time: " +deptime[ch - 1]);
                        System.out.println("No. of seats: " + no);
                        System.out.println("Total Cost:  " + total);
                        break;
                    }
                    case 9:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:  :      " + total);
                        System.out.println();
                        break;
                    }
                    case 10:
                    {
                        System.out.println("Possible airline options for selected departure and arrival location");
                        
                        System.out.println("1 -  Air India                      Rs. 1943/head"+ '\t' + "6:40");
                        System.out.println("2 -  Air India Express              Rs. 2500/head"+ '\t' + "6:50");
                        System.out.println("3 -  AirAsia India                  Rs. 1900/head"+ '\t' + "7:45");
                        System.out.println("4 -  Air Costa                      Rs. 2190/head"+ '\t' + "8:20");
                        System.out.println("5 -  Blue Dart Aviation             Rs. 1234/head"+ '\t' + "9:40") ;
                        System.out.println("6 -  Deccan Charters                Rs. 2283/head"+ '\t' + "10:20");
                        System.out.println("7 -  Fly Easy                       Rs. 1233/head"+ '\t' + "10:40");
                        System.out.println("8 -  GoAir                          Rs. 1456/head"+ '\t' + "10:55");
                        System.out.println("9 -  IndiGo                         Rs. 1567/head"+ '\t' + "11:45");
                        System.out.println("10 - Invision Air                   Rs. 3456/head"+ '\t' + "13:10");
                        System.out.println("11 - Jagson Airlines                Rs. 1245/head"+ '\t' + "14:55");
                        System.out.println("12 - JetKonnect                     Rs. 3478/head"+ '\t' + "17:45");    
                        System.out.println("13 - Jet Airways                    Rs. 3435/head"+ '\t' + "19:25");
                        System.out.println("14 - SpiceJet                       Rs. 3334/head"+ '\t' + "22:15");
                        System.out.println();
                              flag = false;
                        while(flag==false)
                        {
                            try
                            {
                                System.out.println("Enter your choice:");
                                System.out.println();
                                ch = Integer.parseInt(br.readLine());
                                flag = true;
                            }
                            catch(NumberFormatException a)
                            {
                                tk.beep();System.out.println("Invalid Input. Please input an integer value corresponding to your desired choice.");
                                System.out.println();
                            }
                        }
                        
                        System.out.println();
                        System.out.println("Enter number of tickets");
                        no = in.nextInt();
                        total = price_per_head1[ch-1]*no;
                        
                        System.out.println();
                        System.out.println("Please fill in the following contact details");
                        System.out.println();
                        System.out.println("Enter your full name");fullname = br.readLine();
                        System.out.println("Enter your email id");
                        email = br.readLine();
                        System.out.println("Enter your 10 digit phone number");
                        phone = br.readLine();
                        
                        System.out.println();
                        System.out.println("Thank you for your patience valued customer! The following are your flight details");
                        System.out.println();
                        System.out.println("Name:               " + fullname);
                        System.out.println("Email id:           "+ email);
                        System.out.println("Phone number:       " + phone);
                        System.out.println("Departure location: "+ deploc[choice - 1]);
                        System.out.println("Arrival location:   " + arrloc[choice2]);
                        System.out.println("Airline name:       " + airlines[ch - 1]);
                        System.out.println("Departure time:     " + deptime[ch - 1]);
                        System.out.println("No. of seats:       " + no);
                        System.out.println("Total Cost:         " + total);
                        System.out.println();
                        break;
                    }//End of case11
                }
                break;
            }
        }
        System.out.println();
        y2 = taxes (total);
    }
    public static int taxes(int total)
    {   
        Scanner in = new Scanner(System.in);
        System.out.println("Enter category of seat booked" + '\n' + "1. Economy" + '\n' + "2. Business" + '\n' + "3. First class");
        int choice3 = in.nextInt();
        if (choice3 == 1)
        {
            tax = (int)((5.6/100.0)*total);
        }
        else if (choice3 == 2)
        {
            tax = (int)((8.4/100.0)*total);
        }
        else if (choice3 == 3)
        {
            tax = (int)((9.8/100.0)*total);
        }
        finalprice = (int) (total + tax);
        System.out.println("Airline taxes   = Rs. "+tax);
        System.out.println("Your final bill = Rs. "+ (total+tax));
        System.out.println();
        return (finalprice);
    }
    public static void seats()throws IOException
            {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String full = "\u2612";
            String empty = "\u25A1";
            int i;     
            System.out.print("      ");
            for (i=1; i<=6 ; i++)
                {
                    if(i==4)
                    System.out.print("         ");
                    System.out.print(i);
                    System.out.print("     ");
                }
            System.out.println();
            for (i = 65;i<=73;i++)
                    {
                            if (i==65)
                            System.out.println((char)i +"     "+ empty +"    "+ empty +"     "+ empty +"              "+ empty +"    "+ empty+"     "+ empty +"     " + (char)i);
                            else if(i==66)
                            System.out.println((char)i +"     "+ empty +"    "+ empty +"     "+ empty +"              "+ empty +"    "+ empty+"     "+ empty +"     " + (char)i);
                            else if(i==67)
                            System.out.println((char)i +"     "+ empty +"    "+ empty +"     "+ empty +"              "+ empty +"    "+ empty+"     "+ empty +"     " + (char)i);
                            else if(i==68)
                            System.out.println((char)i +"     "+ empty +"    "+ empty +"     "+ empty +"              "+ empty +"    "+ empty+"     "+ empty +"     " + (char)i);
                            else if(i==69)
                                {
                                    System.out.println();
                                    System.out.println();
                                }
                            else if(i==70)
                            System.out.println((char)i +"     "+ empty +"    "+ empty +"     "+ empty +"              "+ empty +"    "+ empty+"     "+ empty +"     " + (char)i);
                            else if(i==71)
                            System.out.println((char)i +"     "+ empty +"    "+ empty +"     "+ empty +"              "+ empty +"    "+ empty+"     "+ empty +"     " + (char)i);
                            else if(i==72)
                            System.out.println((char)i +"     "+ empty +"    "+ empty +"     "+ empty +"              "+ empty +"    "+ empty+"     "+ empty +"     " + (char)i);
                            else if(i==73)
                            System.out.println((char)i +"     "+ empty +"    "+ empty +"     "+ empty +"              "+ empty +"    "+ empty+"     "+ empty +"     " + (char)i);
                        }
            String s[] = new String[no];
            for(i=0;i<no;i++)
                {
                    System.out.println("Enter seat address:");
                    s[i] = br.readLine();
                    for(int j=0;j<no;j++)
                        {
                            if(s[i]==s[j])
                            {   
                                System.out.println("Are you sure? Please enter again to confirm");
                                s[i]=br.readLine();
                            }
                        }
                }
            System.out.println("These are your selected seats:");
            for(i=0;i<no;i++)
                System.out.println(s[i]);
        }
    public static void bill1()
    {
        System.out.println("Final Bill:" + '\n');
        System.out.println();
        System.out.println("Name:                           " + fullname);
        System.out.println("Email id:                       "+ email);
        System.out.println("Phone number:                   " + phone);
        System.out.println("Departure location:             "+ deploc[choice - 1]);
        System.out.println("Arrival location:               " + arrloc[choice2]);
        System.out.println("Airline name:                   " + airlines[ch - 1]);
        System.out.println("Departure time:                 " + deptime[ch - 1]);
        System.out.println("No. of seats:                   " + no);
        System.out.println("Flight tickets:             Rs. "+finalprice);
        
    }
}
        