import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileIOLectureExercise<fileData> {
    public static void main(String[] args) {
        Path oneDirectoryPath = Paths.get("data");
        System.out.println("oneDirectoryPath.toAbsolutePath()= " + oneDirectoryPath.toAbsolutePath());


        Path threeArgumentsPath = Paths.get("dir1", "dir2", "filename.txt");


        Path absolutePath = Paths.get("/", "User");

        System.out.println("absolutePath.isAbsolute()= " + absolutePath.isAbsolute());

        Path anotherAbsolutePath = Paths.get("./", "user");
        System.out.println("anotherAbsolutePath.isAbsolute() =" + anotherAbsolutePath.isAbsolute());

    }
        //Create a new Path to a file. set the directory to "data" and the filename to "dishes.txt"
            Path dishesPath = Paths.get("data", "dishes.txt");
    Path dishesDirPath = Paths.get("data");
        //Have your program create the file if it's missing.
   List<String>fileData = null;
    //Read the file contents using the Files class and store them in a variable called File Data of List <String> type

    //Print out the contents of the file using a println statement.



    }









