package com.flick.milagre.repositories;

import com.flick.milagre.models.MilagreModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MilagreRepository extends JpaRepository<MilagreModel, Long> {

}
