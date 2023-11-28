class Cylinder{
    int radius;
    int height;
    
    public void setradius(int radius) {
        this.radius = radius;
    }
    public void setheight(int height) {
        this.height = height;
    }

    public int getSet_radius() {
        return radius;
    }
    public int getSet_height() {
        return height;
    }
    
}
public class practise_set4 {
    public static void main(String[] args) {
        Cylinder cy=new Cylinder();
        cy.setradius(34);
        cy.setheight(56);
        System.out.println("Height of the cylinder is "+cy.height);
        System.out.println("Radius of the cylinder is "+cy.radius);

    }
    
}
