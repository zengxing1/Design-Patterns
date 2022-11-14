import Logo.Cjf20200440730Logo;
import OnlineShop.Cjf20200440730OnlineShop;
import OnlineShopFactory.Cjf20200440730OnlineShopFactory;

public class Main {
    public static void main(String[] args) {
        Cjf20200440730OnlineShopFactory shopFactory=new Cjf20200440730OnlineShopFactory();
        Cjf20200440730OnlineShop cjf20200440730OnlineShop1 =shopFactory.Getstyle("数码类网店");
        cjf20200440730OnlineShop1.logo(new Cjf20200440730Logo("华为"));
        Cjf20200440730OnlineShop cjf20200440730OnlineShop2 =shopFactory.Getstyle("数码类网店");
        cjf20200440730OnlineShop2.logo(new Cjf20200440730Logo("小米"));
        Cjf20200440730OnlineShop cjf20200440730OnlineShop3 =shopFactory.Getstyle("食品类网点");
        cjf20200440730OnlineShop3.logo(new Cjf20200440730Logo("三只松鼠"));
        Cjf20200440730OnlineShop cjf20200440730OnlineShop4 =shopFactory.Getstyle("食品类网点");
        cjf20200440730OnlineShop4.logo(new Cjf20200440730Logo("良品铺子"));
        System.out.println("网站类数为："+shopFactory.getWebSiteNum());


    }
}