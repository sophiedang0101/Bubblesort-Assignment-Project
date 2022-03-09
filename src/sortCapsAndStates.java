import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class sortCapsAndStates {
    public static void main(String[] args) {

        // Initialize a scanner for user input
        Scanner userInput = new Scanner(System.in);

        // Repeatedly ask the user to enter the capital of a state
        // Print whether their answer is correct or incorrect
        for(int i =0; i < statesAndCaps.length;i++){
            System.out.println("What is the capital of " + statesAndCaps[i][0] + " ? ");
            String capital = userInput.nextLine();
            if(capital.equalsIgnoreCase(statesAndCaps[i][1])){
                System.out.println("Your Answer is Correct!");
            }else{
                System.out.println("Incorrect! The correct answer is " + statesAndCaps[i][1]);
            }
        }

        System.out.println();
        // Display content of the current two-dimensional array
        System.out.println("Current Contents Of Two-Dimensional Array");
        printArray(statesAndCaps);




        //Bubble sort algorithm to sort array by capitals
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < statesAndCaps.length - 1; i++) {
                if (statesAndCaps[i][1].compareTo(statesAndCaps[i + 1][1]) > 0) {
                    swapped = true;
                    String[] temp = statesAndCaps[i];
                    statesAndCaps[i] = statesAndCaps[i + 1];
                    statesAndCaps[i + 1] = temp;
                }
            }
        }

        System.out.println();
        // Another Scanner for user input
        Scanner input = new Scanner(System.in);
        int correctCounter = 0;

        // Repeatedly prompt the user to enter the capitals of all 50 states
        // Store correct answers in correctCounter variable
        for (int i = 0; i < statesAndCaps.length; i++) {
            System.out.print("What is the capital of " + statesAndCaps[i][0] + "? ");
            String userAnswer = input.nextLine();
            if (userAnswer.equalsIgnoreCase(statesAndCaps[i][1])) {
                System.out.println("Your answer is correct!");
                correctCounter++;
            } else {
                System.out.println("Incorrect! The correct answer is " + statesAndCaps[i][1]);
            }
        }


        System.out.println();

        // Print the total correct answers
        System.out.println("The total of correct answers is " + correctCounter + "!");

        System.out.println();

        // Initializing HashMap and populating it with states and capitals
        Map<String, String> myMap = new HashMap<String,String>();
        for(int i = 0; i < statesAndCaps.length;i++){
            myMap.put(statesAndCaps[i][0], statesAndCaps[i][1]);
        }

        System.out.println("Content of the Map");

        // forEach loop to display the content of the HashMap
        for(Map.Entry<String,String>entry: myMap.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("State: " + key + " ," + " Capital: " + value);

        }

        System.out.println();

        // TreeMap to sort the HashMap
        TreeMap<String, String> sortedMap = new TreeMap<String, String>(myMap);


        //Scanner to get user input
        Scanner userAnswer = new Scanner(System.in);

        //Repeatedly ask user to enter a state and then display capital
        //Print "invalid input" when user enters something other than a valid state name
        for(Map.Entry m:sortedMap.entrySet()){
            System.out.println("Please Enter A State Name: ");
            String answer = userAnswer.nextLine().toLowerCase();
            if(sortedMap.containsKey(answer)){
                System.out.println(sortedMap.get(answer));
            }else if(!(sortedMap.containsValue(answer))){
                System.out.println("Invalid Input!");
            }
        }
    }

    // Initialize two-dimensional array of states and capitals
    private static String[][] statesAndCaps = {
            {"alabama", "montgomery"},
            {"alaska", "juneau"},
            {"arizona", "phoenix"},
            {"arkansas", "little rock"},
            {"california", "sacramento"},
            {"colorado", "denver"},
            {"connecticut", "hartford"},
            {"delaware", "dover"},
            {"florida", "tallahassee"},
            {"georgia", "atlanta"},
            {"hawaii", "honolulu"},
            {"idaho", "boise"},
            {"illinois", "springfield"},
            {"indiana", "indianapolis"},
            {"iowa", "des moines"},
            {"kansas", "topeka"},
            {"kentucky", "frankfort"},
            {"louisiana", "baton rouge"},
            {"maine", "augusta"},
            {"maryland", "annapolis"},
            {"massachusetts", "boston"},
            {"michigan", "lansing"},
            {"minnesota", "st. paul"},
            {"mississippi", "jackson"},
            {"missouri", "jefferson city"},
            {"montana", "helena"},
            {"nebraska", "lincoln"},
            {"nevada", "carson city"},
            {"new hampshire", "concord"},
            {"new jersey", "trenton"},
            {"new mexico", "santa fe"},
            {"new york", "albany"},
            {"north carolina", "raleigh"},
            {"north dakota", "bismarck"},
            {"ohio", "columbus"},
            {"oklahoma", "oklahoma city"},
            {"oregon", "salem"},
            {"pennsylvania", "harrisburg"},
            {"rhode island", "providence"},
            {"south carolina", "columbia"},
            {"south dakota", "pierre"},
            {"tennessee", "nashville"},
            {"texas", "austin"},
            {"utah", "salt lake city"},
            {"vermont", "montpelier"},
            {"virginia", "richmond"},
            {"washington", "olympia"},
            {"west virginia", "charleston"},
            {"wisconsin", "madison"},
            {"wyoming", "cheyenne"}
    };


    // Nested for loops to print contents of 2D array
    private static void printArray(String[][] statesAndCaps){
        for(int i = 0; i < statesAndCaps.length;i++){
            for(int j = 0; j < statesAndCaps[i].length;j++){
                System.out.print(statesAndCaps[i][j] + " ");
            }
            System.out.println();
        }
    }
}
