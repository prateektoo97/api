package api.trade.main.repo;

import org.springframework.data.repository.CrudRepository;

import api.trade.main.entity.Nifty50;

public interface NiftyRepo extends CrudRepository<Nifty50,Number> {

}
