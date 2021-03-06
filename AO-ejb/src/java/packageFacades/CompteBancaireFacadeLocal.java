/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageFacades;

import java.util.List;
import javax.ejb.Local;
import packageEntites.Client;
import packageEntites.CompteBancaire;

/**
 *
 * @author 3092790
 */
@Local
public interface CompteBancaireFacadeLocal {

    void create(CompteBancaire compteBancaire);

    void edit(CompteBancaire compteBancaire);

    void remove(CompteBancaire compteBancaire);

    CompteBancaire find(Object id);

    List<CompteBancaire> findAll();

    List<CompteBancaire> findRange(int[] range);

    int count();

    List<CompteBancaire> RetournerComptes();

    void CreerCompte(int num, String titulaire, String banque, int guichet, Client client);

    CompteBancaire RechercherCompteParId(long id);

    void ModifierCompte(long id, int num, String titulaire, String banque, int guichet);
    
}
