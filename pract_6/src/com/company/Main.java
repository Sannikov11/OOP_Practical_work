package com.company;
import java.io.*;
import java.util.Scanner;


public class Main {


    public static int pr(Student arr[], int left, int right) {
        Student tmp;
        int i = left;
        int j = right;
        int pivot = arr[(left + right) / 2].id;
        while (i <= j) {
            while (arr[i].id < pivot)
                i++;
            while (arr[j].id > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }
    public static void qs(Student arr[],int left, int right)
    {
        int index=pr(arr,left,right);
        if (left<index-1)
            qs(arr,left,index-1);
        if(right>index)
            qs(arr,index,right);
    }




    public static void main(String[] args)  throws IOException{
        // Подсчет количества строк в файле
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        int lines = 0;
        while (reader.readLine() != null) lines++;
        reader.close();

        Student[] arrStudents = new Student [lines];// Массив со студентами

        File file = new File("file.txt");

        Scanner sc = new Scanner(file);
        // Запись данных из файла в массив
            for (int count = 0; count < lines; count++) {
                arrStudents[count] = new Student(sc.nextInt(), sc.nextLine());
            }

        qs(arrStudents,0 ,lines-1); // сортировка по индексу
        String lol2;

        for(int i=0; i<4; i++)
        {
            lol2=arrStudents[i].getStudent();
            System.out.println(lol2);
        }
    }
}
