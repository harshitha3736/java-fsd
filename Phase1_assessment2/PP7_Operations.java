package Phase1_assessment2;



import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;


public class PP7_Operations {

		public static void main(String[] args)throws IOException {
			
			 
	             // Creating an object of a file  
			     Path path = Paths.get("C:\\Users\\Harshitha\\eclipse-workspace\\Phase1\\src\\Phase1_assessment2\\data.txt");  
				 try { 
				 Files.createFile(path);
		            
		        } catch (FileAlreadyExistsException ex) {
		            
		            System.err.println("File already exists");
		        }
				 
				 //for reading
				 Path mypath = Paths.get("C:\\Users\\Harshitha\\eclipse-workspace\\Phase1\\src\\Phase1_assessment2\\data.txt"); 
				 List<String> lines = Files.readAllLines(mypath, StandardCharsets.UTF_8);
			        
			        lines.forEach(line -> System.out.println(line));
			     
			     //for writing
			     Path myPath = Paths.get("C:\\Users\\Harshitha\\eclipse-workspace\\Phase1\\src\\Phase1_assessment2\\data.txt"); 
			     List<String> line = new ArrayList<>();
			     line.add("Biryani");
			     line.add("Butter Chicken");
			     line.add("Pepper Chicken");
			     line.add("Chicken ghee roast");
			     line.add("Chicken kabab");
			     
			     Files.write(myPath, line, StandardCharsets.UTF_8, 
			    	        StandardOpenOption.CREATE);

			    	System.out.println("Data written to a file");
			    	
			    	//for deleting entire content in file
			    	boolean fileDeleted = Files.deleteIfExists(myPath);
			        
			        if (fileDeleted) {
			            
			            System.out.println("File deleted");
			        } else {
			            
			            System.out.println("File does not exist");
			        }

		}

	}

