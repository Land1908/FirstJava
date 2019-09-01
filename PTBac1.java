/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaipt;

import java.util.Scanner;


class ptb1{
        public void nhap(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap he so b: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap hang so c: ");
        c = Integer.parseInt(sc.nextLine());
    }
    int a, b, c;
    void kt(){
            if(a == 0){
            if(b == 0)
                System.out.println("pt vo so nghiem");
            else
                System.out.println("pt vo nghiem");
        }
        else       
            System.out.println("Nghiem cua pt la: " + (c-b)/a);
    }
}
