package creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprice website");
    }

    @Override
    void buildCMS() {
        website.setCms(Cms.ALFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
