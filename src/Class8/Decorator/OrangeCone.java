package Class8.Decorator;

public class OrangeCone implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;

    public OrangeCone(){}
    public OrangeCone(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents=iceCreamConeConstituents;
    }
    @Override
    public int getCost() {
        if(iceCreamConeConstituents!=null){
            return iceCreamConeConstituents.getCost() + 20;
        }
        return 20;
    }

    @Override
    public String getDescription() {
        if (iceCreamConeConstituents!=null){
            return iceCreamConeConstituents.getDescription() + " with Orange Cone";
        }
        return "Orange Cone";
    }
}
