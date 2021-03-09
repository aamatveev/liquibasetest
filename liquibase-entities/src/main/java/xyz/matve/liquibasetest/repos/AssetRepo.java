package xyz.matve.liquibasetest.repos;

import xyz.matve.liquibasetest.entities.Asset;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepo extends JpaRepository<Asset, Long> {
}
