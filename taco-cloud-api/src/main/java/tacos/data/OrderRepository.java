package tacos.data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import tacos.Ingredient;
import tacos.Order;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface OrderRepository extends JpaRepository<Order,Long> {
}
