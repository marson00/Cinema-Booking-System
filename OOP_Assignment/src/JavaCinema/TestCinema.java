package JavaCinema;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
For booking
=============
Enter name :
Enter IC : (validate the IC, must above 18 years old)
Enter phone number :
Enter Address :
Enter email :
Enter number of adult (ABOVE 18):
Enter number of child (BELOW 18):
*/


/*
Payment :
Total ticket :
Price : child (10), adult (20)
*/


/*
Accept user enter cash
make the changes
receipt print
*/


/*
Summary :
Movie
Date
Time
Price
Total booking seat (eg. 3 seats , 1 child, 2 adult)
Total number of regular seat:
Total number of large seat:
*/




public class TestCinema{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String space = " ";
        int choice = 4;

        //customer details variable;
        String name = "";
        String ic = "";
        int phone_number = 0;
        String town = "";
        String street = "";
        int zipCode = 0;

        //booking details
        int movie_selected = 0;
        int final_movie_selected = 0;
        String seat_size = "";
        int meal_chosen = 0;
        int adult_num = 0;
        int child_num = 0;
        int total_seats = 0;
        double total_price = 0;
        double total_exchange = 0;

        //user response
        char confirmation = ' ';
        double user_payment = 0;

        //user array to set/hardcode the available movies
        Movie[] regularMovie = new Movie[6];
        regularMovie[0] = new Movie("Black People", "Horror / Comedy", "Dickson", 30);
        regularMovie[1] = new Movie("Dragon Ball", "Animation", "Jacky", 30);
        regularMovie[2] = new Movie("Fast and Furious", "Crime Film / Action / Thriller", "Loh Bak", 30);
        regularMovie[3] = new Movie("Thalaivi","Biography","A.L. Vijay",30);
        regularMovie[4] = new Movie("77 Heartwarmings","Romance","Herman Yau",30);
        regularMovie[5] = new Movie("Those Who Wish Me Dead ","Suspense / Thriller","Taylor Sheridan",30);


        Movie[] vipMovie = new Movie[7];
        vipMovie[0] = new Movie("Godzilla Vs. Kong", "Action / Science Fiction / Thriller", "Adam Wingard", 15);
        vipMovie[1] = new Movie("Great White", "Horror / Thriller ", "Martin Wilson", 15);
        vipMovie[2] = new Movie("The Unholy", "Horror", "Evan Spiliotopoulos", 15);
        vipMovie[3] = new Movie("Mortal Kombat","Action / Adventure / Fantasy","Simon McQuoid",15);
        vipMovie[4] = new Movie("From The Book Of Saw","Crime / Horror / Mystery","Darren Lynn Bousman",15);
        vipMovie[5] = new Movie("My Love","Romance","Han Tian",15);
        vipMovie[6] = new Movie("Fate Grand","Animation","Kei Suezawa",15);


        System.out.println("================================================");
        System.out.println("|     Welcome To GSC Cinema Booking System     |");
        System.out.println("================================================\n");

        do {
            System.out.println("===================================");
            System.out.println("!           Cinema Menu           !");
            System.out.println("===================================");
            System.out.println("|                                 |");
            System.out.println("| 1.   On Showing Movies          |");
            System.out.println("| 2.   Book In Regular Cinema     |");
            System.out.println("| 3.   Book In VIP Cinema         |");
            System.out.println("| 4.   Exit system                |");
            System.out.println("|                                 |");
            System.out.println("===================================");
            System.out.printf("Please enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            while(choice != 1 && choice != 2 && choice != 3 && choice != 4){
                System.out.printf("Please select only (1 - 4) : ");
                choice = scanner.nextInt();
                scanner.nextLine();
            }
            System.out.printf("\n");

            //Accept user input
            switch (choice) {
                case 1:
                    //Show regular Cinema Available Movie
                    System.out.printf("\n=====================================================================================================================================================");
                    System.out.printf("\n|%67sRegular Cinema%66s|\n", space, space);
                    System.out.printf("|%147s|\n", space);
                    System.out.println("=====================================================================================================================================================");
                    System.out.println("|               Movie               |                  Movie Type                  |          Director          |          Seats Available          |");
                    System.out.println("=====================================================================================================================================================");
                    for (int i = 0; i < regularMovie.length; i++) {
                        System.out.println(regularMovie[i]);
                    }
                    System.out.println("=====================================================================================================================================================");
                    System.out.println("---------------------------------------------------  Able to choose seat size [Normal | Large]  -----------------------------------------------------");

                    System.out.printf("\n");

                    //Show VIP Cinema Available Movie
                    System.out.printf("\n=====================================================================================================================================================");
                    System.out.printf("\n|%69sVIP Cinema%68s|\n", space, space);
                    System.out.printf("|%147s|\n", space);
                    System.out.println("=====================================================================================================================================================");
                    System.out.println("|               Movie               |                  Movie Type                  |          Director          |          Seats Available          |");
                    System.out.println("=====================================================================================================================================================");
                    for (int i = 0; i < vipMovie.length; i++) {
                        System.out.println(vipMovie[i]);
                    }
                    System.out.println("=====================================================================================================================================================");
                    System.out.println("----------------------------------------------  Able to choose meal set [Combo A | Combo B | Combo C]  ----------------------------------------------");

                    System.out.printf("\n\n");
                    break;

                case 2:
                case 3:

                    System.out.println("\n---- Please Enter You Personal Information ---- ");
                    System.out.printf("Name : ");
                    name = scanner.nextLine();
                    while(!Pattern.matches("[a-zA-Z]+",name)){
                        System.out.printf("Name cannot contain number! Please re-enter : ");
                        name = scanner.nextLine();
                    }

                    System.out.printf("IC (No spacing) : ");
                    ic = scanner.nextLine();
                    //validation
                    while(!Pattern.matches("\\d{12}",ic)){
                        System.out.printf("Invalid IC , Please try again : ");
                        ic = scanner.nextLine();
                    }
                    if(Pattern.matches("[0][4-9]\\d{10}",ic)){
                        System.out.println("Person below 18 years old are not allow to book the seat in cinema !");
                        System.exit(0);
                    }

                    System.out.printf("Contact Number  : ");
                    phone_number = scanner.nextInt();
                    scanner.nextLine();
                    System.out.printf("Town     : ");
                    town = scanner.nextLine();
                    System.out.printf("Street   : ");
                    street = scanner.nextLine();
                    System.out.printf("Zip Code : ");
                    zipCode = scanner.nextInt();
                    scanner.nextLine();


                    //if user choose regular cinema
                    if(choice == 2){
                        //print movies to let user to choose
                        System.out.printf("\n\n");
                        System.out.println("========================================");
                        System.out.println("|           Movies On Showing          |");
                        System.out.println("========================================");
                        for (int i = 0; i < regularMovie.length; i++) {
                            System.out.printf("|  %d  |  %-25s     |\n", i + 1, regularMovie[i].getTitle());
                        }
                        System.out.println("========================================");

                        System.out.printf("Choose movie : ");
                        movie_selected = scanner.nextInt();
                        scanner.nextLine();

                        //validation
                        while(movie_selected > regularMovie.length || movie_selected <= 0){
                            System.out.printf("Please enter only (1 - %d) : ", regularMovie.length);
                            movie_selected = scanner.nextInt();
                            scanner.nextLine();
                        }
                        //array - 1
                        final_movie_selected = movie_selected - 1;

                        System.out.printf("Number of adult (18 age or above) : ");
                        adult_num = scanner.nextInt();
                        scanner.nextLine();
                        //validation
                        while(adult_num > regularMovie[final_movie_selected].getSeat()){
                            System.out.printf("Only %d seats available ! Please re-enter : ", regularMovie[final_movie_selected].getSeat());
                            adult_num = scanner.nextInt();
                            scanner.nextLine();
                        }

                        int seat_left = regularMovie[final_movie_selected].bookSeat(adult_num);

                        System.out.printf("Number of children     (below 18) : ");
                        child_num = scanner.nextInt();
                        scanner.nextLine();
                        //validation
                        while(child_num > seat_left){
                            System.out.printf("Only %d seats available ! Please re-enter : ", seat_left);
                            child_num = scanner.nextInt();
                            scanner.nextLine();
                        }

                        total_seats = adult_num + child_num;

                        System.out.println("\n\n=========================================");
                        System.out.println("|               Seat Size               |");
                        System.out.println("=========================================");
                        System.out.println("|   Normal   |  No extra charge         |");
                        System.out.println("|   Large    |  Rm 3.00 per each seat   |");
                        System.out.println("=========================================");

                        System.out.printf("Choose your seat size (Normal or Large) : ");
                        seat_size = scanner.nextLine().toUpperCase();

                        //validation
                        while(!seat_size.equals("NORMAL") && !seat_size.equals("LARGE")){
                            System.out.printf("Please enter only (Normal or Large) : ");
                            seat_size = scanner.nextLine().toUpperCase();
                        }



                    }else{
                    //if user choose vip cinema
                        //print movies to let user to choose
                        System.out.printf("\n\n");
                        System.out.println("========================================");
                        System.out.println("|           Movies On Showing          |");
                        System.out.println("========================================");
                        for (int i = 0; i < regularMovie.length; i++) {
                            System.out.printf("|  %d  |  %-25s     |\n", i + 1, vipMovie[i].getTitle());
                        }
                        System.out.println("========================================");

                        System.out.printf("Choose movie : ");
                        movie_selected = scanner.nextInt();
                        scanner.nextLine();

                        //validation
                        while(movie_selected > vipMovie.length || movie_selected <= 0){
                            System.out.printf("Please enter only (1 - %d) : ", vipMovie.length);
                            movie_selected = scanner.nextInt();
                            scanner.nextLine();
                        }
                        //array - 1
                        final_movie_selected = movie_selected - 1;

                        System.out.printf("Number of adult (18 age or above) : ");
                        adult_num = scanner.nextInt();
                        scanner.nextLine();
                        //validation
                        while(adult_num > vipMovie[final_movie_selected].getSeat()){
                            System.out.printf("Only %d seats available ! Please re-enter : ", vipMovie[final_movie_selected].getSeat());
                            adult_num = scanner.nextInt();
                            scanner.nextLine();
                        }

                        int seat_left = vipMovie[final_movie_selected].bookSeat(adult_num);

                        System.out.printf("Number of children     (below 18) : ");
                        child_num = scanner.nextInt();
                        scanner.nextLine();
                        //validation
                        while(child_num > seat_left){
                            System.out.printf("Only %d seats available ! Please re-enter : ", seat_left);
                            child_num = scanner.nextInt();
                            scanner.nextLine();
                        }

                        total_seats = adult_num + child_num;

                        System.out.println("\n\n===================================================================");
                        System.out.println("|                            Meal Sets                            |");
                        System.out.println("===================================================================");
                        System.out.println("| 1 |   Combo A   |  Popcorn(Large) + Cola            |  RM 10.00 |");
                        System.out.println("| 2 |   Combo B   |  Popcorn(Medium) + Mineral Water  |  RM  8.00 |");
                        System.out.println("| 3 |   Combo C   |  Chicken Wing X 5 + Milo          |  RM 15.00 |");
                        System.out.println("===================================================================");

                        System.out.printf("Please choose your meal set (1 - 3) : ");
                        meal_chosen = scanner.nextInt();
                        scanner.nextLine();
                        //validation
                        while(meal_chosen > 3 || meal_chosen <= 0){
                            System.out.printf("Please enter only (1 - 3) : ");
                            meal_chosen = scanner.nextInt();
                            scanner.nextLine();
                        }




                    }
                    Address address = new Address(town,street,zipCode);

                    //declare objects
                    CustomerDetails cust = new CustomerDetails(name,ic,phone_number,address);
                    Price price = new Price(choice, adult_num, child_num, total_seats);
                    RegularPrice seat_price = new RegularPrice(choice, adult_num, child_num, total_seats, seat_size);
                    VipPrice vip_price = new VipPrice(choice, adult_num, child_num, total_seats, meal_chosen);

                    //Show user selected details
                    System.out.println("\n\n====================================================");
                    System.out.println("|                  Booking Details                 |");
                    System.out.println("====================================================");
                    if(choice == 2){
                        System.out.printf("|  Movie Chosen : %-25s        |\n", regularMovie[final_movie_selected].getTitle());
                    }else{
                        System.out.printf("|  Movie Chosen : %-25s        |\n", vipMovie[final_movie_selected].getTitle());
                    }

                    System.out.printf("|  Adult : %-2d                Children : %-2d         |\n", adult_num, child_num);
                    if(choice == 2){
                        System.out.printf("|  Seat Size : %-10s                          |\n", seat_size);
                    }else{
                        if(meal_chosen == 3){

                            System.out.println("|  Meal set :   Combo C                            |");
                        }else if(meal_chosen == 2){
                            System.out.println("|  Meal set :   Combo B                            |");
                        }else{
                            System.out.println("|  Meal set :   Combo A                            |");
                        }
                    }
                    System.out.println("====================================================");

                    System.out.printf("\nIs it the booking details correct ? (Y/N) : ");
                    confirmation = scanner.next().toUpperCase().charAt(0);
                    scanner.nextLine();
                    while(confirmation != 'Y' && confirmation != 'N'){
                        System.out.printf("Please enter (Y or N) : ");
                        confirmation = scanner.next().toUpperCase().charAt(0);
                    }
                    System.out.printf("\n");
                    if(confirmation == 'Y'){
                        if(choice == 2){
                            System.out.printf("%s", seat_price);
                        }else{
                            System.out.printf("%s", vip_price.toString());
                        }


                        System.out.printf("\nPlease enter your payment amount : RM ");
                        user_payment = scanner.nextDouble();
                        scanner.nextLine();
                        //validation
                        if(choice == 2) {
                            while (user_payment < seat_price.calculateRegularPrice()) {
                                System.out.printf("Your payment amount is insufficient! Please re-enter : RM ");
                                user_payment = scanner.nextDouble();
                                scanner.nextLine();
                            }
                        }else{
                            while (user_payment < vip_price.calculateVipPrice()) {
                                System.out.printf("Your payment amount is insufficient! Please re-enter : RM ");
                                user_payment = scanner.nextDouble();
                                scanner.nextLine();
                            }
                        }

                        System.out.printf("\n");

                        //confirmation msg
                        confirmation = ' ';
                        System.out.printf("Are you sure to pay the movie tickets ? (Y/N) : ");
                        confirmation = scanner.next().toUpperCase().charAt(0);
                        while(confirmation != 'Y' && confirmation != 'N'){
                            System.out.printf("Please enter (Y or N) : ");
                            confirmation = scanner.next().toUpperCase().charAt(0);
                        }

                        if(confirmation == 'Y'){

                            //payment function
                            if(choice == 2) {
                                Payment regular_payment = new Payment(user_payment, seat_price.calculateRegularPrice());
                                System.out.printf("%s", regular_payment.toString());
                                total_price = seat_price.calculateRegularPrice();
                                total_exchange = regular_payment.calculateExchange();
                            }else{
                                Payment vip_payment = new Payment(user_payment, vip_price.calculateVipPrice());
                                System.out.printf("%s", vip_payment.toString());
                                total_price = vip_price.calculateVipPrice();
                                total_exchange = vip_payment.calculateExchange();
                            }




                            //print receipt
                            System.out.println("\n=========================================================");
                            System.out.println("|                        Receipt                        |");
                            System.out.printf("%s",cust);
                            if(choice == 2){
                                System.out.printf("|   Movie Chosen : %-25s            |\n", regularMovie[final_movie_selected].getTitle().toUpperCase());
                            }else{
                                System.out.printf("|   Movie Chosen : %-25s            |\n", vipMovie[final_movie_selected].getTitle().toUpperCase());
                            }

                            System.out.printf("|   Adult : %-2d                     Children : %-2d        |\n", adult_num, child_num);
                            if(choice == 2){
                                System.out.printf("|   Seat Size : %-10s                              |\n", seat_size.toUpperCase());
                            }else{
                                if(meal_chosen == 3){

                                    System.out.println("|   Meal set : Combo C                                  |");
                                }else if(meal_chosen == 2){
                                    System.out.println("|   Meal set : Combo B                                  |");
                                }else{
                                    System.out.println("|   Meal set : Combo A                                  |");
                                }
                            }
                            System.out.println("|                                                       |");
                            if(choice == 2) {
                                System.out.printf("|   Receive Payment Amount :               RM %-6.2f    |\n", user_payment);
                                System.out.printf("|   Total Price :                          RM %-6.2f    |\n", total_price);
                                System.out.printf("|                                          ===========  |\n");
                                System.out.printf("|   Exchanges :                            RM %-6.2f    |\n", total_exchange);
                                System.out.printf("|                                          ===========  |\n");
                            }else{
                                System.out.printf("|   Receive Payment Amount :               RM %-6.2f    |\n", user_payment);
                                System.out.printf("|   Total Price :                          RM %-6.2f    |\n", total_price);
                                System.out.printf("|                                          ===========  |\n");
                                System.out.printf("|   Exchanges :                            RM %-6.2f    |\n", total_exchange);
                                System.out.printf("|                                          ===========  |\n");
                            }
                            System.out.println("|                                                       |");
                            System.out.println("=========================================================");

                            System.out.println("\n~~~~~~~~~~~~~~~~~~~~ Thank You Very Much ~~~~~~~~~~~~~~~~");

                            System.exit(0);

                        }else{
                            System.out.printf("\n\n");
                            break;
                        }

                    }else{
                        System.out.printf("\n\n");
                        break;
                    }



                case 4:
                    System.out.println("\n=================================");
                    System.out.println("|     Exiting The System...     |");
                    System.out.println("=================================");

                    System.exit(0);
                    break;



            }
        }while(choice >= 1 && choice <= 4);
    }

}

