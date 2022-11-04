package kodlamaio.Devs.dataAccess.abstracts;

import kodlamaio.Devs.entities.conceretes.Language;
import kodlamaio.Devs.entities.conceretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguageRepository extends JpaRepository<Language,Integer> {

}
