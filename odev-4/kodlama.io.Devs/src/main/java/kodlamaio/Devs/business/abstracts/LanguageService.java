package kodlamaio.Devs.business.abstracts;

import kodlamaio.Devs.business.requests.AddSubTechnologyRequest;
import kodlamaio.Devs.business.requests.LanguageAddRequest;
import kodlamaio.Devs.business.responses.LanguageResponse;
import kodlamaio.Devs.entities.conceretes.Language;

import java.util.List;

public interface LanguageService {
    List<LanguageResponse> getAll();

    LanguageResponse getById(Integer id);

    void add(LanguageAddRequest language);

    void update(Language language);

    void delete(Integer id);

    void addSubTechnology(AddSubTechnologyRequest addSubTechnologyRequest);

    void removeSubTechnology(Integer languageId, Integer techId);

    void getSubTechnology(Integer languageId);
}
