import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size of Books in library : ");
        int size = Integer.parseInt(scanner.next());
        Library myLibrary = new Library(size);

        String bookName;
        System.out.println("Welcome in OSC Library System");
        while(true){
            System.out.println(" *************************************************************************");
            System.out.println(" For Adding book Press 1 \n For Display books Press 2 \n " +
                    "For Search books Press 3 \n For Exit Press 0");
               int choose = Integer.parseInt(scanner.next());
               switch (choose){
                   case 1 :
                       System.out.println("Add Book");
                       bookName = scanner.next();
                       myLibrary.addBook(bookName);
                       break;
                   case 2 :
                       System.out.println("Display all Books");
                       myLibrary.displayBooks();
                       break;
                   case 3 :
                       System.out.println("Search for BOOk");
                       bookName = scanner.next();
                     Boolean isFound=myLibrary.linearSearch(bookName);
                     if (isFound) System.out.println("book is found in OSC Library");
                     else System.out.println("book is not found in OSC Library");
                       break;
                   case 0 :
                        return;
                   default:
                       throw new IllegalArgumentException() ;
               }

        }


    }
}
