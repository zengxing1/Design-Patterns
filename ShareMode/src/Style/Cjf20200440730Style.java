package Style;

import Logo.Cjf20200440730Logo;
import OnlineShop.Cjf20200440730OnlineShop;

public class Cjf20200440730Style extends Cjf20200440730OnlineShop {
    private String style;

    public Cjf20200440730Style(String style) {
        this.style = style;
    }

    @Override
    public void logo(Cjf20200440730Logo cjf20200440730Logo) {
        System.out.println("网店风格"+style+"        logo:  "+ cjf20200440730Logo.getLogo());
    }
}
