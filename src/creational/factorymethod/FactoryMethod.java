package creational.factorymethod;

import java.util.Scanner;

public class FactoryMethod {
    public static void main(String[] args) {
        String type = new Scanner(System.in).next();
        BrandFactory factory = new FactoryMethod().getFactory(type);
        Brand brand = factory.createBrand();
        brand.createAuto();
    }

    BrandFactory getFactory(String type){
        BrandFactory factory = null;
        switch (type){
            case "BMW":
                factory = new BMWFactory();
                break;
            case "Mercedes":
                factory = new MercedesFactory();
                break;
            case "Audi":
                factory = new AudiFactory();
                break;
        }
        return factory;
    }
}
interface BrandFactory{
    Brand createBrand();
}
class BMWFactory implements BrandFactory{
    @Override
    public Brand createBrand() {
        return new BMW();
    }
}
class MercedesFactory implements BrandFactory{
    @Override
    public Brand createBrand() {
        return new Mercedes();
    }
}
class AudiFactory implements BrandFactory{
    @Override
    public Brand createBrand() {
        return new Audi();
    }
}
interface Brand{
    void createAuto();
}
class BMW implements Brand{
    @Override
    public void createAuto() {
        System.out.println("Create new BMW auto ...");
    }
}
class Mercedes implements Brand{
    @Override
    public void createAuto() {
        System.out.println("Create new Mercedes auto ...");
    }
}
class Audi implements Brand{
    @Override
    public void createAuto() {
        System.out.println("Create new Audi auto ...");
    }
}