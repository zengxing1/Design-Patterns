public class Cjf20200440730WeChatNews extends Cjf20200440730Means {
    @Override
    public void send(String counts) {
        String MeanType="微信";
        this.type.besend(MeanType,counts);
    }
}
