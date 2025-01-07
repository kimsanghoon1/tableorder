package tableorder.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tableorder.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "menus", path = "menus")
public interface MenuRepository
    extends PagingAndSortingRepository<Menu, Long> {}
