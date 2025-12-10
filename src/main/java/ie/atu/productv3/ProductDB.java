package ie.atu.productv3;


public class ProductDB {

    public static Product getProduct(String productCode) {

        Product myProduct = null;

        // =========================
        // BOOK PRODUCTS
        // =========================
        if (productCode.equalsIgnoreCase("java")) {
            Book b = new Book();
            b.setCode(productCode);
            b.setDescription("ATU Java Programming");
            b.setPrice(57.50);
            b.setAuthor("Joe Brown");
            myProduct = b;

        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book b = new Book();
            b.setCode(productCode);
            b.setDescription("Java Servlets and JSP");
            b.setPrice(57.50);
            b.setAuthor("Mike White");
            myProduct = b;

        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book b = new Book();
            b.setCode(productCode);
            b.setDescription("Lennon's MySQL");
            b.setPrice(54.50);
            b.setAuthor("Jim Lennon");
            myProduct = b;

            // =========================
            // SOFTWARE PRODUCTS
            // =========================
        } else if (productCode.equalsIgnoreCase("studios")) {
            Software s = new Software();
            s.setCode(productCode);
            s.setDescription("Visual Studios");
            s.setPrice(57.50);
            s.setVersion("Microsoft 1.1");
            myProduct = s;

        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software s = new Software();
            s.setCode(productCode);
            s.setDescription("Build Java apps");
            s.setPrice(57.50);
            s.setVersion("Eclipse Neon");
            myProduct = s;

        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software s = new Software();
            s.setCode(productCode);
            s.setDescription("Latest MySQL");
            s.setPrice(54.50);
            s.setVersion("Oracle 3.0");
            myProduct = s;

            // =========================
            // MUSIC PRODUCTS
            // =========================
        } else if (productCode.equalsIgnoreCase("pink")) {
            Music m = new Music();
            m.setCode(productCode);
            m.setDescription("Wish you were here by Pink Floyd");
            m.setArtist("Pink Floyd");
            m.setLabel("Columbia");
            m.setPrice(8.00);
            myProduct = m;

        } else if (productCode.equalsIgnoreCase("abba")) {
            Music m = new Music();
            m.setCode(productCode);
            m.setDescription("Greatest Hits Collection");
            m.setArtist("ABBA");
            m.setLabel("Universal");
            m.setPrice(9.50);
            myProduct = m;

            // =========================
            // TV PRODUCTS
            // =========================
        } else if (productCode.equalsIgnoreCase("kdl43")) {
            TV tv = new TV();
            tv.setCode(productCode);
            tv.setDescription("SONY BRAVIA SMART TV KDL43WF663");
            tv.setScreenSize("55\"");
            tv.setManufacturer("Sony");
            tv.setPrice(819.00);
            myProduct = tv;
        }

        return myProduct;
    }
}
