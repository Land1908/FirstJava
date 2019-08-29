/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;


class SNT {
    int soKT;
    boolean ketQua;
    void kiemTra(){
        ketQua = true;
        for (int i = 2; i < soKT/2; i++)
            if(soKT % i == 0){
                ketQua = false;
            }
    }
    
}
