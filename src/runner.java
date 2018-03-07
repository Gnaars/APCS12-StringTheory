/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chrx
 */
public class runner {
    public static void main(String[] args) {
     /* StringPlayground sp = new StringPlayground();    
               String temp = sp.formalName("Hamish Catrick Harogo");
               System.out.println(temp);
        //Testing Zone - can be ignored.
                String word = "abcdefghijklmnop";
                    String part = word.substring(4,9);
                        System.out.println(part);
                    int io = word.indexOf("e");
                        System.out.println(io);
                    int howMany = word.length();
                        System.out.println(howMany);
                        if(part.equals("efghi")==true)
                            {System.out.println("equals indeed");}
                         else{
                            System.out.println("no equals here");
                        }*/
        //Assignment testing begins here!
            StringTheory runMan = new StringTheory();
            //[01]  sameWords Test
                runMan.sameWords("beans!", "beans!", "beans!");
            //[02]  alphaOrder Test
                runMan.alphaOrder("a bean", "b bean");
            //[03]  chunks Test
                runMan.chunks("abcdefghij");
            //[04]  ENum Test
                runMan.ENum("Beeeeeeeans");
            //[05]  howMany Test
                runMan.howMany("The the quick THE The brown fox jumped over the lazy dog");
            //[06]  DateSplit Test
                runMan.DateSplit("2000-3-4");
            //[07]  pad5 Test
                runMan.pad5(215);
            //[08]  individualWords Test
                runMan.individualWords("The quick brown fox jumped over the lazy dog man dude");
            //[09]  makeName Test   
                runMan.makeName();
            //[10]  pad5 Test
                runMan.pad5(new int[]{51, 12, 182, 8, 631});
            //[11] containsNumeric Test
                runMan.containsNumeric("acdc5");
    }       
}           
