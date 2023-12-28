import java.io.*; 
import java.util.*;

public class CreateFolderStructure {

    public static void main (String[] args) throws IOException {
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter semester number: ");
        Integer semesterNumber = input.nextInt(); 

        String semesterDirectoryName = "SEM" + semesterNumber;
        File semesterDirectory = new File(semesterDirectoryName); 

        if(!semesterDirectory.exists()) {
            semesterDirectory.mkdir(); 
        }
    }






    
    
}