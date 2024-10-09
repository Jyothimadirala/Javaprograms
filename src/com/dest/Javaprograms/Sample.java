package com.dest.Javaprograms;
import java.awt.Color;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
public class Sample {
	public class Color {
	    // Reset
	    public static final String RESET = "\u001B[0m";

	    // Text Colors
	    

	    // Background Colors
	    public static final String BLACK_BACKGROUND = "\u001B[40m";
	    public static final String RED_BACKGROUND = "\u001B[41m";
	    public static final String GREEN_BACKGROUND = "\u001B[42m";
	    public static final String YELLOW_BACKGROUND = "\u001B[43m";
	    public static final String ANSI_BACKGROUND = "\u001B[44m";
	    public static final String PURPLE_BACKGROUND = "\u001B[45m";
	    public static final String CYAN_BACKGROUND = "\u001B[46m";
	    public static final String WHITE_BACKGROUND = "\u001B[47m";
	    public static final String GRAY_BACKGROUND = "\u001B[47m"; 
	    public static final String LIGHT_BLUE_BACKGROUND = "\u001B[44m"; 
	    public static final String DARK_BLUE_BACKGROUND = "\u001B[44m"; 
	    public static final String DARK_GRAY_BACKGROUND = "\u001B[100m"; 


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		
			

			
				
				
				Scanner sc= new Scanner(System.in);
				ArrayList<String> Cart= new ArrayList<String>();
				ArrayList<String> Products=new ArrayList<String>();
				Products.add("Electronics");
				Products.add("Fashion");
				Products.add("Grocery");
				System.out.println(Color.GREEN_BACKGROUND+"Select the category of Product"+Color.RESET);
				System.out.println();
				System.out.println(Color.RED_BACKGROUND+"1: Electronics"+Color.RESET);
				System.out.println(Color.PURPLE_BACKGROUND+"2: Grocery"+Color.RESET);
				System.out.println(Color.YELLOW_BACKGROUND+"3: Fashion"+Color.RESET);
				System.out.println();
				
				System.out.println(Color.CYAN_BACKGROUND+"Select Category of product you want to see!"+Color.RESET);
				int categorychoice=sc.nextInt();
				System.out.println();
				
			HashMap<Integer, String> Electronics= new HashMap<Integer, String>();
			Electronics.put(1, "Laptop\t");
			Electronics.put(2, "Mobiles\t");
			Electronics.put(3, "Smartwatch\t");
			Electronics.put(4, "Bluetooth\t");
			Electronics.put(5, "PowerBank\t");
			
			HashMap<Integer, String> Grocery= new HashMap<Integer, String>();
			Grocery.put(1, "Apples\t");
			Grocery.put(2, "Guava\t");
			Grocery.put(3, "Grapes\t");
			Grocery.put(4, "Pineapple\t");
			Grocery.put(5, "Chocalates\t");
			
			HashMap<Integer, String> Fashionmen= new HashMap<Integer, String>();
			Fashionmen.put(1, "Pants\t");
			Fashionmen.put(2, "T-shirt\t");
			Fashionmen.put(3, "Sweters\t");
			Fashionmen.put(4, "Dhoti\t");
			Fashionmen.put(5, "Caps\t");
			
			HashMap<Integer, String> Fashionwomen= new HashMap<Integer, String>();
			Fashionwomen.put(1, "Saree\t");
			Fashionwomen.put(2, "Lengha\t");
			Fashionwomen.put(3, "Kurti\t");
			Fashionwomen.put(4, "Tops\t");
			Fashionwomen.put(5, "T-shirts\t");
			
			HashMap<Integer, String> Fashionkids= new HashMap<Integer, String>();
			Fashionkids.put(1, "Pants\t");
			Fashionkids.put(2, "T-shirt\t");
			Fashionkids.put(3, "Jackets\t");
			Fashionkids.put(4, "Gown\t");
			Fashionkids.put(5, "Caps\t");
			
			HashMap<Integer, String> Laptop=new HashMap<Integer, String>();
			Laptop.put(50000, "Lenovolaptop\t");
			Laptop.put(65000, "HPlaptop\t");
			Laptop.put(55000, "Delllaptop\t");
			Laptop.put(70000, "Acerlaptop\t");
			Laptop.put(50000, "Applelaptop\t");
			
			HashMap<Integer, String> Mobiles=new HashMap<Integer, String>();
			Mobiles.put(480000, "SamsungMobiles\t");
			Mobiles.put(67000, "RealmeMobiles\t");
			Mobiles.put(100000, "OneplusMobiles\t");
			Mobiles.put(77000, "VivoMobiles\t");
			Mobiles.put(52000, "OppoMobiles\t");
			
			HashMap<Integer, String> Smartwatch=new HashMap<Integer, String>();
			Smartwatch.put(84000, "Fossil\t");
			Smartwatch.put(90000, "Google\t");
			Smartwatch.put(100000, "Xiaomi\t");
			Smartwatch.put(65000, "Garmin\t");
			Smartwatch.put(56000, "Oppo\t");
			
			HashMap<Integer, String> Bluetooth=new HashMap<Integer, String>();
			Bluetooth.put(35000, "Sony WH-1000XM4\t");
			Bluetooth.put(50000, "Bose QuietComfort 35\t");
			Bluetooth.put(100000, "Apple AirPods Pro\t");
			Bluetooth.put(75000, "Beats Studio3\t");
			Bluetooth.put(46000, "OnePlus Buds Pro\t");
			
			HashMap<Integer, String> Powerbank=new HashMap<Integer, String>();
			 Powerbank.put(35000, " Anker PowerCore 10000\t");
			 Powerbank.put(50000, "Xiaomi Mi Power Bank 3\t");
			 Powerbank.put(75000, "RAVPower\t");
			 Powerbank.put(45000, " Samsung 25W Wireless Power Bank\t");
			 Powerbank.put(56000, "Mophie Powerstation XXL\t");
			 
			 HashMap<Integer, String> Chocalates=new HashMap<Integer, String>();
			 Chocalates.put(5000, " Cadbury Dairy Milk\t");
			 Chocalates.put(3000, "Toblerone\t");
			 Chocalates.put(1500, "Ferrero Rocher\t");
			 Chocalates.put(800, "KitKat\t");
			 Chocalates.put(660, "5star\t");
			 
			 HashMap<Integer, String> Pants=new HashMap<Integer, String>();
			 Pants.put(45000, " Slim-fit denim jeans\t");
			 Pants.put(37000, "Cargo Pants\t");
			 Pants.put(23000, "Casual pants\t");
			 Pants.put(8000, "Chino pants\t");
			 Pants.put(6600, "Joggers\t");
			 
			 HashMap<Integer, String> Tshirts=new HashMap<Integer, String>();
			 Tshirts.put(45000, " Slim-fit denim jeans\t");
			 Tshirts.put(37000, "Cargo Pants\t");
			 Tshirts.put(23000, "Casual pants\t");
			 Tshirts.put(8000, "Chino pants\t");
			 Tshirts.put(6600, "Joggers\t");
			 
			 HashMap<Integer, String> Sweters=new HashMap<Integer, String>();
			 Sweters.put(2300, " Fleece sweater\t");
			 Sweters.put(5000, "Cotton crewneck\t");
			 Sweters.put(4280, "Cashmere sweater\t");
			 Sweters.put(7200, "Merino wool\t");
			 Sweters.put(8260, "Lambswool\t");
			
			 HashMap<Integer, String> Dhoti=new HashMap<Integer, String>();
			 Dhoti.put(2300, " Traditional cotton dhoti\t");
			 Dhoti.put(5000, "Designer dhoti\t");
			 Dhoti.put(4280, "Cashmere \t");
			 Dhoti.put(7200, "normal dhoti\t");
			 Dhoti.put(8260, "fashion dhoti\t");
			 
			 HashMap<Integer, String> Caps=new HashMap<Integer, String>();
			 Caps.put(2300, " Fleece \t");
			 Caps.put(5000, "Cotton cap\t");
			 Caps.put(4280, "Cashmere sweater\t");
			 Caps.put(7200, "sports cap\t");
			 Caps.put(8260, "normal cap\t");
			 
			 HashMap<Integer, String> Saree=new HashMap<Integer, String>();
			 Saree.put(26300, "Silk saree\t");
			 Saree.put(55000, "Cotton saree\t");
			 Saree.put(94280, "Banarasi saree\t");
			 Saree.put(3900, "Casual and formal sarees\t");
			 Saree.put(8560, "Fashion saree\t");
			 
			 HashMap<Integer, String> Lengha=new HashMap<Integer, String>();
			 Lengha.put(2300, " Ethinic lengha\t");
			 Lengha.put(5000, "Cotton lengha\t");
			 Lengha.put(4280, "Silk lengha\t");
			 Lengha.put(7200, " formal lengha\t");
			 Lengha.put(8260, "fashion lengha\t");
			 
			 HashMap<Integer, String> Kurti=new HashMap<Integer, String>();
			 Kurti.put(5300, "  Global Desi Kurti\t");
			 Kurti.put(4500, "Cotton kurti\t");
			 Kurti.put(9880, "Anouk Kurti\t");
			 Kurti.put(7200, "Jabong Kurti\t");
			 Kurti.put(1860, "Aza Fashions Kurti\t");
			 
			 HashMap<Integer, String>Tops=new HashMap<Integer, String>();
			 Tops.put(2300, " short tops\t");
			 Tops.put(5000, "long tops\t");
			 Tops.put(4280, "Crop tops\t");
			 Tops.put(7200, "stylish top\t");
			 Tops.put(8260, "cut top\t");
			 
			 HashMap<Integer, String>Tshirt=new HashMap<Integer, String>();
			 Tshirt.put(4300, "normal tshirt\t");
			 Tshirt.put(6700, "oversize tshirt\t");
			 Tshirt.put(2280, "stylish tshirt\t");
			 Tshirt.put(8300, "Graphic tshirt\t");
			 Tshirt.put(5560, "casual tshirt\t");
			 
			 HashMap<Integer, String>gown=new HashMap<Integer, String>();
			 gown.put(5300, "normal gown\t");
			 gown.put(2700, "fashion gown\t");
			 gown.put(6280, "Formal gown\t");
			 gown.put(3300, "Trendy gown\t");
			 gown.put(8560, "casual gown\t");
			 
			 HashMap<Integer, String>caps=new HashMap<Integer, String>();
			 caps.put(5300, "normal cap\t");
			 caps.put(2700, "fashion cap\t");
			 caps.put(6280, "Sports cap\t");
			 caps.put(3300, " Flat cap\t");
			 caps.put(8560, "Customizable cap\t");
			 
			 HashMap<Integer, String>jackets=new HashMap<Integer, String>();
			 jackets.put(5300, "normal jackets\t");
			 jackets.put(2700, "fashion jackets\t");
			 jackets.put(6280, " Denim jacket\t");
			 jackets.put(3300, "Fleece jacket\t");
			 jackets.put(8560, " Rain jacket\t");
			 
			
		switch (categorychoice){
			case 1:
				System.out.println(Color.GRAY_BACKGROUND+ "----Electronics Products----\n" +Color.RESET);
				System.out.println(Color.PURPLE_BACKGROUND+Electronics+"\n"+Color.RESET);
				System.out.println(Color.RED_BACKGROUND+"Which product you want to see enter the product number"+Color.RESET);
				int electronics=sc.nextInt();
				switch(electronics) {
				case 1:
					System.out.println(Color.CYAN_BACKGROUND+"----Laptop Details----\n"+Color.RESET);
					System.out.println(Color.GRAY_BACKGROUND+Laptop+Color.RESET);
					 System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
		             String laptopChoice = sc.next();
		             if (laptopChoice.equalsIgnoreCase("yes")) {
		                 Cart.add("Laptop");
		             }
		             
					break;
				case 2:
					System.out.println(Color.CYAN_BACKGROUND+"----Mobiles Details----\n"+Color.RESET);
					System.out.println(Color.GRAY_BACKGROUND+Mobiles+Color.RESET);
					 System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
		             String MobilesChoice = sc.next();
		             if (MobilesChoice.equalsIgnoreCase("yes")) {
		                 Cart.add("Mobiles");
		             }
					break;
				case 3:
					System.out.println(Color.CYAN_BACKGROUND+"----Smartwatch Details----\n"+Color.RESET);
					System.out.println(Color.GRAY_BACKGROUND+Smartwatch+Color.RESET);
					 System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
		             String SmartphoneChoice = sc.next();
		             if (SmartphoneChoice.equalsIgnoreCase("yes")) {
		                 Cart.add("Smartphone");
		             }
					break;
				case 4:
					System.out.println(Color.CYAN_BACKGROUND+"----Bluetooth Details----\n"+Color.RESET);
					System.out.println(Color.GRAY_BACKGROUND+Bluetooth+Color.RESET);
					 System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
		             String BluetoothChoice = sc.next();
		             if (BluetoothChoice.equalsIgnoreCase("yes")) {
		                 Cart.add("Bluetooth");
		             }
					break;
				case 5:
					System.out.println(Color.CYAN_BACKGROUND+"----Powerbank Details---\n"+Color.RESET);
					System.out.println(Color.GRAY_BACKGROUND+Powerbank+Color.RESET);
					 System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
		             String PowerbankChoice = sc.next();
		             if (PowerbankChoice.equalsIgnoreCase("yes")) {
		                 Cart.add("Powerbank");
		             }
					break;
					default:
						System.out.println("Invalid choice!, Please select a valid category");
				}
				break;
			case 2:
				System.out.println(Color.GRAY_BACKGROUND +"----Grocery Products----\n"+Color.RESET);
				System.out.println(Color.GREEN_BACKGROUND+Grocery+"\n"+Color.RESET);
				System.out.println(Color.PURPLE_BACKGROUND+"Which product you want to see enter the product number"+Color.RESET);
				int grocery=sc.nextInt();
				switch(grocery) {
				case 1:
					System.out.println(Color.RED_BACKGROUND+"----Apple Details----\n"+Color.RESET);
					System.out.println(Color.YELLOW_BACKGROUND+"Apple prices is 90$"+Color.RESET);
					 System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
		             String AppleChoice = sc.next();
		             if (AppleChoice.equalsIgnoreCase("yes")) {
		                 Cart.add("Apple");
		             }
					break;
				case 2:
					System.out.println(Color.RED_BACKGROUND+"----Guava Details----\n"+Color.RESET);
					System.out.println(Color.YELLOW_BACKGROUND+"Guava prices is 60$"+Color.RESET);
					 System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
		             String GuavaChoice = sc.next();
		             if (GuavaChoice.equalsIgnoreCase("yes")) {
		                 Cart.add("Guava");
		             }
					break;
				case 3:
					System.out.println(Color.RED_BACKGROUND+"----Grapes Details----\n"+Color.RESET);
					System.out.println(Color.YELLOW_BACKGROUND+"Grapes prices is 70$"+Color.RESET);
					 System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
		             String GrapesChoice = sc.next();
		             if (GrapesChoice.equalsIgnoreCase("yes")) {
		                 Cart.add("Grapes");
		             }
					break;
				case 4:
					System.out.println(Color.RED_BACKGROUND+"----Pineapple Details----\n"+Color.RESET);
					System.out.println(Color.YELLOW_BACKGROUND+"Pineapple prices is 100$"+Color.RESET);
					 System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
		             String PineappleChoice = sc.next();
		             if (PineappleChoice.equalsIgnoreCase("yes")) {
		                 Cart.add("Pineapple");
		             }
					break;
				case 5:
					System.out.println(Color.RED_BACKGROUND+"----Chacolates Details----\n"+Color.RESET);
					System.out.println( Color.YELLOW_BACKGROUND+Chocalates+Color.RESET);
					 System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
		             String ChocalatesChoice = sc.next();
		             if (ChocalatesChoice.equalsIgnoreCase("yes")) {
		                 Cart.add("Chocalates");
		             }
					break;
					default:
						System.out.println("Invalid choice!, Please select a valid category");
				}
				break;
				
			case 3:
				System.out.println(Color.GRAY_BACKGROUND+"Which fashions product do you want view\n"+Color.RESET);
				System.out.println(Color.YELLOW_BACKGROUND+"1: men"+Color.RESET);
				System.out.println(Color.PURPLE_BACKGROUND+"2: women"+Color.RESET);
				System.out.println(Color.RED_BACKGROUND+"3: kids\n"+Color.RESET);
				System.out.println(Color.GRAY_BACKGROUND+"Enter product number"+Color.RESET);
				int fashionchoice=sc.nextInt();
				switch(fashionchoice){
					case 1:
						System.out.println(Color.RED_BACKGROUND+"----Fashion Dresses For Men----\n"+Color.RESET);
						System.out.println(Color.YELLOW_BACKGROUND+Fashionmen+"\n"+Color.RESET);
						System.out.println(Color.GRAY_BACKGROUND+"Which product you want to see enter the product number"+Color.RESET);
						int fashionsmen=sc.nextInt();
						switch(fashionsmen) {
						case 1:
							System.out.println(Color.CYAN_BACKGROUND+"---Pants Details---\n"+Color.RESET);
							System.out.println(Color.PURPLE_BACKGROUND+Pants+Color.RESET);
							 System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
				             String PantsChoice = sc.next();
				             if (PantsChoice.equalsIgnoreCase("yes")) {
				                 Cart.add("Pants");
				             }
							break;
						case 2:
							System.out.println(Color.CYAN_BACKGROUND+"---T-shirts Details---\n"+Color.RESET);
							System.out.println(Color.PURPLE_BACKGROUND+Tshirts+Color.RESET);
							System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
				             String TshirtsChoice = sc.next();
				             if (TshirtsChoice.equalsIgnoreCase("yes")) {
				                 Cart.add("Tshirts");
				             }
							break;
						case 3:
							System.out.println(Color.CYAN_BACKGROUND+"---Sweters Details---\n"+Color.RESET);
							System.out.println(Color.PURPLE_BACKGROUND+Sweters+Color.RESET);
							System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
				             String SwetersChoice = sc.next();
				             if (SwetersChoice.equalsIgnoreCase("yes")) {
				                 Cart.add("Sweters");
				             }
							break;
						case 4:
							System.out.println(Color.CYAN_BACKGROUND+"---Dhoti Details\n---"+Color.RESET);
							System.out.println(Color.PURPLE_BACKGROUND+Dhoti+Color.RESET);
							System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
				             String DhotiChoice = sc.next();
				             if (DhotiChoice.equalsIgnoreCase("yes")) {
				                 Cart.add("Dhoti");
				             }
							break;
						case 5:
							System.out.println(Color.CYAN_BACKGROUND+"---Caps Details---\n"+Color.RESET);
							System.out.println(Color.PURPLE_BACKGROUND+Caps+Color.RESET);
							System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
				             String CapsChoice = sc.next();
				             if (CapsChoice.equalsIgnoreCase("yes")) {
				                 Cart.add("Caps");
				             }
							break;
							default:
								System.out.println("Invalid choice!, Please select a valid category");
						}
						break;
					case 2:
						System.out.println(Color. YELLOW_BACKGROUND +"----Fashion Dresses For Women\n----"+Color.RESET);
						System.out.println(Color.YELLOW_BACKGROUND+Fashionwomen+"\n"+Color.RESET);
						System.out.println(Color.GRAY_BACKGROUND+"Which product you want to see enter the product number"+Color.RESET);
						int fashionswomen=sc.nextInt();
						switch(fashionswomen) {
						case 1:
							System.out.println(Color.CYAN_BACKGROUND+"---Saree Details---\n"+Color.RESET);
							System.out.println(Color.PURPLE_BACKGROUND+Saree+Color.RESET);
							System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
				             String SareeChoice = sc.next();
				             if (SareeChoice.equalsIgnoreCase("yes")) {
				                 Cart.add("Saree");
				             }
							break;
						case 2:
							System.out.println(Color.CYAN_BACKGROUND+"---Lengha Details---\n");
							System.out.println(Color.PURPLE_BACKGROUND+Lengha+Color.RESET);
							System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
				             String LenghaChoice = sc.next();
				             if (LenghaChoice.equalsIgnoreCase("yes")) {
				                 Cart.add("Lengha");
				             }
							break;
						case 3:
							System.out.println(Color.CYAN_BACKGROUND+"---Kurti Details---\n"+Color.RESET);
							System.out.println(Color.PURPLE_BACKGROUND+Kurti+Color.RESET);
							System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
				             String KurtiChoice = sc.next();
				             if (KurtiChoice.equalsIgnoreCase("yes")) {
				                 Cart.add("Kurti");
				             }
							break;
						case 4:
							System.out.println(Color.CYAN_BACKGROUND+"---Tops Details---\n"+Color.RESET);
							System.out.println(Color.PURPLE_BACKGROUND+Tops+Color.RESET);
							System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
				             String TopsChoice = sc.next();
				             if (TopsChoice.equalsIgnoreCase("yes")) {
				                 Cart.add("Tops");
				             }
							break;
						case 5:
							System.out.println(Color.CYAN_BACKGROUND+"---T-shirts Details---\n"+Color.RESET);
							System.out.println(Color.PURPLE_BACKGROUND+Tshirts+Color.RESET);
							System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
				             String TshirtsChoice = sc.next();
				             if (TshirtsChoice.equalsIgnoreCase("yes")) {
				                 Cart.add("Tshirts");
				             }
							break;
							default:
								System.out.println("Invalid choice!, Please select a valid category");
						}

						break;
					case 3:
						System.out.println(Color.PURPLE_BACKGROUND+"----Fashion Dresses For Kids----\n"+Color.RESET);
						System.out.println(Color.YELLOW_BACKGROUND+Fashionkids+"\n"+Color.RESET);
						System.out.println(Color.GRAY_BACKGROUND+"Which product you want to see enter the product number"+Color.RESET);
						int fashionskids=sc.nextInt();
						switch(fashionskids) {
						case 1:
							System.out.println(Color.CYAN_BACKGROUND+"---Pants Details\n---");
							System.out.println(Color.PURPLE_BACKGROUND+Pants+Color.RESET);
							System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
				             String PantsChoice = sc.next();
				             if (PantsChoice.equalsIgnoreCase("yes")) {
				                 Cart.add("Pants");
				             }
							break;
						case 2:
							System.out.println(Color.CYAN_BACKGROUND+"---tshirts Details---\n");
							System.out.println(Color.PURPLE_BACKGROUND+Tshirts+Color.RESET);
							System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
				             String TshirtsChoice = sc.next();
				             if (TshirtsChoice.equalsIgnoreCase("yes")) {
				                 Cart.add("Tshirts");
				             }
							break;
						case 3:
							System.out.println(Color.CYAN_BACKGROUND+"---gown Details---\n"+Color.RESET);
							System.out.println(Color.PURPLE_BACKGROUND+gown+Color.RESET);
							System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
				             String gownChoice = sc.next();
				             if (gownChoice.equalsIgnoreCase("yes")) {
				                 Cart.add("gown");
				             }
							break;
						case 4:
							System.out.println(Color.CYAN_BACKGROUND+"---jackets Details---\n"+Color.RESET);
							System.out.println(Color.PURPLE_BACKGROUND+jackets+Color.RESET);
							System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
				             String jacketsChoice = sc.next();
				             if (jacketsChoice.equalsIgnoreCase("yes")) {
				                 Cart.add("jackets");
				             }
							break;
						case 5:
							System.out.println(Color.CYAN_BACKGROUND+"---caps Details---\n"+Color.RESET);
							System.out.println(Color.PURPLE_BACKGROUND+caps+Color.RESET);
							System.out.println(Color.YELLOW_BACKGROUND+"Do you want to add Laptop to your cart? (yes/no)"+Color.RESET);
				             String capsChoice = sc.next();
				             if (capsChoice.equalsIgnoreCase("yes")) {
				                 Cart.add("caps");
				             }
							break;
							default:
								System.out.println("Invalid choice!, Please select a valid category");
						}
						
						break;
						default:
							System.out.println("Invalid choice!, Please select a valid category");
				}
				break;
				default:
					System.out.println("Invalid choice!, Please select a valid category");
			}
		System.out.println(Color.RED_BACKGROUND+"Do you want to see your cart? (yes/no)"+Color.RESET);
		String cartChoice = sc.next();
		if (cartChoice.equalsIgnoreCase("yes")) {
		    System.out.println(Color.CYAN_BACKGROUND + "----Cart Contents----" + Color.RESET);
		    if (Cart.isEmpty()) {
		        System.out.println("Your cart is empty.");
		    } else {
		        for (String product : Cart) {
		            System.out.println(Color.YELLOW_BACKGROUND+product+Color.RESET);
		        }
		    }
		}
			sc.close();
		}
		
	}


