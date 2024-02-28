
package trabalho2;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;


public class LeitorArquivos {

    public void lerArquivo(){
        try{
            Reader lendoArquivo = new FileReader("C:\\Users\\Particular\\Documents\\contatos.csv");
            Iterable<CSVRecord> records = CSVFormat.DEFAULT.parse(lendoArquivo);
            for(CSVRecord record : records){
                String nome = record.get(0);
                String sobrenome = record.get(1);
                String email = record.get(2);
                String idade = record.get(3);
                String telefone = record.get(4);
                System.out.println(String.format("%s %s %s %s %s", nome, sobrenome, email, idade, telefone));
            }
        }catch(IOException e){
            System.out.println("Erro ao abrir arquivo CSV");
        }
    }  
}
