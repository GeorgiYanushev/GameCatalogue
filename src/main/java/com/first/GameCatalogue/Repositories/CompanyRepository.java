package com.first.GameCatalogue.Repositories;

import com.first.GameCatalogue.Classes.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}
