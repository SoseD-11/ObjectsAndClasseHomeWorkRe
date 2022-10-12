public class Main {

    public static void main(String[] args) {
        Author stephenKing = new Author("Stephen", "King");
        Book theStand = new Book("The Stand", stephenKing, 1975);


        Author levTolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1865);


        Author sergeyYesenin = new Author("Sergey", "Yesenin");
        Book blackMan = new Book("Black man", sergeyYesenin, 1926);


        System.out.println(theStand);


        System.out.println(warAndPeace);


        System.out.println(blackMan);


        warAndPeace.setPublicationYear(1999);

    }
}
