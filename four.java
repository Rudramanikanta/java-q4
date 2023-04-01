import java.util.ArrayList;
import java.util.List;

class four{
    public static void main(String[] args) {
        List<Data> s21=new ArrayList<>();
        s21.add(new Data("tea", 100));
        s21.add(new Data("coffee", 100));
        s21.add(new Data("green tea", 75));
         List<Data> s22=new ArrayList<>();
        s22.add(new Data("tea", 120));
        s22.add(new Data("coffee", 110));
        s22.add(new Data("green tea", 100));
       for(int i=0;i<s21.size();i++){
        if(s21.get(i).getProduct().contains("tea")){
            s21.remove(i);
            s22.remove(i);
        }
       }
       System.out.println(s21);
       System.out.println(s22);
    }
}
class Data{
    String product;
    int sale;
   
    Data(String product,int sale){
        this.product=product;
        this.sale=sale;
    }
   
    public String getProduct(){
        return product;
    }
    public int getSale(){
        return sale;
    }
    public String toString(){
        return "{"+product+":"+sale+"}";
    }
}