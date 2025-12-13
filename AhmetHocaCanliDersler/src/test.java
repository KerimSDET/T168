import com.sun.source.tree.BinaryTree;

import java.util.Scanner;

public class test {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Lütfen ürün adetini giriniz");
            int adet = scanner.nextInt();

            System.out.println("Lütfen ürünün fiyatını giriniz :");
            double fiyat = scanner.nextDouble();

            if (fiyat<=0 || adet<=0) {
                System.out.println("Hatalı girdiniz negatif sayı içermemelidir");
            }

            else if (adet>=100)
            {
                System.out.println((adet*fiyat*25/100)+" indirim kazandınız"+
                        "\nÖdeyeceğiniz fiyat : "+ ((adet*fiyat)- (adet*fiyat*25/100)));
            }
            else if (adet>=50) {
                System.out.println((adet*fiyat*20/100)+" indirim kazandınız"+
                        "\nÖdeyeceğiniz fiyat : "+ ((adet*fiyat)- (adet*fiyat*20*100)));
            }
            else if (adet>=10) {
                System.out.println((adet*fiyat*10/100)+" indirim kazandınız"+
                        "\nÖdeyeceğiniz fiyat : "+ ((adet*fiyat)- (adet*fiyat*10/100)));
            }
            else {System.out.println("ödeyeceğniz fiyat : "+(adet*fiyat));
            }

        }
    }