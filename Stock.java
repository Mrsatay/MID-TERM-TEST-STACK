public class Stock{

    String itemcode;
    String name;
    String category;
    int InitialStock;

    public Stock(String code, String name, String category, int initial ){
        this.itemcode = code;
        this.name = name;
        this.category = category;
        this.InitialStock = initial;
    }

    

}


// insert into tblEmployee(EmployeeID,FirstName,LastName,Phone,TitleID,CommissionRate,HireDate,BirthDate,Gender,Notes)
// values(1301,'Patti','Stonesifer','555-5193',2,'5.00%','1996-7-6','1966-3-10','F','She has worked hard the whole career. She embodies a true type A personality. Part of the promotion '97 team!''),
// (1364,'Kevin','Pruski','555-5645',1,'4.00%','2000-12-1','1979-1-26','M','New to the organization but is showing promise. Kevin has made several new contacts.'),
// (1528,'Luca','Pacioli','555-5876',2,'6.00%','1995-8-26','1950-5-6','M','Talkative and a bit slow at times. He shows great potential. However, he insists on using old fashioned methods, and I think he would be happier as an accountant!'),
// (1695,'Ted','Nagasaki','555-5021',1,'4.00%','2000-1-28','1977-4-10','M','Ted can be molded into a fine salesperson if closely supervised.'),
// (2240,'Sharon','Stonley','555-5602',3,'15.00%','1988-11-5','1961-5-3','F','Acting department head for a number of quarters, Sharon shows initiative and is a sure bet for making salesperson of the year!'),
// (2318,'Helen','Hunter','555-5018',2,'8.00%','1993-11-16','1954-1-26','F','Witty and fun, Helen always makes her clients feel comfortable.');

// insert into tblInventoryDescription(ItemID,Name,BeverageType,Flavored,CountryID,Comments)
// values(134,'China Yunnan','t','No',41,'Black tea; tea from this province in southwestern China was first exported over 1,000 years ago. Originally a source of green tea, Yunnan in recent years has developed a black tea that is lighter and more delicately flavored than some of the traditional South China Congous.'),
// (137,'Darjeeling Namring','t','No',82,'Black tea; Assam, known as Darjeeling. Darjeeling is grown in the foothills of the Himalayas at elevations of 1,000 to 6,000 feet. It has a complex aroma with a clear, brisk, and penetrating flavor. Darjeeling is truly one of the finest teas in the world!'),
// (140,'Kalgar-India','t','No',82,'Black tea;'),
// (146,'Mocha','c','No',151,'Bold, earthy, mild acidity. One of Arabia's oldest and best known coffees.''),
// (176,'New Zealand Sunnyslopes','t','No',127,'Fruit blend Tisanes;'),
// (179,'Passion Fruit Blend','t','No',0,'Fruit blend Tisanes;'),
// (182,'Columbia Bucaramanga Especial','c','No',42,'Full bodied, medium acidity, nutty undertones; a soft-bean coffee with some of the character of fine Sumatran coffees.'),
// (185,'Columbia Supremo','c','No',42,'Full bodied; walnutty flavor. The top of the line for Colombian arabicas.'),
// (212,'Pan Fired Green','t','No',0,'Green tea'),
// (251,'Lemon Grass','t','No',41,'Herbal Tisanes; cut, sifted'),
// (254,'Chamomile Blossom','t','No',56,'Herbal Tisanes; whole flowers. Sweet and complex. Grown on the plains of the Nile valley. The world's best Chamomile''),
// (257,'Hibiscus','t','No',116,'Herbal Tisanes; whole flowers'),
// (260,'Espresso Roast','c','No',0,'Intense, hearty, satisfying'),
// (263,'Mexican Coatepec','c','No',116,'It has a fine acidity, delicate body, and pleasantly mellow flavor. Fine Mexican coffees such as Coatepec now compare well with those from Central America.'),
// (266,'Kona Extra Fancy','c','No',183,'Mild, smooth, and delicately aromatic. A mellow roast. This coffee is processed using the wet method to separate the cherry from the bean. Doing so produces a bright, lively acidity. Grown on the slopes of Mauna Loa on the Kona district of the island of H'),
// (269,'Passionfruit with Flowers','t','Yes',93,'Natural flavored tea;');