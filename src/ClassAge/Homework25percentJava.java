package ClassAge;
import java.util.ArrayList;

public class Homework25percentJava
{

    public static class ArrayListDemo {
        public static void main(String[] args) {

            ArrayList<Integer> arrlist = new ArrayList<Integer>(4);
            System.out.println(arrlist);


            arrlist.add(10);
            arrlist.add(20);
            arrlist.add(30);


            arrlist.trimToSize();
            System.out.println(arrlist);
        }
    }
}

