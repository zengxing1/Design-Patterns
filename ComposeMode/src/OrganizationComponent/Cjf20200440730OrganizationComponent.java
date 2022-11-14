package OrganizationComponent;

public abstract class Cjf20200440730OrganizationComponent {
    String Name;

    public Cjf20200440730OrganizationComponent(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public void add(Cjf20200440730OrganizationComponent cjf20200440730OrganizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }
    public void remove(Cjf20200440730OrganizationComponent cjf20200440730OrganizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }
    //抽象方法print(),子类都需要实现
    public abstract void print();
    public abstract  void  SendMessage(String notice);
    public abstract void ReceiveMessage(String notice);

    public abstract void Message() ;
}
