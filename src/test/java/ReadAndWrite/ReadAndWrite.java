package ReadAndWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {
    public static void main(String[] args) throws IOException {
        File file=new File("sample.txt");
        if(!file.exists())
        {
            file.createNewFile();
        }
        FileOutputStream fos=new FileOutputStream(file);
        String writeOperationPerforming="Writing text using java";
        fos.write(writeOperationPerforming.getBytes());
        fos.flush();
        fos.close();

        FileInputStream fis=new FileInputStream(file);
        int i=fis.read();
        while(!(i==-1))
        {
            char c =(char)i;
            System.out.print(c);
            i= fis.read();
        }
        fis.close();

    }
}
