import Component.Cjf20200440730Man;
import Component.Cjf20200440730Prince;
import Decorator.*;

public class Main {
    public static void main(String[] args) {
        //初始化王子
        Cjf20200440730Man man=new Cjf20200440730Prince("曾钘");
        //初始化描述
        Cjf20200440730HomeGround homeGround=new Cjf20200440730HomeGround();
        Cjf20200440730LoveOther loveOther=new Cjf20200440730LoveOther();
        Cjf20200440730Marrige marrige=new Cjf20200440730Marrige();
        Cjf20200440730Quality quality=new Cjf20200440730Quality();
        Cjf20200440730Work work=new Cjf20200440730Work();
        //装饰王子
        homeGround.setMan(man);
        loveOther.setMan(homeGround);
        marrige.setMan(loveOther);
        quality.setMan(marrige);
        work.setMan(quality);
        work.Operation();


    }

}
