/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.interfaces;

//importo para poder usar la lista
import java.util.List;

//importo el modelo
import model.Usuario;

/**
 *
 * @author JP
 */
public interface IUsuarioDAO {
    
    //uso los mismos metodos del dao, luego ire modificando esta parte
    public List<Usuario> obtenerUsuarios();
    
    public Usuario obtenerUsuario(int usuId);
    
    public void agregarUsuario(Usuario usuario);
    
    public void actualizarUsuario(Usuario usuario);
    
    public void eliminarUsuario(int usuId);
}
