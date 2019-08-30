package Factory_pattern;

public class Pizza_factory {

    public Pizza create_pizza(String type){
        Pizza pizza = null;

        if(type.equals("New York")){
            return new NYpizza();
        }else if (type.equals("Chicago")){
            return new CHpizza();
        }else if(type.equals("Buenos Aires")){
            return new BApizza();
        }else{
            System.out.print("Option not available");
            return null;
        }

    }
}
