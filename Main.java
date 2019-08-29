// a object has two part: attribute and method
// each object has attributes, methods. excute their METHOD
// The name of class: Viet hoa chu cai dau tien moi tu( k co dau gach duoi, cach)
// The name of bien : Viet thuong ki tu dau tien
// Truu tuong( dac diem rieng ). bo qua dac diem chung
// Ke thua: tu doi tuong lop cha. duoc xuat phat tu truu tuong
package demo;

public class Main {
     public static void main(String[] args) {
//       int soCanKT;
//       soCanKT = 7;
//        boolean ketQua;
//        ketQua = true;
//        
//        for(int i = 2; i < soCanKT/2; i++){   
//            if (soCanKT % i == 0){
//                ketQua = false;
//            } 
//        }
//        System.out.println("ket qua la: " + ketQua);
        SNT number = new SNT();
        number.soKT = 10;
        number.kiemTra();
        System.out.println("ket qua la: "+ number.ketQua);
        
        SNT number1 = new SNT();
        number1.soKT = 7;
        number1.kiemTra();
        System.out.println("ketqua la: " + number1.ketQua);
        
    }
}
