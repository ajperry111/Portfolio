import java.util.Scanner;
import java.lang.Math;
class ComboMenu {
  public static void main(String[] args) {
    String ordering = " ";
    double total=0;
    double subtotal=0;
    double ordertotal=0;
    String sandwich = "";
    String drink = "";
    String fries = "";
    String ketchup="";
    double ketchupnum = 0.0;
    String order ="";
    int ordernum =0;
    double sandwichPrice =0.0;
    double drinkPrice=0.0;
    double fryPrice=0.0;
    double ketchupPrice=0.0;
    String discount="";
    while(!ordering.equals("n")){
      Scanner ui = new Scanner(System.in);
      ordernum++;
      ordertotal=0;
      sandwichPrice=0.0;
      drinkPrice=0.0;
      fryPrice=0.0;
      ketchupPrice=0.0;
      subtotal=0.0;
      discount="";
      System.out.println("Do you want a sandwich? (y/n) ");
      sandwich = ui.nextLine();
      while(!sandwich.equals("y")&&!sandwich.equals("n")){
        System.out.println("Do you want a sandwich? (y/n) ");
        sandwich = ui.nextLine();
      }
      if (sandwich.equals("y")){
        System.out.println("Which sandwich would you like: chicken $5.25, beef $6.25, tofu $5.75? (c,b,t) ");
        sandwich = ui.nextLine();
        while(!sandwich.equals("c")&&!sandwich.equals("b")&&!sandwich.equals("t")){
          System.out.println("Which sandwich would you like: chicken $5.25, beef $6.25, tofu $5.75? (c,b,t) ");
          sandwich = ui.nextLine();
        }
        if (sandwich.equals("c")){
          subtotal+=5.25;
          sandwichPrice=5.25;
          sandwich = "chicken sandwich";
        }
        else if (sandwich.equals("b")){
          subtotal+=6.25;
          sandwichPrice=6.25;
          sandwich = "beef sandwich";
        }
        else if (sandwich.equals("t")){
          subtotal+=5.75;
          sandwichPrice=5.75;
          sandwich = "tofu sandwich";
        }
      }
      else if (sandwich.equals("n")){
        sandwich = "no sandwich";
      }
      System.out.println("Would you like fries? (y/n) ");
      fries = ui.nextLine();
      while(!fries.equals("y")&&!fries.equals("n")){
        System.out.println("Would you like fries? (y/n) ");
        fries = ui.nextLine();
      }
      if (fries.equals("y")){
        System.out.println("Which size: small $1.00, medium $1.75, large $2.25?  (s,m,l) ");
        fries = ui.nextLine();
        while(!fries.equals("s")&&!fries.equals("m")&&!fries.equals("l")){
          System.out.println("Which size: small $1.00, medium $1.75, large $2.25?  (s,m,l) ");
          fries = ui.nextLine();
        }
        if (fries.equals("s")){
          subtotal+=1.00;
          fryPrice=1.00;
          fries = "small fry";
        }
        else if (fries.equals("m")){
          subtotal+=1.75;
          fryPrice=1.75;
          fries = "medium fry";
        }
        else if (fries.equals("l")){
          subtotal+=2.25;
          fryPrice+=2.25;
          fries = "large fry";
        }
      }
      else if (fries.equals("n")){
        fries = "no fries";
      }
      System.out.println("Would you like a drink? (y/n) ");
      drink = ui.nextLine();
      while(!drink.equals("y")&&!drink.equals("n")){
        System.out.println("Would you like a drink? (y/n) ");
        drink = ui.nextLine();
      }
      if (drink.equals("y")){
        System.out.println("Which size: small $1.00, medium $1.75, large $2.25?  (s,m,l) ");
        drink = ui.nextLine();
        while(!drink.equals("s")&&!drink.equals("m")&&!drink.equals("l")){
          System.out.println("Which size: small $1.00, medium $1.75, large $2.25?  (s,m,l) ");
          drink = ui.nextLine();
        }
        if (drink.equals("s")){
          subtotal+=1.00;
          drinkPrice=1.00;
          drink = "small drink";
        }
        else if (drink.equals("m")){
          subtotal+=1.50;
          drinkPrice=1.50;
          drink = "medium drink";
        }
        else if (drink.equals("l")){
          System.out.println("Would you like to upgrade to a child size for $0.38 more? (y/n) ");
          drink = ui.nextLine();
          while(!drink.equals("y")&&!drink.equals("n")){
            System.out.println("Would you like to upgrade to a child size for $0.38 more? (y/n) ");
            drink = ui.nextLine();
          }
          if (drink.equals("y")){
            subtotal+=2.38;
            drinkPrice=2.38;
            drink = "child size drink";
          }
          else if (drink.equals("n")){
            subtotal+=2.00;
            drinkPrice=2.00;
            drink = "large drink";
          }
        }
      }
      else if (drink.equals("n")){
        drink = "no drink";
      }
      System.out.println("How many ketchup packets would you like?");
      ketchupnum = ui.nextDouble();
      while((ketchupnum<0.0)||(ketchupnum % 1 !=0)){
        System.out.println("How many ketchup packets would you like?(enter a positive whole number) ");
        ketchupnum = ui.nextDouble();
      }
      //ui.close();
      ketchup= String.format("%.0f ketchup packets",ketchupnum);
      ketchupPrice=ketchupnum*.25;
      subtotal+=ketchupPrice;
      if((!sandwich.equals("no sandwich"))&&(!fries.equals("no fries"))&&(!drink.equals("no drink"))){
        discount=String.format("**Combo Disount: -$1.00**\n");
        subtotal-=1.00;
      }
      total+=subtotal;
      // learned String.format() from https://beginnersbook.com/2017/10/java-string-format-method/
      order+= String.format("Order %d:\n%s\t$%.2f\n%s\t\t\t$%.2f\n%s\t\t\t$%.2f\n%s\t$%.2f\n%sSubtotal:\t\t\t $%.2f\n\n",ordernum,sandwich,sandwichPrice,fries,fryPrice,drink,drinkPrice,ketchup,ketchupPrice,discount,subtotal);
      Scanner input = new Scanner(System.in);
      System.out.println("Would you like to add another order? (y/n) ");
      ordering = input.nextLine();
      while(!ordering.equals("y")&&!ordering.equals("n")){
            System.out.println("Would you like to add another order? (y/n) ");
            ordering = input.nextLine();
      }
    }
    double finalSubtotal=total;
    total=subtotal+1.07;
    System.out.printf("\nReciept:\n--------------------------------\n%s\nFinal subtotal:\t$%.2f\nFinal total:\t$%.2f",order,finalSubtotal,total);
  }
}
