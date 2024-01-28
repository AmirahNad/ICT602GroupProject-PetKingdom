package com.example.petkingdom;

import android.content.res.Resources;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class ShoppingCartHelper {

    public static final String PRODUCT_INDEX = "PRODUCT_INDEX";

    private static List<Product> catalog;
    private static Map<Product, ShoppingCartEntry> cartMap = new HashMap<Product, ShoppingCartEntry>();

    public static List<Product> getCatalog(Resources res){
        if(catalog == null) {
            catalog = new Vector<Product>();
            catalog.add(new Product("Powercat Ayam Segar", res
                    .getDrawable(R.drawable.cat_ayam),
                    "BRAND : POWER CAT\n" +
                            "\n" +
                            "It is the only halal cat food products, pure, clean and high in quality. In mid-June 2015, the PowerCat boost the industry with a series of dry food thorugh  the selections of  PowerCat Fresh Ocean and  Fresh Ocean Tuna Fish. PowerCat Dry food production are using modern facilities and technology. Each pack contains fresh fish, which is free of preservatives, artificial coloring and salt as to ensure its premium quality it is high in nutritions, fresh and rich in vitamins.", 72.00));
            catalog.add(new Product("Powercat Ikan Laut Segar", res
                    .getDrawable(R.drawable.cat_ikan),
                    "BRAND : POWER CAT\n" +
                            "\n" +
                            "It is the only halal cat food products, pure, clean and high in quality. In mid-June 2015, the PowerCat boost the industry with a series of dry food thorugh  the selections of  PowerCat Fresh Ocean and  Fresh Ocean Tuna Fish. PowerCat Dry food production are using modern facilities and technology. Each pack contains fresh fish, which is free of preservatives, artificial coloring and salt as to ensure its premium quality it is high in nutritions, fresh and rich in vitamins.", 72.00));
            catalog.add(new Product("Powercat Ikan Tuna Segar", res
                    .getDrawable(R.drawable.cat_tuna),
                    "BRAND : POWER CAT\n" +
                            "\n" +
                            "It is the only halal cat food products, pure, clean and high in quality. In mid-June 2015, the PowerCat boost the industry with a series of dry food thorugh  the selections of  PowerCat Fresh Ocean and  Fresh Ocean Tuna Fish. PowerCat Dry food production are using modern facilities and technology. Each pack contains fresh fish, which is free of preservatives, artificial coloring and salt as to ensure its premium quality it is high in nutritions, fresh and rich in vitamins.", 72.00));

            //ikan
            catalog.add(new Product(" Makanan ikan takara 500g", res
                    .getDrawable(R.drawable.ikan1),
                    "•Floating type\n" +
                            "•Does not cloud water", 5.00));
            catalog.add(new Product("Makanan Ikan Emas - Goldfish Food ", res
                    .getDrawable(R.drawable.ikan2),
                    "Xin Yang Gold Fish Pallet - Floating\n" +
                            "\n" +
                            "Makanan Ikan Emas sesuai untuk semua jenis Ikan Emas. Menaikkan warna, membesar, dan membantu dengan kesihatan.\n" +
                            "\n" +
                            "Tidak mengotorkan air\n" +
                            "\n" +
                            "Goldfish food suitable for all type of Goldfish. Brings out colour, growth and helps with health.\n" +
                            "\n" +
                            "Does not cloudy the water\n" +
                            "\n" +
                            "INGREDIENT\n" +
                            "Fish protein, Malt, Yeast powder, Artemia, Spirulina, Antarctic shrimp, Natural Immune globulin, Proteolytic Enzymes,  Vitamin\n" +
                            "\n" +
                            "ANALYSIS\n" +
                            "Calcium Pantothenate: Min 7%\n" +
                            "Protein: Min 39%\n" +
                            "Fat: Min 8%\n" +
                            "Moisture: Max 7%\n" +
                            "Ash: Min 12%\n" +
                            "Fiber: Min 4%", 12.00));
            catalog.add(new Product("Makanan Ikan Emas - Goldfish Food (Small)", res
                    .getDrawable(R.drawable.ikan3),
                    "Xin Yang Gold Fish Pallet - Floating\n" +
                            "\n" +
                            "Makanan Ikan Emas sesuai untuk semua jenis Ikan Emas. Menaikkan warna, membesar, dan membantu dengan kesihatan.\n" +
                            "\n" +
                            "Tidak mengotorkan air\n" +
                            "\n" +
                            "Goldfish food suitable for all type of Goldfish. Brings out colour, growth and helps with health.\n" +
                            "\n" +
                            "Does not cloudy the water\n" +
                            "\n" +
                            "INGREDIENT\n" +
                            "Fish protein, Malt, Yeast powder, Artemia, Spirulina, Antarctic shrimp, Natural Immune globulin, Proteolytic Enzymes,  Vitamin\n" +
                            "\n" +
                            "ANALYSIS\n" +
                            "Calcium Pantothenate: Min 7%\n" +
                            "Protein: Min 39%\n" +
                            "Fat: Min 8%\n" +
                            "Moisture: Max 7%\n" +
                            "Ash: Min 12%\n" +
                            "Fiber: Min 4%", 5.00));

           }

        return catalog;
    }

    public static void setQuantity(Product product, int quantity) {
        // Get the current cart entry
        ShoppingCartEntry curEntry = cartMap.get(product);

        // If the quantity is zero or less, remove the products
        if(quantity <= 0) {
            if(curEntry != null)
                removeProduct(product);
            return;
        }

        // If a current cart entry doesn't exist, create one
        if(curEntry == null) {
            curEntry = new ShoppingCartEntry(product, quantity);
            cartMap.put(product, curEntry);
            return;
        }

        // Update the quantity
        curEntry.setQuantity(quantity);
    }

    public static int getProductQuantity(Product product) {
        // Get the current cart entry
        ShoppingCartEntry curEntry = cartMap.get(product);

        if(curEntry != null)
            return curEntry.getQuantity();

        return 0;
    }

    public static void removeProduct(Product product) {
        cartMap.remove(product);
    }

    public static List<Product> getCartList() {
        List<Product> cartList = new Vector<Product>(cartMap.keySet().size());
        for(Product p : cartMap.keySet()) {
            cartList.add(p);
        }

        return cartList;
    }

}
