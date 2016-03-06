package dmz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the edi
 tor.
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A {

    public static void main(String[] args) throws IOException {
        int i = 0;
        Scanner s = new Scanner(System.in);
        Scanner sss = new Scanner(System.in);

        {

            System.out.println("1)    Load from file");

            System.out.println("2)    Save to file");

            System.out.println("3)    Add an entry");

            System.out.println("4)    Remove an entry");

            System.out.println("5)    Edit an existing entry");

            System.out.println("6)    Sort an address book");

            System.out.println("7)    Search for specification entry");

            System.out.println("8)    quit");

        }

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please choose what you'd like to do with the Database:");
        i = s.nextInt();

        if (i == 1) {

            /*try {
                System.out.println("Load from file");
                File file = new File("C:\\Users\\Devendra\\Desktop\\b.txt");
                System.out.println(file.createNewFile());
                if (file.isDirectory()) {
                    System.out.println(file.getName() + "Your created text is Loaded");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }*/
        	
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Devendra\\Desktop\\b.txt"));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();

                while (line != null) {
                    sb.append(line);
                    sb.append("\n");
                    line = br.readLine();
                }
                System.out.println(sb.toString()); 
            } finally {
                br.close();
            }

        } else if (i == 2) {

            try {
                System.out.println("Save to file");
                File file = new File("C:\\Users\\Devendra\\Desktop\\b.txt");
                System.out.println(file.createNewFile());
                if (file.renameTo(file)) {
                    System.out.println(file.getName() + "Your created text is Saved");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (i == 3) {
        	 System.out.println("Add an entry");
            try {
               
                File file = new File("C:\\Users\\Devendra\\Desktop\\b.txt");
                //System.out.println(file.createNewFile());
               FileWriter w = new FileWriter(file,true);
               BufferedWriter bufferedWriter = new BufferedWriter(w);
                    
                System.out.println("Enter First name:");
                String ss = sss.nextLine();
                System.out.println("Enter Last name:");
                String s1 = sss.nextLine();
                System.out.println("Enter your mobile no:");
                String s2 = sss.nextLine();
                
                System.out.println("Enter date of birth:");
                String s3 = sss.nextLine();
                System.out.println("Enter your address:");
                String s4 = sss.nextLine();
                System.out.println("Enter your email address:");
                String s5 = sss.nextLine();
                System.out.println("New entry has been added!!!");

                bufferedWriter.write(ss);
                bufferedWriter.write(" ");
                bufferedWriter.write(s1);
                bufferedWriter.write(",");
                bufferedWriter.write(s2);
                bufferedWriter.write(",");
                bufferedWriter.write(s3);
                bufferedWriter.write(",");
                bufferedWriter.write(s4);
                bufferedWriter.write(",");
                bufferedWriter.write(s5);
                bufferedWriter.newLine();
                    //a.flush();
                bufferedWriter.close(); 
                
 } catch (Exception e) {
	 e.printStackTrace();
        }} 
            
            else if (i == 4) {
            try {
                System.out.println(" Remove an entry");
                File file = new File("C:\\Users\\Devendra\\Desktop\\b.txt");
                System.out.println(file.createNewFile());
                if (file.delete()) {
                    System.out.println(file.getName() + "Your created text is deleted");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (i == 5) {

            try {

                System.out.println("Edit an existing entry");
                File file = new File("C:\\Users\\Devendra\\Desktop\\b.txt");
                System.out.println(file.createNewFile());
                FileWriter w = new FileWriter(file);
                System.out.println("Enter First name:");
                String ss = s.nextLine();
                System.out.println("Enter Last name:");
                String s1 = s.nextLine();
                System.out.println("Enter your mobile no:");
                String s2 = s.nextLine();
                System.out.println("Enter date of birth:");
                String s3 = s.nextLine();
                System.out.println("Enter your address:");
                String s4 = s.nextLine();
                System.out.println("Enter your email address:");
                String s5 = s.nextLine();

                try (BufferedWriter a = new BufferedWriter(w)) {
                    a.write(ss);

                    a.write(s1);

                    a.write(s2);

                    a.write(s3);

                    a.write(s4);
                    a.write(s5);

                    a.flush();
                    a.close();

                    System.out.println(file.getName() + "Your created text is updated");
                }

            } catch (Exception e) {
            }
        } else if (i == 6) {

            try {
                System.out.println("Sort an address book");
                File file = new File("C:\\Users\\Devendra\\Desktop\\b.txt");
                System.out.println(file.createNewFile());
                if (file.delete()) {
                    System.out.println(file.getName() + "Your created text is Sorted");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (i == 7) {

            try {
                System.out.println("Search for specification entry");
                File file = new File("C:\\Users\\Devendra\\Desktop\\b.txt");
                System.out.println(file.createNewFile());
                if (file.setReadOnly()) {
                    System.out.println("Your Search text is  " + file.getName());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (i == 8) {
           // System.out.println("");
           
            System.exit(0);
        }
        s.close();
        sss.close();
        in.close();
    }

}
