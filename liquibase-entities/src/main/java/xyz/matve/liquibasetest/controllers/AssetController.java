package xyz.matve.liquibasetest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.matve.liquibasetest.entities.Asset;
import xyz.matve.liquibasetest.repos.AssetRepo;

import java.util.List;

@RestController
public class AssetController {

    private AssetRepo assetRepo;

    @Autowired
    public AssetController(AssetRepo assetRepo) {
        this.assetRepo = assetRepo;
    }

    @GetMapping("/asset/all")
    public List<Asset> allUsers() {
        return assetRepo.findAll();
    }
}