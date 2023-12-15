package template.house;

public class WoodenHouse extends HouseTemplate {

    @Override
    protected void buildWalls() {
        System.out.println("Building wooden walls.");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building wooden pillars with wood coating");
    }

    @Override
    protected void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods, and sand");
    }
    
}
