import java.io.*;
class Airport
{
    public static void main() throws IOException
    {
        Airlines ob1 = new Airlines();
        Menu ob2 = new Menu();
        Movies ob3 = new Movies();
        Payment ob4 = new Payment();
        ob1.planes();
        ob1.seats();
        ob3.films();
        ob2.food();
        ob1.bill1();
        ob2.bill2();
        ob3.bill3();
        ob4.pay();
    }
}