package CityGetter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CittyGetterByFile extends CittyGetter{
    public CittyGetterByFile() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("src/main/resources/Cities.txt"));
            String line = reader.readLine();

            while (line != null) {
                System.out.println(line);
                // read next line
                line = reader.readLine();
                cities.add(line);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
