package Task25;
import java.io.*;

public class StudentAvgs {
    public static void main(String[] args)  throws Exception{

        File file=new File("C:/Users/sumadeep/Desktop/students.csv");
        BufferedReader br=new BufferedReader(new FileReader(file));

        File file2=new File("C:/Users/sumadeep/Desktop/studentgrades.txt");
        BufferedWriter bfr=new BufferedWriter(new FileWriter(file2));
        br.readLine();
        String line;
       while ((line=br.readLine())!=null){
        String[] arr=line.split(",");
         bfr.write(arr[0]+" average marks is  : "+((Integer.parseInt(arr[1])+Integer.parseInt(arr[2])+Integer.parseInt(arr[3]))/3)+"\n");
       } 

       System.out.println("sucesfully written in student grades tetx file");
       
        br.close();
        bfr.close();
        
    }
    
}
