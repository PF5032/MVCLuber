package view;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import components.Menu;

public class FPrincipal extends JFrame{
    
    //Panel de escritorio para poder usar los formularios internos
    JDesktopPane escritorio;
    
    public FPrincipal(){
        initComponents();
    }
    
    private void initComponents(){
        //configuracion de ventana
        setTitle("Modelo Vista Controlador Luber");
        setSize(800, 600);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        //componentes de ventana
        escritorio = new JDesktopPane();
        Menu menu_principal = new Menu();
        setJMenuBar(menu_principal.getMenuPrincipal());
        
        //mostrar el frame principal
        setVisible(true);
        escritorio = new JDesktopPane();
        
        //para agregarle el panel para contener los frames internos
        this.getContentPane().add(menu_principal.getEscritorio());
    }
    
    public static void main(String[] args){
        new FPrincipal();
    }
}
