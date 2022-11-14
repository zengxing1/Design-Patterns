package OnlineShopFactory;

import OnlineShop.Cjf20200440730OnlineShop;
import Style.Cjf20200440730Style;

import java.util.HashMap;

public class Cjf20200440730OnlineShopFactory {
    private HashMap<String, Cjf20200440730OnlineShop> shops = new HashMap<String, Cjf20200440730OnlineShop>();

    public Cjf20200440730OnlineShop Getstyle(String style) {
        Cjf20200440730OnlineShop shop = shops.get(style);
        if (shop != null) {
            return shop;
        }
        else {
            shop=new Cjf20200440730Style(style);
            shops.put(style,shop);
            return shop;

        }

    }
    public int getWebSiteNum(){
        return shops.size();
    }

}
