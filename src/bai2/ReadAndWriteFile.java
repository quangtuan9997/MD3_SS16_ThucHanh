package bai2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath){
        List<Integer> number=new ArrayList<>();
        try {
            File file=new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br=new BufferedReader(new FileReader(file));
            String line ="";
            while ((line=br.readLine())!=null){
                number.add(Integer.parseInt(line));
            }
            br.close();
        }catch (Exception e){
            System.err.println("File khong ton tai or noi dung co loi!");
        }
        return  number;
    }
    public void witeFile(String filePath,int max){
        try {
            FileWriter writer=new FileWriter(filePath,true);
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
            bufferedWriter.write("Gia tri lon nhat la:"+max);
            bufferedWriter.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
