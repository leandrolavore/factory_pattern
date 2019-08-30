package Factory_pattern;

import java.util.Scanner;

public class factory_main {

    public static void main(String[] args) {

        Pizza_factory factory =new Pizza_factory();
        Pizza pizza = null;

        Scanner input = new Scanner(System.in);
        System.out.print("Would you like a Buenos Aires, a Chicago or a New York pizza??");

        if(input.hasNextLine()){

            String type = input.nextLine();

            pizza = factory.create_pizza(type);
        }
        if(pizza != null){
            pizza.informStyle();
        }


    }
}
