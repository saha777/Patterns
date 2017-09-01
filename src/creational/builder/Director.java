package creational.builder;

public class Director {
    WebsiteBuilder builder;

    public void setBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    Website buildWebsite(){
        builder.createWebsite();
        builder.buildName();
        builder.buildCMS();

        Website website = builder.getWebsite();

        return website;
    }
}
