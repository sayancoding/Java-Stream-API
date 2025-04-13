import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Product;

public class S3_StreamCollection {
    public static void main(String[] args) {
        /*
         * Terminate operation/method - Collect()
         */
        List<Product> mobileProduct = PRODUCT_LIST.stream()
        .filter(product -> product.getCategory().equalsIgnoreCase("mobile"))
        .collect(Collectors.toList()); 
        // collect as a list of product
        System.out.println(mobileProduct);

        
        String mobileProductName = PRODUCT_LIST.stream()
        .filter(product -> product.getCategory().equalsIgnoreCase("mobile"))
        .map(product -> product.getName())
        .collect(Collectors.joining(",","[","]")); 
        /*
         * Collect String with format like list
         * joining(delimiter, prefix, suffix)
         * looks like [item1,item2,item3]
         */
        System.out.println(mobileProductName);

        
        double avgLaptopPrice = PRODUCT_LIST.stream()
        .filter(product -> product.getCategory().equalsIgnoreCase("laptop"))
        .collect(Collectors.averagingDouble(p->p.getPrice()));
        /*
         * Collect result as an average of laptop-price
         */
        System.out.println("Avg laptop price : " + avgLaptopPrice);

        
        int sumLaptopPrice = PRODUCT_LIST.stream()
        .filter(product -> product.getCategory().equalsIgnoreCase("laptop"))
        .collect(Collectors.summingInt(p->p.getPrice()));
        /*
         * Collect result as an total/sum of laptop-price
         */
        System.out.println("Total laptop price : " + sumLaptopPrice);

        
        IntSummaryStatistics summarizingMobilePrice = PRODUCT_LIST.stream()
        .filter(product -> product.getCategory().equalsIgnoreCase("laptop"))
        .collect(Collectors.summarizingInt(p->p.getPrice()));
        /*
         * Collect result as summarizing MobilePrice 
         * include avg, sum, min, max, count 
         */
        System.out.println("summarizingMobilePrice mobile price : " + summarizingMobilePrice);

    
        Map<String,List<Product>> categoryMapped = PRODUCT_LIST.stream()
                                                        .collect(Collectors.groupingBy(product -> product.getCategory()));
        /*
         * Mapping like category -> list of product
         */
        System.out.println(categoryMapped);
    }

    public static List<Product> PRODUCT_LIST = Arrays.asList(
        new Product(1,"iPhone16","mobile",70000),
        new Product(2,"Vivo V1","mobile",30000),
        new Product(1,"MacBook m1","laptop",110000),
        new Product(1,"boat 255 pro","earphone",2000),
        new Product(1,"ideaPad 15s","laptop",55000),
        new Product(1,"thinkPad 13s","laptop",65000),
        new Product(1,"noise r1","earphone",1500)
    );
}
