import java.util.Scanner;
public class tiketkereta {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int a = 0, r ,b, i, e = 0;
String c;
String[][] d = {
  {"", " _ _ _ _ _ _ _ _ _ ", " _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _"},
  {"|No |", "    Jenis     ", " | Harga  | Diskon |     AC     |   Colokan |"},
  {"|---|", "---------------", "|------- |--------|------------|-----------|"},
  {"| 1 |", "  ekonomi     ", " | 50000  |   2%   |  Tidak Ada | Tidak Ada |"},
  {"| 2 |", "  Bisnis      ", " | 100000 |   5%   |     Ada    | Tidak Ada |"},
  {"| 3 |", "  Eksekutif   ", " | 200000 |   7%   |     Ada    | Tidak Ada |"},
  {"| 4 |", "  Pariwisata  ", " | 300000 |   10%  |     Ada    |    Ada    |"},
  {"", "-------------------", "--------------------------------------------"}};
String[] f = null;
System.out.println("Pilihan menu adalah : ");
for (c = "Y"; c.equals("Y") || c.equals("y");) {
    System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
    System.out.println("1. Melihat Daftar Kereta Api");
    System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
    System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
    System.out.println("4. Memesan Tiket Kereta Api");
    System.out.println("5. Melihat Pesanan Tiket");
    System.out.print("Masukkan Pilihan Anda : ");
    b = in.nextInt();
    switch (b) {
  case 1:
    System.out.println("-------------------");
    System.out.println("Daftar Kereta Api");
    for (b = 0; b < 8; b++) {
        System.out.println(d[b][0] + d[b][1] + d[b][2]);
    }break;
  case 2:
    System.out.println("------------------------------");
    System.out.println("Daftar Kereta Api yang Ada AC ");
    for (b = 0; b < 8; b++) {
      if (b == 3) {
        continue;
      } else {
        System.out.println(d[b][0] + d[b][1] + d[b][2]);}
    }break;
  case 3:
    System.out.println("----------------------------------");
    System.out.println("Daftar kereta Api yang ada Colokan");
    for (b = 0; b < 8; b++) {
        if (b >= 0 && b <= 2 || b >= 6 && b <= 7) {
            System.out.println(d[b][0] + d[b][1] + d[b][2]);
        } else {            System.out.print("");                       
    }
    }break;
  case 4:
    e++;  i = 0;
    System.out.println("Daftar tiket kereta api");
    for (b = 0; b < 8; b++) {
        System.out.println(d[b][0] + d[b][1] + d[b][2]);
    }
    System.out.print("banyaknya tiket yang anda pesan : ");
    if (e == 1) {
        a = in.nextInt();
    } else {
        System.out.println("");
        System.out.println("Peringatan!!! jika anda ingin memesan tiket lagi");
        System.out.println("Tiket seblumnya dianggap hangus.. ");
        System.out.print("banyaknya tiket yang anda pesan : ");
        a = in.nextInt();}
    f = new String[a];
    for (b = 0; b < a; b++) {
        System.out.print("Tiket ke-" + (b + 1) + " pilih no tiket yang anda pilih : ");
        r = in.nextInt();
        if (r == 1) {
            System.out.println(d[3][1] + d[3][2]);
            f[i] = (d[3][0] + d[3][1] + d[3][2]);
            i++;
        } else if (r == 2) {
            System.out.println(d[4][1] + d[4][2]);
            f[i] = (d[4][0] + d[4][1] + d[4][2]);
            i++;
        } else if (r == 3) {
            System.out.println(d[5][1] + d[5][2]);
            f[i] = (d[5][0] + d[5][1] + d[5][2]);
            i++;
        } else if (r == 4) {
            System.out.println(d[6][1] + d[6][2]);
            f[i] = (d[6][0] + d[6][1] + d[6][2]);
            i++;
        } else {
            System.out.println("--------------------------------------");
            System.out.println("No yang anda pilih tidak terdaftar !!!");
            b--;
            System.out.println("----------------------------------------");}
    }break;
  case 5:
    if (e == 0) {
        System.out.println("Maaf Anda tidak bisa Melihat Pesanan Tiket");
        System.out.print("Anda harus memesan tiket terlebih dahulu (Y/N) : ");
        c = in.next();
    } else {
        System.out.println("yang anda pesan yaitu");
        System.out.println(" _ _ _ _" + d[0][0] + d[0][1] + d[0][2]);
        System.out.println("|Tiket " + d[1][0] + d[1][1] + d[1][2]);
        System.out.println("|------" + d[2][0] + d[2][1] + d[2][2]);
        for (b = 0; b < a; b++) {
            System.out.println("| ke-" + (b + 1) + " " + f[b]);}
        e++;
        System.out.println(" -----" + d[7][0] + d[7][1] + d[7][2]);
    }break;
  default:                 
    System.out.println("Maaf pilihan anda tidak terdaftar pada menu");
    System.out.println("Anda akan keluar dari program");
    c="n"; break;
    }
   }
  }
}
