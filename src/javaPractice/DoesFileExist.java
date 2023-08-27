package javaPractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DoesFileExist {

	public class FileWordMeanings {
		
		
	    public void main(String[] args) {
	        String filePath = "src\\data\\file.text"; // File path to context
	        if (doesFileExist(filePath)) {
	            readAndPrintWordMeanings(filePath);
	        }
	    }

	    public  boolean doesFileExist(String path) {
	        try {
	            FileReader fileReader = new FileReader(path);
	            fileReader.close();
	            return true;
	            
	        } catch (IOException e) {
	            System.out.println("File does not exist at path: " + path);
	            return false;
	        }
	    }

	    public void readAndPrintWordMeanings(String path) {
	        try {
	            BufferedReader reader = new BufferedReader(new FileReader(path));
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split("-");
	                if (parts.length == 2) {
	                    String word = parts[0].trim();
	                    String[] meanings = parts[1].trim().split(",");
	                    System.out.println(word);
	                    for (String meaning : meanings) {
	                        System.out.println(meaning.trim());
	                    }
	                    System.out.println();
	                }
	            }
	            reader.close();
	        } catch (IOException e) {
	            System.out.println("Error reading the file: " + e.getMessage());
	        }
	    }
	}

}
