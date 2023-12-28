import java.io.*; 
import java.util.*;

public class CreateFolderStructure {

    public static void main (String[] args) throws IOException {
        Scanner input = new Scanner(System.in); 

        System.out.print("Enter semester number: ");
        Integer semesterNumber = input.nextInt(); 
        input.nextLine(); //consume the newline character

        String semesterDirectoryName = "SEM" + semesterNumber;
        File semesterDirectory = new File(semesterDirectoryName); 

        if(!semesterDirectory.exists()) {
            semesterDirectory.mkdir(); 
        }

        System.out.print("Enter how many courses are you taking this semester? (this will result in the number of folders created): "); 
        Integer numberOfFolders = input.nextInt(); 
        input.nextLine();
        System.out.println();

        for (int num = 1; num <= numberOfFolders; num++) {
            System.out.print("Enter the name for folder " + num + ":");
            String userCourseName = input.nextLine(); 

            File courseDirectory = new File(semesterDirectoryName + File.separator + userCourseName); 

            if(!courseDirectory.exists()) {
                courseDirectory.mkdir(); 
                //call method that create directory structure inside each course directory
                createSubdirectories(courseDirectory);
            }
            System.out.println();
        }
    }

    public static void createSubdirectories(File path) {
        List<String> subDirectoriesNames = Arrays.asList("Slides", "Labs", "ClassesNotes", "ImportantMaterial");

        for(String folderName : subDirectoriesNames) {
            File subFolder = new File(path + File.separator + folderName); 

            if(!subFolder.exists()) {
                subFolder.mkdir(); 
            }
        }
    }
}