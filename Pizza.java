package Factory_pattern;

public abstract class Pizza {

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void informStyle(){
        System.out.print(description);
    }
    public String description;

}
