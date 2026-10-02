
public class Main {
    public static void main(String[] args){
         Rectangle rectangle = new Rectangle(10, 5);
         Person[] person = new Person[5];

         person[0] = new Person("Sayna","Kiani");
         person[1] = new Person("Homayoun","Azami");
         person[2] = new Person("Zaha","Bahar");
         person[3] = new Person("Rodrigo","Zaha");
         person[4] = new Person("Fariba","Bahar");


        Rectangle[] rectangles = new Rectangle[3];

        rectangles[0] = new Rectangle(10, 5);
        rectangles[1] = new Rectangle(2, 5);
        rectangles[2] = new Rectangle(4, 5);


        Sorter sorter = new Sorter();
         sorter.sort(person);

         System.out.println(person[0].getName() + " " +person[0].getSurname() );
         System.out.println(person[1].getName() + " " +person[1].getSurname() );
         System.out.println(person[2].getName() + " " +person[2].getSurname() );
         System.out.println(person[3].getName() + " " +person[3].getSurname() );
         System.out.println(person[4].getName() + " " +person[4].getSurname() );

        System.out.println("Rectangle area: " + rectangle.getArea());

        // Sort Rectangles
        sorter.sort(rectangles);

        System.out.println(rectangles[0].getArea());
        System.out.println(rectangles[1].getArea());
        System.out.println(rectangles[2].getArea());

    }
}