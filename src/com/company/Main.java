package com.company;

import java.util.Scanner;

public class Main extends pizza {

    Main(String name, String name_topping, int count) {
        super(name, name_topping, count);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("___________________________________\nENTER YOUR NAME : ");
        String user_name = sc.nextLine();
        System.out.println("-----------------------------------\nPIZZA MENU\n-----------------------------------\n\t1.CALIFORNIA\n\t2.DETROIT\n\t3.TEXAS\n\t4.INDIAN\n\t5.ITALIAN\n___________________________________\nENTER YOUR CHOICE");
        int a = sc.nextInt();
        System.out.println("___________________________________\nHOW MANY : ");
        int count = sc.nextInt();

        Main user1 = null;
        switch (a) {
            case 1:

                user1 = new Main("CALIFORNIA", "Pepperoni\tMushrooms\tOnions", count);
                break;

            case 2:
                user1 = new Main("DETROIT", "Pepperoni\tMushrooms\tOnions", count);
                break;

            case 3:
                user1 = new Main("TEXAS", "Pepperoni\tMushrooms\tOnions", count);
                break;

            case 4:
                user1 = new Main("INDIAN", "Pepperoni\tMushrooms\tOnions", count);
                break;

            case 5:
                user1 = new Main("ITALIAN", "Pepperoni\tMushrooms\tOnions", count);
                break;

            default:
                System.exit(0);
                break;
        }
        System.out.println("___________________________________\nYOU NEED EXTRA TOPPINGS\n\tpress (1) : \n\totherwise press (0) : ");
        int ans = sc.nextInt();
        if (ans == 1) {
            user1.settoppings();
        }
        System.out.println("************************************\n---------------ORDER----------------\n************************************"+"\nuser name : "+user_name+"\nname of pizza : "+user1.name_pizza + "\nname of base topping : " + user1.name_base_topping + "\nnumber of pizza : " + user1.count_pizza + "\nextra toppings : " + user1.gettopping()+"\n************************************");
    }
}

class pizza extends toppings{
    String name_pizza;
    String name_base_topping;
    int count_pizza;



    pizza(String name,String name_topping,int count){

        name_pizza=name;
        name_base_topping=name_topping;
        count_pizza=count;

    }





}
class toppings{

    private String name_toppings="nothing";




    public void settoppings(){
        String aa="";
        Scanner sc=new Scanner(System.in);


        System.out.println("-----------------------------------\nPIZZA MENU\n-----------------------------------\n\t1.Green peppers\n\t2.Black olives\n\t3.Extra cheese\n\t4.Bacon\n___________________________________\nENTER YOUR CHOICE");
        int a = sc.nextInt();
        switch (a){
            case  1:

                aa="Green peppers";
                break;

            case 2:
                aa="Black olives";
                break;

            case 3:
                aa="Extra cheese";
                break;

            case 4:
                aa="Bacon";
                break;

            default:
                aa="nothing";
                break;
        }

        name_toppings=aa;
    }
    public String gettopping(){
        return this.name_toppings;
    }



}