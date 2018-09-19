
package models;


public class ModelBlocNotasv1 {
    
    
    private String path = "C:\\archivos\\texto.txt"; // Variable que almacena la ruta del archivo.

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    
    private String message = ""; // Variable que almacena el contenido (texto) del área de texto de "ViewBlocNotasv1".

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
