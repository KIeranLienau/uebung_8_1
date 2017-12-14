package uebung_8_1;
import javax.swing.JOptionPane;

public class Palindrom {
	
public static void main(String[] args) {
String	neu="";
String a= JOptionPane.showInputDialog("Zu prüfendes Wort");
for (int b= a.length()-1;b>=0;b=b-1){
neu= neu +  a.charAt(b);
}
System.out.println(neu);
System.out.println(a);

if (a.equals(neu)){
	System.out.println("Ja, es ist ein Palindrom");
}
else{System.out.println("Nein, es ist kein Palindrom");
	}
}
}
