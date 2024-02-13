package Java;

public class Icio {

	public static void main(String[] args) {
		System.out.println("Hola");
		
		JFrame ventana= new JFrame ("Ejemplo");
		
		ventana.setVisible(true);
		ventana.setSize(100, 100);
		ventana.setLocation(100, 100);
		
		ventana.setLocationRelativeTo(null);
		
		ventana.setResizable(false);
		
		ventana.setDefaultCloseOperation(JFrame.Exit);
		
		System.out.println("Hola");	
		
		
	}

}
