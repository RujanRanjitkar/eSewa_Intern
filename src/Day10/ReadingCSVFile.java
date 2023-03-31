package Day10;

import java.io.*;
public class ReadingCSVFile {
    public static  void main(String[] args) {
        String csvFile = "D:\\Intern Syllabus\\MOCK_FLIGHT_DATA.csv";
        String line = "";
        String csvSeparator = ",";
        try{
            BufferedReader buff=new BufferedReader(new FileReader(csvFile));
            int [] maxColumnLength=null;
            while((line=buff.readLine())!= null){
                String[] data = line.split(csvSeparator);
                if(maxColumnLength==null){
                    maxColumnLength=new int[data.length];
                }
                for(int i=0; i< data.length; i++){
                    if(data[i].length()>maxColumnLength[i]){
                        maxColumnLength[i]=data[i].length();
                    }
                }
            }
            buff.close();
            buff=new BufferedReader(new FileReader(csvFile));
            while ((line= buff.readLine())!=null){
                String[] data=line.split(csvSeparator);
                for(int i=0; i< data.length; i++){
                    System.out.print(String.format("%-" + maxColumnLength[i] + "s", data[i]));
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
