public class Repository {
    private Movies[] DB;
    private int index;
    
    public Repository() {
        DB = new Movies[3];
        index = 0;
    }

    public void insert(Movies m) {
        DB[index] = m;
        index++;
    }
    public void remove(Movies s) {
        for(int i = 0; i < index; i++) {
            if(DB[i] == s) {
               DB[i] = DB[index - 1];
               DB[index - 1] = null;
               index--; 
            }
        }
    }

    public void oCuDeLacerda() {
        for(int i = 0; i < index; i++) {
            DB[i].mReport();
        }
    }

}