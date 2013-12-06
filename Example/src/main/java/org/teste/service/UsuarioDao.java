/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package main.java.org.teste.service;

import java.util.List;

import main.java.org.teste.model.Usuario;
import main.java.org.teste.util.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UsuarioDao {
	private static Session session;
	
    public void save(Usuario usuario) {
    	session = getSession();
    	
        Transaction t = session.beginTransaction();
        session.save(usuario);
        t.commit();
    }
    
    public void update(Usuario usuario) {
    	session = getSession();
    	
        Transaction t = session.beginTransaction();
        session.update(usuario);
        t.commit();
    }
    
    public Usuario getUsuario(Long id) {
    	session = getSession();
    	
        return (Usuario) session.load(Usuario.class, id);
    }
    
    @SuppressWarnings("unchecked")
    public List<Usuario> list() {
    	session = getSession();
    	
        Transaction t = session.beginTransaction();
       
		List<Usuario> lista = session.createQuery("from Usuario").list();
        t.commit();
        return lista;
    }
    
    public void remove(Usuario usuario) {
    	session = getSession();
        Transaction t = session.beginTransaction();
        session.delete(usuario);
        t.commit();
    }
    
    public Session getSession() {
    	return session == null ? HibernateUtil.getSessionFactory(Usuario.class).openSession() : session;
    }
}