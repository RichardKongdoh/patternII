
package tpsttern;

public class TPsttern {

  
    public static void main(String[] args) {
       
       int i,j;
        
       for (i = 1; i <= 4; i++){
           for (j = 1; j <=5 ; j++){
               // membuat 4 baris (i) bintang dan hanya mencetak bintang pada kolom(j) 2 dan 4
               if ( i == 1 || j == 2 || j == 4 || i == 4 ){
                   System.out.print("*");
               } else {
                   //jika tidak sesuai kondisi akan membuat spasi
                    System.out.print(" ");
               }
            
           }
           System.out.println();
       }
       System.out.println();
    }
    
}
