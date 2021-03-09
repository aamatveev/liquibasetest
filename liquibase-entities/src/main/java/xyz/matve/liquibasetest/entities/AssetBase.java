package xyz.matve.liquibasetest.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public class AssetBase {
    private String name;
    private String descrpition;
}
