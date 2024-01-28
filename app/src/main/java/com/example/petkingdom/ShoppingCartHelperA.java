package com.example.petkingdom;

import android.content.res.Resources;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class ShoppingCartHelperA {

    public static final String PRODUCT_INDEX = "PRODUCT_INDEX";

    private static List<Product> accCatalog;
    private static Map<Product, ShoppingCartEntry> accCartMap = new HashMap<>();

    public static List<Product> getCatalog(Resources res){
        if(accCatalog == null) {
            accCatalog = new Vector<Product>();
            accCatalog.add(new Product("Cat Rope Dog Rope Adjustable -Pink-", res
                    .getDrawable(R.drawable.acc_ptali),
                    "Product Description\n" +
                            "\n" +
                            "\uD83D\uDC31\uD83D\uDC36SPECIFICATIONS:\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Product: Premium Hand Made Bear Design Pet Harness\n" +
                            "\n" +
                            "Neck Size: Refer to chart\n" +
                            "\n" +
                            "Chest: Refer to chart\n" +
                            "\n" +
                            "Lead Length: 120 cm\n" +
                            "\n" +
                            "Lead Width: S: 1.0cm, M:1.5 cm, L: 2.0cm\n" +
                            "\n" +
                            "Material: Polyester + Linen Webbing\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "⚡\uFE0FFEATURES:\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "✅ STYLISH & FASHIONABLE APPEARANCE\n" +
                            "\n" +
                            "✅ DURABLE & ADJUSTABLE\n" +
                            "\n" +
                            "✅ COMFORTABLE TO WEAR: It will not hurt your pet.\n" +
                            "\n" +
                            "✅ 100% BRAND NEW AND AUTHENTIC QUALITY\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\uD83D\uDCD0MEASUREMENT:\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "M Size - Chest 34-44 CM / Collar 26-33 CM / Suggested Weight 3 - 6 KG", 5.90));
            accCatalog.add(new Product("Cat Rope Dog Rope Adjustable -Blue-", res
                    .getDrawable(R.drawable.acc_btali),
                    "Product Description\n" +
                            "\n" +
                            "\uD83D\uDC31\uD83D\uDC36SPECIFICATIONS:\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Product: Premium Hand Made Bear Design Pet Harness\n" +
                            "\n" +
                            "Neck Size: Refer to chart\n" +
                            "\n" +
                            "Chest: Refer to chart\n" +
                            "\n" +
                            "Lead Length: 120 cm\n" +
                            "\n" +
                            "Lead Width: S: 1.0cm, M:1.5 cm, L: 2.0cm\n" +
                            "\n" +
                            "Material: Polyester + Linen Webbing\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "⚡\uFE0FFEATURES:\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "✅ STYLISH & FASHIONABLE APPEARANCE\n" +
                            "\n" +
                            "✅ DURABLE & ADJUSTABLE\n" +
                            "\n" +
                            "✅ COMFORTABLE TO WEAR: It will not hurt your pet.\n" +
                            "\n" +
                            "✅ 100% BRAND NEW AND AUTHENTIC QUALITY\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\uD83D\uDCD0MEASUREMENT:\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "S Size - Chest 27-35 CM / Neck 20-25 CM / Suggested Weight 1 - 4 KG\n" +
                            "\n" +
                            "M Size - Chest 34-44 CM / Collar 26-33 CM / Suggested Weight 3 - 6 KG", 5.90));
            accCatalog.add(new Product("Cat Rope Dog Rope Adjustable -Grey-", res
                    .getDrawable(R.drawable.acc_gtali),
                    "Product Description\n" +
                            "\n" +
                            "\uD83D\uDC31\uD83D\uDC36SPECIFICATIONS:\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Product: Premium Hand Made Bear Design Pet Harness\n" +
                            "\n" +
                            "Neck Size: Refer to chart\n" +
                            "\n" +
                            "Chest: Refer to chart\n" +
                            "\n" +
                            "Lead Length: 120 cm\n" +
                            "\n" +
                            "Lead Width: S: 1.0cm, M:1.5 cm, L: 2.0cm\n" +
                            "\n" +
                            "Material: Polyester + Linen Webbing\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "⚡\uFE0FFEATURES:\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "✅ STYLISH & FASHIONABLE APPEARANCE\n" +
                            "\n" +
                            "✅ DURABLE & ADJUSTABLE\n" +
                            "\n" +
                            "✅ COMFORTABLE TO WEAR: It will not hurt your pet.\n" +
                            "\n" +
                            "✅ 100% BRAND NEW AND AUTHENTIC QUALITY\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\uD83D\uDCD0MEASUREMENT:\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "S Size - Chest 27-35 CM / Neck 20-25 CM / Suggested Weight 1 - 4 KG\n" +
                            "\n" +
                            "M Size - Chest 34-44 CM / Collar 26-33 CM / Suggested Weight 3 - 6 KG", 5.90));


            accCatalog.add(new Product("Cat Rope Dog Rope Adjustable -Yellow-", res
                    .getDrawable(R.drawable.acc_ytali),
                    "Product Description\n" +
                            "\n" +
                            "\uD83D\uDC31\uD83D\uDC36SPECIFICATIONS:\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "Product: Premium Hand Made Bear Design Pet Harness\n" +
                            "\n" +
                            "Neck Size: Refer to chart\n" +
                            "\n" +
                            "Chest: Refer to chart\n" +
                            "\n" +
                            "Lead Length: 120 cm\n" +
                            "\n" +
                            "Lead Width: S: 1.0cm, M:1.5 cm, L: 2.0cm\n" +
                            "\n" +
                            "Material: Polyester + Linen Webbing\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "⚡\uFE0FFEATURES:\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "✅ STYLISH & FASHIONABLE APPEARANCE\n" +
                            "\n" +
                            "✅ DURABLE & ADJUSTABLE\n" +
                            "\n" +
                            "✅ COMFORTABLE TO WEAR: It will not hurt your pet.\n" +
                            "\n" +
                            "✅ 100% BRAND NEW AND AUTHENTIC QUALITY\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "\uD83D\uDCD0MEASUREMENT:\n" +
                            "\n" +
                            "\n" +
                            "\n" +
                            "S Size - Chest 27-35 CM / Neck 20-25 CM / Suggested Weight 1 - 4 KG\n" +
                            "\n" +
                            "M Size - Chest 34-44 CM / Collar 26-33 CM / Suggested Weight 3 - 6 KG", 5.90));
            accCatalog.add(new Product("PET TEASER Cat Toy -Mouse-", res
                    .getDrawable(R.drawable.acc_mouse),
                    "Product Highlights:\n" +
                            "- Hand Made Wand, keep your cat happy and healthy.\n" +
                            "- The feather tailed on a wand is interactive entertainment for your cat! \n" +
                            "- It is all available in one toy: chewer, exerciser, and teaser.\n" +
                            "- Awesome interactive fun \n" +
                            "- Watch them flip, jump, pounce, and chase these natural cat teaser toys. \n" +
                            "- A great exerciser to keep you cat healthy and strong.\n" +
                            "\n" +
                            "Length: 40cm\n" +
                            "Total weight: 28g\n" +
                            "Material:Bell, Feather, Elastic String, and Sturdy Wood Rod", 3.14));
            accCatalog.add(new Product("PET TEASER Cat Toy -Party Teaser 88CM- ", res
                    .getDrawable(R.drawable.acc_party),
                    "Product Highlights:\n" +
                            "- Hand Made Wand, keep your cat happy and healthy.\n" +
                            "- The feather tailed on a wand is interactive entertainment for your cat! \n" +
                            "- It is all available in one toy: chewer, exerciser, and teaser.\n" +
                            "- Awesome interactive fun \n" +
                            "- Watch them flip, jump, pounce, and chase these natural cat teaser toys. \n" +
                            "- A great exerciser to keep you cat healthy and strong.\n" +
                            "\n" +
                            "Length: 40cm\n" +
                            "Total weight: 28g\n" +
                            "Material:Bell, Feather, Elastic String, and Sturdy Wood Rod", 2.42));

           }

        return accCatalog;
    }

    public static void setQuantity(Product product, int quantity) {
        // Get the current cart entry
        ShoppingCartEntry curEntry = accCartMap.get(product);

        // If the quantity is zero or less, remove the products
        if(quantity <= 0) {
            if(curEntry != null)
                removeProduct(product);
            return;
        }

        // If a current cart entry doesn't exist, create one
        if(curEntry == null) {
            curEntry = new ShoppingCartEntry(product, quantity);
            accCartMap.put(product, curEntry);
            return;
        }

        // Update the quantity
        curEntry.setQuantity(quantity);
    }

    public static int getProductQuantity(Product product) {
        // Get the current cart entry
        ShoppingCartEntry curEntry = accCartMap.get(product);

        if(curEntry != null)
            return curEntry.getQuantity();

        return 0;
    }

    public static void removeProduct(Product product) {
        accCartMap.remove(product);
    }

    public static List<Product> getCartList() {
        List<Product> cartList = new Vector<Product>(accCartMap.keySet().size());
        for(Product p : accCartMap.keySet()) {
            cartList.add(p);
        }

        return cartList;
    }

}
