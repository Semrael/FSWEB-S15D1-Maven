package org.example.models;

import java.util.*;

public class Grocery {
    public static List<String> groceryList=new ArrayList<>();
    public static void startGrocery() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("0,1,2 sayılarından birini giriniz(0 uygulamayıı durduracaktır.");

        boolean cikis=false;

        while(!cikis){
            int sayi = scanner.nextInt();
            scanner.nextLine();
            switch (sayi){
                case 0:
                    cikis=true;
                    break;
                case 1:

                    addItems(scanner.nextLine());
                    break;
                case 2:

                    RemoveItems(scanner.nextLine());
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yapıldı");
                    break;
            }
        }

    }

    public static void addItems(String input) {
        System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
        String[] items = input.split(",\\s*");

            for (String item : items) {
                if (!checkItemIsInList(item)) {
                    groceryList.add(item);

                }
                else{
                    System.out.println("Eleman zaten listede var");
                }
        }

    }
    public static void RemoveItems(String input){
        System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");

        String[] items =input.split(",\\s*");
        for(String item:items){
            if(!checkItemIsInList(item)){
                System.out.println("Listede bu ürün yok");
            }
            else{
                groceryList.remove(groceryList.indexOf(item));
                }


        }
        System.out.println("İstenen elemanlar silindi.......");

    }

    public static boolean checkItemIsInList(String product){
        return  groceryList.contains(product);

    }

    public void printSorted(){
        Collections.sort(groceryList);
        System.out.println(groceryList);}


    }


