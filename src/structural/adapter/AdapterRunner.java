package structural.adapter;

public class AdapterRunner {
    public static void main(String[] args) {
        Json json = new AdapterXmlToJson();

        json.insert();
        json.update();
        json.remove();
        json.select();
    }
}
