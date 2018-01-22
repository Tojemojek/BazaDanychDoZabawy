package pl.kostrowski.spring.initializer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.kostrowski.spring.entity.Product;
import pl.kostrowski.spring.entity.ProductType;
import pl.kostrowski.spring.repository.ProductRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Component
public class ProductInitializer {

    @Autowired
    ProductRepository productRepository;

    @PostConstruct
    public void initializeData() {

        Product products[] = new Product[100];

        products[0]=new Product(1,"Beef - Ground Medium",ProductType.FOOD,462);
        products[1]=new Product(2,"Bread - Calabrese Baguette",ProductType.FOOD,325);
        products[2]=new Product(3,"Breakfast Quesadillas",ProductType.FOOD,54);
        products[3]=new Product(4,"Broccoli - Fresh",ProductType.FOOD,373);
        products[4]=new Product(5,"Butter - Unsalted",ProductType.FOOD,311);
        products[5]=new Product(6,"Cheese - Camembert",ProductType.FOOD,87);
        products[6]=new Product(7,"Cheese Cloth",ProductType.FOOD,5);
        products[7]=new Product(8,"Chicken - Wings, Tip Off",ProductType.FOOD,236);
        products[8]=new Product(9,"Chips - Doritos",ProductType.FOOD,459);
        products[9]=new Product(10,"Chocolate - Liqueur Cups With Foil",ProductType.FOOD,334);
        products[10]=new Product(11,"Fish - Artic Char, Cold Smoked",ProductType.FOOD,480);
        products[11]=new Product(12,"Garlic - Elephant",ProductType.FOOD,342);
        products[12]=new Product(13,"Gingerale - Schweppes, 355 Ml",ProductType.FOOD,133);
        products[13]=new Product(14,"Ice Cream - Strawberry",ProductType.FOOD,230);
        products[14]=new Product(15,"Juice - Cranberry 284ml",ProductType.FOOD,304);
        products[15]=new Product(16,"Juice - Ocean Spray Cranberry",ProductType.FOOD,230);
        products[16]=new Product(17,"Lamb - Rack",ProductType.FOOD,276);
        products[17]=new Product(18,"Lamb - Whole, Frozen",ProductType.FOOD,89);
        products[18]=new Product(19,"Lemon Balm - Fresh",ProductType.FOOD,88);
        products[19]=new Product(20,"Lemonade - Natural, 591 Ml",ProductType.FOOD,317);
        products[20]=new Product(21,"Lemons",ProductType.FOOD,33);
        products[21]=new Product(22,"Lettuce - Boston Bib",ProductType.FOOD,169);
        products[22]=new Product(23,"Lettuce - Iceberg",ProductType.FOOD,135);
        products[23]=new Product(24,"Lettuce - Red Leaf",ProductType.FOOD,91);
        products[24]=new Product(25,"Longos - Assorted Sandwich",ProductType.FOOD,166);
        products[25]=new Product(26,"Mini - Vol Au Vents",ProductType.FOOD,470);
        products[26]=new Product(27,"Mousse - Mango",ProductType.FOOD,471);
        products[27]=new Product(28,"Muffin - Bran Ind Wrpd",ProductType.FOOD,390);
        products[28]=new Product(29,"Muffin - Zero Transfat",ProductType.FOOD,270);
        products[29]=new Product(30,"Muffin Mix - Carrot",ProductType.FOOD,166);
        products[30]=new Product(31,"Munchies Honey Sweet Trail Mix",ProductType.FOOD,42);
        products[31]=new Product(32,"Mushroom - Morel Frozen",ProductType.FOOD,251);
        products[32]=new Product(33,"Mushroom - Porcini Frozen",ProductType.FOOD,384);
        products[33]=new Product(34,"Mushroom Morel Fresh",ProductType.FOOD,482);
        products[34]=new Product(35,"Oats Large Flake",ProductType.FOOD,20);
        products[35]=new Product(36,"Pasta - Bauletti, Chicken White",ProductType.FOOD,253);
        products[36]=new Product(37,"Pasta - Penne, Lisce, Dry",ProductType.FOOD,171);
        products[37]=new Product(38,"Pate Pans Yellow",ProductType.FOOD,10);
        products[38]=new Product(39,"Pepper - Roasted Red",ProductType.FOOD,308);
        products[39]=new Product(40,"Pesto - Primerba, Paste",ProductType.FOOD,463);
        products[40]=new Product(41,"Pickerel - Fillets",ProductType.FOOD,150);
        products[41]=new Product(42,"Pomegranates",ProductType.FOOD,329);
        products[42]=new Product(43,"Port - 74 Brights",ProductType.FOOD,313);
        products[43]=new Product(44,"Prunes - Pitted",ProductType.FOOD,155);
        products[44]=new Product(45,"Puree - Raspberry",ProductType.FOOD,376);
        products[45]=new Product(46,"Salmon - Sockeye Raw",ProductType.FOOD,471);
        products[46]=new Product(47,"Sesame Seed Black",ProductType.FOOD,310);
        products[47]=new Product(48,"Shrimp - Black Tiger 16/20",ProductType.FOOD,310);
        products[48]=new Product(49,"Spinach - Packaged",ProductType.FOOD,20);
        products[49]=new Product(50,"Split Peas - Yellow, Dry",ProductType.FOOD,156);
        products[50]=new Product(51,"Squash - Sunburst",ProductType.FOOD,376);
        products[51]=new Product(52,"Steampan - Lid For Half Size",ProductType.FOOD,465);
        products[52]=new Product(53,"Strawberries - California",ProductType.FOOD,359);
        products[53]=new Product(54,"Sweet Pea Sprouts",ProductType.FOOD,210);
        products[54]=new Product(55,"Syrup - Golden, Lyles",ProductType.FOOD,366);
        products[55]=new Product(56,"Tart - Raisin And Pecan",ProductType.FOOD,453);
        products[56]=new Product(57,"The Pop Shoppe - Black Cherry",ProductType.FOOD,191);
        products[57]=new Product(58,"Thyme - Fresh",ProductType.FOOD,179);
        products[58]=new Product(59,"Tofu - Soft",ProductType.FOOD,290);
        products[59]=new Product(60,"Tomatoes - Grape",ProductType.FOOD,292);
        products[60]=new Product(61,"Tomatoes Tear Drop Yellow",ProductType.FOOD,317);
        products[61]=new Product(62,"Tray - 12in Rnd Blk",ProductType.FOOD,433);
        products[62]=new Product(63,"Turkey Leg With Drum And Thigh",ProductType.FOOD,320);
        products[63]=new Product(64,"Urban Zen Drinks",ProductType.FOOD,372);
        products[64]=new Product(65,"Veal - Chops, Split, Frenched",ProductType.FOOD,81);
        products[65]=new Product(66,"Veal - Nuckle",ProductType.FOOD,284);
        products[66]=new Product(67,"Wasabi Paste",ProductType.FOOD,173);
        products[67]=new Product(68,"Yoplait Drink",ProductType.DRINK,419);
        products[68]=new Product(69,"Coffee - French Vanilla Frothy",ProductType.DRINK,12);
        products[69]=new Product(70,"Hersey Shakes",ProductType.DRINK,460);
        products[70]=new Product(71,"Instant Coffee",ProductType.DRINK,277);
        products[71]=new Product(72,"Tea - Black Currant",ProductType.DRINK,486);
        products[72]=new Product(73,"Vodka - Moskovskaya",ProductType.DRINK,486);
        products[73]=new Product(74,"Wine - Chardonnay South",ProductType.DRINK,337);
        products[74]=new Product(75,"Wine - Chateauneuf Du Pape",ProductType.DRINK,100);
        products[75]=new Product(76,"Wine - Domaine Boyar Royal",ProductType.DRINK,422);
        products[76]=new Product(77,"Wine - Harrow Estates, Vidal",ProductType.DRINK,124);
        products[77]=new Product(78,"Wine - Marlbourough Sauv Blanc",ProductType.DRINK,319);
        products[78]=new Product(79,"Wine - Merlot Vina Carmen",ProductType.DRINK,480);
        products[79]=new Product(80,"Wine - Vouvray Cuvee Domaine",ProductType.DRINK,427);
        products[80]=new Product(81,"Yogurt - Banana, 175 Gr",ProductType.DRINK,255);
        products[81]=new Product(82,"Teclast X10 Quad Core 1280x800 IPS",ProductType.ELECTRONICS,33);
        products[82]=new Product(83,"WeCool 7 inch Quad Core Kids Tablet",ProductType.ELECTRONICS,295);
        products[83]=new Product(84,"WeCool Children Tablet PC with Silicon Bracket Case",ProductType.ELECTRONICS,272);
        products[84]=new Product(85,"DragonTouch Y88X Plus",ProductType.ELECTRONICS,54);
        products[85]=new Product(86,"BOBARRY Newest 10.1 inch Tablet",ProductType.ELECTRONICS,50);
        products[86]=new Product(87,"Octa core tablet pc G900 2.5D screen",ProductType.ELECTRONICS,196);
        products[87]=new Product(88,"CHUWI HI10 PLUS 10.8 inch Windows 10",ProductType.ELECTRONICS,346);
        products[88]=new Product(89,"CARBAYTA C108 ",ProductType.ELECTRONICS,270);
        products[89]=new Product(90,"HUWI Hi10 Pro 2 in 1 Ultrabook Tablets",ProductType.ELECTRONICS,210);
        products[90]=new Product(91,"WayWalkers 10.1' tablet",ProductType.ELECTRONICS,320);
        products[91]=new Product(92,"CHUWI Surbook Mini",ProductType.ELECTRONICS,345);
        products[92]=new Product(93,"VOYO X7 tablet android 3G/4G",ProductType.ELECTRONICS,362);
        products[93]=new Product(94,"BOBARRY Android 7.0 10.1 inch T900 Tablet",ProductType.ELECTRONICS,314);
        products[94]=new Product(95,"AOSON S8 Pro 4G LTE 8 inch smart phone",ProductType.ELECTRONICS,479);
        products[95]=new Product(96,"LZWIN 10.1 inch T805C Octa Core Ram 4GB Rom 32GB Android",ProductType.ELECTRONICS,129);
        products[96]=new Product(97,"Tablet PC 10 inch 3g 4g tablet Octa Core 1920*1200",ProductType.ELECTRONICS,265);
        products[97]=new Product(98,"BOBARRY 10.1 Inch tablet pc",ProductType.ELECTRONICS,275);
        products[98]=new Product(99,"CARBAYTA T805C",ProductType.ELECTRONICS,26);
        products[99]=new Product(100,"Glavey 10.1 inch Windows PAD Windows 10",ProductType.ELECTRONICS,450);

        productRepository.save(Arrays.asList(products));

    }

}
