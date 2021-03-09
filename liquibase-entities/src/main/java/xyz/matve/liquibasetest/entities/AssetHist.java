package xyz.matve.liquibasetest.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table
@Entity
@Getter
@Setter
public class AssetHist extends AssetBase {
    @Id
    private Long id;

    @JoinColumn(name = "asset_id")
    @ManyToOne
    private Asset asset;
}
