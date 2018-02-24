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
        String a;
        String b;
        String c;
        
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
            for(int i=0;i<a.length();i++){
                
                }
            }
    }
 

