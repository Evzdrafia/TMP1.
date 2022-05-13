package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.JSONObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class json {
    public static void writeJsonSimpleDemo(String filename) throws Exception {
        JSONObject sampleObject = new JSONObject();
        sampleObject.put("name", "Schlyapa");
        sampleObject.put("size", 12);

        Files.write(Paths.get(filename), sampleObject.toJSONString().getBytes());
    }
    public static void js_write(Hat HAT) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp.json");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(HAT);
        oos.flush();
        oos.close();
    }
    public static void js_read_del() throws Exception {
        FileInputStream fis = new FileInputStream("temp.json");
        ObjectInputStream oin = new ObjectInputStream(fis);
        Hat ts = (Hat) oin.readObject();
        System.out.println("Информация из JSON-файла:");
        System.out.println("name="+ts.name+" size="+ts.size);
        oin.close();
    }
    public static void js_wr(Hat hat) {
        Gson gson = new GsonBuilder().create();
        String json = gson.toJson(hat);

        try(FileWriter writer = new FileWriter("test.json", false))
        {
            writer.write(json);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    public static void js_rr(String fileName) {
        List<Character> E =  new ArrayList<Character>();
        try(FileReader reader = new FileReader(fileName))
        {int c;
            while((c=reader.read())!=-1){E.add((char)c);}
        }
        catch(IOException ex){System.out.println(ex.getMessage());}

        StringBuilder builder = new StringBuilder(E.size());
        for(Character ch: E)
        {builder.append(ch);}
        String str1 = builder.toString();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        Hat sch = gson.fromJson(str1,Hat.class);
        System.out.println("size="+sch.size+" name="+sch.name);
    }



}
