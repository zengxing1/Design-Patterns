public class Main {
    public static void main(String[] args) {
        Cjf20200440730NewsType type1=new Cjf20200440730CommonNew();
        Cjf20200440730Means means1=new Cjf20200440730WeChatNews();
        means1.setType(type1);
        means1.send("一条");

        Cjf20200440730Means means2=new Cjf20200440730PhoneTextNews();
        means2.setType(new Cjf20200440730SpecialNew());
        means2.send("两条");


    }


}
