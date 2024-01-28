package com.example.petkingdom;

import android.content.res.Resources;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class ShoppingCartHelperM {

    public static final String PRODUCT_INDEX = "PRODUCT_INDEX";

    private static List<Product> medcatalog;
    private static Map<Product, ShoppingCartEntry> medcartMap = new HashMap<>();


    public static List<Product> getCatalog(Resources res){
        if(medcatalog == null) {
            medcatalog = new Vector<Product>();
            medcatalog.add(new Product("Pet Probiotic", res
                    .getDrawable(R.drawable.med_pro),
                    "Storage Method: Keep in dry and cool place\n" +
                            "\n" +
                            "Applicable: Cat and Dog\n" +
                            "\n" +
                            "Quantity: 180 pcs per bottle\n" +
                            "\n" +
                            "Feeding Method: feed directly or mix with food\n" +
                            "\n" +
                            "\n" +
                            "Feeding Dosage :\n" +
                            "\n" +
                            "(Small Dog, Cat)\n" +
                            "\n" +
                            "* Puppy / kitten 1-3pcs per day\n" +
                            "\n" +
                            "* Adult dog / adult cat 3-5pcs per day\n" +
                            "\n" +
                            "\n" +
                            "(Medium And Large Dog) \n" +
                            "\n" +
                            "*Puppy 3 - 6pcs per day\n" +
                            "\n" +
                            "*Adult dog 6 - 12pcs / day", 3.90));
            medcatalog.add(new Product("Multivitamin tablets", res
                    .getDrawable(R.drawable.med_vit),
                    "Storage Method: Keep in dry and cool place\n" +
                            "\n" +
                            "Applicable: Cat and Dog\n" +
                            "\n" +
                            "Quantity: 180 pcs per bottle\n" +
                            "\n" +
                            "Feeding Method: feed directly or mix with food\n" +
                            "\n" +
                            "\n" +
                            "Feeding Dosage :\n" +
                            "\n" +
                            "(Small Dog, Cat)\n" +
                            "\n" +
                            "* Puppy / kitten 1-3pcs per day\n" +
                            "\n" +
                            "* Adult dog / adult cat 3-5pcs per day\n" +
                            "\n" +
                            "\n" +
                            "(Medium And Large Dog) \n" +
                            "\n" +
                            "*Puppy 3 - 6pcs per day\n" +
                            "\n" +
                            "*Adult dog 6 - 12pcs / day ", 3.90));
            medcatalog.add(new Product("Pet Seaweed Tablets", res
                    .getDrawable(R.drawable.med_sea),
                    "Storage Method: Keep in dry and cool place\n" +
                            "\n" +
                            "Applicable: Cat and Dog\n" +
                            "\n" +
                            "Quantity: 180 pcs per bottle\n" +
                            "\n" +
                            "Feeding Method: feed directly or mix with food\n" +
                            "\n" +
                            "\n" +
                            "Feeding Dosage :\n" +
                            "\n" +
                            "(Small Dog, Cat)\n" +
                            "\n" +
                            "* Puppy / kitten 1-3pcs per day\n" +
                            "\n" +
                            "* Adult dog / adult cat 3-5pcs per day\n" +
                            "\n" +
                            "\n" +
                            "(Medium And Large Dog) \n" +
                            "\n" +
                            "*Puppy 3 - 6pcs per day\n" +
                            "\n" +
                            "*Adult dog 6 - 12pcs / day ", 3.90));


            medcatalog.add(new Product("Pet Trace Element Tablets", res
                    .getDrawable(R.drawable.med_tab),
                    "Storage Method: Keep in dry and cool place\n" +
                            "\n" +
                            "Applicable: Cat and Dog\n" +
                            "\n" +
                            "Quantity: 180 pcs per bottle\n" +
                            "\n" +
                            "Feeding Method: feed directly or mix with food\n" +
                            "\n" +
                            "\n" +
                            "Feeding Dosage :\n" +
                            "\n" +
                            "(Small Dog, Cat)\n" +
                            "\n" +
                            "* Puppy / kitten 1-3pcs per day\n" +
                            "\n" +
                            "* Adult dog / adult cat 3-5pcs per day\n" +
                            "\n" +
                            "\n" +
                            "(Medium And Large Dog) \n" +
                            "\n" +
                            "*Puppy 3 - 6pcs per day\n" +
                            "\n" +
                            "*Adult dog 6 - 12pcs / day", 3.90));
            medcatalog.add(new Product("Cat Probiotic", res
                    .getDrawable(R.drawable.med_cpro),
                    "Storage Method: Keep in dry and cool place\n" +
                            "\n" +
                            "Applicable: Cat and Dog\n" +
                            "\n" +
                            "Quantity: 180 pcs per bottle\n" +
                            "\n" +
                            "Feeding Method: feed directly or mix with food\n" +
                            "\n" +
                            "\n" +
                            "Feeding Dosage :\n" +
                            "\n" +
                            "(Small Dog, Cat)\n" +
                            "\n" +
                            "* Puppy / kitten 1-3pcs per day\n" +
                            "\n" +
                            "* Adult dog / adult cat 3-5pcs per day\n" +
                            "\n" +
                            "\n" +
                            "(Medium And Large Dog) \n" +
                            "\n" +
                            "*Puppy 3 - 6pcs per day\n" +
                            "\n" +
                            "*Adult dog 6 - 12pcs / day", 3.90));
            medcatalog.add(new Product("Chondroition Large Bone Calcium", res
                    .getDrawable(R.drawable.med_bone),
                    "Storage Method: Keep in dry and cool place\n" +
                            "\n" +
                            "Applicable: Cat and Dog\n" +
                            "\n" +
                            "Quantity: 180 pcs per bottle\n" +
                            "\n" +
                            "Feeding Method: feed directly or mix with food\n" +
                            "\n" +
                            "\n" +
                            "Feeding Dosage :\n" +
                            "\n" +
                            "(Small Dog, Cat)\n" +
                            "\n" +
                            "* Puppy / kitten 1-3pcs per day\n" +
                            "\n" +
                            "* Adult dog / adult cat 3-5pcs per day\n" +
                            "\n" +
                            "\n" +
                            "(Medium And Large Dog) \n" +
                            "\n" +
                            "*Puppy 3 - 6pcs per day\n" +
                            "\n" +
                            "*Adult dog 6 - 12pcs / day", 3.90));

           }

        return medcatalog;
    }

    public static void setQuantity(Product product, int quantity) {
        // Get the current cart entry
        ShoppingCartEntry curEntry = medcartMap.get(product);

        // If the quantity is zero or less, remove the products
        if(quantity <= 0) {
            if(curEntry != null)
                removeProduct(product);
            return;
        }

        // If a current cart entry doesn't exist, create one
        if(curEntry == null) {
            curEntry = new ShoppingCartEntry(product, quantity);
            medcartMap.put(product, curEntry);
            return;
        }

        // Update the quantity
        curEntry.setQuantity(quantity);
    }

    public static int getProductQuantity(Product product) {
        // Get the current cart entry
        ShoppingCartEntry curEntry = medcartMap.get(product);

        if(curEntry != null)
            return curEntry.getQuantity();

        return 0;
    }

    public static void removeProduct(Product product) {
        medcartMap.remove(product);
    }

    public static List<Product> getCartList() {
        List<Product> cartList = new Vector<Product>(medcartMap.keySet().size());
        for(Product p : medcartMap.keySet()) {
            cartList.add(p);
        }

        return cartList;
    }


}
