public class test3 {
    public static void main(String[] args) {
        Shop test = new Shop();
        
        
        System.out.println();
        test.viewCart();
        System.out.println("Quantity: of item before move: " + test.getQu());
        System.out.println("Above is prior to adding stock");
        test.getstocko(2);
        test.viewCart();
        System.out.println("Quantity: of item after move: " + test.getQu());
        System.out.println("Above is after adding stock");
    }
}