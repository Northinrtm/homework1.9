public class Main {
    public static void main(String[] args) {
        Author a1 = new Author("Питер", "Уоттс");
        Author a2 = new Author("Курт","Воннегут");
        Book b1 = new Book("Рифтеры",a1,2014);
        Book b2 = new Book("Колыбель для кошки",a2,1963);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(b1);
        System.out.println(b2);
        b2.setYear(2015);
        System.out.println(b2);
    }
}
