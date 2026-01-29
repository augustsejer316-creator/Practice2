
 /*   String nameFront = "August";
    String nameMiddel = "Sejer";
    String nameLast = "Sørensen";
        String fullName = nameFront+" "+nameMiddel+" "+nameLast;

            System.out.println(fullName);

    String levelText = "level";
    int level = 30;
    String levelUpmessage ="Congratulatio with the level up";

        System.out.println(levelText+" "+level+" "+levelUpmessage);



    String street = "Nybbrovej";
    int number = 19;
    String city = "Vangede";


        System.out.println(street+" "+number+" "+city);

String opgaveOrd = "----------Opgave";

    System.out.println(opgaveOrd+" "+"2.24");

int a =5;
int b =3;

System.out.println("sum:"+(a+b));
System.out.println("sum:"+a+b);


 String hello = "Hello";
 String space = " ";
 String world = "World ";


 StringBuilder sb=new StringBuilder(hello+space+world);

System.out.println(sb);

System.out.println(opgaveOrd+" "+"3.3: Navngiv en pris variable");
String namePrice = "price";
double productPrice = 99.99;

System.out.println(namePrice+" "+productPrice);

int studentCount = 0;

    System.out.println(studentCount);


    System.out.println(opgaveOrd+" "+"4.1");

int[] numbers = {10,20,30};

    System.out.println(numbers[2]);
    System.out.println(numbers[1]);
    System.out.println(numbers[0]);

    String mellemrum =" ";
    int number1 =4;
    System.out.println(opgaveOrd+mellemrum+number1+".2");

    String[] names={"August","Sejer","Sorensen"};

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);


    System.out.println(opgaveOrd+mellemrum+number1+".3");

    double[] price ={19.99,29.99,9.99,};

        System.out.println(price[1]);

        boolean[] isShining = {true,false,};
            System.out.println(isShining[1]);
            System.out.println(isShining[0]);

double[] decimal ={.1,.2,.3,.4,.5,.6,.7,.8,.9,.10,.11,.12,};
System.out.println(opgaveOrd+mellemrum+number1+decimal[3]);

 *//*

void main(String[] args){
double[] prices = {15.50,20.44,35.35,};
double firstPrice = prices[0];
double secoundPrice = prices[1];
double sum = firstPrice+secoundPrice;

System.out.println(sum);

int[] numbers = {25,30,22,35,28};
int numberOne = (numbers[0]);
int numberTwo = (numbers[1]);
int numberThree = (numbers[2]);
int total = numberOne+numberTwo+numberThree;

    String nameTotalnumber ="Total";
    System.out.println(nameTotalnumber);
    String allNumbers = "numberOne"+" "+"numberTwo"+" "+"numberThree";


    double indeks = numberOne;

               System.out.println(indeks);
               System.out.println(allNumbers);
               System.out.println(total);
               System.out.println(total/3);


 */
    void  main() {
    int[]ages={25,30,22,23,64};
    int sum=ages[0]+ages[3]+ages[4];

        System.out.println(sum);
    double avrege = sum/3.0;
        System.out.println(avrege);

String[] names = {"Anna","Bob","David",};
int count = names.length;
int countAge = ages.length;
System.out.println(count);
System.out.println(countAge);


int[] scores = {100,123,41,123,};
    String[] team = {"DKK","LFF","SDD","ASD",};
int[] time = {12,13,14,15};

int count1 = team.length;
    String teamOne = team[0];
    String teamtwo = team[1];
    String teamthree = team[2];
    String teamfour = team[3];

    String names1 = team.toString();
double timeSpot = time.length;
int lastNumber =scores[scores.length-1];

    System.out.println(count1);
    System.out.println(names1);
    System.out.println(timeSpot);
    System.out.println(lastNumber);


StringBuilder sb=new StringBuilder(teamOne);
        sb.append(teamtwo);
        sb.append(teamthree);
        sb.append(teamfour);

System.out.println(sb);

double bill = 233.33;
    int pax = 4;
    System.out.println(bill/pax);


int candy = 23;
int kids= 5;
int candyEach = candy/kids;
int rest = candy%kids;
System.out.println(teamOne);
        System.out.println(candyEach);
        System.out.println(rest);

int number = 17;
int remainder = number % 2;

System.out.println(false);
System.out.println(remainder);

String namePizzaslice = "Amout of Pizzaslice pr. box.";
        int pizzaSlice = 18;
    String namePizzabox = "Amount of boxes.";
        int pizzaBox = 10;
            String namePax = "Slice pr. pax.";
                int pax1 = 42;
                String namePizzaTypes ="Pizza type, Oh YAEH";

int sliceTotal = (pizzaSlice*pizzaBox);
int slicePax = sliceTotal/pax;

String[] pizzaTypes ={"Pepperoni","Carlezone","Hawaii"};

System.out.println(namePizzaslice);
    System.out.println(pizzaSlice);
        System.out.println(namePizzabox);
            System.out.println(pizzaBox);
                System.out.println(namePax);
                System.out.println(pax1);
                    System.out.println(namePizzaTypes);
        System.out.println(pizzaTypes[0]);
        System.out.println(sliceTotal);
        System.out.println(slicePax);



        int days = 2;
        int hoursInDay=24;
        int daysInhHours = days*hoursInDay;
System.out.println(daysInhHours);
    days=8;
    daysInhHours=days*hoursInDay;
    System.out.println(daysInhHours);
    }