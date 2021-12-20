package as.com.ciclo4.reto5.repository.crud;


import as.com.ciclo4.reto5.model.Accessory;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Juan Carlos Rodríguez
 */
public interface AccessoryCrudRepository extends MongoRepository<Accessory, String> {
    //Reto 5
    public List<Accessory> findByPriceLessThanEqual(double precio);
    
    @Query("{'description':{'$regex':'?0','$options':'i'}}")
    public List<Accessory> findByDescriptionLike(String description);

}

