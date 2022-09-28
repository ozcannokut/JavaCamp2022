public class Main {
    public static void main(String[] args) {
        CustomerManager musteriler=new CustomerManager();
        CustomerManager musteriler2=new CustomerManager();
        musteriler=musteriler2;

        musteriler.Add();
    }
    }



