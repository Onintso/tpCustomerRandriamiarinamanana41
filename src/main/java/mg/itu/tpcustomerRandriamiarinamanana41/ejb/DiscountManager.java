/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mg.itu.tpcustomerRandriamiarinamanana41.ejb;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.List;
import mg.itu.tpcustomerRandriamiarinamanana41.entities.Discount;

/**
 *
 * @author randr
 */
@Stateless
public class DiscountManager {
    @PersistenceContext
    private EntityManager em;
    
     /**
   * Retourne la liste de tous les Discount.
     * @return list discount
   */
    public List<Discount> getAllDiscounts() {
        Query query = em.createNamedQuery("Discount.findAll");
        return query.getResultList();
    }

    public Discount findById(String code) {
        return em.find(Discount.class, code);
    }

    public void persist(Discount discount) {
        em.persist(discount);
    }
}
