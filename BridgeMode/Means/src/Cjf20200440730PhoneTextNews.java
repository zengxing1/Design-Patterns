public class Cjf20200440730PhoneTextNews extends Cjf20200440730Means {
    @Override
    public void send(String counts) {
        String MeanType="手机短信";
        this.type.besend(MeanType,counts);
    }
}
