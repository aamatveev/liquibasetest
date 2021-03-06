package xyz.matve.liquibasetest.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.matve.liquibasetest.entities.Asset;

@Repository
public interface AssetRepo extends JpaRepository<Asset, Long> {
}
