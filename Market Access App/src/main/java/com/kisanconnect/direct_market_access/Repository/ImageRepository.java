package com.kisanconnect.direct_market_access.Repository;

import com.kisanconnect.direct_market_access.Entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, String> {
}
