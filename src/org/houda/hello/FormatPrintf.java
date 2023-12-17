package org.houda.hello;

import java.io.File;
import java.util.Date;

public class FormatPrintf {
	public static void main(String[] args) {
		int num = 25;
		int dem = 67;
		
		//--------- formatage type entiere ----------//
		System.out.println(num);
		System.out.printf("%d %o %x \n", num , num ,num); // d: decimal o: octal x :hexadecimal
		System.out.printf("[%d/%d]\n",num , dem);
		System.out.printf("%05d\n", num); // \n pour faire le retour en ligne
		System.out.printf("%08x\n", num); //remlire 8 caractere et remplir le vide par 0
		
		//--------- formatage type flotant ----------//
		System.out.printf("%f\n", Math.PI);
		System.out.printf("%05.2f\n", Math.PI);//5 numbre totale de caracter meme le virgule se compte 2 caractere derrier le virgule
		System.out.printf("%e\n", Math.PI);// format exposant
		
		//--------- formatage type caractere et chaine de caractere ----------//
		System.out.printf("%c %s\n", 'h', "houda");
		System.out.printf("(%10s)\n", "houda");//le parenthese juste pour montre les caracteres
		System.out.printf("%%%-10s%%\n", "houda");//pou affiche le % il faut mettre 2 %%
		
		//--------- formatage d'autre type ----------//
		System.out.printf("%b\n", true);
		System.out.printf("%tF %tT\n", new Date(), new Date());
		
		//------------ Exemple d'utilisation de formtage -----------//
		System.out.println( "+------+------------+---------------------+----------------------+" );
        System.out.println( "| Type | Size(ko)   | Date       Time     | File name            |" );
        System.out.println( "+------+------------+---------------------+----------------------+" );
        
        // On traite et affiche chaque entrée du dossier considéré
        File [] files = new File( "." ).listFiles();
        for( File file  : files ) {
            char type = file.isDirectory() ? 'd' : '-';
            long sizeKo = file.length() / 1024;
            Date lastModified = new Date( file.lastModified() );
            String name = file.getName();
            
            System.out.printf( "| %c    | %,10d | %tF %tT | %-20s |\n", 
                               type, sizeKo, lastModified, lastModified, name );
        }
        // On affiche un footer
        System.out.println( "+------+------------+---------------------+----------------------+" );
    
		
	} 
}
