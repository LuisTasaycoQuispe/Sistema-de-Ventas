package pe.edu.vallegrande.ventas.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.vallegrande.ventas.model.Users;


public interface UserRepository extends JpaRepository<Users,Long> {

 }
 