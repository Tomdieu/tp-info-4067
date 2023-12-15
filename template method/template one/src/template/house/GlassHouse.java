package template.house;

public class GlassHouse extends HouseTemplate {

    @Override
    protected void buildWalls() {
        System.out.println("Building glass walls.");
    }

    @Override
    protected void buildPillars() {
        System.out.println("Building glass pillars with glass coating"); 
    }

    @Override
    protected void buildFoundation() {
        System.out.println("Building foundation with cement, iron rods, and sand");
    }
    
}
