
package programa2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author carlo
 */
public class teste {
    public static void main(String args[]) throws IOException{
        
        Path path = Paths.get("D:/User/Downloads/teste.txt");
        
        List<String> linhasArquivo = Files.readAllLines(path);
        for (String linha : linhasArquivo) {
            System.out.println( linha ); 
}
    }
    
}
