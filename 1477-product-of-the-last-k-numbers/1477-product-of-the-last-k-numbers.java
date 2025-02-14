import java.util.*;

class ProductOfNumbers {
    private List<Integer> prefixProducts;

    public ProductOfNumbers() {
        prefixProducts = new ArrayList<>();
        prefixProducts.add(1); 
    }

    public void add(int num) {
        if (num == 0) {
            prefixProducts.clear();
            prefixProducts.add(1); 
        } else {
            int lastProduct = prefixProducts.get(prefixProducts.size() - 1);
            prefixProducts.add(lastProduct * num);
        }
    }

    public int getProduct(int k) {
        int size = prefixProducts.size();
        if (k >= size) return 0; 

        return prefixProducts.get(size - 1) / prefixProducts.get(size - k - 1);
    }

    public static void main(String[] args) {
        ProductOfNumbers obj = new ProductOfNumbers();
        obj.add(3);
        obj.add(0);
        obj.add(2);
        obj.add(5);
        obj.add(4);
        System.out.println(obj.getProduct(2));
        System.out.println(obj.getProduct(3)); 
        System.out.println(obj.getProduct(4)); 
        obj.add(8);
        System.out.println(obj.getProduct(2)); // Output: 32
    }
}


/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */