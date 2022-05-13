package com.company;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class xml {
    public static void XmlWrite(String filename)
    {
        try {
            File file = new File(filename);
            JAXBContext context = JAXBContext.newInstance(Man.class);
            Marshaller marshaller = context.createMarshaller();
            Man muzhik = new Man(77, "Мужик");
            marshaller.marshal(muzhik, file);

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }
    }
    public static void XmlRead(String filename)
    {   System.out.println("Информация из XML-файла:");
        try {
            File file = new File(filename);
            JAXBContext context = JAXBContext.newInstance(Man.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Man muzhik1 = (Man) unmarshaller.unmarshal(file);
            System.out.println(muzhik1);

            //yfltk ve;br ikzge< f jyf tve rfr hfp/

        } catch (JAXBException ex) {
            ex.printStackTrace();
        }}
}
