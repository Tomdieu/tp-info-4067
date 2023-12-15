package template.house;

public abstract class HouseTemplate {

    // template method, final so subclasses can't override
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        System.out.println("House is built.");
    }

    // methods to be implemented by subclasses
    protected abstract void buildWalls();
    protected abstract void buildPillars();

    protected abstract void buildFoundation();
}