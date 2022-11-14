package OrganizationComponent;

import java.util.ArrayList;
import java.util.List;

public class Cjf20200440730College extends Cjf20200440730OrganizationComponent {
    List<Cjf20200440730OrganizationComponent> cjf20200440730OrganizationComponents = new ArrayList<Cjf20200440730OrganizationComponent>();


    public Cjf20200440730College(String name) {
        super(name);
    }

    public void add(Cjf20200440730OrganizationComponent cjf20200440730OrganizationComponent){

        cjf20200440730OrganizationComponents.add(cjf20200440730OrganizationComponent);
    }
    public void remove(Cjf20200440730OrganizationComponent cjf20200440730OrganizationComponent){
        cjf20200440730OrganizationComponents.remove(cjf20200440730OrganizationComponent);

    }
    @Override
    public void print() {
        System.out.println("--------------" + getName() + "--------------");
        //遍历 organizationComponents
        for (Cjf20200440730OrganizationComponent cjf20200440730OrganizationComponent : cjf20200440730OrganizationComponents) {
            cjf20200440730OrganizationComponent.print();
        }

    }

    @Override
    public void SendMessage(String notice) {
        for (Cjf20200440730OrganizationComponent cjf20200440730OrganizationComponent : cjf20200440730OrganizationComponents) {
            cjf20200440730OrganizationComponent.SendMessage(notice);
        }
    }

    @Override
    public void ReceiveMessage(String notice) {

    }

    @Override
    public void Message() {

    }
}
