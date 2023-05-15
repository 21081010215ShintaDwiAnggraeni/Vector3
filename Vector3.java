/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector3;

/**
 *
 * @author Asus
 */
public class Vector3{
    public int[] array = new int[3];

    public Vector3(int x, int y, int z){
        this.array[0] = x;
        this.array[1] = y;
        this.array[2] = z;
    }
    //perkalian vektor dengan skalar
    public Vector3 perkalian(int skalar) {
        Vector3 result = new Vector3(0, 0, 0); 
        for (int i = 0; i < 3; i++) { 
            result.array[i] = this.array[i] * skalar; 
        }
        return result; // mengembalikan objek Vektor3 baru yang telah dihasilkan
    }
    
    //perkalian vektor dengan vektor
    public int perkalian(Vector3 vektor) {
        int result = 0;// membuat variabel result dengan nilai awal 0
        for (int i = 0; i < 3; i++) {// melakukan loop sebanyak 3 kali
            result += this.array[i] * vektor.array[i];// mengalikan elemen array pada indeks ke-i dari objek Vector3 ini dengan elemen array pada indeks ke-i dari objek Vector3 lain yang diberikan sebagai parameter, kemudian menjumlahkan hasilnya ke dalam variabel result
        }
        return result;// mengembalikan variabel result yang berisi hasil perkalian skalar dari dua vektor
    }

    public static void main(String[] args){
        int a=5;
        System.out.println("Hasil Perkalian Vektor dengan Skalar:");
        Vector3 vektor1 = new Vector3(1, 2 , 3);
        System.out.print("[ ");
        for(int i =0; i<vektor1.array.length; i++){
            System.out.print(+vektor1.array[i]+" ");
        }
        System.out.print("] * "+a+" = [ ");
        for(int i=0; i<vektor1.array.length; i++){
            System.out.print(vektor1.perkalian(a).array[i]+" ");
        }
        System.out.println("] \n");

        System.out.println("Hasil Perkalian Vektor dengan Vektor:");
        Vector3 vektor2 = new Vector3(4, 5 , 6);
        System.out.print("[ ");
        for(int i =0; i<vektor1.array.length; i++){
            System.out.print(+vektor1.array[i]+" ");
        }
        
        System.out.print("] * [ ");
        for(int i =0; i<vektor2.array.length; i++){
            System.out.print(+vektor2.array[i]+" ");
        }
        System.out.println("] = "+vektor1.perkalian(vektor2));

    }
}
