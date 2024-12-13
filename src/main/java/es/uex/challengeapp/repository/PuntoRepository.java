package es.uex.challengeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.uex.challengeapp.model.Punto;

@Repository
public interface PuntoRepository extends JpaRepository<Punto, Integer>{

}
