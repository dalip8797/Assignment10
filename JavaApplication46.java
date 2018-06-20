
package javaapplication46;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class JavaApplication46 {

    
    public static void main(String[] args) throws IOException {
        File obj = new File("C:\\Users\\User\\Desktop\\Dalip.txt");
        FileInputStream fin= new FileInputStream(obj);
        int readdata;
        do
        {
            readdata=fin.read();
            if(readdata!=-1)
            {
                System.out.print((char)readdata);
            }
        
        
       
    }while(readdata!=-1);
    
}
}
    
