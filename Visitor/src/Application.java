import com.visitor.*;

public class Application {
    public static void main(String[] args) {

        Shape []shapes = new Shape[10];

        shapes[0] = new Circle();

        shapes[0].setX(5);

        shapes[1] = new Dot();
        shapes[2] = new Rectangle();
        shapes[4] = new CompoundShape();


        XMLExportVisitor xmlExportVisitor = new XMLExportVisitor();

        for (Shape shape:shapes){
            if(shape != null){
                shape.accept(xmlExportVisitor);
            }
        }
    }
}