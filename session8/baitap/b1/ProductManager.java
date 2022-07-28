package session8.baitap.b1;

import java.util.*;

public class ProductManager implements Comparator<Product> {

    public ArrayList<Product> add(ArrayList<Product> list, Product product) {
        list.add(product);
        return list;
    }

    public ArrayList<Product> edit(ArrayList<Product> list, int id, String name, double price) {
        for (Product item : list) {
            if (item.getId() == id) {
                item.setName(name);
                item.setPrice(price);
            }
        }
        return list;
    }

    public ArrayList<Product> delete(ArrayList<Product> list, int id) {
        for (Product item : list) {
            if (item.getId() == id) {
                list.remove(id - 1);
                break;
            }
        }
        return list;
    }

    public ArrayList<Product> searchName(ArrayList<Product> list, String name) {
        ArrayList<Product> res = new ArrayList<Product>();
        for (Product item : list) {
            if (item.getName().equals(name)) {
                res.add(item);
            }

        }
        return res;

    }

    public ArrayList<Product> DecreaseProducts(ArrayList<Product> list) {
        Collections.reverse(list);
        return list;

    }

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice() > o2.getPrice()) {
            return 1;
        } else if (o1.getPrice() > o2.getPrice()) {
            return 0;
        } else {
            return -1;
        }
    }
}