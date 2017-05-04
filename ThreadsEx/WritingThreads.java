package strategy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Random;

/**
 * Created by rama on 04/05/17.
 */
public class Threads{



    public void doStuff(int i,String s){
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(s,true))){
                    String s=" "+i+" ";
                    writer.write(s);
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        t.start();
    }

    public static void main(String[] args) throws InterruptedException {
        Threads t=new Threads();

       // System.out.println("Hello");
        int i=0;
        while(i<=100){
            //your writes might not be in order because you have different threads!!
         if(i%2==0) t.doStuff(i,"test6.txt");
         i++;
        }

        t.doStuff(111,"test6.txt");

    }


}
