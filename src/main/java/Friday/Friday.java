package Friday;

import java.util.Random;
import java.util.Scanner;

public class Friday {
    // Q1
    public static void printName(){
        System.out.println("Alfonza Jones");
    }


    public static String greetUser(String username){
        String user = username;
        return "Welcome to my website " + user;

    }
    public static double buyCoffee(int dollars){
        final double coffeePrice = 1.0;
        double change = dollars - coffeePrice;

        return change;
    }

    public static void myHobbies(String[] hobbies){
        for(int i = 0;i< hobbies.length;i++){
            System.out.print(hobbies[i] + " ");
        }


    }

    public static String checkWeather(String weatherCondition, int temp){
        String ans = " ";

        if( weatherCondition == "hot" && temp > 80){ans = "Wear Shorts";}
        else if(weatherCondition == "cool" && temp > 50){ans = "Wear Wind Breakers";}
        else if(weatherCondition == "cold" && temp < 50){ans = "Wear a jacket";}
        else{ ans = "There is no such weather";}
        return ans;
    }

    public static int areaOfTriangle(int base,int height){
        int a = base * height;
        int ar = a / 2;
        return ar;
    }
    public static String randomNumber(){
        Random rand = new Random();
        int randomNum = rand.nextInt(7);
        String ans = " Please reroll";
        if(randomNum > 0){
            switch (randomNum) {
                case 1: ans = "You rolled a " + randomNum;
                    break;
                case 2: ans = "You rolled a " + randomNum;
                    break;
                case 3: ans = "You rolled a " + randomNum;
                    break;
                case 4: ans = "You rolled a " + randomNum;
                    break;
                case 5: ans = "You rolled a " + randomNum;
                    break;
                case 6: ans = "You rolled a " + randomNum;
                    break; }

        }

        return ans;
    }





//Q9

    public static void getInitials(String fullName){
        char first = fullName.charAt(0);


        System.out.println( first );

    }



// Q8




    public static void main(String[] args) {
        String[] arr = {"coding","basketball","video games"};

        printName();
        System.out.println(greetUser("Mikaila"));
        System.out.println(buyCoffee(100));
        System.out.println(buyCoffee(3));
        myHobbies(arr);
        System.out.println();
        System.out.println(checkWeather("cold",40));
        System.out.println(areaOfTriangle(10,7));
        System.out.println(randomNumber());

        String[][] matrix = {
                {"Biggie", "JayZ", "Nas", "Who?"},
                {"Juicy", "22Twos", "One mIc"}
        };

        for (int i = 0; i < matrix.length ; i++) {

            for (int x = 0; x < matrix[i].length ; x++) {
                if(matrix[i][x] != "Who?"){
                    System.out.print(matrix[i][x] + " ");}
            }
        }

        System.out.println();

        Scanner name = new Scanner(System.in);
        System.out.println("Whats your name");
        String nameOne = name.nextLine();
        if(nameOne == "Aliyah"){
            System.out.println(" Hello Aliyah");

        }
        else if(nameOne == "Hakeem") {
            System.out.println(" Hello Hakeem");

        }









    }
}
