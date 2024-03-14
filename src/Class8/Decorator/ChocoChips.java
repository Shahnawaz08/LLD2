package Class8.Decorator;

public class ChocoChips implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;

    public ChocoChips(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents=iceCreamConeConstituents;
    }
    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() +5;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstituents.getDescription() + " with ChocoChips";
    }
}
