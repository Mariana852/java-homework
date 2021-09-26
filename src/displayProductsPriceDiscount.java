import java.util.ArrayList;
import java.util.Iterator;

public class displayProductsPriceDiscount {
    public static void main(String[] args) {
        ArrayList<ProductDetails> arrOfProductsOne = new ArrayList<>();
        ArrayList<ProductDetails> arrOfProductsTwo = new ArrayList<>();
        ArrayList<ProductDetails> arrOfProductsThree = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            ProductDetails cheapProductDetails = new ProductDetails("Cheap Product" + i, 25 + (i * 5));
            ProductDetails medExpensiveProdDetails = new ProductDetails("Med Expensive Product" + i, 500 + (i * 4));
            ProductDetails expensiveProductDetails = new ProductDetails("Expensive Product" + i, 3000 + (i * 6));

            arrOfProductsOne.add(cheapProductDetails);
            arrOfProductsTwo.add(medExpensiveProdDetails);
            arrOfProductsThree.add(expensiveProductDetails);
        }

        Iterator<ProductDetails> itr0 = arrOfProductsOne.iterator();
        Iterator<ProductDetails> itr1 = arrOfProductsTwo.iterator();
        Iterator<ProductDetails> itr2 = arrOfProductsThree.iterator();

        int sumOfProducts = 0;

        while (itr2.hasNext()) {
            ProductDetails pr = itr2.next();
            sumOfProducts = sumOfProducts + pr.productPrice;
        }

        displayMsgBasedOnValueSize(sumOfProducts);
        // reset the sum
        sumOfProducts = 0;

        while (itr0.hasNext()) {
            ProductDetails pr = itr0.next();
            sumOfProducts = sumOfProducts + pr.productPrice;
        }

        displayMsgBasedOnValueSize(sumOfProducts);
        // reset the sum
        sumOfProducts = 0;

        while (itr1.hasNext()) {
            ProductDetails pr = itr1.next();
            sumOfProducts = sumOfProducts + pr.productPrice;
        }

        displayMsgBasedOnValueSize(sumOfProducts);
    }

    static void displayMsgBasedOnValueSize(int sumOfPrices) {
        if (sumOfPrices < 1000) {
            int howMuchMoreINeed = 1000 - sumOfPrices;
            System.out.println("Spend " + howMuchMoreINeed + " $ to get the discount. Do you want to continue?");
        } else if (sumOfPrices > 1000 && sumOfPrices < 10000) {
            int discountFromSum = (sumOfPrices * 10) / 100;
            System.out.println("Congrats, you saved " + discountFromSum + " $");
        } else {
            int discountFromSum = (sumOfPrices * 20) / 100;
            System.out.println("Congrats, you saved " + discountFromSum + " $");
        }
    }
}

class ProductDetails {
    String productName;
    int productPrice;

    ProductDetails(String productName, int productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }
}


