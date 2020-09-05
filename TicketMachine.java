import java.util.Scanner;
import java.lang.String;
import java.io.*;

public class TicketMachine {

    private int price;

    private int balance;

    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine(int cost) {
        price = cost;
        balance = 0;
        total = 0;

    }

    /**
     * @Return The price of a ticket.
     */
    public int getPrice() {
        return price;
    }

    /**
     * Return The amount of money already inserted for the next ticket.
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Receive an amount of money from a customer. Check that the amount is sensible.
     */
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Use a positive amount rather than: "
                + amount);
        }
    }

    /**
     * Print a ticket if enough money has been inserted, and reduce the current balance by the
     * ticket price. Print an error message if more money is required.
     */
    public void printTicket() {
        if (balance >= price) {
            // Simulate the printing of a ticket.
            System.out.println("HERE IS YOUR TICKET");

            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("You have" + balance + "left");

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        } else {
            System.out.println("You must insert at least: "
                + (price - balance) + " more cents.");

        }
    }

    /**
     * Return the money in the balance. The balance is cleared.
     */
    public int refundBalance() {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }

    public static void main(String[] args) throws  IOException
    {       
        Scanner myScanner = new Scanner(System.in);
        String answer = "";
        int a=15;
        int b=20;
        int c=25;
        int d=30;
        int e=35;
        int k=40;
        int i=45;
        int h=50;
        int j=55;
        int v=60;
        int y=65;
        int q=70;
        int o=75;
        int l=80;
        int x=85;
        int p=90;
        int n=95;
        int s=100;
        int m=105;
       do {
            System.out.println("Enter your city, please:");
            answer = myScanner.nextLine();
            if (answer.equals("London")) {
                System.out.println("Please pay " + a);
                int g;
                g=myScanner.nextInt();
                int f=a-g;
                int z = g - a;
                if (g<15){
                    System.out.println("please add " + f);
                    f=myScanner.nextInt();
                    int change=f-a;
                if(change<=0){
                       break;
            }}               
                else {  System.out.println("Here is your change: " + z);                                                         
                }
                   if(f<=0){
                       break;
            }}           

            if (answer.equals("Manchester")) {
                System.out.println(b);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=b-g;
                int z = g - b;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }         
            if (answer.equals("Liverpool")) {
                System.out.println(c);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=c-g;
                int z = g - c;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }         if (answer.equals("Chealsea")) {
                System.out.println(d);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=d-g;
                int z = g - d;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }         if (answer.equals("Brighton")) {
                System.out.println(e);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=e-g;
                int z = g - e;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }         if (answer.equals("Cornwall")) {
                System.out.println(k);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=k-g;
                int z = g - k;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }         if (answer.equals("Crystal palace")) {
                System.out.println(i);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=i-g;
                int z = g - i;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }         if (answer.equals("Birmingham")) {
                System.out.println(h);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=h-g;
                int z = g - h;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }         if (answer.equals("Liverpool")) {
                System.out.println(j);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=j-g;
                int z = g - j;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }         if (answer.equals("Bristol")) {
                System.out.println(v);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=v-g;
                int z = g - v;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }         if (answer.equals("Leister")) {
                System.out.println(y);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=y-g;
                int z = g - y;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }   if (answer.equals("Peterborough")) {
                System.out.println(q);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=a-g;
                int z = g - a;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }              if (answer.equals("Nottingham")) {
                System.out.println(a);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=a-g;
                int z = g - a;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }              if (answer.equals("Oxford")) {
                System.out.println(a);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=a-g;
                int z = g - a;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }              if (answer.equals("Leeds")) {
                System.out.println(a);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=a-g;
                int z = g - a;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }              if (answer.equals("Bradford")) {
                System.out.println(a);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=a-g;
                int z = g - a;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }              if (answer.equals("York")) {
                System.out.println(n);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=n-g;
                int z = g - n;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }              if (answer.equals("Cambridge")) {
                System.out.println(a);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=a-g;
                int z = g - a;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }              if (answer.equals("Newcastle")) {
                System.out.println(a);
                System.out.println("Please pay");
                int g;
                g=myScanner.nextInt();
                int f=a-g;
                int z = g - a;
                if (g<15){
                    System.out.println("please add" + f);                 
                }               
                else {  System.out.println("Here is your change" + z);                                                         
                }
            }                    

        }
        while (answer != "exit");
    }   
}
