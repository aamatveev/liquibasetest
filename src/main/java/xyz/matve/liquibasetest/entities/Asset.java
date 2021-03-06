package xyz.matve.liquibasetest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Asset extends AssetBase {
    @Id
    private Long id;
}
