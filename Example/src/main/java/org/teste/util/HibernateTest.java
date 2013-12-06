package main.java.org.teste.util;

import java.sql.SQLException;
import java.util.List;

import main.java.org.teste.model.Usuario;
import main.java.org.teste.service.UsuarioDao;

public class HibernateTest {

    public static void main(String[] args) throws SQLException {
    	UsuarioDao usuarioDao = new UsuarioDao();
        
       /* Usuario usuario = usuarioDao.getUsuario(1l);
        usuario.setNome("Teste");
        
        usuarioDao.update(usuario);*/
    	
    	Usuario usuario = new Usuario();
    	usuario.setNome("zé");
    	
    	usuarioDao.save(usuario);
        
        System.out.println("ID do Pessoa: " + usuario.getIdUsuario());
        
        List<Usuario> listaUsuario = usuarioDao.list();
        for (Usuario usuarioTmp : listaUsuario) {
			System.out.println(usuarioTmp.getIdUsuario());
		}
    }
}