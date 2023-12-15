import template.house.GlassHouse;
import template.house.HouseTemplate;
import template.house.WoodenHouse;

public class App {
    public static void main(String[] args) throws Exception {
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();

        System.out.println("************");


        HouseTemplate houseType2 = new GlassHouse();
        houseType2.buildHouse();
    }
}
