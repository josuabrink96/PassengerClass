package ie.gmit;

public class Passenger {
    private String title;
    private String name;
    private String ID;
    private long phone;
    private int age;

    public Passenger(String title) {
        setTitle(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.equals("Mr") || title.equals("Mrs") || title.equals("Ms")) {
            this.title = title;
        }
        else {
            throw new IllegalArgumentException("Invalid title entered");
        }
    }
}
