public class Library {
    private int size;
    private String [] shelfes;
    private int count =0;
    public Library(int size) {
        this.size = size;
        shelfes = new String[size];
    }
    public void addBook(String book){
        if(count >= size){
            // expand size
        }
        shelfes[count++] = book;
    }
    public Boolean linearSearch(String book){
        if(count == 0)return  false;
        for (int i = 0 ; i < count; i++){
            if(shelfes[i].equals(book)) return true ;
        }
        return false;
    }
    public void sortLibrary(){
        //Sort shelfes
    }
    public void displayBooks(){
        for (int i = 0 ; i < count; i++){
            System.out.println("Book Name : "+ shelfes[i]);
        }
    }

}
