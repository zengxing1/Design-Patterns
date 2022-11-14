package Component;

public class Cjf20200440730Prince extends Cjf20200440730Man {

    String name;
    public Cjf20200440730Prince(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Operation() {
        System.out.println("王子："+name);
    }
}
