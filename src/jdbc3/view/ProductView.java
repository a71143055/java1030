package jdbc3.view;

import jdbc3.entity.Product;

import java.util.ArrayList;

public class ProductView {
    public void printHeader(){
        System.out.println("************************");
        System.out.println("***** Product List *****");
        System.out.println("************************");
    }

    public void printFooter(){
        System.out.println("*************************");
        System.out.println("******* End Print *******");
        System.out.println("*************************");
    }

    public void printProduct(ArrayList<Product> proList){
        for (Product p : proList){
            System.out.println("* 제품번호 : " + p.getpNum());
            System.out.println("* 제품명 : " + p.getpName());
            System.out.println("* 재고량 : " + p.getpStock());
            System.out.println("* 단가 : " + p.getpPrice());
            System.out.println("* 제조업체 : " + p.getProduceName());
            System.out.println();
        }
    }

    public static void printView(ArrayList<Product> arrList) {
        ProductView view = new ProductView();
        view.printHeader();
        view.printProduct(arrList);
        view.printFooter();
    }
}