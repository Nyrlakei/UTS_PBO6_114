package pbo_uts_1;

import java.util.Scanner;

class car{
        
        String nama;
        String warna;
        int posisi_x;
        int posisi_y;
        int arah;//0 = timur, 1 = selatan, 2 = barat, 3 = utara
        
        car(String nama, String warna, int posisi_x, int posisi_y, int arah){           //constructor
            
            this.nama = nama;
            this.warna = warna;
            this.posisi_x = posisi_x;
            this.posisi_y = posisi_y;
            this.arah = arah;
            
        }
        
        void accelerator(){                                 //method pedal gas
            
            switch(arah){
                    case 0:
                        posisi_x += 1;
                        break;
                    case 1:
                        posisi_y -= 1;
                        break;
                    case 2:
                        posisi_x -= 1;
                        break;
                    case 3:
                        posisi_y += 1;
                        break;
                }
            
        }
        
        void cek(){
            
            System.out.println(nama);
            System.out.println(warna);
            System.out.println(posisi_x);
            System.out.println(posisi_y);
            System.out.println(arah);
                
        }
        
        String S_arah(){                            //konversi arah dari int ke string
            String nama_arah = "";
            switch(arah){
                case 0:
                    nama_arah = "timur";
                    break;
                case 1:
                    nama_arah = "selatan";
                    break;
                case 2:
                    nama_arah = "barat";
                    break;
                case 3:
                    nama_arah = "utara";
                    break;
            }
            return nama_arah;
        }
        
        void cek_Posisi_Arah(){                                         //cek posisi dan arah mobil
            System.out.println("x : " + posisi_x);
            System.out.println("y : " + posisi_y);
            System.out.println("arah : " + S_arah());
        }
        
    }



public class PBO_UTS_1{

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in); 
        car car1 = new car("Mobil_baru", "kuning", 0, 0, 3);
        String input = "";
        
        while (!input.equals("e")){             //input e untuk exit
            
            System.out.print("Input : ");
            input = myObj.nextLine();
            if (input.equals("w")){             //input w untuk gas/maju
                car1.accelerator();

            }else if (input.equals("d")){       //input d untuk putar ke kanan
                car1.arah = (car1.arah+1)%4;
            }else if (input.equals("a")){       //input a untuk putar ke kiri
                car1.arah = (car1.arah+3)%4;
            }
            
            car1.cek_Posisi_Arah();
            System.out.println("\n\n");
            
        }
        
    }
    
}
