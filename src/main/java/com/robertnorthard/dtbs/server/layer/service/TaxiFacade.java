package com.robertnorthard.dtbs.server.layer.service;

import com.robertnorthard.dtbs.server.layer.service.entities.booking.Booking;
import com.robertnorthard.dtbs.server.layer.service.entities.taxi.Taxi;
import java.util.List;
import javax.ejb.Local;

/**
 * An interface for defining and enforcing operations needed for the Taxi
 * Service class. It provides the scope of possible database requests made
 * through the TaxiDAO.
 *
 * @author robertnorthard
 */
@Local
public interface TaxiFacade {

    /**
     * Find taxi by id.
     *
     * @param id id of taxi.
     * @return taxi or null if not found.
     */
    public Taxi findTaxi(Long id);

    /**
     * Update taxi.
     *
     * @param taxi taxi to update.
     */
    public void updateTaxi(Taxi taxi);
    
    /**
     * Return a collection of taxis on duty and available.
     * 
     * @return a collection of taxis on duty and available.
     */
    public List<Taxi> findAllTaxiOnDutyAndAvailable();
    
    
    /**
     * Return a collection of taxis that are off duty.
     * 
     * @return a collection of taxis that are off duty.
     */
    public List<Taxi> findAllTaxiOffDuty();
}
