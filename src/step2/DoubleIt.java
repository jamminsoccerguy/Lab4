package step2;

/**
 * Created by Mike Plucker
 * Date:  2/16/2016
 * Course: CSCI 1933-12
 */

/**
 * Lab 4: Step 2: Double It
 */
public class DoubleIt {

    //instance variables
    private int [] array;
    private int [] newArray;
    private int histogramLength;


    //constructor creates an empty integer array of length n that will hold the histogram values
    public DoubleIt(int n){

        //validates that n is in the acceptable range
        if(n < 0 || n > 100){
            System.out.println("Error: Integer is not in the acceptable range. Must be between 0 and 100");
            //throw new Exception("Integer is not in the Acceptable Range");
        }
        else{
            histogramLength = n;
            array = new int [histogramLength]; //creates new array with size "n"
        }
    }


    //validate i and add it to the histogram if i is within the range of the histogram
    public void add(int i){

        //validates that i is in the acceptable range
        if(i < 0 || i >= histogramLength){
            System.out.println("Error: Integer is not in the acceptable range. Must be between 0 and " + (histogramLength - 1));
        }
        else{
            array[i]++; //adds the value to the histogram
        }
    }


    //automatically extends the size of the histogram
    public void addAuto(int i){

        //validates that i is a positive number
        if(i < 0){
            System.out.println("Error: Integer must be a postive number.");
        }
        else{
            newArray = new int[(array.length * 2)]; //creates the newArray, but doubles the space of the old array

            //copy values into new array
            for(int j = 0; j < array.length; j++){
                newArray[j] = array[j];
            }

            array = newArray; //makes array an alias for newArray (effectively changes the name of the array)

            array[i]++; //adds the value to the histogram
        }
    }


    //print out the contents of the histogram using "*" for each occurrence of a value
    public void display(String option){

        //local variable
        String output = "Element\t #\tHistogram";

        //long option prints all histogram values (0...n)
        if(option.equalsIgnoreCase("l")){
            for(int i = 0; i < array.length; i++){ //will print out a row for each element in the array
                output += "\n" + i + "\t " + array[i] + "\t"; //adds the element and occurrence of each value to the output

                for(int j = 0; j < array[i]; j++){ //will print an asterisk for each occurrence of a value
                    output += "*"; //adds bar of asterisks to output
                }
            }
            System.out.println(output); //print out histogram
        }

        //short option will print all histogram values, but will skip any 0 values
        else if(option.equalsIgnoreCase("s")){
            for(int i = 1; i < array.length; i++){ //will print out a row for each element in the array (skips "0" values)
                output += "\n" + i + "\t " + array[i] + "\t"; //adds the element and occurrence of each value to the output

                for(int j = 0; j < array[i]; j++){ //will print an asterisk for each occurrence of a value
                    output += "*"; //adds bar of asterisks to output
                }
            }
            System.out.println(output); //print out histogram
        }
    }


    //test program
    public static void main(String[] args) {

        DoubleIt histo = new DoubleIt(10); //creates histogram with length of 10


        //try to add bad values to histogram
        //histo.add(-1);
        //histo.add(10);
        //histo.add(15);


        //add values to histogram
        histo.add(0);
        histo.add(0);

        histo.add(1);

        histo.add(3);
        histo.add(3);
        histo.add(3);
        histo.add(3);

        histo.add(5);
        histo.add(5);
        histo.add(5);


        histo.add(9);
        histo.add(9);
        histo.add(9);


        //prints out long display of the histogram
        histo.display("L");

        System.out.println();

        //prints out short display of the histogram
        histo.display("S");


        //test new addAuto method
        //histo.addAuto(-1);
        histo.addAuto(19);

        System.out.println();

        histo.display("l"); //prints out long display of the histogram
    }
}
