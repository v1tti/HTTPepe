package com.pepe.httpepe;

import com.pepe.httpepe.domain.Pepe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PepeRepository extends JpaRepository<Pepe, Long> {
}
