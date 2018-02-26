/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chrx
 */
public class StringTheory {
    
        //[01] sameWords Method
    public boolean sameWords(String a, String b, String c){
            int r1 = a.compareTo(b); //result 1
            int r2 = b.compareTo(c); //result 2
            int r3 = a.compareTo(c); //result 3
                if(r1==r2&&r2==r3){
                        System.out.println(true);
                    return(true);
                }else{
                        System.out.println(false);
                    return(false);
                }   
            }
        //[02] alphaOrder Method    
    public String alphaOrder(String a, String b){
            int r1 = a.compareTo(b); //result 1
                if(r1>0){
                        System.out.println(b);
                    return(b);
                }else if(r1==0){
                        System.out.println("error: equal strings");
                    return("error: equal strings");
                }else{
                        System.out.println(a);
                    return(a);
                }
            }
        //[03] chunks Method
    public void chunks(String a){
                for(int i=0;i<a.length()-2;i++){
            String three = a.substring(i,i+3);
                        System.out.println(three);
                }
            }
        //[04] ENum Method
    public int ENum(String a){
            int counter = 0;
                for(int i=0;i<a.length();i++){
            String e = a.substring(i,i+1);
                if(e.equals("e")==true){
                    counter++;
                }    
                }
                        System.out.println("There are "+counter+" e's");
                    return(counter);
            }
        //[05] howMany Method
    public int howMany(String a){
            int counter = 0;   
                for(int i=0;i<a.length()-2;i++){
            String three = a.substring(i,i+3);    
                if(three.equals("the")==true||three.equals("The")==true||three.equals("THE")==true){
                    counter++;
                }    
                }
                        System.out.println(counter+" the's found");
                    return(counter);
                }
        //[06] DateSplit Method - only accepts yyyy-mm-dd format
    public void DateSplit(String a){
            int d1 = a.indexOf("-"); //dash 1
            int d2 = a.indexOf("-",d1+1); //dash 2
                String year = a.substring(0,d1);
                String month = a.substring(d1+1,d2);
                String day = a.substring(d2+1);
                        System.out.println(year+"\n"+month+"\n"+day);
                }
        //[07] pad5 Method - Must input 5 or less digits
    public String pad5(int x){
            return("placeholder");
                }
    }
 

