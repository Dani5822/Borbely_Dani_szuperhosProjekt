package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;

public class Kepregeny {
    public static List<Szuperhos> szuperhosLista=new ArrayList<>();

    public static <e> void szereplok(String path){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String sor = bufferedReader.readLine();
            while (sor != null && !sor.isEmpty()){
                String[] adatok = sor.split(" ");
                if(adatok[0]=="Vasember"){
                    Vasember vas=new Vasember();
                    for (int i = 0; i < Integer.parseInt(adatok[1]); i++) {
                        vas.kutyutKeszit();
                    }
                    szuperhosLista.add(vas);

                }else{
                    Batman bat=new Batman();
                    for (int i = 0; i < Integer.parseInt(adatok[1]); i++) {
                        bat.kutyutKeszit();
                    }
                    szuperhosLista.add(bat);
                }
                sor = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void szuperhosok(){
        szuperhosLista.forEach(szuperhos -> {
            System.out.println(szuperhos.toString());
        });
    }
}
