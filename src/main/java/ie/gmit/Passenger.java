package ie.gmit;

public class Passenger {
    private String title;
    private String name;
    private String ID;
    private long phone;
    private int age;

    public Passenger(String title, String name, String ID) {
        setTitle(title);
        setName(name);
        setID(ID);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Invalid name entered");
        }
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        if(ID.length() >= 10) {
            this.ID = ID;
        }
        else {
            throw new IllegalArgumentException("Invalid ID entered");
        }
    }
}
