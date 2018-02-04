import java.io.Closeable;
import java.io.IOException;

public class FileInputStream implements Closeable {

    String name;

    public FileInputStream(String name){
        this.name = name;
    }
    
    public String read(){
        return "실행 어라운드(Execute Around), 파라미터는 " + name;
    }
    public void close() {
        //System.out.println("Closeable");
    }
}