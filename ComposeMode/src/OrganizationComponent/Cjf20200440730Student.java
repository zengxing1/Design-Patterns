package OrganizationComponent;

import java.util.ArrayList;

public class Cjf20200440730Student extends Cjf20200440730OrganizationComponent {
    ArrayList<String> notes = new ArrayList<>();

    public Cjf20200440730Student(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void print() {
        System.out.println(getName());
    }

    @Override
    public void SendMessage(String notice) {

    }

    @Override
    public void ReceiveMessage(String notice) {
        notes.add(notice);
    }

    public void Message(){
        System.out.println(getName()+"同学的消息列表："+notes);
    }
}


