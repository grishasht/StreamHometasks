package task1;

public class Name {
    private Integer countName;
    private String name;

    public Integer getCountName() {
        return countName;
    }

    public String getName() {
        return name;
    }

    public void setCountName(Integer countName) {
        this.countName = countName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Name(Integer countName, String name) {
        this.countName = countName;
        this.name = name;
    }

    @Override
    public String toString() {
        return countName + ". " + name + ";\n";
    }
}
