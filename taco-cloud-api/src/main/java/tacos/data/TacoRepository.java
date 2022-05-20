package tacos.data;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//import tacos.Ingredient;
import org.springframework.stereotype.Repository;
import tacos.Taco;

import javax.transaction.Transactional;


@Repository
@Transactional
public interface TacoRepository extends JpaRepository<Taco,Long> {
} 
