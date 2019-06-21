/*
People Sorter
A program that takes in a text file and outputs a list of people
with their age in a sorted order
by Chait and Alex
*/


import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.*;

public class PeopleSorter{

  public static void main(String[] args) {

    if (args.length == 0){
      System.err.println("No file input detected, reexecute");
      System.exit(1);
    }

    String filePath = args[0];
    ArrayList<People> personList = loadPersonList(filePath);

    sortPersonList(personList);

    printPersonList(personList);

  }
  //End of main method

  /**
   * Takes in the text file, and converts each entry into a person
   * Also adds it into the array list that eventually will become sorted
   * @param personFilePath the path to the text file
   * @return personList the list that is eventually sorted
   */
   
  public static ArrayList<People> loadPersonList(String personFilePath){

    ArrayList<People> personList = new ArrayList<People>();

    String inputFilePath = personFilePath;
    File inputFile = new File(inputFilePath);

    Scanner scanner = null;

    try{
      scanner = new Scanner(inputFile);
      } catch (FileNotFoundException e){
          System.err.println(e);
          System.exit(1);
      }

    while (scanner.hasNextLine()){
      String [] person = scanner.nextLine().split(",");
      personList.add(new People(person[0], person[1], Integer.parseInt(person[2]), Integer.parseInt(person[3]), Integer.parseInt(person[4])));
    }

    return personList;

  } //end of loadPersonList method


  /**
   * defines what it means to print an ArrayList of People
   * @param list of people
   */
  public static void printPersonList(ArrayList<People>list){
      for(People p:list){
        System.out.println(p);
      }
  }//end of printPersonList method

  /**
   * defines the sorting method
   * this uses Selection Sort with the compareTo method
   * @param list , the array list that you want to sort
   */
  public static void sortPersonList(ArrayList<People> list){
    for (int i = 0;  i < list.size(); i++){
      int min = i;
      for (int a = i+1; a < list.size(); a++){
        int compareVar = list.get(a).getfullName().compareTo(list.get(min).getfullName());
        if (compareVar < 0 ){
          min = a;
        }
      }
    People var = list.get(min);
    People var2 = list.get(i);
    list.set(min, var2);
    list.set(i, var);
    }

  }// end of sortPersonList method





}
