
package main;

import controllers.ControllerBlocNotasv1;
import models.ModelBlocNotasv1;
import views.ViewBlocNotasv1;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ModelBlocNotasv1 modelblocnotas = new ModelBlocNotasv1();
        ViewBlocNotasv1 viewblocnotas = new ViewBlocNotasv1();
        ControllerBlocNotasv1 controllerblocnotas = new ControllerBlocNotasv1(modelblocnotas, viewblocnotas); // Integra los componentes del modelo MVC.
        
    }
    
}
