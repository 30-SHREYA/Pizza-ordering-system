import java.util.Scanner;
class M2
{
    
      public static String again;
    public static int choose,n,quantity = 1;
    public static double total = 0,pay;
    public static void Menu()
    {
        
        System.out.println("============================================================================================================================================================");
        System.out.println("\t\t\t\t\t**************************** PIZZA MENU CARD  *******************************\t\t\t\t\t");
        System.out.println("=============================================================================================================================================================");
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\t1 Veg Pizza \t\t\t\t\t");
        System.out.println("\t\t\t\t\t------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("\t\t\t|-------------------------------------------------------------------------------------------|");
        System.out.println("\t\t\t| Sr   Name         	        |      Regular   |	  Medium    |	     Large\t    |");
        System.out.println("\t\t\t|-------------------------------------------------------------------------------------------|");
        System.out.println("\t\t\t| a  Cheese Pizza	        |     Rs.319/-	 |     Rs.579/-     |     Rs.839/-\t    |");
        System.out.println("\t\t\t|-------------------------------------------------------------------------------------------|");
        System.out.println("\t\t\t| b  Cheese n Corn Pizza	|      Rs.169/-	 |      Rs.309/-    |     Rs.499/-\t    |");
        System.out.println("\t\t\t|-------------------------------------------------------------------------------------------|");
        System.out.println("\t\t\t| c  onion Pizza	        |      Rs.99/-	 |      Rs.199/	    |     Rs.399/-          |");
        System.out.println("\t\t\t|-------------------------------------------------------------------------------------------|");
        System.out.println("\t\t\t| d  Paneer Makhani Pizza       |       Rs.249/- |	Rs.459/-    |     Rs.699/-          |");
        System.out.println("\t\t\t|-------------------------------------------------------------------------------------------|");
        System.out.println("\n");
        System.out.println("\t\t===================================================================================================================");
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\t  2 Non-Veg Pizza \t\t\t\t\t");
        System.out.println("\t\t\t\t\t------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("\t\t\t|-------------------------------------------------------------------------------------------|");
        System.out.println("\t\t\t|Sr   Name               	|      Regular      |       Medium	|       Large|");
        System.out.println("\t\t\t|-------------------------------------------------------------------------------------------|");
        System.out.println("\t\t\t|a  Chicken Sausage Pizza	|          Rs.189/-  |      Rs.339/-	|     Rs.539/-   |");
        System.out.println("\t\t\t|-------------------------------------------------------------------------------------------|");
        System.out.println("\t\t\t|b  Chicken Dominator Pizza    |          Rs.319/-  |      Rs.579/-	|     Rs.839/-   |");
        System.out.println("\t\t\t|-------------------------------------------------------------------------------------------|");
        System.out.println("\t\t\t|c  Chicken Fiesta Pizza       |          Rs.249/-   |     Rs.459/-	|    Rs.699/-  |");
        System.out.println("\t\t\t|-------------------------------------------------------------------------------------------|");
        System.out.println("\t\t\t|d  Chicken Pepperoni Pizza    |          Rs.319/-   |       Rs.579/-	|     Rs.839/-  |");
        System.out.println("\t\t\t|-------------------------------------------------------------------------------------------|");
        System.out.println("\t\t\t|e  Indi Chicken Tikka Pizza   |          Rs.319/-	|       Rs.579/- |    Rs.839/-  |");
        System.out.println("\t\t\t|--------------------------------------------------------------------------------------------|");
        System.out.println("\n");
        System.out.println("\t\t===================================================================================================================");
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\t  3 Soft Drink \t\t\t\t\t");
        System.out.println("\t\t\t\t\t------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("\t\t\t\t|-----------------------------------------------------------------------------|");
        System.out.println("\t\t\t\t| Sr    Name              |        Small   |	 Medium	    |    Large        |");
        System.out.println("\t\t\t\t|-----------------------------------------------------------------------------|");
        System.out.println("\t\t\t\t| a   Coca-Cola or Coke   |       Rs.10/-  |      Rs.40/-   |    Rs.80/-      | ");
        System.out.println("\t\t\t\t|-----------------------------------------------------------------------------|");
        System.out.println("\t\t\t\t| b   Pepsi               |       Rs.10/-  |      Rs.40/-   |    Rs.80/-      |");
        System.out.println("\t\t\t\t|-----------------------------------------------------------------------------|");
        System.out.println("\t\t\t\t| c   Sprite              |       Rs.10/-  |      Rs.40/-    |   Rs.80/-      |");
        System.out.println("\t\t\t\t|-----------------------------------------------------------------------------|");  
       
        System.out.println("\t\t\t\t| d   Fanta               |       Rs.10/-  |      Rs.40/-    |   Rs.80/-      |");
        System.out.println("\t\t\t\t|-----------------------------------------------------------------------------|");
        System.out.println("\t\t\t\t| e   Mirinda             |       Rs.10/-  |      Rs.40/-    |   Rs.80/-      |"); 
        System.out.println("\t\t\t\t|-----------------------------------------------------------------------------|"); 
        System.out.println("\n");
        System.out.println("=============================================================================================================================================================");
        System.out.println("\t\t\t\t\t******************************** Order ********************************* \t\t\t\t\t");
        System.out.println("=============================================================================================================================================================");
    }
    public static void display()
    {
        Scanner  Sc = new Scanner(System.in);
        System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
        System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
        System.out.println("Enter any Choice :");
        choose=Sc.nextInt();
    } 
     public static void display1() 
     {
       Scanner  Sc = new Scanner(System.in);
       // System.out.println("Enter any Choice :");
        System.out.println("\t\t\t\t\t------------------------------------------------------------");
        if(choose==1)
        {
            System.out.println(" \t\t\t\t\t\t\t******\t Veg Pizza \t******");
            System.out.println("\t\t\t\t\t------------------------------------------------------------");
            System.out.println("\n");
            System.out.println(" \t\t\t\t\t\t\t******\t Menu \t******");
            System.out.println("\n");
             System.out.println("\t\t\t\t|-----------------|-------------------------|---------------|---------------------------|");
             System.out.println("\t\t\t\t| 1.Cheese Pizza  | 2.Cheese n Corn Pizza   | 3.onion Pizza |  4.Paneer Makhani Pizza   |");
             System.out.println("\t\t\t\t|-----------------|-------------------------|---------------|---------------------------|");
            System.out.println("\n");
            System.out.println("Enter any Choice :");
            n=Sc.nextInt();
            if(n==1)
            {
                 
                       System.out.println(" Select Pizza size : \t1.Regular\t 2.Medium\t 3. Large");
                       int  b0= Sc.nextInt();
                        switch(b0)
                        {
                            case 1:
                              
                                System.out.print("How many Cheese Pizza you want to Buy ? : ");
                                quantity =Sc.nextInt();
                                total = total +(quantity*319);
                                System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Cheese Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Small Cheese Piza ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("\n");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                   
                                   if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            case 2:
                               
                                System.out.print("How many Cheese Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*579);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Cheese Pizza ");
                                 System.out.println("---------------------------------------------");
                                 System.out.println("Pizza Size : Medium Cheese Piza ");
                                  System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");

                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                               if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                    
                                }
                                break;
                            case 3:
                                
                                System.out.print("How many Cheese Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*839);
                                System.out.println("-----------------BILL DETAILS------------------------");
                              System.out.println("Your Pizza is : Cheese Piza");
                               System.out.println("---------------------------------------------");
                              System.out.println("Pizza Size : Large Cheese Piza ");
                               System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                  
                                    //System.out.println("The change is " + total);
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                    
                                }
                                break;
                            default:
                                 System.out.println(" Wrong Choice ");
                        }
            } 
            if(n==2)
            {
                System.out.println(" Select Pizza size : \t1.Regular\t 2.Medium\t 3. Large");
                       int  b0= Sc.nextInt();
                        switch(b0)
                        {
                            case 1:
                                
                                System.out.print("How many Cheese n Corn Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*319);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Cheese n Corn Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println(" Pizza Size : Regular/small Cheese n Corn Pizza	 ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    
                                    System.out.println("The change is " + total);
                                    
                                }
                                break;
                            case 2:
                                
                                System.out.print("How many Cheese n Corn Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*579);
                             System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Cheese n Corn Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Medium Cheese n Corn Pizza ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                    
                                }
                                break;
                            case 3:
                                
                                System.out.print("How many Cheese n Corn Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*839);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Cheese n Corn Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Large Cheese n Corn Pizza	 ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                   
                                    //System.out.println("The change is " + total);
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                    
                                }
                                break;
                            default:
                                 System.out.println(" Wrong Choice ");
                        }
            }   
            if(n==3)
            {
                System.out.println(" Select Pizza size : \t1.Regular\t 2.Medium\t 3. Large");
                       int  b0= Sc.nextInt();
                        switch(b0)
                        {
                            case 1:
                                
                                System.out.print("How many onion Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*319);
                                System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : onion Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println(" Pizza Size : Regular/small onion Pizza	 ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                    
                                }
                                break;
                            case 2:
                                
                                System.out.print("How many onion Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*579);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : onion Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Medium onion Pizza	 ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                  
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                    
                                }
                                break;
                            case 3:
                                
                                System.out.print("How many onion Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*839);
                                System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is :onion Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Large onion Pizza	 ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    
                                   if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            default:
                                 System.out.println(" Wrong Choice ");
                        }
               
            }   
            if(n==4)
            {
                System.out.println(" Select Pizza size : \t1.Regular\t 2.Medium\t 3. Large");
                       int  b0= Sc.nextInt();
                        switch(b0)
                        {
                            case 1:
                                
                                System.out.print("How many Paneer Makhani Pizza  you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*319);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Paneer Makhani Pizza ");
                                 System.out.println("---------------------------------------------");
                                System.out.println(" Pizza Size : Regular/small Paneer Makhani Pizza  ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                   
                                    
                                }
                                break;
                            case 2:
                                
                                System.out.print("How many Paneer Makhani Pizza  you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*579);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Paneer Makhani Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Medium Paneer Makhani Pizza  ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                  if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            case 3:
                                
                                System.out.print("How many Paneer Makhani Pizza  you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*839);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Paneer Makhani Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Large Paneer Makhani Pizza  ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            default:
                                 System.out.println(" Wrong Choice ");
                        }
                
            }   
        }
    }  
    public static void display2()
    {
          Scanner  Sc = new Scanner(System.in);
           if(choose==2)
        {
        
            System.out.println(" \t\t\t\t\t\t\t******\t Non-Veg Pizza \t******");
            System.out.println("\t\t\t\t\t------------------------------------------------------------");
            System.out.println("\n");
            System.out.println(" \t\t\t\t\t\t\t******\t Menu \t******");
            System.out.println("\n");
            System.out.println("\t1.Chicken Sausage Pizza\t 2.Chicken Dominator Pizza\t3.Chicken Fiesta Pizza\t4.Chicken Pepperoni Pizza\t5.Indi Chicken Tikka Pizza");
            System.out.println("\n");
            System.out.println("Enter any Choice :");
            int n=Sc.nextInt();
            if(n==1)
            {
                 System.out.println(" Select Pizza size : \t1.Regular\t 2.Medium\t 3. Large");
                       int  b0= Sc.nextInt();
                        switch(b0)
                        {
                            case 1:
                              
                                System.out.print("How many Chicken Sausage Pizza you want to Buy ? : ");
                                quantity =Sc.nextInt();
                                total = total +(quantity*319);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Chicken Sausage Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : small Cheese Piza ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                   if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }  
                                }
                                break;
                            case 2:
                                
                                System.out.print("How many Chicken Sausage Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*579);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Chicken Sausage Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Medium Chicken Sausage Pizza ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                               if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            case 3:
                               
                                System.out.print("How many Chicken Sausage Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*839);
                                System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Chicken Sausage Pizza");
                                 System.out.println("---------------------------------------------");
                                 System.out.println("Pizza Size : Large Chicken Sausage Pizza ");
                                  System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            default:
                                 System.out.println(" Wrong Choice ");
                        }
                         
            }  
            if(n==2)
            {
                  System.out.println(" Select Pizza size : \t1.Regular\t 2.Medium\t 3. Large");
                       int  b0= Sc.nextInt();
                        switch(b0)
                        {
                            case 1:
                              
                                System.out.print("How many Chicken Dominator Pizza you want to Buy ? : ");
                                quantity =Sc.nextInt();
                                total = total +(quantity*319);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                 
                                System.out.println("Your Pizza is : Chicken Dominator Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : small Chicken Dominator Pizza ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    
                                    }
                                }
                                break;
                            case 2:
                                
                                System.out.print("How many Chicken Dominator Pizza  you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*579);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Chicken Dominator Pizza ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Medium Chicken Dominator Pizza  ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                 System.out.println("---------------------------------------------");

                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                               if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            case 3:
                               
                                System.out.print("How many Chicken Dominator Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*839);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Chicken Dominator Pizza");
                                 System.out.println("---------------------------------------------");
                                 System.out.println("Pizza Size : Large Chicken Dominator Pizza  ");
                                  System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                 System.out.println("---------------------------------------------");

                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            default:
                                 System.out.println(" Wrong Choice ");
                        }
            }   
           if(n==3)
            {
                  System.out.println(" Select Pizza size : \t1.Regular\t 2.Medium\t 3. Large");
                       int  b0= Sc.nextInt();
                        switch(b0)
                        {
                            case 1:
                              
                                System.out.print("How many Chicken Fiesta Pizza you want to Buy ? : ");
                                quantity =Sc.nextInt();
                                total = total +(quantity*319);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Chicken Fiesta Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Small Chicken Fiesta Pizza ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    
                                    }
                                }
                                break;
                            case 2:
                                
                                System.out.print("How many Chicken Fiesta Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*579);
                                System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Chicken Fiesta Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Medium Chicken Fiesta Pizza ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                               if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            case 3:
                              
                                System.out.print("How many Chicken Fiesta Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*839);
                                System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Chicken Fiesta Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Large Chicken Fiesta Pizza ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            default:
                                 System.out.println(" Wrong Choice ");
                        }
            }   
           if(n==4)
            {
                  System.out.println(" Select Pizza size : \t1.Regular\t 2.Medium\t 3. Large");
                       int  b0= Sc.nextInt();
                        switch(b0)
                        {
                            case 1:
                              
                                System.out.print("How many Chicken Pepperoni Pizza you want to Buy ? : ");
                                quantity =Sc.nextInt();
                                total = total +(quantity*319);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                 System.out.println("Your Pizza is :Chicken Pepperoni Pizza ");
                                  System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : small Chicken Pepperoni Pizza ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    
                                    }
                                }
                                break;
                            case 2:
                             
                                System.out.print("How many  Chicken Pepperoni Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*579);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                               System.out.println("Your Pizza is :Chicken Pepperoni Pizza ");
                                System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Medium Chicken Pepperoni Pizza ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                               if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            case 3:
                                
                                System.out.print("How many  Chicken Pepperoni Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*839);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                 System.out.println("Your Pizza is :Chicken Pepperoni Pizza ");
                                  System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Large Chicken Pepperoni Pizza ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            default:
                                 System.out.println(" Wrong Choice ");
                        }
            }   
           if(n==5)
            {
                  System.out.println(" Select Pizza size : \t1.Regular\t 2.Medium\t 3. Large");
                       int  b0= Sc.nextInt();
                        switch(b0)
                        {
                            case 1:
                              
                                System.out.print("How many Indi Chicken Tikka Pizza you want to Buy ? : ");
                                quantity =Sc.nextInt();
                                total = total +(quantity*319);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                 System.out.println("Your Pizza is : Indi Chicken Tikka Pizza");
                                  System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Small Indi Chicken Tikka Pizza ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    
                                    }
                                }
                                break;
                            case 2:
                               
                                System.out.print("How many Indi Chicken Tikka Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*579);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Indi Chicken Tikka Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Medium  Indi Chicken Tikka Pizza ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                               if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            case 3:
                                //System.out.println("Pizza Size : Large Cheese Piza ");
                                System.out.print("How many Indi Chicken Tikka Pizza you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*839);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Pizza is : Indi Chicken Tikka Pizza");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Pizza Size : Large Indi Chicken Tikka Pizza ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            default:
                                 System.out.println(" Wrong Choice ");
                        }
            }
        }
        
    }
    public static void display3()
    {
        Scanner  Sc = new Scanner(System.in);
        if(choose==3)
        {
            
            System.out.println(" \t\t\t\t\t\t\t******\t Soft Drink \t******");
            System.out.println("\t\t\t\t\t------------------------------------------------------------");
            System.out.println("\n");
            System.out.println(" \t\t\t\t\t\t\t******\t Menu \t******");
            System.out.println("\n");
            System.out.println("\t1.Coca-Cola or Coke\t\t2.Pepsi\t\t3.Sprite\t\t4.Fanta\t\t5.Mirinda");
            System.out.println("\n");
            System.out.println("Enter any Choice :");
            n=Sc.nextInt();
            if(n==1)
            {
                 
                       System.out.println(" Select size : \t1.small \t 2.Medium\t 3. Large");
                       int  b0= Sc.nextInt();
                        switch(b0)
                        {
                            case 1:
                               
                                System.out.print("How many  Coca-Cola or Coke you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*10);
                                
                                 System.out.println("-----------------BILL DETAILS------------------------");
                               System.out.println("Your Soft Drink is : Coca-Cola or Coke");
                                System.out.println("---------------------------------------------");
                               System.out.println(" Can Size : Small   ");
                                System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    
                                    }
                                }
                                break;
                            case 2:
                               //System.out.println(" Can Size : Medium   ");
                                System.out.print("How many Coca-Cola or Coke you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*40);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Soft Drink is : Coca-Cola or Coke");
                                 System.out.println("---------------------------------------------");
                               System.out.println(" Can Size : Medium   ");
                                System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                               if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            case 3:
                               //System.out.println(" Can Size : Large   ");
                                System.out.print("How many Coca-Cola or Coke you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*80);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Soft Drink is : Coca-Cola or Coke");
                                 System.out.println("---------------------------------------------");
                               System.out.println(" Can Size : Large  ");
                                System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            default:
                                 System.out.println(" Wrong Choice ");
                        } 
            }     
            if(n==2)
            {
                 
                       System.out.println(" Select size : \t1.small \t 2.Medium\t 3. Large");
                       int  b0= Sc.nextInt();
                        switch(b0)
                        {
                            case 1:
                               //System.out.println(" Can Size : Small   ");
                                System.out.print("How many Pepsi you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*10);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Soft Drink is : Pepsi");
                                System.out.println("---------------------------------------------");
                               System.out.println(" Can Size : Small  ");
                                System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            case 2:
                              // System.out.println(" Can Size : Medium   ");
                                System.out.print("How many Pepsi you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*40);
                               System.out.println("-----------------BILL DETAILS------------------------");                                System.out.println("Your Soft Drink is : Pepsi");
                               System.out.println("Your Soft Drink is : Pepsi");
                                System.out.println("---------------------------------------------");
                               System.out.println(" Can Size : Medium ");
                               System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                          
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                               if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            case 3:
                               // System.out.println(" Can Size : Large   ");
                                System.out.print("How many Pepsi you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*80);
                                System.out.println("-----------------BILL DETAILS------------------------");
                                
                                System.out.println("Your Soft Drink is : Pepsi");
                                System.out.println("---------------------------------------------");
                               System.out.println(" Can Size : Large ");
                               System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            default:
                                 System.out.println(" Wrong Choice ");
                        } 
            }     
         
            if(n==3)
            {
                 
                       System.out.println(" Select size : \t1.small \t 2.Medium\t 3. Large");
                       int  b0= Sc.nextInt();
                        switch(b0)
                        {
                            case 1:
                               //System.out.println(" Can Size : Small   ");
                                System.out.print("How many Sprite  you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*10);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Soft Drink is : Sprite ");
                                 System.out.println("---------------------------------------------");
                               System.out.println(" Can Size : Small  ");
                                System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            case 2:
                              //  System.out.println(" Can Size : Medium   ");
                                System.out.print("How many Sprite you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*40);
                                System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Soft Drink is : Sprite ");
                                 System.out.println("---------------------------------------------");
                                System.out.println(" Can Size : Medium  ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                               if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            case 3:
                              // System.out.println(" Can Size : Large   ");
                                System.out.print("How many Sprite you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*80);
                                System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Soft Drink is : Sprite ");
                                 System.out.println("---------------------------------------------");
                                System.out.println(" Can Size : Large  ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            default:
                                 System.out.println(" Wrong Choice ");
                        } 
            }     
             if(n==4)
            {
                 
                       System.out.println(" Select size : \t1.small \t 2.Medium\t 3. Large");
                       int  b0= Sc.nextInt();
                        switch(b0)
                        {
                            case 1:
                               // System.out.println(" Can Size : Small   ");
                                System.out.print("How many Fanta you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*10);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Soft Drink is : Fanta ");
                                 System.out.println("---------------------------------------------");
                                System.out.println(" Can Size : Small  ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            case 2:
                               System.out.print("How many Fanta you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*10);
                                System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Soft Drink is : Fanta ");
                                 System.out.println("---------------------------------------------");
                                System.out.println(" Can Size : Medium  ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                               if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            case 3:
                               System.out.print("How many Fanta you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*10);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Soft Drink is : Fanta ");
                                 System.out.println("---------------------------------------------");
                                System.out.println(" Can Size : Large  ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                 System.out.println("---------------------------------------------");
                                System.out.println("You Total Bill Is: "+total);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            default:
                                 System.out.println(" Wrong Choice ");
                        } 
            }     
             if(n==5)
            {
                 
                       System.out.println(" Select size : \t1.small \t 2.Medium\t 3. Large");
                       int  b0= Sc.nextInt();
                        switch(b0)
                        {
                            case 1:
                               System.out.print("How many  Mirinda you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*10);
                                 System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Soft Drink is :  Mirinda ");
                                 System.out.println("---------------------------------------------");
                                System.out.println(" Can Size : Small  ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            case 2:
                               System.out.print("How many  Mirinda you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*10);
                                System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Soft Drink is :  Mirinda ");
                                 System.out.println("---------------------------------------------");
                                System.out.println(" Can Size : Medium ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                               if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            case 3:
                               System.out.print("How many  Mirinda you want to Buy? :");
                                quantity =Sc.nextInt();
                                total = total +(quantity*10);
                                System.out.println("-----------------BILL DETAILS------------------------");
                                System.out.println("Your Soft Drink is :  Mirinda ");
                                 System.out.println("---------------------------------------------");
                                System.out.println(" Can Size : Large ");
                                 System.out.println("---------------------------------------------");
                                System.out.println("Total Purchased items: "+quantity);
                                System.out.println("---------------------------------------------");
                                System.out.println("You want to buy again? ");
                                System.out.println("Press Y for Yes and N for N : ");
                                again = Sc.next();
                                if(again.equalsIgnoreCase("Y"))
                                {
                                   System.out.println("\t\t\n\t\t\t\t\t\t Menu :\t 1.Veg Pizza \t 2.Non-Veg Pizza\t 3.Soft Drink\n");
                                    System.out.println("\t\t\t\t\t------------------------------------------------------------------------");
                                    System.out.println("Enter any Choice :");
                                    choose=Sc.nextInt();
                                    switch(choose)
                                    {
                                        case 1:
                                            display1();
                                            break;
                                        case 2:
                                            display2();
                                            break;
                                        case 3:
                                            display3();
                                            break;
                                        default:
                                            System.out.println(" Wrong Choice ");
                                    }
                                }   
                                 else
                                { 
                                    System.out.println("Enter a payment ");
                                    pay =Sc.nextDouble();
                                    if(pay <total){
                                      System.out.println("Not enough payment");
                                    }else{
                                    System.out.println("Total price is " + total);
                                    total = pay-total;
                                    System.out.println("The change is " + total);
                                    }
                                }
                                break;
                            default:
                                 System.out.println(" Wrong Choice ");
                        } 
            }     
             
        }    
    }    
}
public class Proj1 
{
    public static void main(String[] args)
    {
        M2 a1 = new M2();
        a1.Menu();
        a1.display();
        a1.display1();
        a1.display2(); 
        a1.display3();
    }
}
